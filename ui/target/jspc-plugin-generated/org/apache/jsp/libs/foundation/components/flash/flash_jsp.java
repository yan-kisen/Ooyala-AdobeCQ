package org.apache.jsp.libs.foundation.components.flash;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.day.cq.commons.jcr.JcrUtil;
import com.day.cq.wcm.foundation.Download;
import com.day.cq.wcm.api.components.DropTarget;
import com.day.cq.wcm.api.WCMMode;
import com.day.text.Text;
import java.net.URLEncoder;
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

public final class flash_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {



    private String getImgUrl(Resource resource, ValueMap properties, String name) {
        String imgUrl = null;
        String imgRef = properties.get("imageReference", null);
        Resource img = resource.getResourceResolver().resolve(resource.getPath()+"/image/jcr:content");
        if (imgRef != null) {
            imgUrl = imgRef;
        } else if (img != null) {
            Node imgNode = img.adaptTo(Node.class);
            String ext = "gif";
            try {
                String mimeType = imgNode.getProperty("jcr:mimeType").getString();
                ext = mimeType.substring(mimeType.indexOf("/") + 1);
            } catch (Exception e) {}
            imgUrl = img.getPath() + ".res/" + name + "." + ext;
        }
        return imgUrl;
    }


  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/libs/foundation/global.jsp");
  }

  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005fincludeClientLib_005fjs_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcq_005fincludeClientLib_005fjs_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fcq_005fincludeClientLib_005fjs_005fnobody.release();
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




    String name = currentNode.getName();
    String xiUrl = "/etc/clientlibs/foundation/swfobject/swf/expressInstall.swf";
    String flashUrl = currentNode.getPath() + "/file.res/" + name + ".swf";
    String width = properties.get("width", "100%");
    String height = properties.get("height", "160");
    String flashVersion = properties.get("flashVersion", "9.0.0");
    String flashVars = "{backgroundColor:\"" + properties.get("bgColor", "ffffff") + "\"}";
    String menu = properties.get("menu", "");
    menu = "show".equals(menu) ? "true" : "false";
    String params = "{menu:\"" + menu + "\",wmode:\"" + properties.get("wmode", "opaque") + "\"}";

    String[] attrs = properties.get("attrs", "").split(",");
    String jsAttrs = "{";
    for (int i = 0; i < attrs.length; i++) {
        if (attrs[i].indexOf(":") == -1) continue; // skip none name/value pairs
        if (jsAttrs.length() > 1) jsAttrs += ",";
        attrs[i] = attrs[i].replaceAll("\"", ""); // remove all double quotes to avoid unterminated string js errors
        jsAttrs += attrs[i].replace(":", ":\"") + "\""; // set value in quotes
    }
    jsAttrs += "}";

    //drop target css class = dd prefix + name of the drop target in the edit config
    String ddClassName = DropTarget.CSS_CLASS_PREFIX + "flash";

    Download dld = new Download(resource);

    String cls = " class=\"" + ddClassName + (WCMMode.fromRequest(request) == WCMMode.EDIT && !dld.hasContent() ? " cq-flash-placeholder" : "") + "\"";
    String style = WCMMode.fromRequest(request) == WCMMode.EDIT && !dld.hasContent() ? " style=\"width:100%\"" : "";

    String imgUrl = getImgUrl(resource, properties, name);
    if (imgUrl != null) {
        imgUrl = URLEncoder.encode(imgUrl, "UTF-8");
        imgUrl = imgUrl.replaceAll("%2F", "/");
        String styleWidth = width.endsWith("%") ? width : width + "px";
        String styleHeight = height.endsWith("%") ? height : height + "px";
        style = " style=\"width:" + styleWidth + ";height:" + styleHeight + ";background:transparent url('" + request.getContextPath() + imgUrl + "') no-repeat center center;\"";
    }

    String id = JcrUtil.createValidName(resource.getPath()) + "_swf";

    
      out.write("<div ");
      out.print( cls );
      out.print( style );
      out.write("><div id=\"");
      out.print( id );
      out.write("\">&nbsp;</div></div>");


    if (dld.hasContent()) {
        cls = ""; // remove empty representation
        String href = dld.getHref();
        if ("".equals(href)) {
            href = flashUrl;
        }
        href = Text.escape(href, '%', true);
        
      out.write("\n");
      out.write("        ");
      if (_jspx_meth_cq_005fincludeClientLib_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            if( window.CQ_swfobject) CQ_swfobject.embedSWF(\"");
      out.print( request.getContextPath() + href );
      out.write("\", \"");
      out.print( id );
      out.write("\", \"");
      out.print( width );
      out.write("\", \"");
      out.print( height );
      out.write("\", \"");
      out.print( flashVersion );
      out.write("\", \"");
      out.print( request.getContextPath() + xiUrl );
      out.write('"');
      out.write(',');
      out.write(' ');
      out.print( flashVars );
      out.write(',');
      out.write(' ');
      out.print( params );
      out.write(',');
      out.write(' ');
      out.print( jsAttrs );
      out.write(");\n");
      out.write("        </script>\n");
      out.write("        ");

    }

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
    com.day.cq.wcm.tags.IncludeClientLibraryTag _jspx_th_cq_005fincludeClientLib_005f0 = (com.day.cq.wcm.tags.IncludeClientLibraryTag) _005fjspx_005ftagPool_005fcq_005fincludeClientLib_005fjs_005fnobody.get(com.day.cq.wcm.tags.IncludeClientLibraryTag.class);
    _jspx_th_cq_005fincludeClientLib_005f0.setPageContext(_jspx_page_context);
    _jspx_th_cq_005fincludeClientLib_005f0.setParent(null);
    // /libs/foundation/components/flash/flash.jsp(94,8) name = js type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005fincludeClientLib_005f0.setJs("cq.swfobject");
    int _jspx_eval_cq_005fincludeClientLib_005f0 = _jspx_th_cq_005fincludeClientLib_005f0.doStartTag();
    if (_jspx_th_cq_005fincludeClientLib_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005fincludeClientLib_005fjs_005fnobody.reuse(_jspx_th_cq_005fincludeClientLib_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005fincludeClientLib_005fjs_005fnobody.reuse(_jspx_th_cq_005fincludeClientLib_005f0);
    return false;
  }
}
