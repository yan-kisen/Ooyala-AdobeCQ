package org.apache.jsp.libs.foundation.components.form.text;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class multivalue_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
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


/**
 * Copyright 1997-2010 Day Management AG
 * Barfuesserplatz 6, 4001 Basel, Switzerland
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * Day Management AG, ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Day.
 */

      out.write("<script type=\"text/javascript\">\n");
      out.write("    function CQ_form_addMultivalue(name, rows, width) {\n");
      out.write("        var wrapper = document.getElementById(name + \"_rightcol\");\n");
      out.write("        var fieldWrapper = document.createElement(\"div\");\n");
      out.write("        var index = new Date().getTime();\n");
      out.write("        fieldWrapper.id = name + \"_\" + index + \"_wrapper\";\n");
      out.write("\n");
      out.write("\n");
      out.write("        var field;\n");
      out.write("        if (rows == 1) {\n");
      out.write("            field = document.createElement(\"input\");\n");
      out.write("            field.className = \"form_field form_field_text form_field_multivalued\";\n");
      out.write("        }\n");
      out.write("        else {\n");
      out.write("            field = document.createElement(\"textarea\");\n");
      out.write("            field.className = \"form_field form_field_textarea\";\n");
      out.write("            field.rows = rows;\n");
      out.write("        }\n");
      out.write("        field.name = name;\n");
      out.write("        if (width) {\n");
      out.write("            if (width.indexOf(\"px\")< width.length-2) width +=\"px\";\n");
      out.write("            field.style.width = width;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        var icon = document.createElement(\"span\");\n");
      out.write("        icon.className = \"form_mv_remove\";\n");
      out.write("        icon.onclick = function() {\n");
      out.write("            CQ_form_removeMultivalue(name, index);\n");
      out.write("        };\n");
      out.write("        icon.innerHTML = \"&nbsp;[&ndash;]\";\n");
      out.write("\n");
      out.write("        fieldWrapper.appendChild(field);\n");
      out.write("        fieldWrapper.appendChild(icon);\n");
      out.write("        wrapper.appendChild(fieldWrapper);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    /**\n");
      out.write("     * Remove a field from a multivalue text field\n");
      out.write("     * @param index\n");
      out.write("     */\n");
      out.write("    function CQ_form_removeMultivalue(name, index) {\n");
      out.write("        var wrapper = document.getElementById(name + \"_rightcol\");\n");
      out.write("        var fieldWrapper = document.getElementById(name + \"_\" + index + \"_wrapper\");\n");
      out.write("        wrapper.removeChild(fieldWrapper);\n");
      out.write("    }\n");
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
