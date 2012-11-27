package org.apache.jsp.libs.foundation.components.login;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.day.cq.i18n.I18n;
import com.day.cq.wcm.api.WCMMode;
import com.day.cq.wcm.foundation.forms.FormsHelper;
import com.day.text.Text;
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

public final class login_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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



    String id = Text.getName(resource.getPath());
    I18n i18n = new I18n(slingRequest);

    String action = currentPage.getPath() + "/j_security_check";

    String validationFunctionName = "cq5forms_validate_" + id;

    String usernameLabel = properties.get("./usernameLabel", String.class);
    if (usernameLabel == null) {
        usernameLabel = i18n.get("Username");
    } else {
        usernameLabel = i18n.getVar(usernameLabel);
    }
    String passwordLabel = properties.get("./passwordLabel", String.class);
    if (passwordLabel == null) {
        passwordLabel = i18n.get("Password");
    } else {
        passwordLabel = i18n.getVar(passwordLabel);
    }

    String referer = request.getHeader("Referer");
    String defaultRedirect = currentPage.getPath();
    if( referer != null ) {
        //TODO check if referer is inside app
        defaultRedirect = referer;
    }

    // managed URIs should respect sling mapping
    String redirectTo = slingRequest.getResourceResolver().map(request, properties.get("./redirectTo",defaultRedirect));
    if( !redirectTo.endsWith(".html")) {
        redirectTo += ".html";
    }

    boolean isDisabled = WCMMode.fromRequest(request).equals(WCMMode.DISABLED);

      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    function ");
      out.print(validationFunctionName);
      out.write("() {\n");
      out.write("        if (CQ_Analytics) {\n");
      out.write("            var u = document.forms['");
      out.print(id);
      out.write("']['j_username'].value;\n");
      out.write("            if (CQ_Analytics.Sitecatalyst) {\n");
      out.write("                CQ_Analytics.record({ event: \"loginAttempt\", values: {\n");
      out.write("                    username:u,\n");
      out.write("                    loginPage:\"");
      out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentPage.path}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(".html\",\n");
      out.write("                    destinationPage:\"");
      out.print( xssAPI.encodeForJSString(redirectTo) );
      out.write("\"\n");
      out.write("                }});\n");
      out.write("                if (CQ_Analytics.ClickstreamcloudUI && CQ_Analytics.ClickstreamcloudUI.isVisible()) {\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            ");
 if ( !isDisabled ) { 
      out.write("\n");
      out.write("                if (CQ_Analytics.ProfileDataMgr) {\n");
      out.write("                    if (u) {\n");
      out.write("                        /*\n");
      out.write("                         * AdobePatentID=\"B1393\"\n");
      out.write("                         */\n");
      out.write("                        var loaded = CQ_Analytics.ProfileDataMgr.loadProfile(u);\n");
      out.write("                        if (loaded) {\n");
      out.write("                            var url = CQ.shared.HTTP.noCaching(\"");
      out.print( xssAPI.encodeForJSString(redirectTo) );
      out.write("\");\n");
      out.write("                            CQ.shared.Util.load(url);\n");
      out.write("                        } else {\n");
      out.write("                            alert(\"");
      out.print(i18n.get("The user could not be found."));
      out.write("\");\n");
      out.write("                        }\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                return true;\n");
      out.write("            ");
 } else { 
      out.write("\n");
      out.write("                if (CQ_Analytics.ProfileDataMgr) {\n");
      out.write("                    CQ_Analytics.ProfileDataMgr.clear();\n");
      out.write("                }\n");
      out.write("                return true;\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("\n");

    String jReason = request.getParameter("j_reason");

    if (null != jReason) {
        
      out.write("<div class=\"loginerror\">");
      out.print(xssAPI.encodeForHTML(i18n.getVar(jReason)));
      out.write("</div>\n");

    }

      out.write("\n");
      out.write("\n");
      out.write("<form method=\"POST\"\n");
      out.write("      action=\"");
      out.print( xssAPI.getValidHref(action) );
      out.write("\"\n");
      out.write("      id=\"");
      out.print( xssAPI.encodeForHTMLAttr(id) );
      out.write("\"\n");
      out.write("      name=\"");
      out.print( xssAPI.encodeForHTMLAttr(id) );
      out.write("\"\n");
      out.write("      enctype=\"multipart/form-data\"\n");
      out.write("      onsubmit=\"return ");
      out.print(validationFunctionName);
      out.write("();\">\n");
      out.write("    <input type=\"hidden\" name=\"resource\" value=\"");
      out.print( xssAPI.encodeForHTMLAttr(redirectTo) );
      out.write("\">\n");
      out.write("    <input type=\"hidden\" name=\"_charset_\" value=\"UTF-8\"/>\n");
      out.write("    <table class=\"login-form\">\n");
      out.write("        <tr>\n");
      out.write("            <td class=\"label\"><label for=\"");
      out.print( xssAPI.encodeForHTMLAttr(id + "_username"));
      out.write('"');
      out.write('>');
      out.print( xssAPI.encodeForHTML(usernameLabel) );
      out.write("</label></td>\n");
      out.write("            <td><input id=\"");
      out.print( xssAPI.encodeForHTMLAttr(id + "_username"));
      out.write("\"\n");
      out.write("                   class=\"");
      out.print( FormsHelper.getCss(properties, "form_field form_field_text form_" + id + "_username") );
      out.write("\"\n");
      out.write("                   name=\"j_username\"/></td>\n");
      out.write("        </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td class=\"label\"><label for=\"");
      out.print( xssAPI.encodeForHTMLAttr(id + "_password"));
      out.write('"');
      out.write('>');
      out.print( xssAPI.encodeForHTML(passwordLabel) );
      out.write("</label></td>\n");
      out.write("                <td><input id=\"");
      out.print( xssAPI.encodeForHTMLAttr(id + "_password"));
      out.write("\"\n");
      out.write("                           class=\"");
      out.print( FormsHelper.getCss(properties, "form_field form_field_text form_" + id + "_password") );
      out.write("\"\n");
      out.write("                   type=\"password\" name=\"j_password\"/></td>\n");
      out.write("            </tr>\n");
      out.write("        <tr>\n");
      out.write("            <td></td>\n");
      out.write("            <td>\n");
      out.write("                <input class=\"form_button_submit\" type=\"submit\" value=\"Login\">\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("</form>");
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
