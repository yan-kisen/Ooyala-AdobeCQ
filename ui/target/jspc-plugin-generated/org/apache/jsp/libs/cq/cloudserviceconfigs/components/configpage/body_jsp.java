package org.apache.jsp.libs.cq.cloudserviceconfigs.components.configpage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.jcr.Node;
import java.util.Iterator;
import com.day.cq.wcm.webservicesupport.Configuration;
import com.day.cq.wcm.webservicesupport.Service;
import org.apache.commons.lang.StringEscapeUtils;
import org.apache.sling.api.resource.Resource;
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
import com.day.cq.wcm.webservicesupport.Configuration;
import com.day.cq.wcm.webservicesupport.Service;
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
import com.day.cq.wcm.api.WCMMode;

public final class body_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(3);
    _jspx_dependants.add("/libs/foundation/global.jsp");
    _jspx_dependants.add("/libs/cq/cloudserviceconfigs/components/configpage/init.jsp");
    _jspx_dependants.add("/libs/cq/cloudserviceconfigs/components/configpage/opendialog.jspf");
  }

  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005fincludeClientLib_005fcategories_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005finclude_005fresourceType_005fpath_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005finclude_005fscript_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcq_005fincludeClientLib_005fcategories_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcq_005finclude_005fresourceType_005fpath_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcq_005finclude_005fscript_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fcq_005fincludeClientLib_005fcategories_005fnobody.release();
    _005fjspx_005ftagPool_005fcq_005finclude_005fresourceType_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fcq_005finclude_005fscript_005fnobody.release();
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


      out.write('\n');
      out.write('\n');










      //  cq:defineObjects
      com.day.cq.wcm.tags.DefineObjectsTag _jspx_th_cq_005fdefineObjects_005f1 = (com.day.cq.wcm.tags.DefineObjectsTag) _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.get(com.day.cq.wcm.tags.DefineObjectsTag.class);
      _jspx_th_cq_005fdefineObjects_005f1.setPageContext(_jspx_page_context);
      _jspx_th_cq_005fdefineObjects_005f1.setParent(null);
      int _jspx_eval_cq_005fdefineObjects_005f1 = _jspx_th_cq_005fdefineObjects_005f1.doStartTag();
      if (_jspx_th_cq_005fdefineObjects_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.reuse(_jspx_th_cq_005fdefineObjects_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.reuse(_jspx_th_cq_005fdefineObjects_005f1);
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


      out.write(' ');
      out.write('\n');
      out.write('\n');
      if (_jspx_meth_cq_005fincludeClientLib_005f0(_jspx_page_context))
        return;
      out.write('\n');
      out.write('\n');

    String serviceUrl = null;
    String serviceUrlLabel = "Go to service provider";

    String thumbnailPath = "/libs/cq/cloudserviceconfigs/widgets/themes/default/widgets/CloudServiceDialog/thumbnail.png";
    String serviceName = "Cloud service";

    Configuration configuration = resourcePage.adaptTo(Configuration.class);   
    if (configuration != null ){
        serviceUrl = configuration.getInherited("serviceAdminUrl", null);
        Service service = configuration.getParent().adaptTo(Service.class);
        if (service!= null ){
            serviceName = service.getTitle();
            serviceUrlLabel = "Go to " + serviceName;
            thumbnailPath = service.getThumbnailPath();
        }
    }

      out.write('\n');

    String id = currentPage.getName();
    String title = StringEscapeUtils.escapeHtml(properties.get("jcr:title", id)); 
    String description = StringEscapeUtils.escapeHtml(properties.get("jcr:description", ""));
    

    String path = resource.getPath();
    String resourceType = resource.getResourceType();
    String dialogPath = (!resourceType.startsWith("/libs") ? "/libs/" : "") + resourceType + "/dialog";  
     

      out.write("<body>\n");
      out.write("    <div>");
      if (_jspx_meth_cq_005finclude_005f0(_jspx_page_context))
        return;
      out.write("</div>\n");
      out.write("    <h1>");
      out.print( title );
      out.write("</h1>\n");
      out.write("    <p>");
      out.print( description );
      out.write("</p>\n");
      out.write("    <div>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        CQ.WCM.edit({\n");
      out.write("            \"path\":\"");
      out.print( path );
      out.write("\",\n");
      out.write("            \"dialog\":\"");
      out.print( dialogPath );
      out.write("\",\n");
      out.write("            \"type\":\"");
      out.print( resourceType );
      out.write("\",\n");
      out.write("            \"editConfig\":{\n");
      out.write("                \"xtype\":\"editbar\",\n");
      out.write("                \"listeners\":{\n");
      out.write("                    \"afteredit\":\"REFRESH_PAGE\"\n");
      out.write("                },\n");
      out.write("                \"inlineEditing\":CQ.wcm.EditBase.INLINE_MODE_NEVER,\n");
      out.write("                \"actions\":[\n");
      out.write("                    CQ.I18n.getMessage(\"Configuration\"),\n");
      out.write("                    {\n");
      out.write("                        \"xtype\": \"tbseparator\"\n");
      out.write("                    },\n");
      out.write("                    CQ.wcm.EditBase.EDIT\n");
      out.write("                    ");

                    if (serviceUrl != null) {
                    
      out.write("\n");
      out.write("                    ,    \n");
      out.write("                    {\n");
      out.write("                        \"xtype\": \"tbseparator\"\n");
      out.write("                    },                \n");
      out.write("                    {\n");
      out.write("                        \"xtype\": \"tbtext\", \n");
      out.write("                        \"text\": \"<a href='");
      out.print(serviceUrl);
      out.write("' target='_blank' style='color: #15428B; cursor: pointer; text-decoration: underline'>\" + CQ.I18n.getMessage(\"");
      out.print(serviceUrlLabel);
      out.write("\") + \"</span>\"\n");
      out.write("                    }\n");
      out.write("                    ");

                    }
                    
      out.write("\n");
      out.write("                ]\n");
      out.write("            }\n");
      out.write("        });\n");
      out.write("        </script>     \n");
      out.write("    </div>\n");
      out.write("    ");
      if (_jspx_meth_cq_005finclude_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    <script type=\"text/javascript\">\n");
 if (((String)properties.get(configuration.getInherited("connectedWhen", "username"), "")).trim().equals("")) { 
      out.write("\n");
      out.write("        CQ.WCM.onEditableReady(\"");
      out.print( path );
      out.write("\", function(editable){\n");
      out.write("            CQ.wcm.EditBase.showDialog(editable);\n");
      out.write("        }, this);\n");
 } else {
      out.write("\n");
      out.write("        $CQ(\".when-config-successful\").show();\n");
 } 
      out.write("\n");
      out.write("    </script>     \n");
      out.write("\n");
      out.write("    <p>&nbsp;</p>\n");
      out.write("</body>");
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

  private boolean _jspx_meth_cq_005fincludeClientLib_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:includeClientLib
    com.day.cq.wcm.tags.IncludeClientLibraryTag _jspx_th_cq_005fincludeClientLib_005f0 = (com.day.cq.wcm.tags.IncludeClientLibraryTag) _005fjspx_005ftagPool_005fcq_005fincludeClientLib_005fcategories_005fnobody.get(com.day.cq.wcm.tags.IncludeClientLibraryTag.class);
    _jspx_th_cq_005fincludeClientLib_005f0.setPageContext(_jspx_page_context);
    _jspx_th_cq_005fincludeClientLib_005f0.setParent(null);
    // /libs/cq/cloudserviceconfigs/components/configpage/init.jsp(25,0) name = categories type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005fincludeClientLib_005f0.setCategories("cq.wcm.edit");
    int _jspx_eval_cq_005fincludeClientLib_005f0 = _jspx_th_cq_005fincludeClientLib_005f0.doStartTag();
    if (_jspx_th_cq_005fincludeClientLib_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005fincludeClientLib_005fcategories_005fnobody.reuse(_jspx_th_cq_005fincludeClientLib_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005fincludeClientLib_005fcategories_005fnobody.reuse(_jspx_th_cq_005fincludeClientLib_005f0);
    return false;
  }

  private boolean _jspx_meth_cq_005finclude_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:include
    com.day.cq.wcm.tags.IncludeTag _jspx_th_cq_005finclude_005f0 = (com.day.cq.wcm.tags.IncludeTag) _005fjspx_005ftagPool_005fcq_005finclude_005fresourceType_005fpath_005fnobody.get(com.day.cq.wcm.tags.IncludeTag.class);
    _jspx_th_cq_005finclude_005f0.setPageContext(_jspx_page_context);
    _jspx_th_cq_005finclude_005f0.setParent(null);
    // /libs/cq/cloudserviceconfigs/components/configpage/body.jsp(37,9) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005finclude_005f0.setPath("trail");
    // /libs/cq/cloudserviceconfigs/components/configpage/body.jsp(37,9) name = resourceType type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005finclude_005f0.setResourceType("cq/cloudserviceconfigs/components/trail");
    int _jspx_eval_cq_005finclude_005f0 = _jspx_th_cq_005finclude_005f0.doStartTag();
    if (_jspx_th_cq_005finclude_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005finclude_005fresourceType_005fpath_005fnobody.reuse(_jspx_th_cq_005finclude_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005finclude_005fresourceType_005fpath_005fnobody.reuse(_jspx_th_cq_005finclude_005f0);
    return false;
  }

  private boolean _jspx_meth_cq_005finclude_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:include
    com.day.cq.wcm.tags.IncludeTag _jspx_th_cq_005finclude_005f1 = (com.day.cq.wcm.tags.IncludeTag) _005fjspx_005ftagPool_005fcq_005finclude_005fscript_005fnobody.get(com.day.cq.wcm.tags.IncludeTag.class);
    _jspx_th_cq_005finclude_005f1.setPageContext(_jspx_page_context);
    _jspx_th_cq_005finclude_005f1.setParent(null);
    // /libs/cq/cloudserviceconfigs/components/configpage/body.jsp(77,4) name = script type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005finclude_005f1.setScript("content.jsp");
    int _jspx_eval_cq_005finclude_005f1 = _jspx_th_cq_005finclude_005f1.doStartTag();
    if (_jspx_th_cq_005finclude_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005finclude_005fscript_005fnobody.reuse(_jspx_th_cq_005finclude_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005finclude_005fscript_005fnobody.reuse(_jspx_th_cq_005finclude_005f1);
    return false;
  }
}
