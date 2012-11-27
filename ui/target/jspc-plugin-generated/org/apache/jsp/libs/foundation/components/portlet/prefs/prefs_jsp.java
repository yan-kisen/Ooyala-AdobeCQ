package org.apache.jsp.libs.foundation.components.portlet.prefs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.day.cq.widget.HtmlLibraryManager;
import javax.jcr.*;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;
import com.day.cq.commons.inherit.InheritanceValueMap;
import com.day.cq.wcm.commons.WCMUtils;
import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.NameConstants;
import com.day.cq.wcm.api.PageManager;
import com.day.cq.wcm.api.designer.Designer;
import com.day.cq.wcm.api.designer.Design;
import com.day.cq.wcm.api.designer.Style;
import com.day.cq.wcm.api.components.ComponentContext;
import com.day.cq.wcm.api.components.EditContext;

public final class prefs_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {




  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/libs/foundation/global.jsp");
  }

  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;











      //  cq:defineObjects
      com.day.cq.wcm.tags.DefineObjectsTag _jspx_th_cq_005fdefineObjects_005f0 = (com.day.cq.wcm.tags.DefineObjectsTag) _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.get(com.day.cq.wcm.tags.DefineObjectsTag.class);
      _jspx_th_cq_005fdefineObjects_005f0.setPageContext(_jspx_page_context);
      _jspx_th_cq_005fdefineObjects_005f0.setParent(null);
      int _jspx_eval_cq_005fdefineObjects_005f0 = _jspx_th_cq_005fdefineObjects_005f0.doStartTag();
      if (_jspx_th_cq_005fdefineObjects_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.reuse(_jspx_th_cq_005fdefineObjects_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.reuse(_jspx_th_cq_005fdefineObjects_005f0);
      org.apache.sling.api.SlingHttpServletRequest slingRequest = null;
      org.apache.sling.api.SlingHttpServletResponse slingResponse = null;
      org.apache.sling.api.resource.Resource resource = null;
      javax.jcr.Node currentNode = null;
      org.apache.sling.api.resource.ResourceResolver resourceResolver = null;
      org.apache.sling.api.scripting.SlingScriptHelper sling = null;
      org.slf4j.Logger log = null;
      org.apache.sling.api.scripting.SlingBindings bindings = null;
      com.day.cq.wcm.api.components.ComponentContext componentContext = null;
      com.day.cq.wcm.api.components.EditContext editContext = null;
      org.apache.sling.api.resource.ValueMap properties = null;
      com.day.cq.wcm.api.PageManager pageManager = null;
      com.day.cq.wcm.api.Page currentPage = null;
      com.day.cq.wcm.api.Page resourcePage = null;
      com.day.cq.commons.inherit.InheritanceValueMap pageProperties = null;
      com.day.cq.wcm.api.components.Component component = null;
      com.day.cq.wcm.api.designer.Designer designer = null;
      com.day.cq.wcm.api.designer.Design currentDesign = null;
      com.day.cq.wcm.api.designer.Design resourceDesign = null;
      com.day.cq.wcm.api.designer.Style currentStyle = null;
      com.adobe.granite.xss.XSSAPI xssAPI = null;
      slingRequest = (org.apache.sling.api.SlingHttpServletRequest) _jspx_page_context.findAttribute("slingRequest");
      slingResponse = (org.apache.sling.api.SlingHttpServletResponse) _jspx_page_context.findAttribute("slingResponse");
      resource = (org.apache.sling.api.resource.Resource) _jspx_page_context.findAttribute("resource");
      currentNode = (javax.jcr.Node) _jspx_page_context.findAttribute("currentNode");
      resourceResolver = (org.apache.sling.api.resource.ResourceResolver) _jspx_page_context.findAttribute("resourceResolver");
      sling = (org.apache.sling.api.scripting.SlingScriptHelper) _jspx_page_context.findAttribute("sling");
      log = (org.slf4j.Logger) _jspx_page_context.findAttribute("log");
      bindings = (org.apache.sling.api.scripting.SlingBindings) _jspx_page_context.findAttribute("bindings");
      componentContext = (com.day.cq.wcm.api.components.ComponentContext) _jspx_page_context.findAttribute("componentContext");
      editContext = (com.day.cq.wcm.api.components.EditContext) _jspx_page_context.findAttribute("editContext");
      properties = (org.apache.sling.api.resource.ValueMap) _jspx_page_context.findAttribute("properties");
      pageManager = (com.day.cq.wcm.api.PageManager) _jspx_page_context.findAttribute("pageManager");
      currentPage = (com.day.cq.wcm.api.Page) _jspx_page_context.findAttribute("currentPage");
      resourcePage = (com.day.cq.wcm.api.Page) _jspx_page_context.findAttribute("resourcePage");
      pageProperties = (com.day.cq.commons.inherit.InheritanceValueMap) _jspx_page_context.findAttribute("pageProperties");
      component = (com.day.cq.wcm.api.components.Component) _jspx_page_context.findAttribute("component");
      designer = (com.day.cq.wcm.api.designer.Designer) _jspx_page_context.findAttribute("designer");
      currentDesign = (com.day.cq.wcm.api.designer.Design) _jspx_page_context.findAttribute("currentDesign");
      resourceDesign = (com.day.cq.wcm.api.designer.Design) _jspx_page_context.findAttribute("resourceDesign");
      currentStyle = (com.day.cq.wcm.api.designer.Style) _jspx_page_context.findAttribute("currentStyle");
      xssAPI = (com.adobe.granite.xss.XSSAPI) _jspx_page_context.findAttribute("xssAPI");


    // add more initialization code here




      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Portlet Preferences</title>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; utf-8\" />\n");
      out.write("    ");

    HtmlLibraryManager htmlMgr = sling.getService(HtmlLibraryManager.class);
    if (htmlMgr != null) {
        htmlMgr.writeIncludes(slingRequest, out, "cq.widgets");
    }
    
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("CQ.portlets = {};\n");
      out.write("CQ.portlets.createPage = function(){\n");
      out.write("    var parentPath = CQ.Ext.getCmp(\"cqportletprefspathfield\").getValue();\n");
      out.write("    var templatesStore = new CQ.Ext.data.Store({\n");
      out.write("        \"proxy\": new CQ.Ext.data.HttpProxy({ \"url\":\"/bin/wcm/templates\", \"method\":\"GET\" }),\n");
      out.write("        \"reader\": new CQ.Ext.data.JsonReader(\n");
      out.write("            { \"totalProperty\":\"results\", \"root\":\"templates\", \"id\":\"path\" },\n");
      out.write("            [ \"path\", \"title\", \"description\", \"thumbnailPath\", \"iconPath\", \"ranking\" ]\n");
      out.write("        ),\n");
      out.write("        \"baseParams\": { \"_charset_\":\"utf-8\", \"path\":parentPath },\n");
      out.write("        \"listeners\": {\n");
      out.write("            \"load\": function() {\n");
      out.write("                this.sort(\"ranking\");\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    var dataView = new CQ.Ext.DataView({\n");
      out.write("        \"multiSelect\": false,\n");
      out.write("        \"singleSelect\": true,\n");
      out.write("        \"emptyText\": CQ.I18n.getMessage(\"No template available\"),\n");
      out.write("        \"store\": templatesStore,\n");
      out.write("        \"overClass\": \"x-view-over\",\n");
      out.write("        \"itemSelector\" :\"div.template-item\",\n");
      out.write("        \"tpl\":new CQ.Ext.XTemplate(\n");
      out.write("            '<tpl for=\".\">',\n");
      out.write("            '<div class=\"template-item\">',\n");
      out.write("            '<tpl if=\"thumbnailPath\">',\n");
      out.write("                '<img class=\"template-thumbnail\" src=\"{thumbnailPath}\">',\n");
      out.write("                '<div class=\"template-title\">{title}</div>',\n");
      out.write("                '<div class=\"template-description\">{description}</div>',\n");
      out.write("            '</tpl>',\n");
      out.write("            '<tpl if=\"thumbnailPath == \\'\\'\">',\n");
      out.write("                '<div class=\"template-title template-no-thumbnail\">{title}</div>',\n");
      out.write("                '<div class=\"template-description template-no-thumbnail\">{description}</div>',\n");
      out.write("            '</tpl>',\n");
      out.write("            '<div style=\"clear:both\"></div>',\n");
      out.write("            '</div>',\n");
      out.write("            '</tpl>',\n");
      out.write("            '<div style=\"height:5px;overflow:hidden\"></div>'),\n");
      out.write("        \"prepareData\": function(data) {\n");
      out.write("            // 900000000: move to the end of the list\n");
      out.write("            data.ranking = data.ranking != null ? data.ranking : 900000000;\n");
      out.write("            data.thumbnailPath = data.thumbnailPath ? CQ.HTTP.externalize(data.thumbnailPath) : '';\n");
      out.write("            data.title = CQ.I18n.getVarMessage(data.title);\n");
      out.write("            data.description = data.description ? CQ.I18n.getVarMessage(data.description) : \"\";\n");
      out.write("            return data;\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    var hiddenTemplate =  new CQ.Ext.form.Hidden({\"name\": \"template\"});\n");
      out.write("\n");
      out.write("    //workaround to select a default value. select() must be called at the end of refresh method\n");
      out.write("    dataView.refresh = function(){\n");
      out.write("        this.clearSelections(false, true);\n");
      out.write("        this.el.update(\"\");\n");
      out.write("        var html = [];\n");
      out.write("        var records = this.store.getRange();\n");
      out.write("        if(records.length < 1){\n");
      out.write("            if(!this.deferEmptyText || this.hasSkippedEmptyText){\n");
      out.write("                this.el.update(this.emptyText);\n");
      out.write("            }\n");
      out.write("            this.hasSkippedEmptyText = true;\n");
      out.write("            this.all.clear();\n");
      out.write("            return;\n");
      out.write("        }\n");
      out.write("        this.tpl.overwrite(this.el, this.collectData(records, 0));\n");
      out.write("        this.all.fill(CQ.Ext.query(this.itemSelector, this.el.dom));\n");
      out.write("        this.updateIndexes(0);\n");
      out.write("\n");
      out.write("        //CQ: START\n");
      out.write("        //select first item by default\n");
      out.write("        this.select(0);\n");
      out.write("        //CQ: END\n");
      out.write("    };\n");
      out.write("\n");
      out.write("   var createDialog = {\n");
      out.write("        \"jcr:primaryType\": \"cq:Dialog\",\n");
      out.write("        \"id\": CQ.Util.createId(\"cq-createdialog\"),\n");
      out.write("        \"title\":CQ.I18n.getMessage(\"Create Page\"),\n");
      out.write("        \"formUrl\":\"/bin/wcmcommand\",\n");
      out.write("        \"params\": {\n");
      out.write("            \"cmd\":\"createPage\",\n");
      out.write("            \"_charset_\":\"utf-8\"\n");
      out.write("        },\n");
      out.write("        \"height\": 520,\n");
      out.write("        \"items\": {\n");
      out.write("            \"jcr:primaryType\": \"cq:Panel\",\n");
      out.write("            \"items\": {\n");
      out.write("                \"jcr:primaryType\": \"cq:WidgetCollection\",\n");
      out.write("                \"title\": {\n");
      out.write("                    \"fieldLabel\":CQ.I18n.getMessage(\"Title\"),\n");
      out.write("                    \"allowBlank\":false,\n");
      out.write("                    \"name\":\"title\"\n");
      out.write("                },\n");
      out.write("                \"label\": {\n");
      out.write("                    \"fieldLabel\":CQ.I18n.getMessage(\"Name\"),\n");
      out.write("                    \"vtype\":\"itemname\",\n");
      out.write("                    \"name\":\"label\"\n");
      out.write("                },\n");
      out.write("                \"template\": {\n");
      out.write("                    \"xtype\": \"panel\",\n");
      out.write("                    \"border\": false,\n");
      out.write("                    \"cls\": \"cq-template-view\",\n");
      out.write("                    \"autoScroll\":true,\n");
      out.write("                    \"width\": \"100%\",\n");
      out.write("                    \"autoHeight\":false,\n");
      out.write("                    \"height\": 350,\n");
      out.write("                    \"items\": [\n");
      out.write("                        hiddenTemplate,\n");
      out.write("                        dataView\n");
      out.write("                    ]\n");
      out.write("                    ,\"listeners\": {\n");
      out.write("                        \"render\" : {\n");
      out.write("                            fn: function() {\n");
      out.write("                                templatesStore.load();\n");
      out.write("                            }\n");
      out.write("                        }\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        },\n");
      out.write("        \"okText\":CQ.I18n.getMessage(\"Create\")\n");
      out.write("    };\n");
      out.write("\n");
      out.write("    var dialog = CQ.WCM.getDialog(createDialog);\n");
      out.write("\n");
      out.write("    dialog.on(\"beforesubmit\", function() {\n");
      out.write("        if(dataView.getSelectedRecords()[0] && dataView.getSelectedRecords()[0].data)\n");
      out.write("            hiddenTemplate.setRawValue(dataView.getSelectedRecords()[0].data.path);\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    dialog.addHidden({ \"parentPath\":parentPath });\n");
      out.write("    dialog.success = function(form, action) {\n");
      out.write("        var path = action.result[\"Location\"];\n");
      out.write("        var search = CQ.portlets.prefix;\n");
      out.write("        var pos = path.indexOf(search);\n");
      out.write("        path = path.substring(pos + CQ.portlets.prefixlength);\n");
      out.write("        var parPos = path.indexOf(\"?\");\n");
      out.write("        if ( parPos > 0 ) {\n");
      out.write("        \tpath = path.substring(0, parPos);\n");
      out.write("        }\n");
      out.write("        CQ.Ext.getCmp(\"cqportletprefspathfield\").setValue(path);\n");
      out.write("    };\n");
      out.write("    dialog.failure = function(){\n");
      out.write("        CQ.Ext.Msg.alert(\n");
      out.write("            CQ.I18n.getMessage(\"Error\"),\n");
      out.write("            CQ.I18n.getMessage(\"Could not create page.\")\n");
      out.write("        );\n");
      out.write("    };\n");
      out.write("\n");
      out.write("    dialog.show();\n");
      out.write("};    \n");
      out.write("CQ.Ext.onReady(function(){\n");
      out.write("   PORTLET_PREFS\n");
      out.write("   CQ.portlets.prefixlength = data.prefixLength;\n");
      out.write("   CQ.portlets.prefix = data.prefix;\n");
      out.write("   var redirectCancel = data.redirectCancel;\n");
      out.write("   var createDialog = {\n");
      out.write("        \"jcr:primaryType\": \"cq:Dialog\",\n");
      out.write("        \"title\":CQ.I18n.getMessage(\"Portlet Preferences\"),\n");
      out.write("        \"formUrl\":data.url,\n");
      out.write("        \"height\": 520,\n");
      out.write("        \"modal\":true,\n");
      out.write("        \"items\": {\n");
      out.write("            \"jcr:primaryType\": \"cq:Panel\",\n");
      out.write("            \"items\": {\n");
      out.write("                \"jcr:primaryType\": \"cq:WidgetCollection\",\n");
      out.write("                \"path\": {\n");
      out.write("                    \"fieldLabel\":CQ.I18n.getMessage(\"Start Path\"),\n");
      out.write("                    \"allowBlank\":false,\n");
      out.write("                    \"name\":\"startPath\",\n");
      out.write("                    \"xtype\":\"pathfield\",\n");
      out.write("                    \"id\": \"cqportletprefspathfield\",\n");
      out.write("                    \"rootPath\":\"/\",\n");
      out.write("                    \"value\": data.startPath\n");
      out.write("                },\n");
      out.write("                \"create\": {\n");
      out.write("                    \"xtype\":\"compositefield\",\n");
      out.write("                    \"border\":false,\n");
      out.write("                    \"items\":[\n");
      out.write("                    { \n");
      out.write("                        \"xtype\":\"panel\",\n");
      out.write("                        \"border\":false,\n");
      out.write("                        \"bodyStyle\":\"padding:4px\",\n");
      out.write("                        \"items\":[{\n");
      out.write("                            \"xtype\":\"button\",\n");
      out.write("                            \"text\":CQ.I18n.getMessage(\"Create Page\"),\n");
      out.write("                            \"handler\":function() {\n");
      out.write("                                CQ.portlets.createPage();\n");
      out.write("                            },\n");
      out.write("                        }]\n");
      out.write("                    }]\n");
      out.write("                },\n");
      out.write("                \"selector\": {\n");
      out.write("                    \"fieldLabel\":CQ.I18n.getMessage(\"HTML Selector\"),\n");
      out.write("                    \"name\":\"htmlSelector\",\n");
      out.write("                    \"xtype\":\"textfield\",\n");
      out.write("                    \"value\": data.htmlSelector\n");
      out.write("                },\n");
      out.write("                \"urlParamNames\": {\n");
      out.write("                    \"fieldLabel\":CQ.I18n.getMessage(\"URL Parameters\"),\n");
      out.write("                    \"name\" : \"urlParameterNames\",\n");
      out.write("                    \"xtype\":\"textfield\",\n");
      out.write("                    \"value\": data.urlParameterNames\n");
      out.write("                },\n");
      out.write("                \"privToolbar\": {\n");
      out.write("                    \"fieldLabel\":CQ.I18n.getMessage(\"Priv Toolbar\"),\n");
      out.write("                    \"name\" : \"priv:toolbar\",\n");
      out.write("                    \"xtype\":\"textfield\",\n");
      out.write("                    \"value\": data[\"priv:toolbar\"]\n");
      out.write("                },\n");
      out.write("                \"privPrefs\": {\n");
      out.write("                    \"fieldLabel\":CQ.I18n.getMessage(\"Priv Prefs\"),\n");
      out.write("                    \"name\" : \"priv:prefs\",\n");
      out.write("                    \"xtype\":\"textfield\",\n");
      out.write("                    \"value\": data[\"priv:prefs\"]\n");
      out.write("                },\n");
      out.write("                \"privAuthorEdit\": {\n");
      out.write("                    \"fieldLabel\":CQ.I18n.getMessage(\"Priv Author Edit\"),\n");
      out.write("                    \"name\" : \"priv:cq-author:edit\",\n");
      out.write("                    \"xtype\":\"textfield\",\n");
      out.write("                    \"value\": data[\"priv:cq-author:edit\"]\n");
      out.write("                },\n");
      out.write("                \"privAuthorPreview\": {\n");
      out.write("                    \"fieldLabel\":CQ.I18n.getMessage(\"Priv Author Preview\"),\n");
      out.write("                    \"name\" : \"priv:cq-author:preview\",\n");
      out.write("                    \"xtype\":\"textfield\",\n");
      out.write("                    \"value\": data[\"priv:cq-author:preview\"]\n");
      out.write("                },\n");
      out.write("                \"privAuthorSiteadmin\": {\n");
      out.write("                    \"fieldLabel\":CQ.I18n.getMessage(\"Priv Author SiteAdmin\"),\n");
      out.write("                    \"name\" : \"priv:cq-author:siteadmin\",\n");
      out.write("                    \"xtype\":\"textfield\",\n");
      out.write("                    \"value\": data[\"priv:cq-author:siteadmin\"]\n");
      out.write("                },\n");
      out.write("                \"cssHeader\":{\n");
      out.write("                    \"fieldLabel\":CQ.I18n.getMessage(\"Include CSS\"),\n");
      out.write("                    \"name\":\"addCssToPortalHeader\",\n");
      out.write("                    \"type\":\"checkbox\",\n");
      out.write("                    \"xtype\":\"selection\",\n");
      out.write("                    \"value\": data.addCssToPortalHeader\n");
      out.write("                },\n");
      out.write("                \"includeToolbar\":{\n");
      out.write("                    \"fieldLabel\":CQ.I18n.getMessage(\"Include Toolbar\"),\n");
      out.write("                    \"name\":\"includeToolbar\",\n");
      out.write("                    \"type\":\"checkbox\",\n");
      out.write("                    \"xtype\":\"selection\",\n");
      out.write("                    \"value\": data.includeToolbar\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        },\n");
      out.write("        \"okText\":CQ.I18n.getMessage(\"Change\")\n");
      out.write("    };\n");
      out.write("    var dialog = CQ.WCM.getDialog(createDialog);\n");
      out.write("    dialog.on(\"hide\", function() {\n");
      out.write("        window.location = redirectCancel;\n");
      out.write("    });\n");
      out.write("    dialog.addHidden({ \"cqp:prefs\":\"true\", \"cqp:action\":\"prefs\", \"urlParameterNames@TypeHint\":\"String[]\"});\n");
      out.write("    dialog.ok = function() {\n");
      out.write("        var form = this.form.el.dom;\n");
      out.write("        form.action = this.form.url;\n");
      out.write("        form.submit();\n");
      out.write("    }\n");
      out.write("    dialog.show();\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
