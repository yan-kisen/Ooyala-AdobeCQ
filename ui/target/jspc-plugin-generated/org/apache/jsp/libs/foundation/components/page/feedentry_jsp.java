package org.apache.jsp.libs.foundation.components.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import com.day.cq.commons.Externalizer;
import java.util.ArrayList;
import com.day.cq.tagging.Tag;
import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.PageManager;
import com.day.cq.wcm.foundation.ParagraphSystem;
import com.day.cq.wcm.foundation.Paragraph;
import com.day.cq.wcm.foundation.Download;
import org.apache.sling.api.resource.ResourceResolver;
import com.day.text.Text;
import com.day.cq.wcm.api.WCMMode;

public final class feedentry_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fatom_005fentry_005fupdated_005fpublished_005fid;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fatom_005ftitle;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fatom_005flink_005fhref_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fatom_005fauthor_005fname_005femail_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fatom_005flink_005ftype_005frel_005fhref_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fatom_005fcontent;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsling_005finclude_005fpath_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fatom_005fcategory_005fterm_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fatom_005fsummary;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fatom_005fentry_005fupdated_005fpublished_005fid = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fatom_005ftitle = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fatom_005flink_005fhref_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fatom_005fauthor_005fname_005femail_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fatom_005flink_005ftype_005frel_005fhref_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fatom_005fcontent = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsling_005finclude_005fpath_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fatom_005fcategory_005fterm_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fatom_005fsummary = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fatom_005fentry_005fupdated_005fpublished_005fid.release();
    _005fjspx_005ftagPool_005fatom_005ftitle.release();
    _005fjspx_005ftagPool_005fatom_005flink_005fhref_005fnobody.release();
    _005fjspx_005ftagPool_005fatom_005fauthor_005fname_005femail_005fnobody.release();
    _005fjspx_005ftagPool_005fatom_005flink_005ftype_005frel_005fhref_005fnobody.release();
    _005fjspx_005ftagPool_005fatom_005fcontent.release();
    _005fjspx_005ftagPool_005fsling_005finclude_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fatom_005fcategory_005fterm_005fnobody.release();
    _005fjspx_005ftagPool_005fatom_005fsummary.release();
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


    try {
        WCMMode.DISABLED.toRequest(request);
        ResourceResolver rr = slingRequest.getResourceResolver();
        Page entryPage = rr.adaptTo(PageManager.class).getPage(Text.getRelativeParent(currentNode.getPath(), 1));

        Externalizer externalizer = sling.getService(Externalizer.class);
        String url = externalizer.absoluteLink(slingRequest, slingRequest.getScheme(), entryPage.getPath());

        String link = url + ".html"; //todo need to revisit this, here just to be consistent with other feedentry
        String title = entryPage.getTitle() !=null ?
                entryPage.getTitle() : currentNode.getName();
        String desc = entryPage.getDescription() != null ?
                entryPage.getDescription() : (String)properties.get("jcr:description", null);
        Date udate = entryPage.getLastModified() != null ?
                entryPage.getLastModified().getTime() : properties.get("jcr:created", Date.class);
        Date pdate = properties.get("cq:lastReplicated", udate);
        String authorName = entryPage.getLastModifiedBy() != null ?
                entryPage.getLastModifiedBy() : properties.get("jcr:createdBy", "unknown");
        String authorEmail = "noemail@noemail.org";
        Tag[] tags = entryPage.getTags();

        String[] contentTypes = new String[]{"title", "text", "image", "chart", "table" };
        String[] mediaTypes = new String[]{"download", "flash"};

        ArrayList<Paragraph> contentPars = new ArrayList<Paragraph>();
        ArrayList<Paragraph> mediaPars = new ArrayList<Paragraph>();
        try {
            ParagraphSystem parsys = new ParagraphSystem(entryPage.getContentResource("par"));
            for (Paragraph par : parsys.paragraphs()) {
                for (String ct : contentTypes) {
                    if (par.getResourceType().endsWith(ct)) {
                        contentPars.add(par);
                        break;
                    }
                }
                for (String mt : mediaTypes) {
                    if (par.getResourceType().endsWith(mt)) {
                        mediaPars.add(par);
                        break;
                    }
                }
            }
        } catch (Exception e) {}


        
      //  atom:entry
      org.apache.sling.atom.taglib.EntryTagHandler _jspx_th_atom_005fentry_005f0 = (org.apache.sling.atom.taglib.EntryTagHandler) _005fjspx_005ftagPool_005fatom_005fentry_005fupdated_005fpublished_005fid.get(org.apache.sling.atom.taglib.EntryTagHandler.class);
      _jspx_th_atom_005fentry_005f0.setPageContext(_jspx_page_context);
      _jspx_th_atom_005fentry_005f0.setParent(null);
      // /libs/foundation/components/page/feedentry.jsp(82,10) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_atom_005fentry_005f0.setId( url );
      // /libs/foundation/components/page/feedentry.jsp(82,10) name = updated type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_atom_005fentry_005f0.setUpdated( udate );
      // /libs/foundation/components/page/feedentry.jsp(82,10) name = published type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_atom_005fentry_005f0.setPublished( pdate );
      int _jspx_eval_atom_005fentry_005f0 = _jspx_th_atom_005fentry_005f0.doStartTag();
      if (_jspx_eval_atom_005fentry_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_atom_005fentry_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_atom_005fentry_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_atom_005fentry_005f0.doInitBody();
        }
        do {

            
          //  atom:title
          org.apache.sling.atom.taglib.TitleTagHandler _jspx_th_atom_005ftitle_005f0 = (org.apache.sling.atom.taglib.TitleTagHandler) _005fjspx_005ftagPool_005fatom_005ftitle.get(org.apache.sling.atom.taglib.TitleTagHandler.class);
          _jspx_th_atom_005ftitle_005f0.setPageContext(_jspx_page_context);
          _jspx_th_atom_005ftitle_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_atom_005fentry_005f0);
          int _jspx_eval_atom_005ftitle_005f0 = _jspx_th_atom_005ftitle_005f0.doStartTag();
          if (_jspx_eval_atom_005ftitle_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_atom_005ftitle_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_atom_005ftitle_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_atom_005ftitle_005f0.doInitBody();
            }
            do {
              out.print( title );
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

            
          //  atom:link
          org.apache.sling.atom.taglib.LinkTagHandler _jspx_th_atom_005flink_005f0 = (org.apache.sling.atom.taglib.LinkTagHandler) _005fjspx_005ftagPool_005fatom_005flink_005fhref_005fnobody.get(org.apache.sling.atom.taglib.LinkTagHandler.class);
          _jspx_th_atom_005flink_005f0.setPageContext(_jspx_page_context);
          _jspx_th_atom_005flink_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_atom_005fentry_005f0);
          // /libs/foundation/components/page/feedentry.jsp(87,14) name = href type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_atom_005flink_005f0.setHref( link );
          int _jspx_eval_atom_005flink_005f0 = _jspx_th_atom_005flink_005f0.doStartTag();
          if (_jspx_th_atom_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fatom_005flink_005fhref_005fnobody.reuse(_jspx_th_atom_005flink_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fatom_005flink_005fhref_005fnobody.reuse(_jspx_th_atom_005flink_005f0);

            
          //  atom:author
          org.apache.sling.atom.taglib.AuthorTagHandler _jspx_th_atom_005fauthor_005f0 = (org.apache.sling.atom.taglib.AuthorTagHandler) _005fjspx_005ftagPool_005fatom_005fauthor_005fname_005femail_005fnobody.get(org.apache.sling.atom.taglib.AuthorTagHandler.class);
          _jspx_th_atom_005fauthor_005f0.setPageContext(_jspx_page_context);
          _jspx_th_atom_005fauthor_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_atom_005fentry_005f0);
          // /libs/foundation/components/page/feedentry.jsp(88,14) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_atom_005fauthor_005f0.setName( authorName );
          // /libs/foundation/components/page/feedentry.jsp(88,14) name = email type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_atom_005fauthor_005f0.setEmail( authorEmail );
          int _jspx_eval_atom_005fauthor_005f0 = _jspx_th_atom_005fauthor_005f0.doStartTag();
          if (_jspx_th_atom_005fauthor_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fatom_005fauthor_005fname_005femail_005fnobody.reuse(_jspx_th_atom_005fauthor_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fatom_005fauthor_005fname_005femail_005fnobody.reuse(_jspx_th_atom_005fauthor_005f0);


            if (mediaPars.size() > 0) {
                for (Paragraph par : mediaPars) {
                    Download dld = new Download(par);
                    url = externalizer.absoluteLink(slingRequest, slingRequest.getScheme(), dld.getHref());
                    
          //  atom:link
          org.apache.sling.atom.taglib.LinkTagHandler _jspx_th_atom_005flink_005f1 = (org.apache.sling.atom.taglib.LinkTagHandler) _005fjspx_005ftagPool_005fatom_005flink_005ftype_005frel_005fhref_005fnobody.get(org.apache.sling.atom.taglib.LinkTagHandler.class);
          _jspx_th_atom_005flink_005f1.setPageContext(_jspx_page_context);
          _jspx_th_atom_005flink_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_atom_005fentry_005f0);
          // /libs/foundation/components/page/feedentry.jsp(94,22) name = href type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_atom_005flink_005f1.setHref( url );
          // /libs/foundation/components/page/feedentry.jsp(94,22) name = rel type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_atom_005flink_005f1.setRel("enclosure");
          // /libs/foundation/components/page/feedentry.jsp(94,22) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_atom_005flink_005f1.setType( dld.getMimeType() );
          int _jspx_eval_atom_005flink_005f1 = _jspx_th_atom_005flink_005f1.doStartTag();
          if (_jspx_th_atom_005flink_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fatom_005flink_005ftype_005frel_005fhref_005fnobody.reuse(_jspx_th_atom_005flink_005f1);
            return;
          }
          _005fjspx_005ftagPool_005fatom_005flink_005ftype_005frel_005fhref_005fnobody.reuse(_jspx_th_atom_005flink_005f1);

                }
            }

            if (contentPars.size() > 0) {
                
          //  atom:content
          org.apache.sling.atom.taglib.ContentTagHandler _jspx_th_atom_005fcontent_005f0 = (org.apache.sling.atom.taglib.ContentTagHandler) _005fjspx_005ftagPool_005fatom_005fcontent.get(org.apache.sling.atom.taglib.ContentTagHandler.class);
          _jspx_th_atom_005fcontent_005f0.setPageContext(_jspx_page_context);
          _jspx_th_atom_005fcontent_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_atom_005fentry_005f0);
          int _jspx_eval_atom_005fcontent_005f0 = _jspx_th_atom_005fcontent_005f0.doStartTag();
          if (_jspx_eval_atom_005fcontent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_atom_005fcontent_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_atom_005fcontent_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_atom_005fcontent_005f0.doInitBody();
            }
            do {

                int i = 0;
                for (Paragraph par : contentPars) {
                    String path = par.getPath() + ".html";
                    
              //  sling:include
              org.apache.sling.scripting.jsp.taglib.IncludeTagHandler _jspx_th_sling_005finclude_005f0 = (org.apache.sling.scripting.jsp.taglib.IncludeTagHandler) _005fjspx_005ftagPool_005fsling_005finclude_005fpath_005fnobody.get(org.apache.sling.scripting.jsp.taglib.IncludeTagHandler.class);
              _jspx_th_sling_005finclude_005f0.setPageContext(_jspx_page_context);
              _jspx_th_sling_005finclude_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_atom_005fcontent_005f0);
              // /libs/foundation/components/page/feedentry.jsp(106,22) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_sling_005finclude_005f0.setPath( path );
              int _jspx_eval_sling_005finclude_005f0 = _jspx_th_sling_005finclude_005f0.doStartTag();
              if (_jspx_th_sling_005finclude_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fsling_005finclude_005fpath_005fnobody.reuse(_jspx_th_sling_005finclude_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fsling_005finclude_005fpath_005fnobody.reuse(_jspx_th_sling_005finclude_005f0);

                    if (++i == 4) {
                        break;
                    }
                }
                
              int evalDoAfterBody = _jspx_th_atom_005fcontent_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_atom_005fcontent_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_atom_005fcontent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fatom_005fcontent.reuse(_jspx_th_atom_005fcontent_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fatom_005fcontent.reuse(_jspx_th_atom_005fcontent_005f0);

            }

            for (Tag tag : tags) {
                
          //  atom:category
          org.apache.sling.atom.taglib.CategoryTagHandler _jspx_th_atom_005fcategory_005f0 = (org.apache.sling.atom.taglib.CategoryTagHandler) _005fjspx_005ftagPool_005fatom_005fcategory_005fterm_005fnobody.get(org.apache.sling.atom.taglib.CategoryTagHandler.class);
          _jspx_th_atom_005fcategory_005f0.setPageContext(_jspx_page_context);
          _jspx_th_atom_005fcategory_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_atom_005fentry_005f0);
          // /libs/foundation/components/page/feedentry.jsp(115,18) name = term type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_atom_005fcategory_005f0.setTerm( tag.getTitle() );
          int _jspx_eval_atom_005fcategory_005f0 = _jspx_th_atom_005fcategory_005f0.doStartTag();
          if (_jspx_th_atom_005fcategory_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fatom_005fcategory_005fterm_005fnobody.reuse(_jspx_th_atom_005fcategory_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fatom_005fcategory_005fterm_005fnobody.reuse(_jspx_th_atom_005fcategory_005f0);

            }

            if (desc != null) {
                
          //  atom:summary
          org.apache.sling.atom.taglib.SummaryTagHandler _jspx_th_atom_005fsummary_005f0 = (org.apache.sling.atom.taglib.SummaryTagHandler) _005fjspx_005ftagPool_005fatom_005fsummary.get(org.apache.sling.atom.taglib.SummaryTagHandler.class);
          _jspx_th_atom_005fsummary_005f0.setPageContext(_jspx_page_context);
          _jspx_th_atom_005fsummary_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_atom_005fentry_005f0);
          int _jspx_eval_atom_005fsummary_005f0 = _jspx_th_atom_005fsummary_005f0.doStartTag();
          if (_jspx_eval_atom_005fsummary_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_atom_005fsummary_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_atom_005fsummary_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_atom_005fsummary_005f0.doInitBody();
            }
            do {
              out.print( desc );
              int evalDoAfterBody = _jspx_th_atom_005fsummary_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_atom_005fsummary_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_atom_005fsummary_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fatom_005fsummary.reuse(_jspx_th_atom_005fsummary_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fatom_005fsummary.reuse(_jspx_th_atom_005fsummary_005f0);

            }

        
          int evalDoAfterBody = _jspx_th_atom_005fentry_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_atom_005fentry_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.popBody();
        }
      }
      if (_jspx_th_atom_005fentry_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fatom_005fentry_005fupdated_005fpublished_005fid.reuse(_jspx_th_atom_005fentry_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fatom_005fentry_005fupdated_005fpublished_005fid.reuse(_jspx_th_atom_005fentry_005f0);


    } catch (Exception e) {
        log.error("error while rendering feed entry for page", e);
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
}
