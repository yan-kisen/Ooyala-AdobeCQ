CQ.cloudservices.CloudServiceDialog = CQ.Ext.extend(CQ.Dialog, {
    
    servicesStore: null,
    
    dataView: null,
    
    constructor: function(config) {
        var dlg = this;
        
        this.servicesStore = new CQ.Ext.data.Store({
            "proxy": new CQ.Ext.data.HttpProxy({ "url": CQ.HTTP.noCaching("/libs/cq/cloudservices/services.json"), "method":"GET" }),
            "reader": new CQ.Ext.data.JsonReader({
                    "root":"services",
                    "id":"path"
                }, [
                    "path",
                    "title",
                    "description",
                    "visible",
                    "name",
                    "serviceUrl",
                    "serviceUrlLabel",
                    "templatePath",
                    "thumbnailPath",
                    "iconPath",
                    "ranking"
                ]),
                "listeners": {
                    "load": function() {
                        this.sort("ranking"); 
                        this.filterBy(function(rec){
                            var cfg = config.data['cq:cloudserviceconfigs'];
                            if(cfg) {
                                if(CQ.Ext.isArray(cfg)) {
                                    for(var i=0; i<cfg.length; i++) {
                                        if(cfg[i].indexOf(rec.get('path')) > -1) {
                                            return false;
                                        }
                                    }
                                } else {
                                    if(cfg.indexOf(rec.get('path')) > -1) {
                                        return false;
                                    }
                                }
                                return (rec.get('visible'));
                            }
                            return (rec.get('visible'));
                        });
                    }
                }
            }
        );      
        
        var defThumb = CQ.HTTP.externalize("/libs/cq/cloudserviceconfigs/widgets/themes/default/widgets/CloudServiceDialog/thumbnail.png");
        this.dataView = new CQ.Ext.DataView({
            "multiSelect": false,
            "singleSelect": true,
            "emptyText": CQ.I18n.getMessage("No (unreferenced) cloud services available"),
            "store": dlg.servicesStore,
            "overClass": "x-view-over",
            "itemSelector" :"div.template-item",
            "tpl": new CQ.Ext.XTemplate(
                '<tpl for=".">',
                    '<div class="template-item">',
                        '<tpl if="thumbnailPath">',
                            '<img class="template-thumbnail" src="{thumbnailPath}">',
                        '</tpl>',
                        '<tpl if="!thumbnailPath">',
                            '<img class="template-thumbnail" src="{this.defThumb}">',
                        '</tpl>',
                        '<div class="template-title">{title:this.formatStr}</div>',
                        '<div class="template-description">{description:this.formatStr}</div>',
                        '<div style="clear:both"></div>',
                    '</div>',
                '</tpl>',
                '<div style="height:5px;overflow:hidden"></div>', 
                {
                    formatStr: function(v) {
                        return (v!== null) ? v : "";
                    },
                    defThumb: defThumb
                }
            ),
            "prepareData": function(data) {
                data.ranking = data.ranking != null ? data.ranking : 900000000;
                return data;
            }
        });
        
        var mainPanel = new CQ.Ext.Panel({
            id: "cq-card-first",
            layout: "form",
            autoScroll: true,
            title: CQ.I18n.getMessage("Select Cloud Service"),
            header: false,
            bodyStyle: CQ.themes.Dialog.TAB_BODY_STYLE,
            labelWidth: CQ.themes.Dialog.LABEL_WIDTH,
            defaultType: "textfield",
            "stateful": false,
            defaults: {
                msgTarget: CQ.themes.Dialog.MSG_TARGET,
                anchor: CQ.themes.Dialog.ANCHOR,
                "stateful": false
            },
            "items": [{
                    "xtype": "panel",
                    "border": false,
                    "cls": "cq-template-view",
                    "autoScroll":true,
                    "width": "100%",
                    "layout": "fit",
                    "items": dlg.dataView,
                    "listeners": {
                        "render" : {
                            fn: function() {
                                dlg.servicesStore.load();
                            }
                        }
                    }
                }
            ]           
        });
        
        CQ.Util.applyDefaults(config, {
            id:"cq-cloudservicesdialog",
            title:CQ.I18n.getMessage("Cloud Services"),
            items: [mainPanel],
            buttons: [
                CQ.Dialog.OK,
                CQ.Dialog.CANCEL
            ]
        });

        CQ.cloudservices.CloudServiceDialog.superclass.constructor.call(this, config);
    },
    
    getSelectedService: function() {
        var r = this.dataView.getSelectedRecords()[0];
        if(r && r.data) {
            return r.data;
        }
        return null;
    }
    
});
CQ.Ext.reg("cloudservicedialog", CQ.cloudservices.CloudServiceDialog);