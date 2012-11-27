package org.apache.jsp.libs.foundation.components.primary.dam.Asset;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import com.day.cq.commons.Externalizer;
import javax.jcr.Node;
import javax.jcr.NodeIterator;
import com.day.text.Text;
import org.apache.sling.api.resource.ResourceResolver;
import com.day.cq.wcm.api.WCMMode;

public final class feedentry_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fatom_005fentry_005fupdated_005fpublished_005fid;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fatom_005ftitle;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fatom_005flink_005fhref_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fatom_005fcontent;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fatom_005fcategory_005fterm_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmedia_005fcontent_005furl_005ftype_005fmedium;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fmedia_005fthumbnail_005fwidth_005furl_005fheight_005fnobody;

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
    _005fjspx_005ftagPool_005fatom_005fcontent = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fatom_005fcategory_005fterm_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fmedia_005fcontent_005furl_005ftype_005fmedium = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fmedia_005fthumbnail_005fwidth_005furl_005fheight_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fatom_005fentry_005fupdated_005fpublished_005fid.release();
    _005fjspx_005ftagPool_005fatom_005ftitle.release();
    _005fjspx_005ftagPool_005fatom_005flink_005fhref_005fnobody.release();
    _005fjspx_005ftagPool_005fatom_005fcontent.release();
    _005fjspx_005ftagPool_005fatom_005fcategory_005fterm_005fnobody.release();
    _005fjspx_005ftagPool_005fmedia_005fcontent_005furl_005ftype_005fmedium.release();
    _005fjspx_005ftagPool_005fmedia_005fthumbnail_005fwidth_005furl_005fheight_005fnobody.release();
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
        Node renditions = currentNode.getNode("jcr:content/renditions");
        Node metadata = currentNode.getNode("jcr:content/metadata");

        Externalizer externalizer = sling.getService(Externalizer.class);
        String url = externalizer.absoluteLink(slingRequest, slingRequest.getScheme(), currentNode.getPath());

        String title = currentNode.getName();
        if (metadata!=null&&metadata.hasProperty("dc:title")) {
          title = metadata.getProperty("dc:title").getString();
        }
        String mimetype = "application/octet-stream";
        if (metadata!=null&&metadata.hasProperty("dc:format")) {
          mimetype = metadata.getProperty("dc:format").getString();
        }
        Date pdate = properties.get("cq:lastPublished", properties.get("jcr:created", Date.class));
        Date udate = properties.get("jcr:lastModified", properties.get("cq:lastModified", Date.class));
        String desc = properties.get("jcr:description", null);
        if (metadata!=null&&metadata.hasProperty("dc:description")) {
          desc = metadata.getProperty("dc:description").getString();
        }

        
      //  atom:entry
      org.apache.sling.atom.taglib.EntryTagHandler _jspx_th_atom_005fentry_005f0 = (org.apache.sling.atom.taglib.EntryTagHandler) _005fjspx_005ftagPool_005fatom_005fentry_005fupdated_005fpublished_005fid.get(org.apache.sling.atom.taglib.EntryTagHandler.class);
      _jspx_th_atom_005fentry_005f0.setPageContext(_jspx_page_context);
      _jspx_th_atom_005fentry_005f0.setParent(null);
      // /libs/foundation/components/primary/dam/Asset/feedentry.jsp(55,10) name = id type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_atom_005fentry_005f0.setId( url );
      // /libs/foundation/components/primary/dam/Asset/feedentry.jsp(55,10) name = updated type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_atom_005fentry_005f0.setUpdated( udate );
      // /libs/foundation/components/primary/dam/Asset/feedentry.jsp(55,10) name = published type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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
          // /libs/foundation/components/primary/dam/Asset/feedentry.jsp(60,14) name = href type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_atom_005flink_005f0.setHref( url );
          int _jspx_eval_atom_005flink_005f0 = _jspx_th_atom_005flink_005f0.doStartTag();
          if (_jspx_th_atom_005flink_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fatom_005flink_005fhref_005fnobody.reuse(_jspx_th_atom_005flink_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fatom_005flink_005fhref_005fnobody.reuse(_jspx_th_atom_005flink_005f0);

            
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

                // todo: find suitable thumbnail in content instead of hardcoded 140x100
                
              out.write("<img src=\"");
              out.print(url);
              out.write("/jcr:content/renditions/cq5dam.thumbnail.140.100.png\" alt=\"");
              out.print( title );
              out.write('"');
              out.write('/');
              out.write('>');

                // disabled desc for bug #27019
                // desc - even provided by a camera - ends sometimes with a null character %00
//              if (desc != null) {
                  

//          }
            
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


            String[] tags =
                    properties.get("./jcr:content/metadata/cq:tags", new String[0]);
            for (String tag : tags) {
                
          //  atom:category
          org.apache.sling.atom.taglib.CategoryTagHandler _jspx_th_atom_005fcategory_005f0 = (org.apache.sling.atom.taglib.CategoryTagHandler) _005fjspx_005ftagPool_005fatom_005fcategory_005fterm_005fnobody.get(org.apache.sling.atom.taglib.CategoryTagHandler.class);
          _jspx_th_atom_005fcategory_005f0.setPageContext(_jspx_page_context);
          _jspx_th_atom_005fcategory_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_atom_005fentry_005f0);
          // /libs/foundation/components/primary/dam/Asset/feedentry.jsp(74,18) name = term type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_atom_005fcategory_005f0.setTerm(tag);
          int _jspx_eval_atom_005fcategory_005f0 = _jspx_th_atom_005fcategory_005f0.doStartTag();
          if (_jspx_th_atom_005fcategory_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fatom_005fcategory_005fterm_005fnobody.reuse(_jspx_th_atom_005fcategory_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fatom_005fcategory_005fterm_005fnobody.reuse(_jspx_th_atom_005fcategory_005f0);

            }

            if (desc != null) {
                

            }

            try {
                NodeIterator rIter = renditions.getNodes();
                String medium = "document";
                if (mimetype.startsWith("image/")) {
                  medium = "image";
                } else if (mimetype.startsWith("video/")) {
                  medium = "video";
                } else if (mimetype.startsWith("audio/")) {
                  medium = "audio";
                }
                
          //  media:content
          org.apache.sling.atom.taglib.media.MediaContentTagHandler _jspx_th_media_005fcontent_005f0 = (org.apache.sling.atom.taglib.media.MediaContentTagHandler) _005fjspx_005ftagPool_005fmedia_005fcontent_005furl_005ftype_005fmedium.get(org.apache.sling.atom.taglib.media.MediaContentTagHandler.class);
          _jspx_th_media_005fcontent_005f0.setPageContext(_jspx_page_context);
          _jspx_th_media_005fcontent_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_atom_005fentry_005f0);
          // /libs/foundation/components/primary/dam/Asset/feedentry.jsp(91,18) name = url type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_media_005fcontent_005f0.setUrl( url );
          // /libs/foundation/components/primary/dam/Asset/feedentry.jsp(91,18) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_media_005fcontent_005f0.setType(mimetype );
          // /libs/foundation/components/primary/dam/Asset/feedentry.jsp(91,18) name = medium type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_media_005fcontent_005f0.setMedium(medium );
          int _jspx_eval_media_005fcontent_005f0 = _jspx_th_media_005fcontent_005f0.doStartTag();
          if (_jspx_eval_media_005fcontent_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            if (_jspx_eval_media_005fcontent_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.pushBody();
              _jspx_th_media_005fcontent_005f0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
              _jspx_th_media_005fcontent_005f0.doInitBody();
            }
            do {

                while (rIter.hasNext()) {
                    Node rendition = rIter.nextNode();
                    if (rendition.getName().indexOf(".thumbnail.") > 0) {
                        String[] nameParts = Text.explode(rendition.getName(), '.');
                        int width = nameParts.length > 2 ? Integer.parseInt(nameParts[2]) : 0;
                        int height = nameParts.length > 3 ? Integer.parseInt(nameParts[3]) : 0;
                        url = externalizer.absoluteLink(slingRequest, slingRequest.getScheme(), rendition.getPath());
                        
              //  media:thumbnail
              org.apache.sling.atom.taglib.media.MediaThumbnailTagHandler _jspx_th_media_005fthumbnail_005f0 = (org.apache.sling.atom.taglib.media.MediaThumbnailTagHandler) _005fjspx_005ftagPool_005fmedia_005fthumbnail_005fwidth_005furl_005fheight_005fnobody.get(org.apache.sling.atom.taglib.media.MediaThumbnailTagHandler.class);
              _jspx_th_media_005fthumbnail_005f0.setPageContext(_jspx_page_context);
              _jspx_th_media_005fthumbnail_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_media_005fcontent_005f0);
              // /libs/foundation/components/primary/dam/Asset/feedentry.jsp(99,26) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_media_005fthumbnail_005f0.setUrl( url );
              // /libs/foundation/components/primary/dam/Asset/feedentry.jsp(99,26) name = width type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_media_005fthumbnail_005f0.setWidth( width );
              // /libs/foundation/components/primary/dam/Asset/feedentry.jsp(99,26) name = height type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_media_005fthumbnail_005f0.setHeight( height );
              int _jspx_eval_media_005fthumbnail_005f0 = _jspx_th_media_005fthumbnail_005f0.doStartTag();
              if (_jspx_th_media_005fthumbnail_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                _005fjspx_005ftagPool_005fmedia_005fthumbnail_005fwidth_005furl_005fheight_005fnobody.reuse(_jspx_th_media_005fthumbnail_005f0);
                return;
              }
              _005fjspx_005ftagPool_005fmedia_005fthumbnail_005fwidth_005furl_005fheight_005fnobody.reuse(_jspx_th_media_005fthumbnail_005f0);

                    }
                }
                
              int evalDoAfterBody = _jspx_th_media_005fcontent_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
            if (_jspx_eval_media_005fcontent_005f0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
              out = _jspx_page_context.popBody();
            }
          }
          if (_jspx_th_media_005fcontent_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fmedia_005fcontent_005furl_005ftype_005fmedium.reuse(_jspx_th_media_005fcontent_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fmedia_005fcontent_005furl_005ftype_005fmedium.reuse(_jspx_th_media_005fcontent_005f0);

            } catch (Exception e) { }
        
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
        log.error("error while rendering feed entry for dam asset", e);
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
