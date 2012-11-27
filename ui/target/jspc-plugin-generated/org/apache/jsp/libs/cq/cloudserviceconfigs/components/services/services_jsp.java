package org.apache.jsp.libs.cq.cloudserviceconfigs.components.services;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
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
import java.util.Iterator;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;
import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.webservicesupport.ConfigurationUtil;

public final class services_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
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

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcq_005fincludeClientLib_005fcategories_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fcq_005fincludeClientLib_005fcategories_005fnobody.release();
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








    ConfigurationManager cfgMgr = sling.getService(ConfigurationManager.class);
    String pageTitle = properties.get("jcr:title", "Cloud Services");
    

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>CQ5 Cloud Services | ");
      out.print( pageTitle );
      out.write("</title>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; utf-8\" />\n");
      out.write("    <script src=\"/libs/cq/ui/resources/cq-ui.js\" type=\"text/javascript\"></script>\n");
      out.write("    ");
      if (_jspx_meth_cq_005fincludeClientLib_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<script language=\"javascript\" type=\"text/javascript\">\n");
      out.write("\n");
      out.write("function thumbClick(id){ \n");
      out.write("      if (document.getElementById(id+\"-border\").style.visibility == \"hidden\")\n");
      out.write("      {\n");
      out.write("         document.getElementById(id+\"-border\").style.visibility=\"visible\"; \n");
      out.write("         document.getElementById(id+\"-border\").style.display=\"block\"; \n");
      out.write("         document.getElementById(id+\"-more\").style.visibility=\"visible\";\n");
      out.write("         document.getElementById(id+\"-more\").style.display=\"block\";\n");
      out.write("      }\n");
      out.write("      else\n");
      out.write("      {\n");
      out.write("        document.getElementById(id+\"-border\").style.visibility=\"hidden\"; \n");
      out.write("        document.getElementById(id+\"-border\").style.display=\"none\";\n");
      out.write("        document.getElementById(id+\"-more\").style.visibility=\"hidden\";\n");
      out.write("        document.getElementById(id+\"-more\").style.display=\"none\";\n");
      out.write("      } \n");
      out.write("}\n");
      out.write(" \n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<body style=\"background-color: #ffffff; padding: 70px 40px 40px 40px\"> \n");
      out.write("\n");
      out.write("<div style=\"font-size: 20px; color: #336600; padding: 0px 0px 5px 0px; width: 615px; border-bottom: 1px solid #f1f1f1; margin-bottom: 35px\"><b>Adobe Digital Marketing Suite</b></div>\n");
      out.write("\n");
      out.write("    ");

        for (Iterator<Resource> iter = resource.listChildren(); iter.hasNext();) {
            Resource child = iter.next();
            
            if (ConfigurationUtil.isService(child) ) {
                Service service = cfgMgr.getService(child.getName());
                String id = child.getName();
                ValueMap content = child.getChild("./jcr:content").adaptTo(ValueMap.class);
                if (content == null) {
                    content = ValueMap.EMPTY;
                }
                //select only adobe products
                if ( content.get("jcr:title", "").contains("Adobe") ){
                    String title = content.get("jcr:title", "");
                    String description = content.get("jcr:description", "");       
    
                    Boolean isEnabled = ConfigurationUtil.hasConfigurations(child);                  
                    String status =  isEnabled ? "enabled" : "disabled";
        
                    
      out.write("\n");
      out.write("                    <div class=\"cq-cloudservice-dms\">  \n");
      out.write("                            ");

                            String thumbnailPath = service.getThumbnailPath();
                            if (thumbnailPath == null) {
                                thumbnailPath = "/libs/cq/cloudserviceconfigs/widgets/themes/default/widgets/CloudServiceDialog/thumbnail.png";
                            }
                            thumbnailPath = request.getContextPath() + thumbnailPath;
                            
      out.write("\n");
      out.write("                        <div class=\"cq-cloudservice-thumb\" style=\"background: url('");
      out.print(thumbnailPath);
      out.write("');\" id=\"");
      out.print( id );
      out.write("\" onClick=\"thumbClick('");
      out.print( id );
      out.write("')\">    \n");
      out.write("                            <img src=\"/libs/cq/cloudserviceconfigs/widgets/themes/default/thumbnailBorder.png\" id=\"");
      out.print( id );
      out.write("-border\" style=\"visibility: hidden; display: none;\" />\n");
      out.write("                        </div>\n");
      out.write("                    \n");
      out.write("                        <div style=\"padding: 0px 0px 0px 15px; width: 520px; float:left;\"> \n");
      out.write("                            <span style=\"font-size: 18px; color: #336600; font-weight: bold; cursor: pointer\"  onClick=\"thumbClick('");
      out.print( id );
      out.write("')\">");
      out.print( title );
      out.write("</span><br/> \n");
      out.write("                            <span>\n");
      out.write("                                ");
      out.print( content.get("description", "") );
      out.write("\n");
      out.write("                            </span>\n");
      out.write("                            \n");
      out.write("                            <div id=\"");
      out.print( id );
      out.write("-more\" style=\"visibility: hidden; display: none; padding: 15px 0px 0px 0px;\"> \n");
      out.write("                            ");
 if (!isEnabled){ 
      out.write("\n");
      out.write("                            \n");
      out.write("                                <span> \n");
      out.write("                                ");
      out.print( content.get("descriptionExtended", "") );
      out.write("\n");
      out.write("                                </span>\n");
      out.write("                                \n");
      out.write("                                <div style=\"padding: 20px 0px 20px 0px\">\n");
      out.write("                                    <div style=\"float: left; width: 245px; border-left: 1px solid #f1f1f1; padding: 0px 0px 0px 10px;\">\n");
      out.write("                                        <div style=\"color: #336600; font-weight: bold; padding: 0px 2px 5px 2px; margin-top: -2px;\">Not a ");
      out.print( title.replace("Adobe ", "") );
      out.write(" customer yet?</div> \n");
      out.write("                                        <input type=\"button\" value=\"Learn More\" onClick=\"javascript: window.open('");
      out.print( content.get("serviceUrl", "") );
      out.write("', '_blank')\" style=\"margin-bottom: 0px;\">\n");
      out.write("                                    </div>\n");
      out.write("                                    \n");
      out.write("                                    <div style=\"float: left; width: 245px; border-left: 1px solid #f1f1f1; padding: 0px 0px 0px 10px;\">\n");
      out.write("                                        <div style=\"color: #336600; font-weight: bold; padding: 0px 2px 5px 2px; margin-top: -2px;\">Already a ");
      out.print( title.replace("Adobe ", "") );
      out.write(" customer?</div>\n");
      out.write("                                        <input type=\"button\" value=\"Configure Now\" style=\"margin-bottom: 0px;\"\n");
      out.write("                                               onclick=\"CQ.cloudservices.editNewConfiguration('");
      out.print(child.getPath());
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.print(child.getPath());
      out.write("', undefined, 'Create Configuration')\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                \n");
      out.write("                             ");
 }else{ 
      out.write("  \n");
      out.write("                                 <div style=\"clear:both; padding:0px; border-top: 1px solid #f5f5f5; margin: 0px 0px 0px 0px\"> \n");
      out.write("                                        ");

                                        Resource statistics = child.getChild("statistics"); 
                                        if (statistics != null) {
                                            int cnt = 0;
                                            for(Iterator<Resource> it = statistics.listChildren(); it.hasNext();) {
                                                cnt++;
                                                Resource stat = it.next();
                                                ValueMap stats = stat.adaptTo(ValueMap.class);
                                                String name = stats.get("jcr:title",stat.getName());
                                                String value = stats.get("total", "0");
                                            
      out.write(" \n");
      out.write("                                                <div style=\"padding: 2px 0px 2px 0px;  border-bottom: 1px solid #f5f5f5; height: 18px; ");
      out.print( (cnt%2 == 1) ? "background-color: #f9f9f9;" : "" );
      out.write("\">\n");
      out.write("                                                    <div style=\"padding-left: 12px; width: 250px; float: left;\">");
      out.print(name);
      out.write("</div>\n");
      out.write("                                                    <div style=\"padding-left: 10px; width: 100px; float: left;\"><strong>");
      out.print(value);
      out.write("</strong></div>\n");
      out.write("                                                </div>    \n");
      out.write("                                            ");

                                            }
                                        }
                                        
      out.write("\n");
      out.write("                                  </ul>      \n");
      out.write("                                  </div>   \n");
      out.write("                                  <div style=\"padding:20px 10px 20px 0px\">\n");
      out.write("                                    <div style=\"float: left; width: 245px; border-left: 1px solid #f1f1f1; padding: 0px 0px 0px 10px;\"> \n");
      out.write("                                        <div style=\"color: #336600; font-weight: bold; padding: 0px 2px 5px 2px; margin-top: -2px;\">");
      out.print( title.replace("Adobe ", "") );
      out.write(" is configured</div> \n");
      out.write("                                        <input type=\"button\" value=\"Show configurations\" onClick=\"document.getElementById('");
      out.print(title);
      out.write("-configurations').style.display='block';\" \n");
      out.write("                                               style=\"margin-bottom: 0px;\" /> \n");
      out.write("                                    </div> \n");
      out.write("                                    <div  class=\"available-configs\" id=\"");
      out.print(title);
      out.write("-configurations\" style=\"float: left; display: none;\">\n");
      out.write("                                        <div style=\"color: #336600; font-weight: bold; padding: 20px 0px 0px 02px; margin-top: 0px; border-bottom: 1px solid #f1f1f1;\">Available Configurations \n");
      out.write("                                            [<a href=\"javascript: CQ.cloudservices.editNewConfiguration('");
      out.print(child.getPath());
      out.write('\'');
      out.write(',');
      out.write('\'');
      out.print(child.getPath());
      out.write("', true);\"\n");
      out.write("                                                style=\"color: #336600;\" title=\"Add new configuration\"><b>+</b></a>]\n");
      out.write("                                        </div>\n");
      out.write("                                        ");










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
      out.write("                                        ");
      out.print(printChildren(child.adaptTo(Page.class)));
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                             ");
 } 
      out.write("   \n");
      out.write("                            </div>    \n");
      out.write("                                                        \n");
      out.write("                        </div>    \n");
      out.write("                  \n");
      out.write("                    </div> \n");
      out.write("                ");
 
                }
            }
    }
 
      out.write("\n");
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
    // /libs/cq/cloudserviceconfigs/components/services/services.jsp(38,4) name = categories type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005fincludeClientLib_005f0.setCategories("cq.wcm.edit,cq.cloudserviceconfigs");
    int _jspx_eval_cq_005fincludeClientLib_005f0 = _jspx_th_cq_005fincludeClientLib_005f0.doStartTag();
    if (_jspx_th_cq_005fincludeClientLib_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005fincludeClientLib_005fcategories_005fnobody.reuse(_jspx_th_cq_005fincludeClientLib_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005fincludeClientLib_005fcategories_005fnobody.reuse(_jspx_th_cq_005fincludeClientLib_005f0);
    return false;
  }
}
