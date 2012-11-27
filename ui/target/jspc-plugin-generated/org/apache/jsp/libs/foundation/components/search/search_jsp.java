package org.apache.jsp.libs.foundation.components.search;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.day.cq.wcm.foundation.Search;
import com.day.cq.tagging.TagManager;
import org.apache.commons.lang3.StringEscapeUtils;
import java.util.Locale;
import java.util.ResourceBundle;
import com.day.cq.i18n.I18n;
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

public final class search_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {

static private org.apache.sling.scripting.jsp.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;
static private org.apache.sling.scripting.jsp.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_1;

static {
  _jspx_fnmap_0= org.apache.sling.scripting.jsp.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:escapeXml", org.apache.taglibs.standard.functions.Functions.class, "escapeXml", new Class[] {java.lang.String.class});
  _jspx_fnmap_1= org.apache.sling.scripting.jsp.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:length", org.apache.taglibs.standard.functions.Functions.class, "length", new Class[] {java.lang.Object.class});
}

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/libs/foundation/global.jsp");
  }

  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005fsetContentBundle_005fsource_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_005ftest;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_005ftest;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_005fvalue;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fparam_005fvalue_005fname_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fparam_005fvalue_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005frequestURL;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005faddParam_005fvalue_005fname_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005fremoveParam_005fvalue_005fname_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fcatch;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fdateStyle_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcq_005fsetContentBundle_005fsource_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_005ftest = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005furl_005fvalue = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fparam_005fvalue_005fname_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fparam_005fvalue_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcq_005frequestURL = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcq_005faddParam_005fvalue_005fname_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcq_005fremoveParam_005fvalue_005fname_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fcatch = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fdateStyle_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fcq_005fsetContentBundle_005fsource_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fif_005ftest.release();
    _005fjspx_005ftagPool_005fc_005furl_005fvalue.release();
    _005fjspx_005ftagPool_005fc_005fparam_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey.release();
    _005fjspx_005ftagPool_005ffmt_005fparam_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fcq_005frequestURL.release();
    _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fcq_005faddParam_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fcq_005fremoveParam_005fvalue_005fname_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fcatch.release();
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fdateStyle_005fnobody.release();
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




      if (_jspx_meth_cq_005fsetContentBundle_005f0(_jspx_page_context))
        return;

    Search search = new Search(slingRequest);

    final Locale pageLocale = currentPage.getLanguage(true);
    final ResourceBundle resourceBundle = slingRequest.getResourceBundle(pageLocale);
    I18n i18n = new I18n(resourceBundle);

    // Hack to get the values of the local search dictionary (./i18n/en.xml) extracted by xliff
    if (false) {
        i18n.get("nextText", "Please Translate 'Next'");
        i18n.get("noResultsText", "Please Translate 'Your search - &lt;b>{0}&lt;/b> - did not match any documents.'");
        i18n.get("previousText", "Please Translate 'Previous'");
        i18n.get("relatedSearchesText", "Please Translate 'Related searches:'");
        i18n.get("resultPagesText", "Please Translate 'Results'");
        i18n.get("searchButtonText", "Please Translate 'Search'");
        i18n.get("searchTrendsText", "Please Translate 'Search Trends'");
        i18n.get("similarPagesText", "Please Translate 'Similar Pages'");
        i18n.get("spellcheckText", "Please Translate 'Did you mean:'");
        i18n.get("statisticsText", "Please Translate 'Results {0} - {1} of {2} for &lt;b>{3}&lt;/b>. ({4} seconds)'");
    }

    String searchIn = (String) properties.get("searchIn");
    String requestSearchPath = request.getParameter("path");
    if (searchIn != null) {
        // only allow the "path" request parameter to be used if it
        // is within the searchIn path configured
        if (requestSearchPath != null && requestSearchPath.startsWith(searchIn)) {
            search.setSearchIn(requestSearchPath);
        } else {
            search.setSearchIn(searchIn);
        }
    } else if (requestSearchPath != null) {
        search.setSearchIn(requestSearchPath);
    }
    
    
    String escapedQuery = StringEscapeUtils.escapeEcmaScript(search.getQuery());
    pageContext.setAttribute("escapedQuery", escapedQuery);
    
    pageContext.setAttribute("search", search);
    TagManager tm = resourceResolver.adaptTo(TagManager.class);

      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      if (_jspx_meth_c_005fset_005f1(_jspx_page_context))
        return;


      out.write("<center>\n");
      out.write("  <form action=\"");
      out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentPage.path}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(".html\">\n");
      out.write("    <input size=\"41\" maxlength=\"2048\" name=\"q\" value=\"");
      out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:escapeXml(search.query)}", java.lang.String.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
      out.write("\"/>\n");
      out.write("    <input value=\"");
      if (_jspx_meth_fmt_005fmessage_005f0(_jspx_page_context))
        return;
      out.write("\" type=\"submit\"/>\n");
      out.write("  </form>\n");
      out.write("</center>\n");
      out.write("<br/>\n");
      //  c:choose
      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write('\n');
          out.write(' ');
          out.write(' ');
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return;
          out.write('\n');
          out.write(' ');
          out.write(' ');
          if (_jspx_meth_c_005fwhen_005f1(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return;
          out.write('\n');
          out.write(' ');
          out.write(' ');
          //  c:otherwise
          org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
          _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
          _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
          int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
          if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("    <span record=\"'search', {'keyword': '");
              if (_jspx_meth_c_005fout_005f2(_jspx_th_c_005fotherwise_005f0, _jspx_page_context))
                return;
              out.write("', 'results':'");
              out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result.totalMatches}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("', 'executionTime':'");
              out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result.executionTime}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("'}\"></span>\n");
              out.write("    ");
              out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result.trackerScript}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
              out.write("\n");
              out.write("    ");
              if (_jspx_meth_fmt_005fmessage_005f3(_jspx_th_c_005fotherwise_005f0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("      <div class=\"searchRight\">\n");
              out.write("          ");
              if (_jspx_meth_c_005fif_005f1(_jspx_th_c_005fotherwise_005f0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("\n");
              out.write("          ");
              //  c:if
              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
              _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
              _jspx_th_c_005fif_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
              // /libs/foundation/components/search/search.jsp(107,10) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result.facets.languages.containsHit}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
              int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
              if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n");
                  out.write("              <p>");
                  out.print(i18n.get("Languages"));
                  out.write("</p>\n");
                  out.write("              ");
                  //  c:forEach
                  org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
                  _jspx_th_c_005fforEach_005f1.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fforEach_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f2);
                  // /libs/foundation/components/search/search.jsp(109,14) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_c_005fforEach_005f1.setVar("bucket");
                  // /libs/foundation/components/search/search.jsp(109,14) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_c_005fforEach_005f1.setItems((java.lang.Object) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result.facets.languages.buckets}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
                  int[] _jspx_push_body_count_c_005fforEach_005f1 = new int[] { 0 };
                  try {
                    int _jspx_eval_c_005fforEach_005f1 = _jspx_th_c_005fforEach_005f1.doStartTag();
                    if (_jspx_eval_c_005fforEach_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\n");
                        out.write("                  ");
                        if (_jspx_meth_c_005fset_005f2(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
                          return;
                        out.write("\n");
                        out.write("                  ");
                        //  c:set
                        org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f3 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
                        _jspx_th_c_005fset_005f3.setPageContext(_jspx_page_context);
                        _jspx_th_c_005fset_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
                        // /libs/foundation/components/search/search.jsp(111,18) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                        _jspx_th_c_005fset_005f3.setVar("label");
                        // /libs/foundation/components/search/search.jsp(111,18) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                        _jspx_th_c_005fset_005f3.setValue( new java.util.Locale((String) pageContext.getAttribute("bucketValue")).getDisplayLanguage(request.getLocale()) );
                        int _jspx_eval_c_005fset_005f3 = _jspx_th_c_005fset_005f3.doStartTag();
                        if (_jspx_th_c_005fset_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                          _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f3);
                          return;
                        }
                        _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f3);
                        out.write("\n");
                        out.write("                  ");
                        if (_jspx_meth_c_005fchoose_005f1(_jspx_th_c_005fforEach_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
                          return;
                        out.write("<br/>\n");
                        out.write("              ");
                        int evalDoAfterBody = _jspx_th_c_005fforEach_005f1.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_c_005fforEach_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_c_005fforEach_005f1[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_c_005fforEach_005f1.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_c_005fforEach_005f1.doFinally();
                    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f1);
                  }
                  out.write("\n");
                  out.write("          ");
                  int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f2);
                return;
              }
              _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f2);
              out.write("\n");
              out.write("\n");
              out.write("          ");
              //  c:if
              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
              _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
              _jspx_th_c_005fif_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
              // /libs/foundation/components/search/search.jsp(119,10) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result.facets.tags.containsHit}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
              int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
              if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n");
                  out.write("              <p>");
                  out.print(i18n.get("Tags"));
                  out.write("</p>\n");
                  out.write("              ");
                  //  c:forEach
                  org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
                  _jspx_th_c_005fforEach_005f2.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fforEach_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f3);
                  // /libs/foundation/components/search/search.jsp(121,14) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_c_005fforEach_005f2.setVar("bucket");
                  // /libs/foundation/components/search/search.jsp(121,14) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_c_005fforEach_005f2.setItems((java.lang.Object) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result.facets.tags.buckets}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
                  int[] _jspx_push_body_count_c_005fforEach_005f2 = new int[] { 0 };
                  try {
                    int _jspx_eval_c_005fforEach_005f2 = _jspx_th_c_005fforEach_005f2.doStartTag();
                    if (_jspx_eval_c_005fforEach_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\n");
                        out.write("                  ");
                        if (_jspx_meth_c_005fset_005f4(_jspx_th_c_005fforEach_005f2, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
                          return;
                        out.write("\n");
                        out.write("                  ");
                        //  c:set
                        org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f5 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
                        _jspx_th_c_005fset_005f5.setPageContext(_jspx_page_context);
                        _jspx_th_c_005fset_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f2);
                        // /libs/foundation/components/search/search.jsp(123,18) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                        _jspx_th_c_005fset_005f5.setVar("tag");
                        // /libs/foundation/components/search/search.jsp(123,18) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                        _jspx_th_c_005fset_005f5.setValue( tm.resolve((String) pageContext.getAttribute("bucketValue")) );
                        int _jspx_eval_c_005fset_005f5 = _jspx_th_c_005fset_005f5.doStartTag();
                        if (_jspx_th_c_005fset_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                          _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f5);
                          return;
                        }
                        _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f5);
                        out.write("\n");
                        out.write("                  ");
                        //  c:if
                        org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
                        _jspx_th_c_005fif_005f4.setPageContext(_jspx_page_context);
                        _jspx_th_c_005fif_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f2);
                        // /libs/foundation/components/search/search.jsp(124,18) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                        _jspx_th_c_005fif_005f4.setTest(((java.lang.Boolean) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tag != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
                        int _jspx_eval_c_005fif_005f4 = _jspx_th_c_005fif_005f4.doStartTag();
                        if (_jspx_eval_c_005fif_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                          do {
                            out.write("\n");
                            out.write("                      ");
                            if (_jspx_meth_c_005fset_005f6(_jspx_th_c_005fif_005f4, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
                              return;
                            out.write("\n");
                            out.write("                      ");
                            //  c:choose
                            org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f2 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
                            _jspx_th_c_005fchoose_005f2.setPageContext(_jspx_page_context);
                            _jspx_th_c_005fchoose_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
                            int _jspx_eval_c_005fchoose_005f2 = _jspx_th_c_005fchoose_005f2.doStartTag();
                            if (_jspx_eval_c_005fchoose_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write("\n");
                              out.write("                          ");
                              //  c:when
                              org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                              _jspx_th_c_005fwhen_005f3.setPageContext(_jspx_page_context);
                              _jspx_th_c_005fwhen_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f2);
                              // /libs/foundation/components/search/search.jsp(127,26) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                              _jspx_th_c_005fwhen_005f3.setTest( request.getParameter("tag") != null && java.util.Arrays.asList(request.getParameterValues("tag")).contains(pageContext.getAttribute("bucketValue")) );
                              int _jspx_eval_c_005fwhen_005f3 = _jspx_th_c_005fwhen_005f3.doStartTag();
                              if (_jspx_eval_c_005fwhen_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${label}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                              out.write(' ');
                              out.write('(');
                              out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bucket.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                              out.write(") - <a href=\"");
                              if (_jspx_meth_cq_005frequestURL_005f2(_jspx_th_c_005fwhen_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
                              return;
                              out.write("\">remove filter</a>");
                              int evalDoAfterBody = _jspx_th_c_005fwhen_005f3.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                              }
                              if (_jspx_th_c_005fwhen_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f3);
                              return;
                              }
                              _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f3);
                              out.write("\n");
                              out.write("                          ");
                              if (_jspx_meth_c_005fotherwise_005f2(_jspx_th_c_005fchoose_005f2, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
                              return;
                              out.write("\n");
                              out.write("                      ");
                              int evalDoAfterBody = _jspx_th_c_005fchoose_005f2.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                            }
                            if (_jspx_th_c_005fchoose_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f2);
                              return;
                            }
                            _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f2);
                            out.write("<br/>\n");
                            out.write("                  ");
                            int evalDoAfterBody = _jspx_th_c_005fif_005f4.doAfterBody();
                            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                          } while (true);
                        }
                        if (_jspx_th_c_005fif_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                          _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f4);
                          return;
                        }
                        _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f4);
                        out.write("\n");
                        out.write("              ");
                        int evalDoAfterBody = _jspx_th_c_005fforEach_005f2.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_c_005fforEach_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_c_005fforEach_005f2[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_c_005fforEach_005f2.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_c_005fforEach_005f2.doFinally();
                    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f2);
                  }
                  out.write("\n");
                  out.write("          ");
                  int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f3);
                return;
              }
              _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f3);
              out.write("\n");
              out.write("\n");
              out.write("          ");
              //  c:if
              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
              _jspx_th_c_005fif_005f5.setPageContext(_jspx_page_context);
              _jspx_th_c_005fif_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
              // /libs/foundation/components/search/search.jsp(134,10) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_c_005fif_005f5.setTest(((java.lang.Boolean) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result.facets.mimeTypes.containsHit}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
              int _jspx_eval_c_005fif_005f5 = _jspx_th_c_005fif_005f5.doStartTag();
              if (_jspx_eval_c_005fif_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n");
                  out.write("              ");
                  com.day.cq.wcm.foundation.FileTypes fileTypes = null;
                  synchronized (_jspx_page_context) {
                    fileTypes = (com.day.cq.wcm.foundation.FileTypes) _jspx_page_context.getAttribute("fileTypes", PageContext.PAGE_SCOPE);
                    if (fileTypes == null){
                      fileTypes = new com.day.cq.wcm.foundation.FileTypes();
                      _jspx_page_context.setAttribute("fileTypes", fileTypes, PageContext.PAGE_SCOPE);
                    }
                  }
                  out.write("\n");
                  out.write("              <p>");
                  out.print(i18n.get("File types"));
                  out.write("</p>\n");
                  out.write("              ");
                  //  c:forEach
                  org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
                  _jspx_th_c_005fforEach_005f3.setPageContext(_jspx_page_context);
                  _jspx_th_c_005fforEach_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f5);
                  // /libs/foundation/components/search/search.jsp(137,14) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_c_005fforEach_005f3.setVar("bucket");
                  // /libs/foundation/components/search/search.jsp(137,14) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                  _jspx_th_c_005fforEach_005f3.setItems((java.lang.Object) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result.facets.mimeTypes.buckets}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
                  int[] _jspx_push_body_count_c_005fforEach_005f3 = new int[] { 0 };
                  try {
                    int _jspx_eval_c_005fforEach_005f3 = _jspx_th_c_005fforEach_005f3.doStartTag();
                    if (_jspx_eval_c_005fforEach_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                      do {
                        out.write("\n");
                        out.write("                  ");
                        if (_jspx_meth_c_005fset_005f7(_jspx_th_c_005fforEach_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
                          return;
                        out.write("\n");
                        out.write("                  ");
                        if (_jspx_meth_c_005fset_005f8(_jspx_th_c_005fforEach_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
                          return;
                        out.write("\n");
                        out.write("                  ");
                        //  c:choose
                        org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f3 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
                        _jspx_th_c_005fchoose_005f3.setPageContext(_jspx_page_context);
                        _jspx_th_c_005fchoose_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f3);
                        int _jspx_eval_c_005fchoose_005f3 = _jspx_th_c_005fchoose_005f3.doStartTag();
                        if (_jspx_eval_c_005fchoose_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                          do {
                            out.write("\n");
                            out.write("                      ");
                            //  c:when
                            org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f4 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
                            _jspx_th_c_005fwhen_005f4.setPageContext(_jspx_page_context);
                            _jspx_th_c_005fwhen_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f3);
                            // /libs/foundation/components/search/search.jsp(141,22) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
                            _jspx_th_c_005fwhen_005f4.setTest( request.getParameter("mimeType") != null && java.util.Arrays.asList(request.getParameterValues("mimeType")).contains(pageContext.getAttribute("bucketValue")) );
                            int _jspx_eval_c_005fwhen_005f4 = _jspx_th_c_005fwhen_005f4.doStartTag();
                            if (_jspx_eval_c_005fwhen_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                              do {
                              out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${label}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                              out.write(' ');
                              out.write('(');
                              out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bucket.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                              out.write(") - <a href=\"");
                              if (_jspx_meth_cq_005frequestURL_005f4(_jspx_th_c_005fwhen_005f4, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
                              return;
                              out.write("\">remove filter</a>");
                              int evalDoAfterBody = _jspx_th_c_005fwhen_005f4.doAfterBody();
                              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                              } while (true);
                            }
                            if (_jspx_th_c_005fwhen_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                              _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f4);
                              return;
                            }
                            _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f4);
                            out.write("\n");
                            out.write("                      ");
                            if (_jspx_meth_c_005fotherwise_005f3(_jspx_th_c_005fchoose_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
                              return;
                            out.write("\n");
                            out.write("                  ");
                            int evalDoAfterBody = _jspx_th_c_005fchoose_005f3.doAfterBody();
                            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                              break;
                          } while (true);
                        }
                        if (_jspx_th_c_005fchoose_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                          _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f3);
                          return;
                        }
                        _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f3);
                        out.write("<br/>\n");
                        out.write("              ");
                        int evalDoAfterBody = _jspx_th_c_005fforEach_005f3.doAfterBody();
                        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                          break;
                      } while (true);
                    }
                    if (_jspx_th_c_005fforEach_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                      return;
                    }
                  } catch (Throwable _jspx_exception) {
                    while (_jspx_push_body_count_c_005fforEach_005f3[0]-- > 0)
                      out = _jspx_page_context.popBody();
                    _jspx_th_c_005fforEach_005f3.doCatch(_jspx_exception);
                  } finally {
                    _jspx_th_c_005fforEach_005f3.doFinally();
                    _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f3);
                  }
                  out.write("\n");
                  out.write("          ");
                  int evalDoAfterBody = _jspx_th_c_005fif_005f5.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_005fif_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f5);
                return;
              }
              _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f5);
              out.write("\n");
              out.write("\n");
              out.write("          ");
              //  c:if
              org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
              _jspx_th_c_005fif_005f6.setPageContext(_jspx_page_context);
              _jspx_th_c_005fif_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
              // /libs/foundation/components/search/search.jsp(147,10) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_c_005fif_005f6.setTest(((java.lang.Boolean) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result.facets.lastModified.containsHit}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
              int _jspx_eval_c_005fif_005f6 = _jspx_th_c_005fif_005f6.doStartTag();
              if (_jspx_eval_c_005fif_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                do {
                  out.write("\n");
                  out.write("              <p>");
                  out.print(i18n.get("Last Modified"));
                  out.write("</p>\n");
                  out.write("              ");
                  if (_jspx_meth_c_005fforEach_005f4(_jspx_th_c_005fif_005f6, _jspx_page_context))
                    return;
                  out.write("\n");
                  out.write("          ");
                  int evalDoAfterBody = _jspx_th_c_005fif_005f6.doAfterBody();
                  if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                    break;
                } while (true);
              }
              if (_jspx_th_c_005fif_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f6);
                return;
              }
              _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f6);
              out.write("\n");
              out.write("      </div>\n");
              out.write("\n");
              out.write("      ");
              if (_jspx_meth_c_005fif_005f9(_jspx_th_c_005fotherwise_005f0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("      <br/>\n");
              out.write("      ");
              if (_jspx_meth_c_005fforEach_005f6(_jspx_th_c_005fotherwise_005f0, _jspx_page_context))
                return;
              out.write("\n");
              out.write("      <br/>\n");
              out.write("      ");
              if (_jspx_meth_c_005fif_005f12(_jspx_th_c_005fotherwise_005f0, _jspx_page_context))
                return;
              out.write('\n');
              out.write(' ');
              out.write(' ');
              int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
          out.write('\n');
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
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

  private boolean _jspx_meth_cq_005fsetContentBundle_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:setContentBundle
    com.day.cq.wcm.tags.SetContentBundleTag _jspx_th_cq_005fsetContentBundle_005f0 = (com.day.cq.wcm.tags.SetContentBundleTag) _005fjspx_005ftagPool_005fcq_005fsetContentBundle_005fsource_005fnobody.get(com.day.cq.wcm.tags.SetContentBundleTag.class);
    _jspx_th_cq_005fsetContentBundle_005f0.setPageContext(_jspx_page_context);
    _jspx_th_cq_005fsetContentBundle_005f0.setParent(null);
    // /libs/foundation/components/search/search.jsp(25,2) name = source type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005fsetContentBundle_005f0.setSource("page");
    int _jspx_eval_cq_005fsetContentBundle_005f0 = _jspx_th_cq_005fsetContentBundle_005f0.doStartTag();
    if (_jspx_th_cq_005fsetContentBundle_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005fsetContentBundle_005fsource_005fnobody.reuse(_jspx_th_cq_005fsetContentBundle_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005fsetContentBundle_005fsource_005fnobody.reuse(_jspx_th_cq_005fsetContentBundle_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f0.setParent(null);
    // /libs/foundation/components/search/search.jsp(66,2) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setVar("trends");
    // /libs/foundation/components/search/search.jsp(66,2) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f0.setValue((java.lang.Object) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${search.trends}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
    if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f1.setParent(null);
    // /libs/foundation/components/search/search.jsp(66,48) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setVar("result");
    // /libs/foundation/components/search/search.jsp(66,48) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f1.setValue((java.lang.Object) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${search.result}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
    if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f0.setParent(null);
    // /libs/foundation/components/search/search.jsp(70,18) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f0.setKey("searchButtonText");
    int _jspx_eval_fmt_005fmessage_005f0 = _jspx_th_fmt_005fmessage_005f0.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /libs/foundation/components/search/search.jsp(75,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty result && empty search.query}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
    if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write('\n');
        out.write(' ');
        out.write(' ');
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
    // /libs/foundation/components/search/search.jsp(77,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty result.hits}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
    if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("    ");
        out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result.trackerScript}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        if (_jspx_meth_fmt_005fmessage_005f2(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    <span record=\"'noresults', {'keyword': '");
        if (_jspx_meth_c_005fout_005f1(_jspx_th_c_005fwhen_005f1, _jspx_page_context))
          return true;
        out.write("', 'results':'zero', 'executionTime':'");
        out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result.executionTime}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("'}\"></span>\n");
        out.write("  ");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /libs/foundation/components/search/search.jsp(79,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result.spellcheck != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("      <p>");
        if (_jspx_meth_fmt_005fmessage_005f1(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write(" <a href=\"");
        if (_jspx_meth_c_005furl_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("\"><b>");
        if (_jspx_meth_c_005fout_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
          return true;
        out.write("</b></a></p>\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /libs/foundation/components/search/search.jsp(80,9) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f1.setKey("spellcheckText");
    int _jspx_eval_fmt_005fmessage_005f1 = _jspx_th_fmt_005fmessage_005f1.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /libs/foundation/components/search/search.jsp(80,54) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentPage.path}.html", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_eval_c_005furl_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_005furl_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_c_005furl_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_005furl_005f0.doInitBody();
      }
      do {
        if (_jspx_meth_c_005fparam_005f0(_jspx_th_c_005furl_005f0, _jspx_page_context))
          return true;
        int evalDoAfterBody = _jspx_th_c_005furl_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_005furl_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fparam_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005furl_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_005fparam_005f0 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _005fjspx_005ftagPool_005fc_005fparam_005fvalue_005fname_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_005fparam_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fparam_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005furl_005f0);
    // /libs/foundation/components/search/search.jsp(80,94) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fparam_005f0.setName("q");
    // /libs/foundation/components/search/search.jsp(80,94) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fparam_005f0.setValue((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result.spellcheck}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fparam_005f0 = _jspx_th_c_005fparam_005f0.doStartTag();
    if (_jspx_th_c_005fparam_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fparam_005fvalue_005fname_005fnobody.reuse(_jspx_th_c_005fparam_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fparam_005fvalue_005fname_005fnobody.reuse(_jspx_th_c_005fparam_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
    // /libs/foundation/components/search/search.jsp(80,155) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result.spellcheck}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
    if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f2 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /libs/foundation/components/search/search.jsp(82,4) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f2.setKey("noResultsText");
    int _jspx_eval_fmt_005fmessage_005f2 = _jspx_th_fmt_005fmessage_005f2.doStartTag();
    if (_jspx_eval_fmt_005fmessage_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_fmt_005fmessage_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_fmt_005fmessage_005f2.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_fmt_005fmessage_005f2.doInitBody();
      }
      do {
        out.write("\n");
        out.write("      ");
        if (_jspx_meth_fmt_005fparam_005f0(_jspx_th_fmt_005fmessage_005f2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_fmt_005fmessage_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_fmt_005fmessage_005f2 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_fmt_005fmessage_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey.reuse(_jspx_th_fmt_005fmessage_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey.reuse(_jspx_th_fmt_005fmessage_005f2);
    return false;
  }

  private boolean _jspx_meth_fmt_005fparam_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fmessage_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:param
    org.apache.taglibs.standard.tag.rt.fmt.ParamTag _jspx_th_fmt_005fparam_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.ParamTag) _005fjspx_005ftagPool_005ffmt_005fparam_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.ParamTag.class);
    _jspx_th_fmt_005fparam_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fparam_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fmessage_005f2);
    // /libs/foundation/components/search/search.jsp(83,6) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fparam_005f0.setValue((java.lang.Object) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:escapeXml(search.query)}", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
    int _jspx_eval_fmt_005fparam_005f0 = _jspx_th_fmt_005fparam_005f0.doStartTag();
    if (_jspx_th_fmt_005fparam_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fparam_005fvalue_005fnobody.reuse(_jspx_th_fmt_005fparam_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fparam_005fvalue_005fnobody.reuse(_jspx_th_fmt_005fparam_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f1);
    // /libs/foundation/components/search/search.jsp(85,44) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${escapedQuery}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
    if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
    // /libs/foundation/components/search/search.jsp(88,41) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${escapedQuery}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
    if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f3 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
    // /libs/foundation/components/search/search.jsp(90,4) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f3.setKey("statisticsText");
    int _jspx_eval_fmt_005fmessage_005f3 = _jspx_th_fmt_005fmessage_005f3.doStartTag();
    if (_jspx_eval_fmt_005fmessage_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_fmt_005fmessage_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_th_fmt_005fmessage_005f3.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_fmt_005fmessage_005f3.doInitBody();
      }
      do {
        out.write("\n");
        out.write("      ");
        if (_jspx_meth_fmt_005fparam_005f1(_jspx_th_fmt_005fmessage_005f3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("      ");
        if (_jspx_meth_fmt_005fparam_005f2(_jspx_th_fmt_005fmessage_005f3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("      ");
        if (_jspx_meth_fmt_005fparam_005f3(_jspx_th_fmt_005fmessage_005f3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("      ");
        if (_jspx_meth_fmt_005fparam_005f4(_jspx_th_fmt_005fmessage_005f3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("      ");
        if (_jspx_meth_fmt_005fparam_005f5(_jspx_th_fmt_005fmessage_005f3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("    ");
        int evalDoAfterBody = _jspx_th_fmt_005fmessage_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_fmt_005fmessage_005f3 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
      }
    }
    if (_jspx_th_fmt_005fmessage_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey.reuse(_jspx_th_fmt_005fmessage_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey.reuse(_jspx_th_fmt_005fmessage_005f3);
    return false;
  }

  private boolean _jspx_meth_fmt_005fparam_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fmessage_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:param
    org.apache.taglibs.standard.tag.rt.fmt.ParamTag _jspx_th_fmt_005fparam_005f1 = (org.apache.taglibs.standard.tag.rt.fmt.ParamTag) _005fjspx_005ftagPool_005ffmt_005fparam_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.ParamTag.class);
    _jspx_th_fmt_005fparam_005f1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fparam_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fmessage_005f3);
    // /libs/foundation/components/search/search.jsp(91,6) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fparam_005f1.setValue((java.lang.Object) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result.startIndex + 1}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fparam_005f1 = _jspx_th_fmt_005fparam_005f1.doStartTag();
    if (_jspx_th_fmt_005fparam_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fparam_005fvalue_005fnobody.reuse(_jspx_th_fmt_005fparam_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fparam_005fvalue_005fnobody.reuse(_jspx_th_fmt_005fparam_005f1);
    return false;
  }

  private boolean _jspx_meth_fmt_005fparam_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fmessage_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:param
    org.apache.taglibs.standard.tag.rt.fmt.ParamTag _jspx_th_fmt_005fparam_005f2 = (org.apache.taglibs.standard.tag.rt.fmt.ParamTag) _005fjspx_005ftagPool_005ffmt_005fparam_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.ParamTag.class);
    _jspx_th_fmt_005fparam_005f2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fparam_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fmessage_005f3);
    // /libs/foundation/components/search/search.jsp(92,6) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fparam_005f2.setValue((java.lang.Object) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result.startIndex + fn:length(result.hits)}", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_1, false));
    int _jspx_eval_fmt_005fparam_005f2 = _jspx_th_fmt_005fparam_005f2.doStartTag();
    if (_jspx_th_fmt_005fparam_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fparam_005fvalue_005fnobody.reuse(_jspx_th_fmt_005fparam_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fparam_005fvalue_005fnobody.reuse(_jspx_th_fmt_005fparam_005f2);
    return false;
  }

  private boolean _jspx_meth_fmt_005fparam_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fmessage_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:param
    org.apache.taglibs.standard.tag.rt.fmt.ParamTag _jspx_th_fmt_005fparam_005f3 = (org.apache.taglibs.standard.tag.rt.fmt.ParamTag) _005fjspx_005ftagPool_005ffmt_005fparam_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.ParamTag.class);
    _jspx_th_fmt_005fparam_005f3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fparam_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fmessage_005f3);
    // /libs/foundation/components/search/search.jsp(93,6) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fparam_005f3.setValue((java.lang.Object) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result.totalMatches}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fparam_005f3 = _jspx_th_fmt_005fparam_005f3.doStartTag();
    if (_jspx_th_fmt_005fparam_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fparam_005fvalue_005fnobody.reuse(_jspx_th_fmt_005fparam_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fparam_005fvalue_005fnobody.reuse(_jspx_th_fmt_005fparam_005f3);
    return false;
  }

  private boolean _jspx_meth_fmt_005fparam_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fmessage_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:param
    org.apache.taglibs.standard.tag.rt.fmt.ParamTag _jspx_th_fmt_005fparam_005f4 = (org.apache.taglibs.standard.tag.rt.fmt.ParamTag) _005fjspx_005ftagPool_005ffmt_005fparam_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.ParamTag.class);
    _jspx_th_fmt_005fparam_005f4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fparam_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fmessage_005f3);
    // /libs/foundation/components/search/search.jsp(94,6) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fparam_005f4.setValue((java.lang.Object) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:escapeXml(search.query)}", java.lang.Object.class, (PageContext)_jspx_page_context, _jspx_fnmap_0, false));
    int _jspx_eval_fmt_005fparam_005f4 = _jspx_th_fmt_005fparam_005f4.doStartTag();
    if (_jspx_th_fmt_005fparam_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fparam_005fvalue_005fnobody.reuse(_jspx_th_fmt_005fparam_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fparam_005fvalue_005fnobody.reuse(_jspx_th_fmt_005fparam_005f4);
    return false;
  }

  private boolean _jspx_meth_fmt_005fparam_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_fmt_005fmessage_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:param
    org.apache.taglibs.standard.tag.rt.fmt.ParamTag _jspx_th_fmt_005fparam_005f5 = (org.apache.taglibs.standard.tag.rt.fmt.ParamTag) _005fjspx_005ftagPool_005ffmt_005fparam_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.ParamTag.class);
    _jspx_th_fmt_005fparam_005f5.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fparam_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_fmt_005fmessage_005f3);
    // /libs/foundation/components/search/search.jsp(95,6) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fparam_005f5.setValue((java.lang.Object) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result.executionTime}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_fmt_005fparam_005f5 = _jspx_th_fmt_005fparam_005f5.doStartTag();
    if (_jspx_th_fmt_005fparam_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fparam_005fvalue_005fnobody.reuse(_jspx_th_fmt_005fparam_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fparam_005fvalue_005fnobody.reuse(_jspx_th_fmt_005fparam_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
    // /libs/foundation/components/search/search.jsp(98,10) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:length(trends.queries) > 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_1, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("              <p>");
        if (_jspx_meth_fmt_005fmessage_005f4(_jspx_th_c_005fif_005f1, _jspx_page_context))
          return true;
        out.write("</p>\n");
        out.write("              <div class=\"searchTrends\">\n");
        out.write("                  ");
        if (_jspx_meth_c_005fforEach_005f0(_jspx_th_c_005fif_005f1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("              </div>\n");
        out.write("          ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f4 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f4.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
    // /libs/foundation/components/search/search.jsp(99,17) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f4.setKey("searchTrendsText");
    int _jspx_eval_fmt_005fmessage_005f4 = _jspx_th_fmt_005fmessage_005f4.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f1);
    // /libs/foundation/components/search/search.jsp(101,18) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("query");
    // /libs/foundation/components/search/search.jsp(101,18) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${trends.queries}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                      <a href=\"");
          if (_jspx_meth_c_005furl_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("\"><span style=\"font-size:");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${query.size}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("px\">");
          if (_jspx_meth_c_005fout_005f3(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
            return true;
          out.write("</span></a>\n");
          out.write("                  ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_005fvalue.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /libs/foundation/components/search/search.jsp(102,31) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f1.setValue((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentPage.path}.html", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005furl_005f1 = _jspx_th_c_005furl_005f1.doStartTag();
    if (_jspx_eval_c_005furl_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      if (_jspx_eval_c_005furl_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.pushBody();
        _jspx_push_body_count_c_005fforEach_005f0[0]++;
        _jspx_th_c_005furl_005f1.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
        _jspx_th_c_005furl_005f1.doInitBody();
      }
      do {
        if (_jspx_meth_c_005fparam_005f1(_jspx_th_c_005furl_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
          return true;
        int evalDoAfterBody = _jspx_th_c_005furl_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
      if (_jspx_eval_c_005furl_005f1 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
        out = _jspx_page_context.popBody();
        _jspx_push_body_count_c_005fforEach_005f0[0]--;
      }
    }
    if (_jspx_th_c_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_005fvalue.reuse(_jspx_th_c_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_005fvalue.reuse(_jspx_th_c_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fparam_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005furl_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:param
    org.apache.taglibs.standard.tag.rt.core.ParamTag _jspx_th_c_005fparam_005f1 = (org.apache.taglibs.standard.tag.rt.core.ParamTag) _005fjspx_005ftagPool_005fc_005fparam_005fvalue_005fname_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ParamTag.class);
    _jspx_th_c_005fparam_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fparam_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005furl_005f1);
    // /libs/foundation/components/search/search.jsp(102,71) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fparam_005f1.setName("q");
    // /libs/foundation/components/search/search.jsp(102,71) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fparam_005f1.setValue((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${query.query}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fparam_005f1 = _jspx_th_c_005fparam_005f1.doStartTag();
    if (_jspx_th_c_005fparam_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fparam_005fvalue_005fname_005fnobody.reuse(_jspx_th_c_005fparam_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fparam_005fvalue_005fname_005fnobody.reuse(_jspx_th_c_005fparam_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /libs/foundation/components/search/search.jsp(102,163) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f3.setValue((java.lang.Object) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${query.query}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f3 = _jspx_th_c_005fout_005f3.doStartTag();
    if (_jspx_th_c_005fout_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f2 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    // /libs/foundation/components/search/search.jsp(110,18) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f2.setVar("bucketValue");
    // /libs/foundation/components/search/search.jsp(110,18) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f2.setValue((java.lang.Object) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bucket.value}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f2 = _jspx_th_c_005fset_005f2.doStartTag();
    if (_jspx_th_c_005fset_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f1 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f1);
    int _jspx_eval_c_005fchoose_005f1 = _jspx_th_c_005fchoose_005f1.doStartTag();
    if (_jspx_eval_c_005fchoose_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                      ");
        if (_jspx_meth_c_005fwhen_005f2(_jspx_th_c_005fchoose_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
          return true;
        out.write("\n");
        out.write("                      ");
        if (_jspx_meth_c_005fotherwise_005f1(_jspx_th_c_005fchoose_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
          return true;
        out.write("\n");
        out.write("                  ");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
    // /libs/foundation/components/search/search.jsp(113,22) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f2.setTest(((java.lang.Boolean) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.language != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f2 = _jspx_th_c_005fwhen_005f2.doStartTag();
    if (_jspx_eval_c_005fwhen_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${label}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(' ');
        out.write('(');
        out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bucket.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(") - <a href=\"");
        if (_jspx_meth_cq_005frequestURL_005f0(_jspx_th_c_005fwhen_005f2, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
          return true;
        out.write("\">remove filter</a>");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f2);
    return false;
  }

  private boolean _jspx_meth_cq_005frequestURL_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:requestURL
    com.day.cq.wcm.tags.RequestURLTag _jspx_th_cq_005frequestURL_005f0 = (com.day.cq.wcm.tags.RequestURLTag) _005fjspx_005ftagPool_005fcq_005frequestURL.get(com.day.cq.wcm.tags.RequestURLTag.class);
    _jspx_th_cq_005frequestURL_005f0.setPageContext(_jspx_page_context);
    _jspx_th_cq_005frequestURL_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f2);
    int _jspx_eval_cq_005frequestURL_005f0 = _jspx_th_cq_005frequestURL_005f0.doStartTag();
    if (_jspx_eval_cq_005frequestURL_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_cq_005fremoveParam_005f0(_jspx_th_cq_005frequestURL_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
          return true;
        if (_jspx_meth_cq_005fremoveParam_005f1(_jspx_th_cq_005frequestURL_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
          return true;
        int evalDoAfterBody = _jspx_th_cq_005frequestURL_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_cq_005frequestURL_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005frequestURL.reuse(_jspx_th_cq_005frequestURL_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005frequestURL.reuse(_jspx_th_cq_005frequestURL_005f0);
    return false;
  }

  private boolean _jspx_meth_cq_005fremoveParam_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_cq_005frequestURL_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:removeParam
    com.day.cq.wcm.tags.RemoveParamTag _jspx_th_cq_005fremoveParam_005f0 = (com.day.cq.wcm.tags.RemoveParamTag) _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.get(com.day.cq.wcm.tags.RemoveParamTag.class);
    _jspx_th_cq_005fremoveParam_005f0.setPageContext(_jspx_page_context);
    _jspx_th_cq_005fremoveParam_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cq_005frequestURL_005f0);
    // /libs/foundation/components/search/search.jsp(113,116) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005fremoveParam_005f0.setName("start");
    int _jspx_eval_cq_005fremoveParam_005f0 = _jspx_th_cq_005fremoveParam_005f0.doStartTag();
    if (_jspx_th_cq_005fremoveParam_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.reuse(_jspx_th_cq_005fremoveParam_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.reuse(_jspx_th_cq_005fremoveParam_005f0);
    return false;
  }

  private boolean _jspx_meth_cq_005fremoveParam_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_cq_005frequestURL_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:removeParam
    com.day.cq.wcm.tags.RemoveParamTag _jspx_th_cq_005fremoveParam_005f1 = (com.day.cq.wcm.tags.RemoveParamTag) _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.get(com.day.cq.wcm.tags.RemoveParamTag.class);
    _jspx_th_cq_005fremoveParam_005f1.setPageContext(_jspx_page_context);
    _jspx_th_cq_005fremoveParam_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cq_005frequestURL_005f0);
    // /libs/foundation/components/search/search.jsp(113,146) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005fremoveParam_005f1.setName("language");
    int _jspx_eval_cq_005fremoveParam_005f1 = _jspx_th_cq_005fremoveParam_005f1.doStartTag();
    if (_jspx_th_cq_005fremoveParam_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.reuse(_jspx_th_cq_005fremoveParam_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.reuse(_jspx_th_cq_005fremoveParam_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f1 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f1);
    int _jspx_eval_c_005fotherwise_005f1 = _jspx_th_c_005fotherwise_005f1.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<a title=\"filter results\" href=\"");
        if (_jspx_meth_cq_005frequestURL_005f1(_jspx_th_c_005fotherwise_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
          return true;
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${label}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(' ');
        out.write('(');
        out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bucket.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(")</a>");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f1);
    return false;
  }

  private boolean _jspx_meth_cq_005frequestURL_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:requestURL
    com.day.cq.wcm.tags.RequestURLTag _jspx_th_cq_005frequestURL_005f1 = (com.day.cq.wcm.tags.RequestURLTag) _005fjspx_005ftagPool_005fcq_005frequestURL.get(com.day.cq.wcm.tags.RequestURLTag.class);
    _jspx_th_cq_005frequestURL_005f1.setPageContext(_jspx_page_context);
    _jspx_th_cq_005frequestURL_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f1);
    int _jspx_eval_cq_005frequestURL_005f1 = _jspx_th_cq_005frequestURL_005f1.doStartTag();
    if (_jspx_eval_cq_005frequestURL_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_cq_005fremoveParam_005f2(_jspx_th_cq_005frequestURL_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
          return true;
        if (_jspx_meth_cq_005faddParam_005f0(_jspx_th_cq_005frequestURL_005f1, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f1))
          return true;
        int evalDoAfterBody = _jspx_th_cq_005frequestURL_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_cq_005frequestURL_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005frequestURL.reuse(_jspx_th_cq_005frequestURL_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005frequestURL.reuse(_jspx_th_cq_005frequestURL_005f1);
    return false;
  }

  private boolean _jspx_meth_cq_005fremoveParam_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_cq_005frequestURL_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:removeParam
    com.day.cq.wcm.tags.RemoveParamTag _jspx_th_cq_005fremoveParam_005f2 = (com.day.cq.wcm.tags.RemoveParamTag) _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.get(com.day.cq.wcm.tags.RemoveParamTag.class);
    _jspx_th_cq_005fremoveParam_005f2.setPageContext(_jspx_page_context);
    _jspx_th_cq_005fremoveParam_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cq_005frequestURL_005f1);
    // /libs/foundation/components/search/search.jsp(114,82) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005fremoveParam_005f2.setName("start");
    int _jspx_eval_cq_005fremoveParam_005f2 = _jspx_th_cq_005fremoveParam_005f2.doStartTag();
    if (_jspx_th_cq_005fremoveParam_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.reuse(_jspx_th_cq_005fremoveParam_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.reuse(_jspx_th_cq_005fremoveParam_005f2);
    return false;
  }

  private boolean _jspx_meth_cq_005faddParam_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_cq_005frequestURL_005f1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:addParam
    com.day.cq.wcm.tags.AddParamTag _jspx_th_cq_005faddParam_005f0 = (com.day.cq.wcm.tags.AddParamTag) _005fjspx_005ftagPool_005fcq_005faddParam_005fvalue_005fname_005fnobody.get(com.day.cq.wcm.tags.AddParamTag.class);
    _jspx_th_cq_005faddParam_005f0.setPageContext(_jspx_page_context);
    _jspx_th_cq_005faddParam_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cq_005frequestURL_005f1);
    // /libs/foundation/components/search/search.jsp(114,112) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005faddParam_005f0.setName("language");
    // /libs/foundation/components/search/search.jsp(114,112) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005faddParam_005f0.setValue((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bucket.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_cq_005faddParam_005f0 = _jspx_th_cq_005faddParam_005f0.doStartTag();
    if (_jspx_th_cq_005faddParam_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005faddParam_005fvalue_005fname_005fnobody.reuse(_jspx_th_cq_005faddParam_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005faddParam_005fvalue_005fname_005fnobody.reuse(_jspx_th_cq_005faddParam_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f4 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f2);
    // /libs/foundation/components/search/search.jsp(122,18) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f4.setVar("bucketValue");
    // /libs/foundation/components/search/search.jsp(122,18) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f4.setValue((java.lang.Object) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bucket.value}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f4 = _jspx_th_c_005fset_005f4.doStartTag();
    if (_jspx_th_c_005fset_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f6 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f4);
    // /libs/foundation/components/search/search.jsp(125,22) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f6.setVar("label");
    // /libs/foundation/components/search/search.jsp(125,22) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f6.setValue((java.lang.Object) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tag.title}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f6 = _jspx_th_c_005fset_005f6.doStartTag();
    if (_jspx_th_c_005fset_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f6);
    return false;
  }

  private boolean _jspx_meth_cq_005frequestURL_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:requestURL
    com.day.cq.wcm.tags.RequestURLTag _jspx_th_cq_005frequestURL_005f2 = (com.day.cq.wcm.tags.RequestURLTag) _005fjspx_005ftagPool_005fcq_005frequestURL.get(com.day.cq.wcm.tags.RequestURLTag.class);
    _jspx_th_cq_005frequestURL_005f2.setPageContext(_jspx_page_context);
    _jspx_th_cq_005frequestURL_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f3);
    int _jspx_eval_cq_005frequestURL_005f2 = _jspx_th_cq_005frequestURL_005f2.doStartTag();
    if (_jspx_eval_cq_005frequestURL_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_cq_005fremoveParam_005f3(_jspx_th_cq_005frequestURL_005f2, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
          return true;
        if (_jspx_meth_cq_005fremoveParam_005f4(_jspx_th_cq_005frequestURL_005f2, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
          return true;
        int evalDoAfterBody = _jspx_th_cq_005frequestURL_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_cq_005frequestURL_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005frequestURL.reuse(_jspx_th_cq_005frequestURL_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005frequestURL.reuse(_jspx_th_cq_005frequestURL_005f2);
    return false;
  }

  private boolean _jspx_meth_cq_005fremoveParam_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_cq_005frequestURL_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:removeParam
    com.day.cq.wcm.tags.RemoveParamTag _jspx_th_cq_005fremoveParam_005f3 = (com.day.cq.wcm.tags.RemoveParamTag) _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.get(com.day.cq.wcm.tags.RemoveParamTag.class);
    _jspx_th_cq_005fremoveParam_005f3.setPageContext(_jspx_page_context);
    _jspx_th_cq_005fremoveParam_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cq_005frequestURL_005f2);
    // /libs/foundation/components/search/search.jsp(127,249) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005fremoveParam_005f3.setName("start");
    int _jspx_eval_cq_005fremoveParam_005f3 = _jspx_th_cq_005fremoveParam_005f3.doStartTag();
    if (_jspx_th_cq_005fremoveParam_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.reuse(_jspx_th_cq_005fremoveParam_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.reuse(_jspx_th_cq_005fremoveParam_005f3);
    return false;
  }

  private boolean _jspx_meth_cq_005fremoveParam_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_cq_005frequestURL_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:removeParam
    com.day.cq.wcm.tags.RemoveParamTag _jspx_th_cq_005fremoveParam_005f4 = (com.day.cq.wcm.tags.RemoveParamTag) _005fjspx_005ftagPool_005fcq_005fremoveParam_005fvalue_005fname_005fnobody.get(com.day.cq.wcm.tags.RemoveParamTag.class);
    _jspx_th_cq_005fremoveParam_005f4.setPageContext(_jspx_page_context);
    _jspx_th_cq_005fremoveParam_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cq_005frequestURL_005f2);
    // /libs/foundation/components/search/search.jsp(127,279) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005fremoveParam_005f4.setName("tag");
    // /libs/foundation/components/search/search.jsp(127,279) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005fremoveParam_005f4.setValue((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bucket.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_cq_005fremoveParam_005f4 = _jspx_th_cq_005fremoveParam_005f4.doStartTag();
    if (_jspx_th_cq_005fremoveParam_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005fremoveParam_005fvalue_005fname_005fnobody.reuse(_jspx_th_cq_005fremoveParam_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005fremoveParam_005fvalue_005fname_005fnobody.reuse(_jspx_th_cq_005fremoveParam_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f2 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f2.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f2);
    int _jspx_eval_c_005fotherwise_005f2 = _jspx_th_c_005fotherwise_005f2.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<a title=\"filter results\" href=\"");
        if (_jspx_meth_cq_005frequestURL_005f3(_jspx_th_c_005fotherwise_005f2, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
          return true;
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${label}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(' ');
        out.write('(');
        out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bucket.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(")</a>");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f2);
    return false;
  }

  private boolean _jspx_meth_cq_005frequestURL_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:requestURL
    com.day.cq.wcm.tags.RequestURLTag _jspx_th_cq_005frequestURL_005f3 = (com.day.cq.wcm.tags.RequestURLTag) _005fjspx_005ftagPool_005fcq_005frequestURL.get(com.day.cq.wcm.tags.RequestURLTag.class);
    _jspx_th_cq_005frequestURL_005f3.setPageContext(_jspx_page_context);
    _jspx_th_cq_005frequestURL_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f2);
    int _jspx_eval_cq_005frequestURL_005f3 = _jspx_th_cq_005frequestURL_005f3.doStartTag();
    if (_jspx_eval_cq_005frequestURL_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_cq_005fremoveParam_005f5(_jspx_th_cq_005frequestURL_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
          return true;
        if (_jspx_meth_cq_005faddParam_005f1(_jspx_th_cq_005frequestURL_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f2))
          return true;
        int evalDoAfterBody = _jspx_th_cq_005frequestURL_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_cq_005frequestURL_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005frequestURL.reuse(_jspx_th_cq_005frequestURL_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005frequestURL.reuse(_jspx_th_cq_005frequestURL_005f3);
    return false;
  }

  private boolean _jspx_meth_cq_005fremoveParam_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_cq_005frequestURL_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:removeParam
    com.day.cq.wcm.tags.RemoveParamTag _jspx_th_cq_005fremoveParam_005f5 = (com.day.cq.wcm.tags.RemoveParamTag) _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.get(com.day.cq.wcm.tags.RemoveParamTag.class);
    _jspx_th_cq_005fremoveParam_005f5.setPageContext(_jspx_page_context);
    _jspx_th_cq_005fremoveParam_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cq_005frequestURL_005f3);
    // /libs/foundation/components/search/search.jsp(128,86) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005fremoveParam_005f5.setName("start");
    int _jspx_eval_cq_005fremoveParam_005f5 = _jspx_th_cq_005fremoveParam_005f5.doStartTag();
    if (_jspx_th_cq_005fremoveParam_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.reuse(_jspx_th_cq_005fremoveParam_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.reuse(_jspx_th_cq_005fremoveParam_005f5);
    return false;
  }

  private boolean _jspx_meth_cq_005faddParam_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_cq_005frequestURL_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:addParam
    com.day.cq.wcm.tags.AddParamTag _jspx_th_cq_005faddParam_005f1 = (com.day.cq.wcm.tags.AddParamTag) _005fjspx_005ftagPool_005fcq_005faddParam_005fvalue_005fname_005fnobody.get(com.day.cq.wcm.tags.AddParamTag.class);
    _jspx_th_cq_005faddParam_005f1.setPageContext(_jspx_page_context);
    _jspx_th_cq_005faddParam_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cq_005frequestURL_005f3);
    // /libs/foundation/components/search/search.jsp(128,116) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005faddParam_005f1.setName("tag");
    // /libs/foundation/components/search/search.jsp(128,116) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005faddParam_005f1.setValue((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bucket.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_cq_005faddParam_005f1 = _jspx_th_cq_005faddParam_005f1.doStartTag();
    if (_jspx_th_cq_005faddParam_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005faddParam_005fvalue_005fname_005fnobody.reuse(_jspx_th_cq_005faddParam_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005faddParam_005fvalue_005fname_005fnobody.reuse(_jspx_th_cq_005faddParam_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f7 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f3);
    // /libs/foundation/components/search/search.jsp(138,18) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f7.setVar("bucketValue");
    // /libs/foundation/components/search/search.jsp(138,18) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f7.setValue((java.lang.Object) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bucket.value}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f7 = _jspx_th_c_005fset_005f7.doStartTag();
    if (_jspx_th_c_005fset_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f7);
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f8 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_005fset_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005fset_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f3);
    // /libs/foundation/components/search/search.jsp(139,18) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f8.setVar("label");
    // /libs/foundation/components/search/search.jsp(139,18) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fset_005f8.setValue((java.lang.Object) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fileTypes[bucket.value]}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fset_005f8 = _jspx_th_c_005fset_005f8.doStartTag();
    if (_jspx_th_c_005fset_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fset_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f8);
    return false;
  }

  private boolean _jspx_meth_cq_005frequestURL_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:requestURL
    com.day.cq.wcm.tags.RequestURLTag _jspx_th_cq_005frequestURL_005f4 = (com.day.cq.wcm.tags.RequestURLTag) _005fjspx_005ftagPool_005fcq_005frequestURL.get(com.day.cq.wcm.tags.RequestURLTag.class);
    _jspx_th_cq_005frequestURL_005f4.setPageContext(_jspx_page_context);
    _jspx_th_cq_005frequestURL_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f4);
    int _jspx_eval_cq_005frequestURL_005f4 = _jspx_th_cq_005frequestURL_005f4.doStartTag();
    if (_jspx_eval_cq_005frequestURL_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_cq_005fremoveParam_005f6(_jspx_th_cq_005frequestURL_005f4, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
          return true;
        if (_jspx_meth_cq_005fremoveParam_005f7(_jspx_th_cq_005frequestURL_005f4, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
          return true;
        int evalDoAfterBody = _jspx_th_cq_005frequestURL_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_cq_005frequestURL_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005frequestURL.reuse(_jspx_th_cq_005frequestURL_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005frequestURL.reuse(_jspx_th_cq_005frequestURL_005f4);
    return false;
  }

  private boolean _jspx_meth_cq_005fremoveParam_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_cq_005frequestURL_005f4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:removeParam
    com.day.cq.wcm.tags.RemoveParamTag _jspx_th_cq_005fremoveParam_005f6 = (com.day.cq.wcm.tags.RemoveParamTag) _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.get(com.day.cq.wcm.tags.RemoveParamTag.class);
    _jspx_th_cq_005fremoveParam_005f6.setPageContext(_jspx_page_context);
    _jspx_th_cq_005fremoveParam_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cq_005frequestURL_005f4);
    // /libs/foundation/components/search/search.jsp(141,255) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005fremoveParam_005f6.setName("start");
    int _jspx_eval_cq_005fremoveParam_005f6 = _jspx_th_cq_005fremoveParam_005f6.doStartTag();
    if (_jspx_th_cq_005fremoveParam_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.reuse(_jspx_th_cq_005fremoveParam_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.reuse(_jspx_th_cq_005fremoveParam_005f6);
    return false;
  }

  private boolean _jspx_meth_cq_005fremoveParam_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_cq_005frequestURL_005f4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:removeParam
    com.day.cq.wcm.tags.RemoveParamTag _jspx_th_cq_005fremoveParam_005f7 = (com.day.cq.wcm.tags.RemoveParamTag) _005fjspx_005ftagPool_005fcq_005fremoveParam_005fvalue_005fname_005fnobody.get(com.day.cq.wcm.tags.RemoveParamTag.class);
    _jspx_th_cq_005fremoveParam_005f7.setPageContext(_jspx_page_context);
    _jspx_th_cq_005fremoveParam_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cq_005frequestURL_005f4);
    // /libs/foundation/components/search/search.jsp(141,285) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005fremoveParam_005f7.setName("mimeType");
    // /libs/foundation/components/search/search.jsp(141,285) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005fremoveParam_005f7.setValue((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bucket.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_cq_005fremoveParam_005f7 = _jspx_th_cq_005fremoveParam_005f7.doStartTag();
    if (_jspx_th_cq_005fremoveParam_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005fremoveParam_005fvalue_005fname_005fnobody.reuse(_jspx_th_cq_005fremoveParam_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005fremoveParam_005fvalue_005fname_005fnobody.reuse(_jspx_th_cq_005fremoveParam_005f7);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f3 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f3.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f3);
    int _jspx_eval_c_005fotherwise_005f3 = _jspx_th_c_005fotherwise_005f3.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<a title=\"filter results\" href=\"");
        if (_jspx_meth_cq_005frequestURL_005f5(_jspx_th_c_005fotherwise_005f3, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
          return true;
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${label}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(' ');
        out.write('(');
        out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bucket.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(")</a>");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f3);
    return false;
  }

  private boolean _jspx_meth_cq_005frequestURL_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:requestURL
    com.day.cq.wcm.tags.RequestURLTag _jspx_th_cq_005frequestURL_005f5 = (com.day.cq.wcm.tags.RequestURLTag) _005fjspx_005ftagPool_005fcq_005frequestURL.get(com.day.cq.wcm.tags.RequestURLTag.class);
    _jspx_th_cq_005frequestURL_005f5.setPageContext(_jspx_page_context);
    _jspx_th_cq_005frequestURL_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f3);
    int _jspx_eval_cq_005frequestURL_005f5 = _jspx_th_cq_005frequestURL_005f5.doStartTag();
    if (_jspx_eval_cq_005frequestURL_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_cq_005fremoveParam_005f8(_jspx_th_cq_005frequestURL_005f5, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
          return true;
        if (_jspx_meth_cq_005faddParam_005f2(_jspx_th_cq_005frequestURL_005f5, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f3))
          return true;
        int evalDoAfterBody = _jspx_th_cq_005frequestURL_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_cq_005frequestURL_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005frequestURL.reuse(_jspx_th_cq_005frequestURL_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005frequestURL.reuse(_jspx_th_cq_005frequestURL_005f5);
    return false;
  }

  private boolean _jspx_meth_cq_005fremoveParam_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_cq_005frequestURL_005f5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:removeParam
    com.day.cq.wcm.tags.RemoveParamTag _jspx_th_cq_005fremoveParam_005f8 = (com.day.cq.wcm.tags.RemoveParamTag) _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.get(com.day.cq.wcm.tags.RemoveParamTag.class);
    _jspx_th_cq_005fremoveParam_005f8.setPageContext(_jspx_page_context);
    _jspx_th_cq_005fremoveParam_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cq_005frequestURL_005f5);
    // /libs/foundation/components/search/search.jsp(142,82) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005fremoveParam_005f8.setName("start");
    int _jspx_eval_cq_005fremoveParam_005f8 = _jspx_th_cq_005fremoveParam_005f8.doStartTag();
    if (_jspx_th_cq_005fremoveParam_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.reuse(_jspx_th_cq_005fremoveParam_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.reuse(_jspx_th_cq_005fremoveParam_005f8);
    return false;
  }

  private boolean _jspx_meth_cq_005faddParam_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_cq_005frequestURL_005f5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:addParam
    com.day.cq.wcm.tags.AddParamTag _jspx_th_cq_005faddParam_005f2 = (com.day.cq.wcm.tags.AddParamTag) _005fjspx_005ftagPool_005fcq_005faddParam_005fvalue_005fname_005fnobody.get(com.day.cq.wcm.tags.AddParamTag.class);
    _jspx_th_cq_005faddParam_005f2.setPageContext(_jspx_page_context);
    _jspx_th_cq_005faddParam_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cq_005frequestURL_005f5);
    // /libs/foundation/components/search/search.jsp(142,112) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005faddParam_005f2.setName("mimeType");
    // /libs/foundation/components/search/search.jsp(142,112) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005faddParam_005f2.setValue((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bucket.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_cq_005faddParam_005f2 = _jspx_th_cq_005faddParam_005f2.doStartTag();
    if (_jspx_th_cq_005faddParam_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005faddParam_005fvalue_005fname_005fnobody.reuse(_jspx_th_cq_005faddParam_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005faddParam_005fvalue_005fname_005fnobody.reuse(_jspx_th_cq_005faddParam_005f2);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f6);
    // /libs/foundation/components/search/search.jsp(149,14) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f4.setVar("bucket");
    // /libs/foundation/components/search/search.jsp(149,14) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f4.setItems((java.lang.Object) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result.facets.lastModified.buckets}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_c_005fforEach_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f4 = _jspx_th_c_005fforEach_005f4.doStartTag();
      if (_jspx_eval_c_005fforEach_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                  ");
          if (_jspx_meth_c_005fchoose_005f4(_jspx_th_c_005fforEach_005f4, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f4))
            return true;
          out.write("<br/>\n");
          out.write("              ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f4.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f4 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f4);
    int _jspx_eval_c_005fchoose_005f4 = _jspx_th_c_005fchoose_005f4.doStartTag();
    if (_jspx_eval_c_005fchoose_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                      ");
        if (_jspx_meth_c_005fwhen_005f5(_jspx_th_c_005fchoose_005f4, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f4))
          return true;
        out.write("\n");
        out.write("                      ");
        if (_jspx_meth_c_005fotherwise_005f4(_jspx_th_c_005fchoose_005f4, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f4))
          return true;
        out.write("\n");
        out.write("                  ");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f5 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f4);
    // /libs/foundation/components/search/search.jsp(151,22) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f5.setTest(((java.lang.Boolean) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.from == bucket.from && param.to == bucket.to}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f5 = _jspx_th_c_005fwhen_005f5.doStartTag();
    if (_jspx_eval_c_005fwhen_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bucket.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(' ');
        out.write('(');
        out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bucket.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(") - <a href=\"");
        if (_jspx_meth_cq_005frequestURL_005f6(_jspx_th_c_005fwhen_005f5, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f4))
          return true;
        out.write("\">remove filter</a>");
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f5);
    return false;
  }

  private boolean _jspx_meth_cq_005frequestURL_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fwhen_005f5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:requestURL
    com.day.cq.wcm.tags.RequestURLTag _jspx_th_cq_005frequestURL_005f6 = (com.day.cq.wcm.tags.RequestURLTag) _005fjspx_005ftagPool_005fcq_005frequestURL.get(com.day.cq.wcm.tags.RequestURLTag.class);
    _jspx_th_cq_005frequestURL_005f6.setPageContext(_jspx_page_context);
    _jspx_th_cq_005frequestURL_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fwhen_005f5);
    int _jspx_eval_cq_005frequestURL_005f6 = _jspx_th_cq_005frequestURL_005f6.doStartTag();
    if (_jspx_eval_cq_005frequestURL_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_cq_005fremoveParam_005f9(_jspx_th_cq_005frequestURL_005f6, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f4))
          return true;
        if (_jspx_meth_cq_005fremoveParam_005f10(_jspx_th_cq_005frequestURL_005f6, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f4))
          return true;
        if (_jspx_meth_cq_005fremoveParam_005f11(_jspx_th_cq_005frequestURL_005f6, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f4))
          return true;
        int evalDoAfterBody = _jspx_th_cq_005frequestURL_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_cq_005frequestURL_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005frequestURL.reuse(_jspx_th_cq_005frequestURL_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005frequestURL.reuse(_jspx_th_cq_005frequestURL_005f6);
    return false;
  }

  private boolean _jspx_meth_cq_005fremoveParam_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_cq_005frequestURL_005f6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:removeParam
    com.day.cq.wcm.tags.RemoveParamTag _jspx_th_cq_005fremoveParam_005f9 = (com.day.cq.wcm.tags.RemoveParamTag) _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.get(com.day.cq.wcm.tags.RemoveParamTag.class);
    _jspx_th_cq_005fremoveParam_005f9.setPageContext(_jspx_page_context);
    _jspx_th_cq_005fremoveParam_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cq_005frequestURL_005f6);
    // /libs/foundation/components/search/search.jsp(151,151) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005fremoveParam_005f9.setName("start");
    int _jspx_eval_cq_005fremoveParam_005f9 = _jspx_th_cq_005fremoveParam_005f9.doStartTag();
    if (_jspx_th_cq_005fremoveParam_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.reuse(_jspx_th_cq_005fremoveParam_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.reuse(_jspx_th_cq_005fremoveParam_005f9);
    return false;
  }

  private boolean _jspx_meth_cq_005fremoveParam_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_cq_005frequestURL_005f6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:removeParam
    com.day.cq.wcm.tags.RemoveParamTag _jspx_th_cq_005fremoveParam_005f10 = (com.day.cq.wcm.tags.RemoveParamTag) _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.get(com.day.cq.wcm.tags.RemoveParamTag.class);
    _jspx_th_cq_005fremoveParam_005f10.setPageContext(_jspx_page_context);
    _jspx_th_cq_005fremoveParam_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cq_005frequestURL_005f6);
    // /libs/foundation/components/search/search.jsp(151,181) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005fremoveParam_005f10.setName("from");
    int _jspx_eval_cq_005fremoveParam_005f10 = _jspx_th_cq_005fremoveParam_005f10.doStartTag();
    if (_jspx_th_cq_005fremoveParam_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.reuse(_jspx_th_cq_005fremoveParam_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.reuse(_jspx_th_cq_005fremoveParam_005f10);
    return false;
  }

  private boolean _jspx_meth_cq_005fremoveParam_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_cq_005frequestURL_005f6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:removeParam
    com.day.cq.wcm.tags.RemoveParamTag _jspx_th_cq_005fremoveParam_005f11 = (com.day.cq.wcm.tags.RemoveParamTag) _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.get(com.day.cq.wcm.tags.RemoveParamTag.class);
    _jspx_th_cq_005fremoveParam_005f11.setPageContext(_jspx_page_context);
    _jspx_th_cq_005fremoveParam_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cq_005frequestURL_005f6);
    // /libs/foundation/components/search/search.jsp(151,210) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005fremoveParam_005f11.setName("to");
    int _jspx_eval_cq_005fremoveParam_005f11 = _jspx_th_cq_005fremoveParam_005f11.doStartTag();
    if (_jspx_th_cq_005fremoveParam_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.reuse(_jspx_th_cq_005fremoveParam_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.reuse(_jspx_th_cq_005fremoveParam_005f11);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f4 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f4);
    int _jspx_eval_c_005fotherwise_005f4 = _jspx_th_c_005fotherwise_005f4.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("<a title=\"filter results\" href=\"");
        if (_jspx_meth_cq_005frequestURL_005f7(_jspx_th_c_005fotherwise_005f4, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f4))
          return true;
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bucket.value}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(' ');
        out.write('(');
        out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bucket.count}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write(")</a>");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f4);
    return false;
  }

  private boolean _jspx_meth_cq_005frequestURL_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:requestURL
    com.day.cq.wcm.tags.RequestURLTag _jspx_th_cq_005frequestURL_005f7 = (com.day.cq.wcm.tags.RequestURLTag) _005fjspx_005ftagPool_005fcq_005frequestURL.get(com.day.cq.wcm.tags.RequestURLTag.class);
    _jspx_th_cq_005frequestURL_005f7.setPageContext(_jspx_page_context);
    _jspx_th_cq_005frequestURL_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f4);
    int _jspx_eval_cq_005frequestURL_005f7 = _jspx_th_cq_005frequestURL_005f7.doStartTag();
    if (_jspx_eval_cq_005frequestURL_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_cq_005fremoveParam_005f12(_jspx_th_cq_005frequestURL_005f7, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f4))
          return true;
        if (_jspx_meth_cq_005fremoveParam_005f13(_jspx_th_cq_005frequestURL_005f7, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f4))
          return true;
        if (_jspx_meth_cq_005fremoveParam_005f14(_jspx_th_cq_005frequestURL_005f7, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f4))
          return true;
        if (_jspx_meth_c_005fif_005f7(_jspx_th_cq_005frequestURL_005f7, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f4))
          return true;
        if (_jspx_meth_c_005fif_005f8(_jspx_th_cq_005frequestURL_005f7, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f4))
          return true;
        int evalDoAfterBody = _jspx_th_cq_005frequestURL_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_cq_005frequestURL_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005frequestURL.reuse(_jspx_th_cq_005frequestURL_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005frequestURL.reuse(_jspx_th_cq_005frequestURL_005f7);
    return false;
  }

  private boolean _jspx_meth_cq_005fremoveParam_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_cq_005frequestURL_005f7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:removeParam
    com.day.cq.wcm.tags.RemoveParamTag _jspx_th_cq_005fremoveParam_005f12 = (com.day.cq.wcm.tags.RemoveParamTag) _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.get(com.day.cq.wcm.tags.RemoveParamTag.class);
    _jspx_th_cq_005fremoveParam_005f12.setPageContext(_jspx_page_context);
    _jspx_th_cq_005fremoveParam_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cq_005frequestURL_005f7);
    // /libs/foundation/components/search/search.jsp(152,82) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005fremoveParam_005f12.setName("start");
    int _jspx_eval_cq_005fremoveParam_005f12 = _jspx_th_cq_005fremoveParam_005f12.doStartTag();
    if (_jspx_th_cq_005fremoveParam_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.reuse(_jspx_th_cq_005fremoveParam_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.reuse(_jspx_th_cq_005fremoveParam_005f12);
    return false;
  }

  private boolean _jspx_meth_cq_005fremoveParam_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_cq_005frequestURL_005f7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:removeParam
    com.day.cq.wcm.tags.RemoveParamTag _jspx_th_cq_005fremoveParam_005f13 = (com.day.cq.wcm.tags.RemoveParamTag) _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.get(com.day.cq.wcm.tags.RemoveParamTag.class);
    _jspx_th_cq_005fremoveParam_005f13.setPageContext(_jspx_page_context);
    _jspx_th_cq_005fremoveParam_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cq_005frequestURL_005f7);
    // /libs/foundation/components/search/search.jsp(152,112) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005fremoveParam_005f13.setName("from");
    int _jspx_eval_cq_005fremoveParam_005f13 = _jspx_th_cq_005fremoveParam_005f13.doStartTag();
    if (_jspx_th_cq_005fremoveParam_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.reuse(_jspx_th_cq_005fremoveParam_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.reuse(_jspx_th_cq_005fremoveParam_005f13);
    return false;
  }

  private boolean _jspx_meth_cq_005fremoveParam_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_cq_005frequestURL_005f7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:removeParam
    com.day.cq.wcm.tags.RemoveParamTag _jspx_th_cq_005fremoveParam_005f14 = (com.day.cq.wcm.tags.RemoveParamTag) _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.get(com.day.cq.wcm.tags.RemoveParamTag.class);
    _jspx_th_cq_005fremoveParam_005f14.setPageContext(_jspx_page_context);
    _jspx_th_cq_005fremoveParam_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cq_005frequestURL_005f7);
    // /libs/foundation/components/search/search.jsp(152,141) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005fremoveParam_005f14.setName("to");
    int _jspx_eval_cq_005fremoveParam_005f14 = _jspx_th_cq_005fremoveParam_005f14.doStartTag();
    if (_jspx_th_cq_005fremoveParam_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.reuse(_jspx_th_cq_005fremoveParam_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005fremoveParam_005fname_005fnobody.reuse(_jspx_th_cq_005fremoveParam_005f14);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_cq_005frequestURL_005f7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cq_005frequestURL_005f7);
    // /libs/foundation/components/search/search.jsp(152,168) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f7.setTest(((java.lang.Boolean) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bucket.from != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f7 = _jspx_th_c_005fif_005f7.doStartTag();
    if (_jspx_eval_c_005fif_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_cq_005faddParam_005f3(_jspx_th_c_005fif_005f7, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f4))
          return true;
        int evalDoAfterBody = _jspx_th_c_005fif_005f7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f7);
    return false;
  }

  private boolean _jspx_meth_cq_005faddParam_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:addParam
    com.day.cq.wcm.tags.AddParamTag _jspx_th_cq_005faddParam_005f3 = (com.day.cq.wcm.tags.AddParamTag) _005fjspx_005ftagPool_005fcq_005faddParam_005fvalue_005fname_005fnobody.get(com.day.cq.wcm.tags.AddParamTag.class);
    _jspx_th_cq_005faddParam_005f3.setPageContext(_jspx_page_context);
    _jspx_th_cq_005faddParam_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f7);
    // /libs/foundation/components/search/search.jsp(152,204) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005faddParam_005f3.setName("from");
    // /libs/foundation/components/search/search.jsp(152,204) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005faddParam_005f3.setValue((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bucket.from}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_cq_005faddParam_005f3 = _jspx_th_cq_005faddParam_005f3.doStartTag();
    if (_jspx_th_cq_005faddParam_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005faddParam_005fvalue_005fname_005fnobody.reuse(_jspx_th_cq_005faddParam_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005faddParam_005fvalue_005fname_005fnobody.reuse(_jspx_th_cq_005faddParam_005f3);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_cq_005frequestURL_005f7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f8.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_cq_005frequestURL_005f7);
    // /libs/foundation/components/search/search.jsp(152,260) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f8.setTest(((java.lang.Boolean) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bucket.to != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f8 = _jspx_th_c_005fif_005f8.doStartTag();
    if (_jspx_eval_c_005fif_005f8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        if (_jspx_meth_cq_005faddParam_005f4(_jspx_th_c_005fif_005f8, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f4))
          return true;
        int evalDoAfterBody = _jspx_th_c_005fif_005f8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f8);
    return false;
  }

  private boolean _jspx_meth_cq_005faddParam_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f8, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:addParam
    com.day.cq.wcm.tags.AddParamTag _jspx_th_cq_005faddParam_005f4 = (com.day.cq.wcm.tags.AddParamTag) _005fjspx_005ftagPool_005fcq_005faddParam_005fvalue_005fname_005fnobody.get(com.day.cq.wcm.tags.AddParamTag.class);
    _jspx_th_cq_005faddParam_005f4.setPageContext(_jspx_page_context);
    _jspx_th_cq_005faddParam_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f8);
    // /libs/foundation/components/search/search.jsp(152,294) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005faddParam_005f4.setName("to");
    // /libs/foundation/components/search/search.jsp(152,294) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005faddParam_005f4.setValue((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${bucket.to}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_cq_005faddParam_005f4 = _jspx_th_cq_005faddParam_005f4.doStartTag();
    if (_jspx_th_cq_005faddParam_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005faddParam_005fvalue_005fname_005fnobody.reuse(_jspx_th_cq_005faddParam_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005faddParam_005fvalue_005fname_005fnobody.reuse(_jspx_th_cq_005faddParam_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f9.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
    // /libs/foundation/components/search/search.jsp(158,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f9.setTest(((java.lang.Boolean) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:length(search.relatedQueries) > 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_1, false)).booleanValue());
    int _jspx_eval_c_005fif_005f9 = _jspx_th_c_005fif_005f9.doStartTag();
    if (_jspx_eval_c_005fif_005f9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        <br/><br/>\n");
        out.write("        ");
        if (_jspx_meth_fmt_005fmessage_005f5(_jspx_th_c_005fif_005f9, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_c_005fforEach_005f5(_jspx_th_c_005fif_005f9, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f9);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f5 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f5.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f9);
    // /libs/foundation/components/search/search.jsp(160,8) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f5.setKey("relatedSearchesText");
    int _jspx_eval_fmt_005fmessage_005f5 = _jspx_th_fmt_005fmessage_005f5.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f9);
    // /libs/foundation/components/search/search.jsp(161,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f5.setVar("rq");
    // /libs/foundation/components/search/search.jsp(161,8) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f5.setItems((java.lang.Object) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${search.relatedQueries}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_c_005fforEach_005f5 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f5 = _jspx_th_c_005fforEach_005f5.doStartTag();
      if (_jspx_eval_c_005fforEach_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            <a style=\"margin-right:10px\" href=\"");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${currentPage.path}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(".html?q=");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rq}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          if (_jspx_meth_c_005fout_005f4(_jspx_th_c_005fforEach_005f5, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f5))
            return true;
          out.write("</a>\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f5.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f5);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f4 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_005fout_005f4.setPageContext(_jspx_page_context);
    _jspx_th_c_005fout_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f5);
    // /libs/foundation/components/search/search.jsp(162,81) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fout_005f4.setValue((java.lang.Object) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${rq}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_c_005fout_005f4 = _jspx_th_c_005fout_005f4.doStartTag();
    if (_jspx_th_c_005fout_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f4);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f6 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
    // /libs/foundation/components/search/search.jsp(166,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f6.setVar("hit");
    // /libs/foundation/components/search/search.jsp(166,6) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f6.setItems((java.lang.Object) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result.hits}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /libs/foundation/components/search/search.jsp(166,6) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f6.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f6 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f6 = _jspx_th_c_005fforEach_005f6.doStartTag();
      if (_jspx_eval_c_005fforEach_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("        <br/>\n");
          out.write("        ");
          if (_jspx_meth_c_005fif_005f10(_jspx_th_c_005fforEach_005f6, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f6))
            return true;
          out.write("\n");
          out.write("        <a href=\"");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hit.URL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("\" onclick=\"trackSelectedResult(this, ");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.index + 1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write(')');
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hit.title}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</a>\n");
          out.write("        <div>");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hit.excerpt}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</div>\n");
          out.write("        ");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hit.URL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          if (_jspx_meth_c_005fif_005f11(_jspx_th_c_005fforEach_005f6, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f6))
            return true;
          out.write(" - <a href=\"");
          out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hit.similarURL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          if (_jspx_meth_fmt_005fmessage_005f6(_jspx_th_c_005fforEach_005f6, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f6))
            return true;
          out.write("</a>\n");
          out.write("        <br/>\n");
          out.write("      ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f6.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f6);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f10.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f6);
    // /libs/foundation/components/search/search.jsp(168,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f10.setTest(((java.lang.Boolean) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hit.extension != \"\" && hit.extension != \"html\"}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f10 = _jspx_th_c_005fif_005f10.doStartTag();
    if (_jspx_eval_c_005fif_005f10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            <span class=\"icon type_");
        out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hit.extension}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"><img src=\"/etc/designs/default/0.gif\" alt=\"*\"></span>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f10);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f10);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f11.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f6);
    // /libs/foundation/components/search/search.jsp(173,18) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f11.setTest(((java.lang.Boolean) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${!empty hit.properties['cq:lastModified']}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f11 = _jspx_th_c_005fif_005f11.doStartTag();
    if (_jspx_eval_c_005fif_005f11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(' ');
        out.write('-');
        out.write(' ');
        if (_jspx_meth_c_005fcatch_005f0(_jspx_th_c_005fif_005f11, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f6))
          return true;
        int evalDoAfterBody = _jspx_th_c_005fif_005f11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f11);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f11);
    return false;
  }

  private boolean _jspx_meth_c_005fcatch_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f11, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:catch
    org.apache.taglibs.standard.tag.common.core.CatchTag _jspx_th_c_005fcatch_005f0 = (org.apache.taglibs.standard.tag.common.core.CatchTag) _005fjspx_005ftagPool_005fc_005fcatch.get(org.apache.taglibs.standard.tag.common.core.CatchTag.class);
    _jspx_th_c_005fcatch_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fcatch_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f11);
    int[] _jspx_push_body_count_c_005fcatch_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fcatch_005f0 = _jspx_th_c_005fcatch_005f0.doStartTag();
      if (_jspx_eval_c_005fcatch_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_th_c_005fcatch_005f0, _jspx_page_context, _jspx_push_body_count_c_005fcatch_005f0))
            return true;
          int evalDoAfterBody = _jspx_th_c_005fcatch_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fcatch_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fcatch_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fcatch_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fcatch_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fcatch.reuse(_jspx_th_c_005fcatch_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fcatch_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fcatch_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fdateStyle_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fcatch_005f0);
    // /libs/foundation/components/search/search.jsp(173,87) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${hit.properties['cq:lastModified'].time}", java.util.Date.class, (PageContext)_jspx_page_context, null, false));
    // /libs/foundation/components/search/search.jsp(173,87) name = dateStyle type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setDateStyle("medium");
    int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fdateStyle_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_005fvalue_005fdateStyle_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f6 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f6.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f6);
    // /libs/foundation/components/search/search.jsp(173,221) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f6.setKey("similarPagesText");
    int _jspx_eval_fmt_005fmessage_005f6 = _jspx_th_fmt_005fmessage_005f6.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f6);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fotherwise_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f12 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f12.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
    // /libs/foundation/components/search/search.jsp(177,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f12.setTest(((java.lang.Boolean) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${fn:length(result.resultPages) > 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, _jspx_fnmap_1, false)).booleanValue());
    int _jspx_eval_c_005fif_005f12 = _jspx_th_c_005fif_005f12.doStartTag();
    if (_jspx_eval_c_005fif_005f12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_fmt_005fmessage_005f7(_jspx_th_c_005fif_005f12, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_c_005fif_005f13(_jspx_th_c_005fif_005f12, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_c_005fforEach_005f7(_jspx_th_c_005fif_005f12, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("        ");
        if (_jspx_meth_c_005fif_005f14(_jspx_th_c_005fif_005f12, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("      ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f12);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f12);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f7 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f7.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f12);
    // /libs/foundation/components/search/search.jsp(178,8) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f7.setKey("resultPagesText");
    int _jspx_eval_fmt_005fmessage_005f7 = _jspx_th_fmt_005fmessage_005f7.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f7);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f7);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f13 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f13.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f12);
    // /libs/foundation/components/search/search.jsp(179,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f13.setTest(((java.lang.Boolean) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result.previousPage != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f13 = _jspx_th_c_005fif_005f13.doStartTag();
    if (_jspx_eval_c_005fif_005f13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("          <a href=\"");
        out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result.previousPage.URL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('"');
        out.write('>');
        if (_jspx_meth_fmt_005fmessage_005f8(_jspx_th_c_005fif_005f13, _jspx_page_context))
          return true;
        out.write("</a>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f13);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f13);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f13, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f8 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f8.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f13);
    // /libs/foundation/components/search/search.jsp(180,47) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f8.setKey("previousText");
    int _jspx_eval_fmt_005fmessage_005f8 = _jspx_th_fmt_005fmessage_005f8.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f8);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f8);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f7 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f7.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f12);
    // /libs/foundation/components/search/search.jsp(182,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f7.setVar("page");
    // /libs/foundation/components/search/search.jsp(182,8) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f7.setItems((java.lang.Object) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result.resultPages}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    int[] _jspx_push_body_count_c_005fforEach_005f7 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f7 = _jspx_th_c_005fforEach_005f7.doStartTag();
      if (_jspx_eval_c_005fforEach_005f7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("          ");
          if (_jspx_meth_c_005fchoose_005f5(_jspx_th_c_005fforEach_005f7, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f7))
            return true;
          out.write("\n");
          out.write("        ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f7.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f7.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f7);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fchoose_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f7, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f5 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_005fchoose_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fchoose_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f7);
    int _jspx_eval_c_005fchoose_005f5 = _jspx_th_c_005fchoose_005f5.doStartTag();
    if (_jspx_eval_c_005fchoose_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_c_005fwhen_005f6(_jspx_th_c_005fchoose_005f5, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f7))
          return true;
        out.write("\n");
        out.write("            ");
        if (_jspx_meth_c_005fotherwise_005f5(_jspx_th_c_005fchoose_005f5, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f7))
          return true;
        out.write("\n");
        out.write("          ");
        int evalDoAfterBody = _jspx_th_c_005fchoose_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fchoose_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f6 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_005fwhen_005f6.setPageContext(_jspx_page_context);
    _jspx_th_c_005fwhen_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f5);
    // /libs/foundation/components/search/search.jsp(184,12) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fwhen_005f6.setTest(((java.lang.Boolean) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${page.currentPage}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fwhen_005f6 = _jspx_th_c_005fwhen_005f6.doStartTag();
    if (_jspx_eval_c_005fwhen_005f6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${page.index + 1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        int evalDoAfterBody = _jspx_th_c_005fwhen_005f6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fwhen_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f6);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fwhen_005ftest.reuse(_jspx_th_c_005fwhen_005f6);
    return false;
  }

  private boolean _jspx_meth_c_005fotherwise_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f7)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f5 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_005fotherwise_005f5.setPageContext(_jspx_page_context);
    _jspx_th_c_005fotherwise_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f5);
    int _jspx_eval_c_005fotherwise_005f5 = _jspx_th_c_005fotherwise_005f5.doStartTag();
    if (_jspx_eval_c_005fotherwise_005f5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("              <a href=\"");
        out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${page.URL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('"');
        out.write('>');
        out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${page.index + 1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("</a>\n");
        out.write("            ");
        int evalDoAfterBody = _jspx_th_c_005fotherwise_005f5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fotherwise_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f5);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f5);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f14 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f14.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f12);
    // /libs/foundation/components/search/search.jsp(190,8) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f14.setTest(((java.lang.Boolean) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result.nextPage != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f14 = _jspx_th_c_005fif_005f14.doStartTag();
    if (_jspx_eval_c_005fif_005f14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("          <a href=\"");
        out.write((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${result.nextPage.URL}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write('"');
        out.write('>');
        if (_jspx_meth_fmt_005fmessage_005f9(_jspx_th_c_005fif_005f14, _jspx_page_context))
          return true;
        out.write("</a>\n");
        out.write("        ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f14);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_005ftest.reuse(_jspx_th_c_005fif_005f14);
    return false;
  }

  private boolean _jspx_meth_fmt_005fmessage_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f14, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:message
    org.apache.taglibs.standard.tag.rt.fmt.MessageTag _jspx_th_fmt_005fmessage_005f9 = (org.apache.taglibs.standard.tag.rt.fmt.MessageTag) _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.MessageTag.class);
    _jspx_th_fmt_005fmessage_005f9.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fmessage_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f14);
    // /libs/foundation/components/search/search.jsp(191,43) name = key type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fmessage_005f9.setKey("nextText");
    int _jspx_eval_fmt_005fmessage_005f9 = _jspx_th_fmt_005fmessage_005f9.doStartTag();
    if (_jspx_th_fmt_005fmessage_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f9);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fmessage_005fkey_005fnobody.reuse(_jspx_th_fmt_005fmessage_005f9);
    return false;
  }
}
