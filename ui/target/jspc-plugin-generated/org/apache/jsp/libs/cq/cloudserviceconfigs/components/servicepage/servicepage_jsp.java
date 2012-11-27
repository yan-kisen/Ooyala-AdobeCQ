package org.apache.jsp.libs.cq.cloudserviceconfigs.components.servicepage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Iterator;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;
import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.webservicesupport.Service;
import com.day.cq.wcm.webservicesupport.ConfigurationManager;
import com.day.cq.wcm.webservicesupport.ConfigurationUtil;
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
import java.util.Iterator;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;
import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.webservicesupport.ConfigurationUtil;

public final class servicepage_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {


    /**
     * Generates HTML code for a service {@link Page}'s configuration children.
     * 
     * @param page
     * @return an indented HTML list of hyperlinks
     */
    protected String printChildren(Page page) {
        StringBuffer sb = new StringBuffer();
        Iterator<Page> configPages = page.listChildren();
        if (configPages.hasNext()) {
            sb.append("<ul style='margin-bottom: 0px;'>");
            while (configPages.hasNext()) {
                Page child = configPages.next();
                Resource tmpl = child.getTemplate().adaptTo(Resource.class);
                ValueMap tmplVals =  tmpl.getResourceResolver().getResource(tmpl.getPath() + "/jcr:content").adaptTo(ValueMap.class);
                String compPath = tmplVals.get("sling:resourceType", "");
                ValueMap comp = tmpl.getResourceResolver().getResource(compPath).adaptTo(ValueMap.class);
                String view = "contentfinder".equals(comp.get("cq:defaultView", "")) ? "/cf#" : "";
                if (child != null) {
                    sb.append("<li class=\"config\">&raquo; <a href=\"");
                    sb.append(view + child.getPath());
                    sb.append(".html\">");
                    sb.append(child.getTitle());
                    sb.append(" (");
                    sb.append(child.getTemplate().getTitle().replace( "Adobe ", ""));
                    sb.append(")");
                    sb.append("</a>");
                    if (child.getTemplate().getTitle().contains("SiteCatalyst")) {
                        sb.append(" [<a href=\"javascript: CQ.cloudservices.editNewConfiguration('");
                        sb.append(child.getPath() + "','" + child.getPath() +"', false, 'Create Framework')\"");
                        sb.append(" style=\"color: #336600;\" title=\"Create Child Framework\">");
                        sb.append("<b>+</b></a>]");  
                    }
                    sb.append("</li>");
                    if (child.listChildren().hasNext()) {
                        sb.append(printChildren(child));
                    }
                }
            }
            sb.append("</ul>");
        }
        return sb.toString();
    }

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/libs/foundation/global.jsp");
    _jspx_dependants.add("/libs/cq/cloudserviceconfigs/components/childlist/childlist.jsp");
  }

  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005fincludeClientLib_005fcategories_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005finclude_005fresourceType_005fpath_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcq_005fincludeClientLib_005fcategories_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcq_005finclude_005fresourceType_005fpath_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fcq_005fincludeClientLib_005fcategories_005fnobody.release();
    _005fjspx_005ftagPool_005fcq_005finclude_005fresourceType_005fpath_005fnobody.release();
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

      out.write('\n');












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






    ConfigurationManager cfgMgr = sling.getService(ConfigurationManager.class);
    Service service = cfgMgr.getService(currentPage.getName());
    String pageTitle =  xssAPI.encodeForHTML(properties.get("jcr:title", "Cloud Services"));
    

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>CQ5 Cloud Service | ");
      out.print( pageTitle );
      out.write("</title>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; utf-8\" />\n");
      out.write("    <script src=\"/libs/cq/ui/resources/cq-ui.js\" type=\"text/javascript\"></script>\n");
      out.write("    ");
      if (_jspx_meth_cq_005fincludeClientLib_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</head>\n");
      out.write("<body> \n");
      out.write("    ");


        Resource pageResource = resource.getParent();
        String id = pageResource.getName();
        ValueMap content = resource.adaptTo(ValueMap.class);
        if (content == null) {
            content = ValueMap.EMPTY;
        }
        String title =  xssAPI.encodeForHTML(content.get("jcr:title", ""));
        String description =  xssAPI.encodeForHTML(content.get("jcr:description", ""));       

        Boolean isEnabled = ConfigurationUtil.hasConfigurations(pageResource);               
        String globalIcnCls = "cq-config-header";
        globalIcnCls += isEnabled ? "-on" : "-off";                
        String status =  isEnabled ? "enabled" : "disabled";

        
      out.write("\n");
      out.write("        <div>");
      if (_jspx_meth_cq_005finclude_005f0(_jspx_page_context))
        return;
      out.write("</div>\n");
      out.write("        \n");
      out.write("        <div class=\"cq-cloudservice-dms\">\n");
      out.write("        <h2 class=\"");
      out.print( globalIcnCls );
      out.write('"');
      out.write('>');
      out.print( title );
      out.write("</h2>");

        
      out.write('<');
      out.write('p');
      out.write('>');
      out.print( description );
      out.write("</p>");

        String thumbnailPath = service.getThumbnailPath();
        if (thumbnailPath == null) {
            thumbnailPath = "/libs/cq/cloudserviceconfigs/widgets/themes/default/widgets/CloudServiceDialog/thumbnail.png";
        }
        
      out.write("\n");
      out.write("         <div class=\"cq-cloudservice-thumb-empty\">\n");
      out.write("            <img src=\"");
      out.print(thumbnailPath);
      out.write("\" class=\"thumb\" alt=\"");
      out.print(title);
      out.write("\" /> \n");
      out.write("        </div> \n");
      out.write("        <div style=\"padding: 0px 0px 0px 15px; width: 522px; float:left;\"> \n");
      out.write("            <div style=\"padding: 2px 0px 2px 0px;  border-bottom: 1px solid #f5f5f5; height: 18px; background-color: #f9f9f9;\">\n");
      out.write("                <div style=\"padding-left: 12px; width: 250px; float: left;\">Service is</div>\n");
      out.write("                <div style=\"padding-left: 10px; width: 100px; float: left;\"><strong>");
      out.print( status );
      out.write("</strong></div>\n");
      out.write("            </div> \n");
      out.write("            ");

            Resource statistics = pageResource.getChild("statistics");
            if (statistics != null) {
                int cnt = 0;
                for(Iterator<Resource> it = statistics.listChildren(); it.hasNext();) {
                    cnt++;
                    Resource stat = it.next();
                    ValueMap stats = stat.adaptTo(ValueMap.class);
                    String name = stats.get("jcr:title",stat.getName());
                    String value = stats.get("total", "0");
                
      out.write("\n");
      out.write("                <div style=\"padding: 2px 0px 2px 0px;  border-bottom: 1px solid #f5f5f5; height: 18px;  \n");
      out.write("                        ");
      out.print( (cnt%2 == 0) ? "background-color: #f9f9f9;" : "" );
      out.write(";\">\n");
      out.write("                    <div style=\"padding-left: 12px; width: 250px; float: left;\">");
      out.print(name);
      out.write("</div>\n");
      out.write("                    <div style=\"padding-left: 10px; width: 100px; float: left;\"><strong>");
      out.print(value);
      out.write("</strong></div>\n");
      out.write("                </div> \n");
      out.write("                ");

                }
            }
            
      out.write("\n");
      out.write("        </div>\n");
      out.write("        </div>       \n");
      out.write("        <div class=\"available-configs\">\n");
      out.write("            <h2 style=\"border: none; margin-top: 10px; padding-left:0px;\">Available Configurations\n");
      out.write("            ");
 String resPath = resource.getPath().replace("/jcr:content", ""); 
      out.write(" \n");
      out.write("            [<a href=\"javascript: CQ.cloudservices.editNewConfiguration('");
      out.print(resPath);
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.print(resPath);
      out.write("', true, 'Create Configuration')\" style=\"color: #336600;\" title=\"Add new configuration\"><b>+</b></a>]\n");
      out.write("            </h2>\n");
      out.write("            ");










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






      out.write('\n');
      out.write("\n");
      out.write("            ");
      out.print(printChildren(currentPage));
      out.write("\n");
      out.write("        </div> \n");
      out.write("</body>\n");
      out.write("</html>\n");
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
    // /libs/cq/cloudserviceconfigs/components/servicepage/servicepage.jsp(40,4) name = categories type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005fincludeClientLib_005f0.setCategories("cq.wcm.edit,cq.cloudserviceconfigs");
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
    // /libs/cq/cloudserviceconfigs/components/servicepage/servicepage.jsp(60,13) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005finclude_005f0.setPath("trail");
    // /libs/cq/cloudserviceconfigs/components/servicepage/servicepage.jsp(60,13) name = resourceType type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005finclude_005f0.setResourceType("cq/cloudserviceconfigs/components/trail");
    int _jspx_eval_cq_005finclude_005f0 = _jspx_th_cq_005finclude_005f0.doStartTag();
    if (_jspx_th_cq_005finclude_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005finclude_005fresourceType_005fpath_005fnobody.reuse(_jspx_th_cq_005finclude_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005finclude_005fresourceType_005fpath_005fnobody.reuse(_jspx_th_cq_005finclude_005f0);
    return false;
  }
}
