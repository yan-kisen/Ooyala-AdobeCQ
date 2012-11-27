package org.apache.jsp.libs.foundation.components.list;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.day.cq.wcm.api.Page;
import javax.jcr.Node;
import javax.jcr.RepositoryException;
import org.apache.commons.lang3.StringEscapeUtils;

public final class listitem_005fteaser_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
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

      out.write('$');




    Page listItem = (Page)request.getAttribute("listitem");

    boolean hasImage = false;
    String title = listItem.getTitle() != null ? listItem.getTitle() : listItem.getName();
    String description = listItem.getDescription() != null ? listItem.getDescription() : "";

    try {
        hasImage = listItem.getContentResource().adaptTo(Node.class).hasNode("image") ||
                listItem.getProperties().get("imageReference", "").length() > 0;
    } catch (RepositoryException re) {
    }

    
      out.write("<li><p><a href=\"");
      out.print( listItem.getPath() );
      out.write(".html\" title=\"");
      out.print( StringEscapeUtils.escapeHtml4(title) );
      out.write("\"\n");
      out.write("                onclick=\"CQ_Analytics.record({event: 'listTeaserItemClicked', values: { listItemPath: '");
      out.print( listItem.getPath() );
      out.write("' }, collect:  false, options: { obj: this }})\">");


    if (hasImage) {
        
      out.write("<img class=\"teaser\" src=\"");
      out.print( listItem.getPath() );
      out.write("/jcr:content.thumbnail.48.48.jpg\" alt=\"");
      out.print( StringEscapeUtils.escapeHtml4(title) );
      out.write("\" title=\"");
      out.print( StringEscapeUtils.escapeHtml4(title) );
      out.write('"');
      out.write('>');

    }

    
      out.write("<span class=\"teaser-title\">");
      out.print( StringEscapeUtils.escapeHtml4(title) );
      out.write("</span></a>");


    if (!"".equals(description)) {
        
      out.write("<br/><span class=\"teaser-description\">");
      out.print( StringEscapeUtils.escapeHtml4(description) );
      out.write("</span>");

    }


      out.write("</p></li>");
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
