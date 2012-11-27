CQ.cloudservices.CloudServicePanel = CQ.Ext.extend(CQ.Ext.Panel, {
    
    inheritField: null,
    
    serviceFieldSet: null,
    
    addServiceButton: null,
    
    dataView: null,
    
    data: null,
    
    constructor: function(config) {
        var dlg = this;
        
        this.inheritField = new CQ.Static({
            "fieldLabel": CQ.I18n.getMessage("Inherited from"),
            "html": ""
        });
                
        this.serviceFieldSet = new CQ.form.DialogFieldSet({
            title: CQ.I18n.getMessage("Cloud Service Configurations"),
            collapsed: false,
            autoHeight: true,
            autoScroll: true,
            items: [
                {
                    xtype: "hidden",
                    name: "./cq:cloudserviceconfigs" + CQ.Sling.DELETE_SUFFIX,
                    value: true
                }
            ]
        });
        
        this.addServiceButton = new CQ.Ext.Button({
            "text": CQ.I18n.getMessage("Add Service"),
            "style": "float:right",
            "handler": function() {
                var parentDlg = this.findParentByType("dialog");
                var serviceDlg = new CQ.cloudservices.CloudServiceDialog({
                    path: parentDlg.path,
                    data: dlg.data,
                    buttons: [
                        {
                            text: CQ.I18n.getMessage("OK"),
                            handler: function() {
                                dlg.addService(serviceDlg.getSelectedService());
                                var configs = dlg.data['cq:cloudserviceconfigs'];
                                if(!configs) {
                                    configs = [];
                                }
                                if(typeof(configs) == "string") {
                                    configs = [configs];
                                }
                                dlg.data["cq:cloudserviceconfigs"] = configs;
                                configs.push(serviceDlg.getSelectedService().path);
                                serviceDlg.close();                                                         
                            }
                        },
                        {
                            text: CQ.I18n.getMessage("Cancel"),
                            handler: function() {
                                serviceDlg.close();
                            }
                        }
                    ]
                });
                serviceDlg.show();
            }
        });
        
        CQ.Util.applyDefaults(config, {
            "items": [
                dlg.inheritField,
                dlg.serviceFieldSet,
                {
                    "xtype": "panel",
                    "border": false,
                    "items": [
                        dlg.addServiceButton,
                        {
                            xtype: "static",
                            style: "float:right;margin:3px 10px 0px 0px;text-decoration:underline;",
                            html: '<a href="' + CQ.HTTP.externalize('/miscadmin#/etc/cloudservices') + '" target="_blank">' + CQ.I18n.getMessage("Manage configurations") + '</a>'
                        }
                    ]
                }
            ],
            "listeners": {
                "beforeshow": function(comp) {
                    comp.doLayout();
                }
            }
        });
        
        CQ.cloudservices.CloudServicePanel.superclass.constructor.call(this, config);
    },
    
    initComponent: function() {
        CQ.cloudservices.CloudServicePanel.superclass.initComponent.call(this);
        var parentDialog = this.findParentByType("dialog");
        parentDialog.on("loadcontent", this.postProcessRecords, this);
    },
    
    postProcessRecords: function(dialog, records, opts, sucess) {
        //#38153: already initialized
        if (this.data) {        
            return;
        }
        //check for inheritance
        var dlg = this.findParentByType('dialog');
        var dlgPath = dlg.path.replace("/jcr:content","");
        var showParent = !records[0].data["cq:cloudserviceconfigs"] ? "" : "?showparent=true"; 
        var url = CQ.HTTP.noCaching(dlgPath + ".cloudservices.json" + showParent)
        var response = CQ.HTTP.get(url);
        var inheritData = CQ.HTTP.eval(response);    
        var recordData = records[0].data;
        var isInherited = inheritData["jcr:path"] != undefined; 
        var isOverridden = (isInherited && recordData["cq:cloudserviceconfigs"] != undefined);
        
        this.data = recordData;
        if(isInherited && !isOverridden) {
            this.data = inheritData;
        }
        
        //fill store with configured services
        if(this.data["cq:cloudserviceconfigs"]) {       
            var url = CQ.HTTP.noCaching("/libs/cq/cloudservices/services.json")
            var response = CQ.HTTP.get(url);
            var data = CQ.HTTP.eval(response);
            
            var configs = this.data["cq:cloudserviceconfigs"];
            if(typeof(configs) == "string") {
                configs = [configs];
            }
            for(var i=0; i<configs.length; i++) {
                var service = this.getServiceForConfigPath(data.services, configs[i]);
                if(service) {
                    this.addService(service, configs[i]);
                }
            }
        }
        
        if( (this.data["jcr:path"] || dlgPath) ) {
            if(isInherited) {
                var inheritPath = inheritData["jcr:path"].replace("/jcr:content","");
                var tpl = new CQ.Ext.Template('{path}');
                this.inheritField.updateHtml(tpl.apply({path: inheritPath}));
            }
            
            this.inheritField.setVisible((isOverridden || isInherited));
            this.setConfigurationsEnabled((isOverridden || !isInherited));
            
            var editLock = isOverridden ? false : true;
            this.handleLock(this.inheritField, editLock);
        }
    },
    
    setConfigurationsEnabled: function(enable) {
        var tab = this.findParentByType('tabpanel');
        var fields = tab.findByType('compositefield');
        for(var i = 0; i < fields.length; i++) {
            enable ? fields[i].enable() : fields[i].disable();
        }
        enable ? this.addServiceButton.enable() :  this.addServiceButton.disable();
    },
    
    getServiceForConfigPath: function(services, path) {
        for(var i=0; i<services.length; i++) {
            if(path.indexOf(services[i].path) > -1) {
                return services[i];
            }
        }
    },
    
    handleLock: function(field, editLock) {
        try {
            var dlg = this;
            var iconCls = (editLock ? "cq-dialog-locked" : "cq-dialog-unlocked");
            field.editLock = editLock;
            
            field.fieldEditLockBtn = new CQ.TextButton({
                "tooltip": editLock ? CQ.Dialog.CANCEL_INHERITANCE : CQ.Dialog.REVERT_INHERITANCE,
                "cls": "cq-dialog-editlock",
                "iconCls": iconCls,
                "handleMouseEvents": false,
                "handler": function() {                     
                    dlg.switchInheritance(field, function(field, iconCls, editLock) {
                            field.fieldEditLockBtn.setIconClass(iconCls);
                            field.fieldEditLockBtn.setTooltip(iconCls == "cq-dialog-unlocked" ?
                                    CQ.Dialog.REVERT_INHERITANCE : CQ.Dialog.CANCEL_INHERITANCE);
                            field.setDisabled(editLock);
                            field.editLock = editLock;
                            },
                            dlg);
                }
            });
            var formEl = CQ.Ext.get('x-form-el-' + field.id);
            var label = formEl.parent().first();
            // narrow the field label
            formEl.parent().first().dom.style.width =
                    (parseInt(label.dom.style.width) - CQ.themes.Dialog.LOCK_WIDTH) + "px";
            if (field.rendered) {
                field.fieldEditLockBtn.render(formEl.parent(), label.next());
            } else {
                this.on("render", function(comp) {
                    field.fieldEditLockBtn.render(formEl.parent(), label.next());
                });
            }
        }
        catch (e) {
            // skip (formEl is null)
        }       
    },
    
    switchInheritance: function(field, callback, scope) {
        CQ.Ext.Msg.confirm(
            field.editLock ? CQ.I18n.getMessage("Cancel inheritance") : CQ.I18n.getMessage("Revert inheritance"),
            field.editLock ? CQ.I18n.getMessage("Do you really want to cancel the inheritance?") : CQ.I18n.getMessage("Do you really want to revert the inheritance?"),
            function(btnId) {
                if (btnId == "yes") {
                    var editLock = (field.editLock ? false : true);
                    var iconCls = (field.editLock ? "cq-dialog-unlocked" : "cq-dialog-locked");
                    if (callback) {
                        callback.call(this, field, iconCls, editLock);
                    }
                    this.setConfigurationsEnabled(!editLock);
                }
            },
            scope || this
        );
    },
    
    addService: function(service, value) {
        if(service && service.title && service.path) {
            var fld = {
                "xtype": "compositefield",
                "items": [
                    {
                        "xtype": "cloudservicescombo",
                        "fieldLabel": service.title,
                        "name": "./cq:cloudserviceconfigs",
                        "rootPath": service.path,
                        "templatePath": service.templatePath,
                        "value": value ? value : "",
                        "flex": 1
                    }
                ]
            };
            
            var linkHtml;
            if(service.serviceUrl) {
                linkHtml = '<a href="' + service.serviceUrl + '" target="_blank"><img ext:qtip="' + (service.serviceUrlLabel || "Link to Service") + '" src="' + (service.iconPath || '/libs/cq/ui/widgets/themes/default/icons/16x16/siteadmin.png') + '" /></a>';
            } else {
                linkHtml = '<img src="/etc/designs/default/0.gif" />';
            }
            
            fld.items.push({
                xtype: 'static',
                html: linkHtml,
                width: '16px'
            });
            
            this.serviceFieldSet.add(fld);
            this.serviceFieldSet.doLayout();
        }
    }
    
});
CQ.Ext.reg("cloudservicepanel", CQ.cloudservices.CloudServicePanel);