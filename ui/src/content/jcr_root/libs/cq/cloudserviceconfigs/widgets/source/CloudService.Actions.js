
/**
 * Creates a dialog for creating new configurations.
 * 
 * @param rootPath {String} Path to the service root
 * @param parentPath {String} Path to be set by default on the parent path field (optional)
 * @param showParent {String} Setting to true shows the parent selection popup (optional)
 * @param dialogTitle {String} Setting it alters the configuration dialog title (optional)
 */
CQ.cloudservices.createConfiguration = function(rootPath, parentPath, showParent, dialogTitle) {
    dialogTitle = dialogTitle || CQ.I18n.getMessage("Create Configuration");
    var templatesStore = new CQ.Ext.data.Store({
        "proxy": new CQ.Ext.data.HttpProxy({ "url":"/bin/wcm/templates", "method":"GET" }),
        "reader": new CQ.Ext.data.JsonReader(
            { "totalProperty":"results", "root":"templates", "id":"path" },
            [ "path", "title", "description", "thumbnailPath", "iconPath", "ranking" ]
        ),
        "baseParams": { "_charset_":"utf-8", "path":rootPath },
        "listeners": {
            "load": function() {
                this.sort("ranking");
            }
        }

    });

    var dataView = new CQ.Ext.DataView({
        "multiSelect": false,
        "singleSelect": true,
        "emptyText": CQ.I18n.getMessage("No template available"),
        "store": templatesStore,
        "overClass": "x-view-over",
        "itemSelector" :"div.template-item",
        "tpl":new CQ.Ext.XTemplate(
            '<tpl for=".">',
            '<div class="template-item">',
            '<tpl if="thumbnailPath">',
                '<img class="template-thumbnail" src="{[CQ.shared.HTTP.getXhrHookedURL(CQ.shared.HTTP.externalize(CQ.shared.HTTP.encodePath(values.thumbnailPath)))]}">',
                '<div class="template-title">{title}</div>',
                '<div class="template-description">{description}</div>',
            '</tpl>',
            '<tpl if="thumbnailPath == \'\'">',
                '<div class="template-title template-no-thumbnail">{title}</div>',
                '<div class="template-description template-no-thumbnail">{description}</div>',
            '</tpl>',
            '<div style="clear:both"></div>',
            '</div>',
            '</tpl>',
            '<div style="height:5px;overflow:hidden"></div>'),
        "prepareData": function(data) {
            // 900000000: move to the end of the list
            data.ranking = data.ranking != null ? data.ranking : 900000000;
            data.thumbnailPath = data.thumbnailPath ? CQ.HTTP.externalize(data.thumbnailPath) : '';
            data.title = CQ.I18n.getVarMessage(data.title);
            data.description = data.description ? CQ.I18n.getVarMessage(data.description) : "";
            return data;
        }
    });

    var hiddenTemplate =  new CQ.Ext.form.Hidden({"name": "template"});

    //workaround to select a default value. select() must be called at the end of refresh method
    dataView.refresh = function(){
        this.clearSelections(false, true);
        this.el.update("");
        var html = [];
        var records = this.store.getRange();
        if(records.length < 1){
            if(!this.deferEmptyText || this.hasSkippedEmptyText){
                this.el.update(this.emptyText);
            }
            this.hasSkippedEmptyText = true;
            this.all.clear();
            return;
        }
        this.tpl.overwrite(this.el, this.collectData(records, 0));
        this.all.fill(CQ.Ext.query(this.itemSelector, this.el.dom));
        this.updateIndexes(0);

        this.select(0);
    };

   var createDialog = {
        "jcr:primaryType": "cq:Dialog",
        "id": CQ.Util.createId("cq-createdialog"),
        "title": dialogTitle,
        "formUrl": CQ.shared.HTTP.externalize("/bin/wcmcommand"),
        "params": {
            "cmd":"createPage",
            "_charset_":"utf-8"
        },
        "height": 520,
        "items": {
            "jcr:primaryType": "cq:Panel",
            "items": {
                "jcr:primaryType": "cq:WidgetCollection",
                "parent": {
                    "xtype": "pathfield",
                    "fieldLabel": CQ.I18n.getMessage("Parent Configuration"),
                    "allowBlank": false,
                    "name":"parentPath",
                    "rootPath": rootPath,
                    "value": parentPath || undefined,
                    "hidden": !showParent,
                    "listeners": {
                        "dialogselect": function(comp,path,anchor) {
                            /* reload templates for new path */
                            templatesStore.setBaseParam("path", path);
                            templatesStore.removeAll();                    
                            templatesStore.reload();
                        }
                    }
                },
                "title": {
                    "fieldLabel":CQ.I18n.getMessage("Title"),
                    "allowBlank":false,
                    "name":"title"
                },
                "label": {
                    "fieldLabel":CQ.I18n.getMessage("Name"),
                    "vtype":"itemname",
                    "name":"label"
                },
                "template": {
                    "xtype": "panel",
                    "border": false,
                    "cls": "cq-template-view",
                    "autoScroll":true,
                    "width": "100%",
                    "autoHeight":false,
                    "height": 350,
                    "items": [
                        hiddenTemplate,
                        dataView
                    ]
                    ,"listeners": {
                        "render" : {
                            fn: function() {
                                templatesStore.load();
                            }
                        }
                    }
                }
            }
        },
        "okText":CQ.I18n.getMessage("Create")
    };

    var dialog = CQ.WCM.getDialog(createDialog);

    dialog.on("beforesubmit", function() {
        if(dataView.getSelectedRecords()[0] && dataView.getSelectedRecords()[0].data)
            hiddenTemplate.setRawValue(dataView.getSelectedRecords()[0].data.path);
    });

    dialog.success = function(form, action) {
        if( (typeof action.result.Path) == "string") {
            var newPage = action.result.Path;    //CQ.HTTP.internalize(action.result.Location);
            CQ.wcm.SiteAdmin.multiWinMode = false;
            CQ.wcm.SiteAdmin.openPage(newPage, "page", false);
        } else {
            CQ.Ext.Msg.alert(
                    CQ.I18n.getMessage("Error"),
                    CQ.I18n.getMessage("Did not get path of new configuration in response"));
        }
    };
    
    dialog.failure = function(){
        CQ.Ext.Msg.alert(
            CQ.I18n.getMessage("Error"),
            CQ.I18n.getMessage("Could not create configuration.")
        );
    };

    return dialog;
};

