package org.apache.jsp.libs.foundation.components.form.address;

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
import com.day.cq.wcm.foundation.forms.FormsHelper;
import com.day.cq.wcm.foundation.forms.LayoutHelper;
import org.apache.commons.lang3.StringEscapeUtils;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.ResourceBundle;
import com.day.cq.i18n.I18n;

public final class address_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/libs/foundation/global.jsp");
  }

  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.release();
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




      out.write('\n');

	
	final Locale pageLocale = currentPage.getLanguage(true);
	final ResourceBundle bundle = slingRequest.getResourceBundle(pageLocale);
	I18n i18n = new I18n(bundle);
		
    final String name = FormsHelper.getParameterName(resource);
    final String id = FormsHelper.getFieldId(slingRequest, resource);
    final boolean required = FormsHelper.isRequired(resource);
    final boolean hideTitle = properties.get("hideTitle", false);
    final String title = FormsHelper.getTitle(resource, i18n.get("Address"));
    
    final String firstName = FormsHelper.getValue(slingRequest, resource, name + ".firstname");
    final String lastName = FormsHelper.getValue(slingRequest, resource, name + ".lastname");
    final String street1 = FormsHelper.getValue(slingRequest, resource, name + ".street1");
    final String street2 = FormsHelper.getValue(slingRequest, resource, name + ".street2");
    final String zip = FormsHelper.getValue(slingRequest, resource, name + ".zip");
    final String city = FormsHelper.getValue(slingRequest, resource, name + ".city");
    final String state = FormsHelper.getValue(slingRequest, resource, name + ".state");
    final String country = FormsHelper.getValue(slingRequest, resource, name + ".country");

    final Map<String, String> countries = new LinkedHashMap<String, String>();
    countries.put("Argentina", i18n.get("Argentina"));
    countries.put("Australia", i18n.get("Australia"));
    countries.put("Austria", i18n.get("Austria"));
    countries.put("Bahamas", i18n.get("Bahamas"));
    countries.put("Bahrain", i18n.get("Bahrain"));
    countries.put("Brazil", i18n.get("Brazil"));
    countries.put("Canada", i18n.get("Canada"));
    countries.put("Chile", i18n.get("Chile"));
    countries.put("China", i18n.get("China"));
    countries.put("Colombia", i18n.get("Colombia"));
    countries.put("Egypt", i18n.get("Egypt"));
    countries.put("France", i18n.get("France"));
    countries.put("Germany", i18n.get("Germany"));
    countries.put("Gibraltar", i18n.get("Gibraltar"));
    countries.put("Hongkong", i18n.get("Hong Kong"));
    countries.put("Italy", i18n.get("Italy"));
    countries.put("Japan", i18n.get("Japan"));
    countries.put("Luxembourg", i18n.get("Luxembourg"));
    countries.put("Malaysia", i18n.get("Malaysia"));
    countries.put("Mexico", i18n.get("Mexico"));
    countries.put("Monaco", i18n.get("Monaco"));
    countries.put("Russia", i18n.get("Russia"));
    countries.put("Singapore", i18n.get("Singapore"));
    countries.put("Spain", i18n.get("Spain"));
    countries.put("Switzerland", i18n.get("Switzerland"));
    countries.put("United States of America", i18n.get("United States of America"));
    countries.put("United Arab Emirates", i18n.get("United Arab Emirates"));
    countries.put("United Kingdom", i18n.get("United Kingdom"));
    countries.put("Uruguay", i18n.get("Uruguay"));
    countries.put("Venezuela", i18n.get("Venezuela"));
    countries.put("other...", i18n.get("other..."));
    
      out.write("\n");
      out.write("    <div class=\"form_row\">\n");
      out.write("        ");
 LayoutHelper.printTitle(id, title, required, hideTitle, out); 
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form_row\">\n");
      out.write("        <div class=\"form_leftcolnobr\">\n");
      out.write("            <input class=\"");
      out.print( FormsHelper.getCss(properties, "form_field form_field_text form_address_firstname") );
      out.write("\"\n");
      out.write("                id=\"");
      out.print( StringEscapeUtils.escapeHtml4(id + "-firstname") );
      out.write("\"\n");
      out.write("                name=\"");
      out.print( StringEscapeUtils.escapeHtml4(name + ".firstname") );
      out.write("\"\n");
      out.write("                value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent(null);
      // /libs/foundation/components/form/address/address.jsp(89,23) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue( firstName != null ? firstName : "" );
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      out.write("\"\n");
      out.write("                size=\"16\">\n");
      out.write("            ");
 LayoutHelper.printDescription(id + "-firstname", bundle.getString("First Name"), out); 
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form_rightcolnobr\">\n");
      out.write("            <input class=\"");
      out.print( FormsHelper.getCss(properties, "form_field form_field_text form_address_lastname") );
      out.write("\"\n");
      out.write("                id=\"");
      out.print( StringEscapeUtils.escapeHtml4(id + "-lastname") );
      out.write("\"\n");
      out.write("                name=\"");
      out.print( StringEscapeUtils.escapeHtml4(name + ".lastname") );
      out.write("\"\n");
      out.write("                value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f1.setParent(null);
      // /libs/foundation/components/form/address/address.jsp(97,23) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f1.setValue( lastName != null ? lastName : "" );
      int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
      if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      out.write("\"\n");
      out.write("                size=\"16\">\n");
      out.write("            ");
 LayoutHelper.printDescription(id + "-lastname", bundle.getString("Last Name"), out); 
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form_row\">\n");
      out.write("        <div class=\"form_leftcolnobr\">\n");
      out.write("            <input class=\"");
      out.print( FormsHelper.getCss(properties, "form_field form_field_text form_address_street1") );
      out.write("\"\n");
      out.write("                id=\"");
      out.print( StringEscapeUtils.escapeHtml4(id + "-street1") );
      out.write("\"\n");
      out.write("                name=\"");
      out.print( StringEscapeUtils.escapeHtml4(name + ".street1") );
      out.write("\"\n");
      out.write("                value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f2.setParent(null);
      // /libs/foundation/components/form/address/address.jsp(107,23) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f2.setValue( street1 != null ? street1 : "" );
      int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
      if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      out.write("\" >\n");
      out.write("            ");
 LayoutHelper.printDescription(id + "-street1", bundle.getString("Street address 1"), out); 
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form_rightcolnobr\">\n");
      out.write("            <input class=\"");
      out.print( FormsHelper.getCss(properties, "form_field form_field_text form_address_street2") );
      out.write("\"\n");
      out.write("                id=\"");
      out.print( StringEscapeUtils.escapeHtml4(id + "-street2") );
      out.write("\"\n");
      out.write("                name=\"");
      out.print( StringEscapeUtils.escapeHtml4(name + ".street2") );
      out.write("\"\n");
      out.write("                value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f3.setParent(null);
      // /libs/foundation/components/form/address/address.jsp(114,23) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f3.setValue( street2 != null ? street2 : "" );
      int _jspx_eval_c_005fout_005f3 = _jspx_th_c_005fout_005f3.doStartTag();
      if (_jspx_th_c_005fout_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
      out.write("\" >\n");
      out.write("            ");
 LayoutHelper.printDescription(id + "-street2", bundle.getString("Street address 2"), out); 
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form_row\">\n");
      out.write("        <div class=\"form_leftcolnobr\">\n");
      out.write("            <input class=\"");
      out.print( FormsHelper.getCss(properties, "form_field form_field_text form_address_zip") );
      out.write("\"\n");
      out.write("                id=\"");
      out.print( StringEscapeUtils.escapeHtml4(id + "-zip") );
      out.write("\"\n");
      out.write("                name=\"");
      out.print( StringEscapeUtils.escapeHtml4(name + ".zip") );
      out.write("\"\n");
      out.write("                value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f4.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f4.setParent(null);
      // /libs/foundation/components/form/address/address.jsp(123,23) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f4.setValue( zip != null ? zip : "" );
      int _jspx_eval_c_005fout_005f4 = _jspx_th_c_005fout_005f4.doStartTag();
      if (_jspx_th_c_005fout_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
      out.write("\" >\n");
      out.write("            ");
 LayoutHelper.printDescription(id + "-zip", bundle.getString("Postal / Zip Code"), out); 
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form_rightcolnobr\">\n");
      out.write("            <input class=\"");
      out.print( FormsHelper.getCss(properties, "form_field form_field_text form_address_city") );
      out.write("\"\n");
      out.write("                id=\"");
      out.print( StringEscapeUtils.escapeHtml4(id + "-city") );
      out.write("\"\n");
      out.write("                name=\"");
      out.print( StringEscapeUtils.escapeHtml4(name + ".city") );
      out.write("\"\n");
      out.write("                value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f5 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f5.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f5.setParent(null);
      // /libs/foundation/components/form/address/address.jsp(130,23) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f5.setValue( city != null ? city : "" );
      int _jspx_eval_c_005fout_005f5 = _jspx_th_c_005fout_005f5.doStartTag();
      if (_jspx_th_c_005fout_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f5);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f5);
      out.write("\" >\n");
      out.write("            ");
 LayoutHelper.printDescription(id + "-city", bundle.getString("City"), out); 
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"form_row\">\n");
      out.write("        <div class=\"form_leftcolnobr\">\n");
      out.write("            <input class=\"");
      out.print( FormsHelper.getCss(properties, "form_field form_field_text form_address_state") );
      out.write("\"\n");
      out.write("                id=\"");
      out.print( StringEscapeUtils.escapeHtml4(id + "-state") );
      out.write("\"\n");
      out.write("                name=\"");
      out.print( StringEscapeUtils.escapeHtml4(name + ".state") );
      out.write("\"\n");
      out.write("                value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f6 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f6.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f6.setParent(null);
      // /libs/foundation/components/form/address/address.jsp(139,23) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f6.setValue( state != null ? state : "" );
      int _jspx_eval_c_005fout_005f6 = _jspx_th_c_005fout_005f6.doStartTag();
      if (_jspx_th_c_005fout_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f6);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f6);
      out.write("\" >\n");
      out.write("            ");
 LayoutHelper.printDescription(id + "-state", bundle.getString("State / Province"), out); 
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form_rightcolnobr\">\n");
      out.write("            <select class=\"");
      out.print( FormsHelper.getCss(properties, "form_field form_field_select form_address_country") );
      out.write("\"\n");
      out.write("                id=\"");
      out.print( StringEscapeUtils.escapeHtml4(id + "-country") );
      out.write("\"\n");
      out.write("                name=\"");
      out.print( StringEscapeUtils.escapeHtml4(name + ".country") );
      out.write('"');
      out.write('>');

            for (final Map.Entry<String, String> c : countries.entrySet()) {
                if (c.getKey().equals(country)) {
                    
      out.write("<option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f7 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f7.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f7.setParent(null);
      // /libs/foundation/components/form/address/address.jsp(148,37) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f7.setValue( c.getKey() );
      int _jspx_eval_c_005fout_005f7 = _jspx_th_c_005fout_005f7.doStartTag();
      if (_jspx_th_c_005fout_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f7);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f7);
      out.write("\" selected>");
      out.print( c.getValue() );
      out.write("</option>");

                } else {
                    
      out.write("<option value=\"");
      //  c:out
      org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f8 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
      _jspx_th_c_005fout_005f8.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f8.setParent(null);
      // /libs/foundation/components/form/address/address.jsp(150,37) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f8.setValue( c.getKey() );
      int _jspx_eval_c_005fout_005f8 = _jspx_th_c_005fout_005f8.doStartTag();
      if (_jspx_th_c_005fout_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f8);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f8);
      out.write('"');
      out.write('>');
      out.print( c.getValue() );
      out.write("</option>");

                }
            }
            
      out.write("</select>\n");
      out.write("            ");
 LayoutHelper.printDescription(id + "-country", bundle.getString("Country"), out); 
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    ");

    LayoutHelper.printDescription(FormsHelper.getDescription(resource, ""), out);
    LayoutHelper.printErrors(slingRequest, name, hideTitle, out);

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
