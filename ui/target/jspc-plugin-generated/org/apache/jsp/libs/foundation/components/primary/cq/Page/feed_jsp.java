package org.apache.jsp.libs.foundation.components.primary.cq.Page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.day.cq.wcm.api.Page;
import com.day.cq.commons.Externalizer;
import com.day.cq.wcm.api.WCMMode;
import java.util.Iterator;
import com.day.cq.commons.ProductInfoService;
import com.day.cq.commons.ProductInfo;

public final class feed_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fatom_005ffeed_005fid;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fatom_005ftitle;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fatom_005fsubtitle;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fatom_005flink_005frel_005fhref_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fatom_005fgenerator_005fversion_005furi;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsling_005finclude_005fpath_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fatom_005ffeed_005fid = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fatom_005ftitle = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fatom_005fsubtitle = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fatom_005flink_005frel_005fhref_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fatom_005fgenerator_005fversion_005furi = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsling_005finclude_005fpath_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fatom_005ffeed_005fid.release();
    _005fjspx_005ftagPool_005fatom_005ftitle.release();
    _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fatom_005fsubtitle.release();
    _005fjspx_005ftagPool_005fatom_005flink_005frel_005fhref_005fnobody.release();
    _005fjspx_005ftagPool_005fatom_005fgenerator_005fversion_005furi.release();
    _005fjspx_005ftagPool_005fsling_005finclude_005fpath_005fnobody.release();
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


    // todo: forward to jcr:content node