/**
 * Creates and pops up a dialog for creating new configurations.
 * 
 * @param rootPath {String} Path to the service root
 * @param parentPath {String} Path to be set by default on the parent path field (optional)
 * @param showParent {String} Setting to true shows the parent selection popup (optional)
 * @param dialogTitle {String} Setting it alters the configuration dialog title (optional)
 */
CQ.cloudservices.editNewConfiguration = function(rootPath, parentPath, showParent, dialogTitle) {
    CQ.cloudservices.createConfiguration(rootPath, parentPath, showParent, dialogTitle).show();
}

/**
 * Creates a panel for displaying a service summary.
 *
 * @param path {String} Path to the dialog 
 */
CQ.cloudservices.createSummaryPanel = function(path) {
    //load path from service
    var url = CQ.HTTP.externalize(path + CQ.Sling.SELECTOR_INFINITY + CQ.HTTP.EXTENSION_JSON, true);
    var response = CQ.HTTP.get(url);
    var data = CQ.HTTP.eval(response);
    if (data) {
        var url = data["jcr:content"]["summaryPanelPath"];
        var createDialog = CQ.WCM.getDialogConfig(url);
        if (createDialog) {
            createDialog.path = path;
            var dialog = CQ.Util.build(createDialog);
            return dialog;
        }
    } else {
        CQ.Log.warn("CQ.cloudservices#createSummaryDialog: retrieval of dialog unsuccessful");
    }
};
