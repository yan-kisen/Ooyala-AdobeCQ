package org.apache.jsp.apps.ooyala.config.components.uploader;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class content_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<div>\n");
      out.write("  <label for=\"assetName\">Name: </label>\n");
      out.write("  <input type=\"text\" id=\"assetName\" value=\"\" placeholder=\"Name\"/>\n");
      out.write("  <label for=\"assetDescription\">Description: </label>\n");
      out.write("  <input type=\"text\" id=\"assetDescription\" value=\"\" placeholder=\"Description\"/>\n");
      out.write("  <a id=\"selectAsset\"><button>Select Asset</button></a>\n");
      out.write("</div>\n");
      out.write("<div>\n");
      out.write("  <button id=\"upload\" onclick=\"upload();\">Upload</button>\n");
      out.write("</div>\n");
      out.write("<div id=\"progress\"></div>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("  window.uploader = new Ooyala.Client.AssetCreator('/bin/ooyala/upload', 'selectAsset');\n");
      out.write("\n");
      out.write("  uploader.on(\"progress\", function(){\n");
      out.write("    $(\"#progress\").text(uploader.progress());\n");
      out.write("  });\n");
      out.write("\n");
      out.write("  uploader.on(\"error\", function(err){console.log(err)});\n");
      out.write("\n");
      out.write("  uploader.on(\"assetCreationComplete\", function(){\n");
      out.write("    uploader.upload();\n");
      out.write("  });\n");
      out.write("\n");
      out.write("  function upload(){\n");
      out.write("    uploader.prepareUpload($(\"#assetName\").val(), $(\"#assetDescription\").val());\n");
      out.write("  }\n");
      out.write("</script>");
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
