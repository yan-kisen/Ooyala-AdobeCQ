/**
 * @class CQ.cloudservices.ConfigurationCombo
 * @extends CQ.Ext.form.ComboBox
 * The ConfigurationCombo is a customized {@link CQ.Ext.form.ComboBox}
 * that shows a list of available configurations for a specific service.
 *
 * @constructor
 * Creates a new ConfigurationCombo.
 * @param {Object} config The config object
 */
CQ.cloudservices.CloudConfigurationCombo = CQ.Ext.extend(CQ.form.ClearableComboBox, {

	/**
	 * @cfg {String} rootPath
	 * Path of configurations root (i.e. /etc/cloudservices/sitecatalyst)
	 */
    rootPath: null,
    
    /**
     * @cfg {Boolean} createNewEnabled
     * Enables creating of new configuration by adding an additional
     * entry in the dropdown (Defaults to false)
     */
    createNewEnabled: false,

    constructor: function(config) {
    	var self = this;
        config = (!config ? {} : config);
        
        this.rootPath = config.rootPath || null;
        
        var rootPathParam = config.rootPath ? "?rootPath=" + config.rootPath : "";
        
        this.store = new CQ.Ext.data.Store({
            "autoLoad": {},
            "proxy":new CQ.Ext.data.HttpProxy({
                "url":CQ.shared.HTTP.externalize("/libs/cq/cloudservices/configurations.json" + rootPathParam),
                "method":"GET"
            }),
            "reader": new CQ.Ext.data.JsonReader({
                "root": "configurations",
                "id" : "path",
                "fields": [ "title", "description", "name", "path", "templatePath" ]
            }),
            "listeners": {
                "load": function(store) {
                	if (self.createNewEnabled) {
	                    store.add(new store.recordType({
	                        "path": "",
	                        "title": CQ.I18n.getMessage("Create new configuration..."),
	                        "description": ""
	                    }, CQ.Ext.id()));
                    }
                }
            }
        });

        // If setValue is called before our store's data is loaded, we need
        // to set the value again so that labels are correctly displayed
        var thisCombo = this;
        this.initialValue = null;
        this.store.on("load", function() {
            if(thisCombo.initialValue) {
                thisCombo.setValue(thisCombo.initialValue);
            }
            thisCombo.fireEvent("load", this);
        });

        config = CQ.Util.applyDefaults(config, {
            "name": config.name || "cloudserviceconfigs",
            "hiddenName": "./" + config.name || "./cloudserviceconfigs",
            "fieldLabel": "Configuration",
            "displayField":"title",
            "valueField":"path",
            "valueNotFoundText": CQ.I18n.getMessage("Configuration reference missing"),
            "title":CQ.I18n.getMessage("Available configurations"),
            "selectOnFocus":true,
            "triggerAction":"all",
            "allowBlank":true,
            "editable":false,
            "lazyInit":false,
            "store":this.store,
            "mode": "local",
            "tpl":new CQ.Ext.XTemplate(
                '<tpl for=".">',
                '<div class="workflow-model-item x-combo-list-item">',
                    '<div class="workflow-model-title workflow-model-no-thumbnail">{title:this.formatStr}</div>',
                    '<div class="workflow-model-description workflow-model-no-thumbnail">{description:this.formatStr}</div>',
                    '<div style="clear:both"></div>',
                '</div>',
                '</tpl>',
                '<div style="height:5px;overflow:hidden"></div>',
                {
                	formatStr:function(v) {
                		return (v!== null) ? v : "";
                	}
                }
            )
        });

        CQ.cloudservices.CloudConfigurationCombo.superclass.constructor.call(this, config);
    },

    initComponent : function() {
        CQ.cloudservices.CloudConfigurationCombo.superclass.initComponent.call(this);
        
        this.on("select", function(combo, record, index) {
            if(record.get("path") == "") {
                this.createNewConfiguration();
            }
        }, this);
    },

    setValue : function(value) {
        this.initialValue = value;
        CQ.cloudservices.CloudConfigurationCombo.superclass.setValue.call(this, value);
    },

    reload : function(options) {
        this.store.reload(options);
    },

    getSelectedRecord : function() {
        var result = {};
        var id = this.getValue();
        result = this.store.getById(id);
        return result;
    },

    createNewConfiguration : function() {      
        var myThis = this;
        var newDialogConfig = CQ.cloudservices.createConfiguration(this.rootPath);
        var newDialog = CQ.WCM.getDialog(newDialogConfig);

        newDialog.success = function(form, action) {
        	if( (typeof action.result.Path) == "string") {
                myThis.reload();
                myThis.setValue(action.result.Path);
                var newPage = CQ.HTTP.internalize(action.result.Location);
                CQ.wcm.SiteAdmin.openPage(newPage, "page", true);
            } else {
                CQ.Ext.Msg.alert(
                        CQ.I18n.getMessage("Error"),
                        CQ.I18n.getMessage("Did not get path of new configuration in response"));
            }
        };
        newDialog.failure = function(){
            CQ.Ext.Msg.alert(
                CQ.I18n.getMessage("Error"),
                CQ.I18n.getMessage("Could not create configuration.")
            );
        };
        
        newDialog.show();
    }
});

CQ.Ext.reg("cloudservicescombo", CQ.cloudservices.CloudConfigurationCombo);