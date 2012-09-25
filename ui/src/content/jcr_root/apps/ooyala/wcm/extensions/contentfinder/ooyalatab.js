{
    "tabTip": "Ooyala Videos",
    "id": "cfTab-Ooyala",
    "iconCls": "cq-cft-tab-icon ooyala",
    "xtype": "ooyalacontentfindertab",
    "suggest": true,
    "ranking": 20,
    "allowedPaths": [
        "/content/*",
        "/etc/scaffolding/*"
    ],
    "items": [
        CQ.wcm.ContentFinderTab.getQueryBoxConfig({
            "id": "cfTab-Ooyala-QueryBox",
            "height": 150,
            "items": [
                CQ.wcm.ContentFinderTab.getSuggestFieldConfig({
                    "xtype": "ooyalasuggestfield",
                    "url": "/bin/wcm/ooyala/suggestions.json"
                }),
                Ooyala.ContentFinderRadioGroup()
            ]
        }),
        CQ.wcm.ContentFinderTab.getResultsBoxConfig({
            "itemsDDGroups": [ "ooyala" ],
            "itemsDDNewParagraph": {
                "path": "ooyala/components/content/ooyalaVideo",
                "propertyName": "./videoid"
            },
            "disableContinuousLoading": false,
            "items": {
                "cls": "cq-cft-dataview cq-cft-ooyalaview",
                "tpl":
                    '<tpl for=".">' +
                        '<div style="" class="cq-cft-ooyala-vid">' +
                            '<img class="cq-cft-ooyala-image" src="{preview_image_url}"/>' +
                            '<div class="cq-cft-ooyala-ddproxy-wrapper"><h4>{name}</h4>' +
                            '<div class="cq-cft-ooyala-duration">{duration}</div></div>' +
                            '<div class="cq-cft-ooyala-separator"></div>' +
                        '</div>' +
                    '</tpl>',
                "itemSelector":  ".cq-cft-ooyala-vid"
            },
            "tbar": [
                CQ.wcm.ContentFinderTab.REFRESH_BUTTON
            ]
        },{
            "url": "/bin/wcm/ooyala"
        }, {
            "reader": new CQ.Ext.data.JsonReader({
                "totalProperty": "results",
                "root": "hits",
                "fields": [
                    "name", "path", "preview_image_url", "labels", "duration"
                ],
            "id": "path"
        }),
        })
    ]
}