//    RequestDispatcherOptions opts = new RequestDispatcherOptions();
//    opts.setForceResourceType("cq/PageContent");
//    slingRequest.getRequestDispatcher(currentPage.getContentResource(), opts).
//            forward(request, response);


    try {
        ProductInfo pi = sling.getService(ProductInfoService.class).getInfo();
        WCMMode.DISABLED.toRequest(request);

        Externalizer externalizer = sling.getService(Externalizer.class);
        String url = externalizer.absoluteLink(slingRequest, slingRequest.getScheme(), currentPage.getPath());

        String link = url + ".feed";
        String title = currentPage.getTitle() !=null ?
                currentPage.getTitle() : currentNode.getName();
        String subTitle = currentPage.getDescription() != null ?
                currentPage.getDescription() : (String)properties.get("jcr:description", null);
        String genUri = pi.getUrl();
        String genName = pi.getName();
        String genVersion = pi.getShortVersion();

        
      //  atom:feed
      org.apache.sling.atom.taglib.FeedTagHandler _jspx_th_atom_005ffeed_005f0 = (org.apache.sling.atom.taglib.FeedTagHandler) _005fjspx_005ftagPool_005fatom_005ffeed_005fid.get(org.apache.sling.atom.taglib.FeedTagHandler.class);
      _jspx_th_atom_005ffeed_005f0.setPageContext(_jspx_page_context);
      _jspx_th_atom_005ffeed_005f0.setParent(null);
      // /libs/foundation/components/primary/cq/Page/feed.jsp(54,10) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_atom_005ffeed_005f0.setId( url );
      int _jspx_eval_atom_005ffeed_005f0 = _jspx_th_atom_005ffeed_005f0.doStartTag();
      if (_jspx_eval_atom_005ffeed_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_atom_005ffeed_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_atom_005ffeed_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_atom_005ffeed_005f0.doInitBody();
        }
        do {

            
          //  atom:title
          org.apache.sling.atom.taglib.TitleTagHandler _jspx_th_atom_005ftitle_005f0 = (org.apache.sling.atom.taglib.TitleTagHandler) _005fjspx_005ftagPool_005fatom_005ftitle.get(org.apache.sling.atom.taglib.TitleTagHandler.class);
          _jspx_th_atom_005ftitle_005f0.setPageContext(_jspx_page_context);
          _jspx_th_atom_005ftitle_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_atom_005ffeed_005f0);
          int _jspx_eval_atom_005ftitle_005f0 = _jspx_th_atom_005ftitle_005f0.doStartTag();
          if (_jspx_eval_atom_005ftitle_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_atom_005ftitle_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_atom_005ftitle_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_atom_005ftitle_005f0.doInitBody();
            }
            do {
              //  c:out
              org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
              _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
              _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_atom_005ftitle_005f0);
              // /libs/foundation/components/primary/cq/Page/feed.jsp(55,26) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_c_005fout_005f0.setValue( title );
              int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
              if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
              int evalDoAfterBody = _jspx_th_atom_005ftitle_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_atom_005ftitle_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_atom_005ftitle_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fatom_005ftitle.reuse(_jspx_th_atom_005ftitle_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fatom_005ftitle.reuse(_jspx_th_atom_005ftitle_005f0);

            if (subTitle != null) {
                
          //  atom:subtitle
          org.apache.sling.atom.taglib.SubtitleTagHandler _jspx_th_atom_005fsubtitle_005f0 = (org.apache.sling.atom.taglib.SubtitleTagHandler) _005fjspx_005ftagPool_005fatom_005fsubtitle.get(org.apache.sling.atom.taglib.SubtitleTagHandler.class);
          _jspx_th_atom_005fsubtitle_005f0.setPageContext(_jspx_page_context);
          _jspx_th_atom_005fsubtitle_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_atom_005ffeed_005f0);
          int _jspx_eval_atom_005fsubtitle_005f0 = _jspx_th_atom_005fsubtitle_005f0.doStartTag();
          if (_jspx_eval_atom_005fsubtitle_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_atom_005fsubtitle_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_atom_005fsubtitle_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_atom_005fsubtitle_005f0.doInitBody();
            }
            do {
              //  c:out
              org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
              _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
              _jspx_th_c_005fout_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_atom_005fsubtitle_005f0);
              // /libs/foundation/components/primary/cq/Page/feed.jsp(57,33) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_c_005fout_005f1.setValue( subTitle );
              int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
              if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
                return;
              }
              _005fjspx_005ftagPool_005fc_005fout_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
              int evalDoAfterBody = _jspx_th_atom_005fsubtitle_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_atom_005fsubtitle_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_atom_005fsubtitle_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fatom_005fsubtitle.reuse(_jspx_th_atom_005fsubtitle_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fatom_005fsubtitle.reuse(_jspx_th_atom_005fsubtitle_005f0);

            }
        
          //  atom:link
          org.apache.sling.atom.taglib.LinkTagHandler _jspx_th_atom_005flink_005f0 = (org.apache.sling.atom.taglib.LinkTagHandler) _005fjspx_005ftagPool_005fatom_005flink_005frel_005fhref_005fnobody.get(org.apache.sling.atom.taglib.LinkTagHandler.class);
          _jspx_th_atom_005flink_005f0.setPageContext(_jspx_page_context);
          _jspx_th_atom_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_atom_005ffeed_005f0);
          // /libs/foundation/components/primary/cq/Page/feed.jsp(59,10) name = href type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_atom_005flink_005f0.setHref( link );
          // /libs/foundation/components/primary/cq/Page/feed.jsp(59,10) name = rel type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_atom_005flink_005f0.setRel("self");
          int _jspx_eval_atom_005flink_005f0 = _jspx_th_atom_005flink_005f0.doStartTag();
          if (_jspx_th_atom_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fatom_005flink_005frel_005fhref_005fnobody.reuse(_jspx_th_atom_005flink_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fatom_005flink_005frel_005fhref_005fnobody.reuse(_jspx_th_atom_005flink_005f0);

        
          //  atom:generator
          org.apache.sling.atom.taglib.GeneratorTagHandler _jspx_th_atom_005fgenerator_005f0 = (org.apache.sling.atom.taglib.GeneratorTagHandler) _005fjspx_005ftagPool_005fatom_005fgenerator_005fversion_005furi.get(org.apache.sling.atom.taglib.GeneratorTagHandler.class);
          _jspx_th_atom_005fgenerator_005f0.setPageContext(_jspx_page_context);
          _jspx_th_atom_005fgenerator_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_atom_005ffeed_005f0);
          // /libs/foundation/components/primary/cq/Page/feed.jsp(60,10) name = uri type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_atom_005fgenerator_005f0.setUri( genUri );
          // /libs/foundation/components/primary/cq/Page/feed.jsp(60,10) name = version type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_atom_005fgenerator_005f0.setVersion( genVersion);
          int _jspx_eval_atom_005fgenerator_005f0 = _jspx_th_atom_005fgenerator_005f0.doStartTag();
          if (_jspx_eval_atom_005fgenerator_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_atom_005fgenerator_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_atom_005fgenerator_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_atom_005fgenerator_005f0.doInitBody();
            }
            do {
              out.print( genName );
              int evalDoAfterBody = _jspx_th_atom_005fgenerator_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_atom_005fgenerator_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_atom_005fgenerator_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fatom_005fgenerator_005fversion_005furi.reuse(_jspx_th_atom_005fgenerator_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fatom_005fgenerator_005fversion_005furi.reuse(_jspx_th_atom_005fgenerator_005f0);



        Iterator<Page> i = currentPage.listChildren();
        while (i.hasNext()) {
            Page p = i.next();
            pageContext.setAttribute("p", p);
            
          if (_jspx_meth_sling_005finclude_005f0(_jspx_th_atom_005ffeed_005f0, _jspx_page_context))
            return;

        }

        
          int evalDoAfterBody = _jspx_th_atom_005ffeed_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_atom_005ffeed_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_atom_005ffeed_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fatom_005ffeed_005fid.reuse(_jspx_th_atom_005ffeed_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fatom_005ffeed_005fid.reuse(_jspx_th_atom_005ffeed_005f0);


    } catch (Exception e) {
        log.error("error rendering feed for page", e);
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

  private boolean _jspx_meth_sling_005finclude_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_atom_005ffeed_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sling:include
    org.apache.sling.scripting.jsp.taglib.IncludeTagHandler _jspx_th_sling_005finclude_005f0 = (org.apache.sling.scripting.jsp.taglib.IncludeTagHandler) _005fjspx_005ftagPool_005fsling_005finclude_005fpath_005fnobody.get(org.apache.sling.scripting.jsp.taglib.IncludeTagHandler.class);
    _jspx_th_sling_005finclude_005f0.setPageContext(_jspx_page_context);
    _jspx_th_sling_005finclude_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_atom_005ffeed_005f0);
    // /libs/foundation/components/primary/cq/Page/feed.jsp(67,14) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_sling_005finclude_005f0.setPath((java.lang.String) org.apache.sling.scripting.jsp.jasper.runtime.PageContextImpl.proprietaryEvaluate("${p.path}.feedentry", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    int _jspx_eval_sling_005finclude_005f0 = _jspx_th_sling_005finclude_005f0.doStartTag();
    if (_jspx_th_sling_005finclude_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsling_005finclude_005fpath_005fnobody.reuse(_jspx_th_sling_005finclude_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsling_005finclude_005fpath_005fnobody.reuse(_jspx_th_sling_005finclude_005f0);
    return false;
  }
}
