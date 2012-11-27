CQ.cloudservices.CloudServiceSummaryPanel = CQ.Ext.extend(CQ.Ext.Panel, {

    /**
     * @cfg {String} path
     * The path to load the content from.
     */
    path: null,
    
    /**
     * @private
     */  
    serviceDescription: null,
    
    /**
     * @private
     */
    serviceInfo: null,
    
    constructor: function(config) {
        var self = this;

        this.path = config.ownerCt.path;
        if (!config.items) {
            config.items = [];
        }
            
        /* add service description */ 
        this.serviceDescription = new CQ.Static(); 
        config.items.unshift({
            "xtype":"panel",
            "cls": "cq-cloudservice-summary-info",
            "header": false,
            "border": false,
            "items": [
                this.serviceDescription
            ]
        });
        
        /* add service info */
        this.serviceInfo = new CQ.Static({
            "fieldLabel": CQ.I18n.getMessage("Service is")
        });
        config.items.splice(1,0,this.serviceInfo);
        
        CQ.Util.applyDefaults(config, {
            "cls": "cq-cloudservice-summary",
            "title": CQ.I18n.getMessage("Service summary"),
            "header": false,
            "border": false,
            "width": "100%",
            "labelWidth": 200,
            "padding": 10,
            "layout": "form",
            "listeners": {
                "loadcontent": self.updateContent
            }
        });
        
        // add events
        this.addEvents(
            /**
             * @event loadcontent
             * Fires after the dialog's content has been loaded.
             * @param {CQ.Dialog} this
             * @param {CQ.Ext.data.Record[]} recs The records
             * @param {Object} opts The options, such as the scope
             * @param {Boolean} success True if retrieval of records was
             *        successful
             */
            "loadcontent"        
        );
        
        CQ.cloudservices.CloudServiceSummaryPanel.superclass.constructor.call(this, config);
    },
    
    initComponent: function() {
        CQ.cloudservices.CloudServiceSummaryPanel.superclass.initComponent.call(this);
        this.loadContent();
    },
    
    updateContent: function(cmp) {
        this.updateServiceDescription();
        this.updateServiceInfo();
    },
    
    updateServiceDescription: function() {
        if (this.content) {
            var img = (this.content["thumbnailPath"] || CQ.WCM.THUMBNAIL_DEFAULT_PATH);
            var title = (this.content["jcr:title"] || "") ;
            var desc = (this.content["description"] || "");

            this.serviceDescription.updateHtml('<h1>' + title + this.getThumbnailHtml(img) + '</h1><p>' + desc + '</p>');
        }
    },
    
    updateServiceInfo: function() {
        if (this.data) {
            var isActive = this.isServiceActive();
            this.serviceInfo.updateHtml( (isActive ? "enabled" : "disabled") );
        }
    },
    
    isServiceActive: function() {
        /* check for child pages */
        for (prop in this.data) {
            var node = this.data[prop];
            if (node && node["jcr:primaryType"]) {
                if (node["jcr:primaryType"] == "cq:Page") {
                    return true;
                }
            }
        }
        return false;
    },
 
    getThumbnailHtml: function(path) {
        var url = CQ.HTTP.externalize(path, true);
        return '<img src="' + CQ.shared.XSS.getXSSValue(url) + '">';
    },
       

    /**
     * Loads the content from the specified path or Store (similar to
     * {@link CQ.Dialog#loadContent}).
     */
    loadContent: function() {
        var store = null;

        if (!this.content) {
            var extension = CQ.Sling.SELECTOR_INFINITY + CQ.HTTP.EXTENSION_JSON;
            var url = CQ.HTTP.externalize(this.path + extension);
            store = new CQ.data.SlingStore({"url": url});
        } else if (this.content instanceof CQ.Ext.data.Store) {
            store = this.content;
        }

        store.load({
            callback: this.processRecords,
            scope: this
        });
    },

    /**
     * Processes the given records. This method should only be used as
     * a callback by the component's store when loading content.
     * @param {CQ.Ext.data.Record[]} recs The records
     * @param {Object} opts The options such as the scope (optional)
     * @param {Boolean} success True if retrieval of records was successful
     * @see CQ.Dialog#processRecords
     * @private
     */
    processRecords: function(recs, opts, success) {
        var rec;
        if (success) {
            rec = recs[0];
            this.data = rec;
            this.content = rec.get("jcr:content");
        } else {
            CQ.Log.warn("CQ.cloudservices.CloudServiceSummaryPanel#processRecords: retrieval of records unsuccessful");
            rec = new CQ.data.SlingRecord();
            rec.data = {};
        }
        CQ.Log.debug("CQ.cloudservices.CloudServiceSummaryPanel#processRecords: processing records for fields");
        var fields = this.findByType('static');

        for (var i = 0; i < fields.length; i++) {
            try {
                if (!fields[i].initialConfig.ignoreData) {
                    CQ.Log.debug("CQ.cloudservices.CloudServiceSummaryPanel#processRecords: calling updateHTML of field '{0}'", fields[i]);
                    var valName = fields[i].name;
                    var val = rec.get(valName);
                    if (val !== undefined && fields[i].updateHtml) {
                        fields[i].updateHtml(val);
                    }
                }
            }
            catch (e) {
                CQ.Log.debug("CQ.cloudservices.CloudServiceSummaryPanel#processRecords: {0}", e.message);
            }
        }

        this.fireEvent("loadcontent", this);
    }

});

CQ.Ext.reg("cloudservicesummarypanel", CQ.cloudservices.CloudServiceSummaryPanel);

CQ.cloudservices.CloudServiceSummaryPanel.THUMBNAIL_DEFAULT_PATH = "/libs/cq/cloudserviceconfigs/widgets/extjs/themes/default/widgets/CloudServiceDialog/thumbnail.png";