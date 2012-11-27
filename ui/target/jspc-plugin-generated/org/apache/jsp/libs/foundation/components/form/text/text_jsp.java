package org.apache.jsp.libs.foundation.components.form.text;

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
import com.day.cq.wcm.foundation.TextFormat;
import com.day.cq.wcm.foundation.forms.FormsHelper;
import com.day.cq.wcm.foundation.forms.LayoutHelper;
import com.day.cq.wcm.foundation.forms.FormResourceEdit;
import java.util.ResourceBundle;
import com.day.cq.i18n.I18n;

public final class text_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/libs/foundation/global.jsp");
    _jspx_dependants.add("/libs/foundation/components/form/text/multivalue.jsp");
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






	final ResourceBundle resourceBundle = slingRequest.getResourceBundle(null);
	I18n i18n = new I18n(resourceBundle);  
					
    final String name = FormsHelper.getParameterName(resource);
    final String id = FormsHelper.getFieldId(slingRequest, resource);
    final boolean required = FormsHelper.isRequired(resource);
    final boolean readOnly = FormsHelper.isReadOnly(slingRequest, resource);
    final boolean multiValued = properties.get("multivalue", false);
    final boolean hideTitle = properties.get("hideTitle", false);
    final String width = properties.get("width", String.class);
    final int rows = xssAPI.getValidInteger(properties.get("rows", String.class), 1);
    final int cols = xssAPI.getValidInteger(properties.get("cols", String.class), 35);
    String[] values = FormsHelper.getValues(slingRequest, resource);
    if (values == null) {
        values = new String[]{""};
    }

    String title = i18n.getVar(FormsHelper.getTitle(resource, "Text"));

    if (multiValued && !readOnly) {
        

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

    }

    boolean multiRes = FormResourceEdit.isMultiResource(slingRequest);
    String mrName = name + FormResourceEdit.WRITE_SUFFIX;
    String mrChangeHandler = multiRes ? "cq5forms_multiResourceChange(event, '" + xssAPI.encodeForJSString(mrName) + "');" : "";
    String forceMrChangeHandler = multiRes ? "cq5forms_multiResourceChange(event, '" + xssAPI.encodeForJSString(mrName) + "', true);" : "";

    
      out.write("<div class=\"form_row\">\n");
      out.write("        ");
 LayoutHelper.printTitle(id, title, required, hideTitle, out); 
      out.write("\n");
      out.write("        <div class=\"form_rightcol\" id=\"");
      out.print( xssAPI.encodeForHTMLAttr(name) );
      out.write("_rightcol\">");

            int i = 0;
            for (String value : values) {
                
      out.write("<div id=\"");
      out.print( xssAPI.encodeForHTMLAttr(name) );
      out.write('_');
      out.print( i );
      out.write("_wrapper\" class=\"form_rightcol_wrapper\">");

                if (readOnly) {
                    if (value.length() == 0) {
                        // at least display a space otherwise layout may break
                        value = " ";
                    }
                    
      out.print( new TextFormat().format(value) );

                } else {
                    String currentId = i == 0 ? id : id + "-" + i;
                    if (rows == 1) {
                        
      out.write("<input class=\"");
      out.print( FormsHelper.getCss(properties, "form_field form_field_text" + (multiValued ? " form_field_multivalued" : "" )) );
      out.write('"');
      out.write(' ');

                            
      out.write("id=\"");
      out.print( xssAPI.encodeForHTMLAttr(currentId) );
      out.write('"');
      out.write(' ');

                            
      out.write("name=\"");
      out.print( xssAPI.encodeForHTMLAttr(name) );
      out.write('"');
      out.write(' ');

                            
      out.write("value=\"");
      out.print( xssAPI.encodeForHTMLAttr(value) );
      out.write('"');
      out.write(' ');

                            
      out.write("size=\"");
      out.print( cols );
      out.write('"');
      out.write(' ');

                            if (width != null) {
                                
      out.write("style=\"width:");
      out.print( xssAPI.getValidInteger(width, 100) );
      out.write("px;\" ");

                            }
                            
      out.write("onkeydown=\"");
      out.print( mrChangeHandler );
      out.write('"');
      out.write(' ');
      out.write('>');

                    } else {
                        
      out.write("<textarea class=\"");
      out.print( FormsHelper.getCss(properties, "form_field form_field_textarea") );
      out.write('"');
      out.write(' ');

                            
      out.write("id=\"");
      out.print( xssAPI.encodeForHTMLAttr(currentId) );
      out.write('"');
      out.write(' ');

                            
      out.write("name=\"");
      out.print( xssAPI.encodeForHTMLAttr(name) );
      out.write('"');
      out.write(' ');

                            
      out.write("rows=\"");
      out.print( rows );
      out.write("\" cols=\"");
      out.print( cols );
      out.write('"');
      out.write(' ');

                            if (width != null) {
                                
      out.write("style=\"width:");
      out.print( xssAPI.getValidInteger(width, 100) );
      out.write("px;\" ");

                            }
                            
      out.write("onkeydown=\"");
      out.print( mrChangeHandler );
      out.write('"');
      out.write(' ');
      out.write('>');
      out.print( xssAPI.encodeForHTML(value) );
      out.write("</textarea>");

                    }
                    if (values.length > 1) {
                        
      out.write("<span class=\"form_mv_remove\" onclick=\"CQ_form_removeMultivalue('");
      out.print( xssAPI.encodeForJSString(name) );
      out.write('\'');
      out.write(',');
      out.write(' ');
      out.print( i );
      out.write(')');
      out.write(';');
      out.print( forceMrChangeHandler );
      out.write("\">&nbsp;[&ndash;]</span>");

                    }
                    if (i == 0 && multiRes) {
                        
      out.write("<span class=\"mr_write\"><input type=\"checkbox\" ");

                                                    
      out.write("name=\"");
      out.print( xssAPI.encodeForHTMLAttr(mrName) );
      out.write('"');
      out.write(' ');

                                                    
      out.write("id=\"");
      out.print( xssAPI.encodeForHTMLAttr(mrName) );
      out.write('"');
      out.write(' ');

                                                    
      out.write("value=\"true\" ");

                                                    if (request.getParameter(mrName) != null) {
                                                        
      out.write("checked=\"checked\" ");

                                                    }
                                                    
      out.write("></span>");

                    }
                }
                i++;
                
      out.write("</div>");

            }
        
      out.write("</div>");

        if (multiValued && !readOnly) {
            
      out.write("<span class=\"form_mv_add\" onclick=\"CQ_form_addMultivalue('");
      out.print( xssAPI.encodeForJSString(name) );
      out.write('\'');
      out.write(',');
      out.write(' ');
      out.print( rows );
      out.write(',');
      out.write(' ');
      out.print( width == null ? "null" : "'" + xssAPI.getValidInteger(width, 100) + "'" );
      out.write(')');
      out.write(';');
      out.print( forceMrChangeHandler );
      out.write("\">[+]</span>");

        }
    
      out.write("</div>");


    LayoutHelper.printDescription(FormsHelper.getDescription(resource, ""), out);
    boolean errorPrinted = false;
    for (int j = 0; j < values.length; j++) {
        // constraints (e.g. "number") are checked per field (multiple fields when multi value)
        errorPrinted = LayoutHelper.printErrors(slingRequest, name, out, j);
        if (errorPrinted) break;
    }
    if (!errorPrinted) {
        // check mandatory and single values constraints
        LayoutHelper.printErrors(slingRequest, name, out);
    }

      out.write('\n');
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
