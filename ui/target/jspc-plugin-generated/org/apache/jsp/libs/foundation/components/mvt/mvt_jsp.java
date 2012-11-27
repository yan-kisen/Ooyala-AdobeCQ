package org.apache.jsp.libs.foundation.components.mvt;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import com.day.cq.i18n.I18n;
import com.day.cq.wcm.api.WCMMode;
import com.day.cq.wcm.api.components.DropTarget;
import com.day.cq.wcm.api.components.Toolbar;
import com.day.cq.wcm.core.mvt.MVTStatistics;
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

public final class mvt_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {



    private class Banner {

        final String fileRef;
        final String title;
        final int bias;
        final int idx;

        Banner(String fileRef, String title, int bias, int idx) {
            this.fileRef = fileRef;
            this.title = title;
            this.bias = bias;
            this.idx = idx;
        }
    }

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/libs/foundation/global.jsp");
  }

  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005fincludeClientLib_005fcategories_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcq_005fincludeClientLib_005fcategories_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.release();
    _005fjspx_005ftagPool_005fcq_005fincludeClientLib_005fcategories_005fnobody.release();
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




    //drop target css class = dd prefix + name of the drop target in the edit config
    String ddClassName = DropTarget.CSS_CLASS_PREFIX + "mvt " + DropTarget.CSS_CLASS_PREFIX + "page";
    String id = currentNode.getPath() + "_mvt";
    MVTStatistics mvtStats = sling.getService(MVTStatistics.class);
    String trackURL = null;
    if (mvtStats != null && mvtStats.getTrackingURI() != null) {
    	trackURL = mvtStats.getTrackingURI().toString();
    }
    if (WCMMode.fromRequest(request) == WCMMode.EDIT) {
        
      if (_jspx_meth_cq_005fincludeClientLib_005f0(_jspx_page_context))
        return;

    }

    // add buttons to edit bar
    if (editContext != null && WCMMode.fromRequest(request) == WCMMode.EDIT) {
        Toolbar tb = editContext.getEditConfig().getToolbar();
        tb.add(0, new Toolbar.Label("MVT"));
    }

    String href = null;
    if (currentNode.hasProperty("href")) {
        href = currentNode.getProperty("href").getString();
        if (href.startsWith("/")) {
            href = request.getContextPath() + href + ".html";
        }
    }

    String size = "";
    if (currentNode.hasProperty("width")) {
        size += " width=\"" + currentNode.getProperty("width").getString() + "\"";
    }
    if (currentNode.hasProperty("height")) {
        size += " height=\"" + currentNode.getProperty("height").getString() + "\"";
    }

    NodeIterator images = currentNode.getNodes("image*");
    int numDistinctBanners = 0;
    List<Banner> banners = new ArrayList<Banner>();
    while (images.hasNext()) {
        Node banner = images.nextNode();
        if (!banner.hasProperty("fileReference")) {
            continue;
        }
        String fileRef = request.getContextPath() + banner.getProperty("fileReference").getString();
        String title = banner.hasProperty("jcr:title") ? banner.getProperty("jcr:title").getString() : "";
        int bias = banner.hasProperty("bias") ?  (int) banner.getProperty("bias").getLong() : 1;
        Banner b = new Banner(fileRef, title, bias, numDistinctBanners);
        for (int i = 0; i < bias; i++) {
            banners.add(b);
        }
        numDistinctBanners++;
    }

    String bannerSelector = "0";
    String msgPattern = I18n.get(slingRequest, "Showing {0} of {1} ({2}/{3})");
    String fileRef = "";
    long impressions = 0;
    long clicks = 0;
    double ctr = 0.0;
    int bannerIdx = 0;
    if (WCMMode.fromRequest(request) == WCMMode.EDIT && mvtStats != null) {
        if (banners.isEmpty()) {
            if (editContext != null) {
                editContext.getEditConfig().getToolbar().add(new Toolbar.Label("Showing none"));
            }
        } else {
            // pick banner on the server side and display statistics in tool bar
            int idx = new Random().nextInt(banners.size());
            Banner b = banners.get(idx);
            fileRef = b.fileRef;
            for (Object[] result : mvtStats.report(currentPage)) {
                String ref = (String) result[0];
                if (ref.equals(b.fileRef)) {
                    impressions = (Long) result[1];
                    clicks = (Long) result[2];
                    ctr = (Double) result[3];
                    break;
                }
            }
            // fix impressions, the value does not reflect the current impression
            impressions++;
            bannerIdx = b.idx;
            // add info
            String msg = MessageFormat.format(msgPattern, b.idx + 1, numDistinctBanners, clicks, impressions);
            if (editContext != null) {
                editContext.getEditConfig().getToolbar().add(new Toolbar.Label(msg));

            }
            bannerSelector = String.valueOf(idx);
        }

    } else {
        // let client side javascript decide
        bannerSelector = "Math.floor(Math.random() * banners.length)";
    }


      out.write("<div class=\"");
      out.print( ddClassName );
      out.write("\" id=\"");
      out.print( id );
      out.write('"');
      out.write('>');

    if (banners.isEmpty()) {
        
      out.write("<img src=\"/etc/designs/default/0.gif\" class=\"cq-image-placeholder\"/>");

    }

      out.write("</div><script type=\"text/javascript\">\n");
      out.write("    function buildMVTBannerList() {\n");
      out.write("        var banners = new Array();\n");
      out.write("        var banner;\n");
      out.write("    ");

        if (href != null) { 
      out.write("\n");
      out.write("        banners.href = '");
      out.print( href );
      out.write("';\n");
      out.write("    ");
  }
        Banner previous = null;
        int i = 0;
        for (Banner b : banners) {
            if (b != previous) {
    
      out.write("\n");
      out.write("        banner = new Object();\n");
      out.write("        banner.fileRef = '");
      out.print( b.fileRef );
      out.write("';\n");
      out.write("        banner.title = '");
      out.print( b.title );
      out.write("';\n");
      out.write("        banner.bias = ");
      out.print( b.bias );
      out.write(";\n");
      out.write("    ");

            }
    
      out.write("\n");
      out.write("        banners[");
      out.print( i++ );
      out.write("] = banner;\n");
      out.write("    ");

        previous = b;
        }
    
      out.write("\n");
      out.write("        if (banners.length > 0) {\n");
      out.write("            var randomBanner = banners[");
      out.print( bannerSelector );
      out.write("];\n");
      out.write("            if (window.randomBannerList) {\n");
      out.write("                window.randomBannerList += '|' + randomBanner.fileRef;\n");
      out.write("            } else {\n");
      out.write("                window.randomBannerList = randomBanner.fileRef;\n");
      out.write("            }\n");
      out.write("            var div = document.getElementById('");
      out.print( id );
      out.write("');\n");
      out.write("            var inner = '<img alt=\"' + randomBanner.title + '\" src=\"' + CQ.shared.HTTP.getXhrHookedURL(randomBanner.fileRef) + '\"");
      out.print( size );
      out.write("/>';\n");
      out.write("            if (banners.href) {\n");
      out.write("                inner = '<a href=\"' + CQ.shared.HTTP.getXhrHookedURL(banners.href) + '\" onclick=\"bannerClicked()\">' + inner + '</a>';\n");
      out.write("            }\n");
      out.write("            div.innerHTML = inner;\n");
      out.write("        }\n");
      out.write("    };\n");

    if (WCMMode.fromRequest(request) == WCMMode.EDIT) {
    // update edit bar on refresh

      out.write("\n");
      out.write("    var mvtOnReady = function() {\n");
      out.write("        function updateEditBar() {\n");
      out.write("            var editBar = CQ.WCM.getEditable('");
      out.print( currentNode.getPath() );
      out.write("');\n");
      out.write("            var toolbarItems = editBar.items.get(0).items;\n");
      out.write("            for (var i = 0; i < toolbarItems.getCount(); i++) {\n");
      out.write("                var tbItem = toolbarItems.get(i);\n");
      out.write("                if (tbItem.el && tbItem.el.dom && tbItem.el.dom.innerHTML && tbItem.el.dom.innerHTML.indexOf(\"Showing\") == 0) {\n");
      out.write("                    tbItem.el.dom.innerHTML = CQ.Util.patchText('");
      out.print( msgPattern );
      out.write("',\n");
      out.write("                            ['");
      out.print( bannerIdx + 1 );
      out.write("', '");
      out.print( numDistinctBanners );
      out.write("', '");
      out.print( clicks );
      out.write("', '");
      out.print( impressions );
      out.write("']);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        }\n");

        if (trackURL != null) {

      out.write("\n");
      out.write("            window.randomBannerList = null;\n");
      out.write("            CQ.HTTP.get('");
      out.print( trackURL );
      out.write("/view?path=' + encodeURIComponent('");
      out.print( currentPage.getPath() );
      out.write("') + '&vars=' + encodeURIComponent('");
      out.print( fileRef );
      out.write("'), function(){updateEditBar();});\n");

       }
        
      out.write("\n");
      out.write("        buildMVTBannerList();\n");
      out.write("    };\n");
      out.write("    if( CQ.Ext.isReady) {\n");
      out.write("        mvtOnReady.call();\n");
      out.write("    } else {\n");
      out.write("        CQ.WCM.onEditableReady(\"");
      out.print( currentNode.getPath() );
      out.write("\",mvtOnReady);\n");
      out.write("    }\n");
      out.write("        ");

    } else {

      out.write("\n");
      out.write("\t$CQ(buildMVTBannerList);\n");
      out.write("\t$CQ(trackMVTImpression);\n");
 } 
      out.write("\n");
      out.write("\n");
      out.write("    function bannerClicked() {\n");
      out.write("    ");
 if (trackURL != null) { 
      out.write("\n");
      out.write("        var trackImg = new Image();\n");
      out.write("        trackImg.src = CQ.shared.HTTP.getXhrHookedURL('");
      out.print( trackURL );
      out.write("/click?path=' + encodeURIComponent('");
      out.print( currentPage.getPath() );
      out.write("') + '&vars=' + encodeURIComponent(window.randomBannerList));\n");
      out.write("    ");
 }
      out.write("\n");
      out.write("    };\n");
      out.write("\n");
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

  private boolean _jspx_meth_cq_005fincludeClientLib_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  cq:includeClientLib
    com.day.cq.wcm.tags.IncludeClientLibraryTag _jspx_th_cq_005fincludeClientLib_005f0 = (com.day.cq.wcm.tags.IncludeClientLibraryTag) _005fjspx_005ftagPool_005fcq_005fincludeClientLib_005fcategories_005fnobody.get(com.day.cq.wcm.tags.IncludeClientLibraryTag.class);
    _jspx_th_cq_005fincludeClientLib_005f0.setPageContext(_jspx_page_context);
    _jspx_th_cq_005fincludeClientLib_005f0.setParent(null);
    // /libs/foundation/components/mvt/mvt.jsp(36,10) name = categories type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_cq_005fincludeClientLib_005f0.setCategories("cq.mvt");
    int _jspx_eval_cq_005fincludeClientLib_005f0 = _jspx_th_cq_005fincludeClientLib_005f0.doStartTag();
    if (_jspx_th_cq_005fincludeClientLib_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fcq_005fincludeClientLib_005fcategories_005fnobody.reuse(_jspx_th_cq_005fincludeClientLib_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fcq_005fincludeClientLib_005fcategories_005fnobody.reuse(_jspx_th_cq_005fincludeClientLib_005f0);
    return false;
  }
}
