package org.apache.jsp.libs.foundation.components.list;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.day.cq.wcm.foundation.List;

public final class pagination_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
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



List list = (List)request.getAttribute("list");


      out.write("<div class=\"pagination\">");

    if (list.getPreviousPageLink() != null) {
        
      out.write("<div class=\"previous\">");

            
      out.write("<a href=\"");
      out.print( list.getPreviousPageLink() );
      out.write("\" onclick=\"CQ_Analytics.record({event: 'listPreviousPage', values: { listPageStart: '");
      out.print( list.getPageStart() );
      out.write("' }, collect:  false, options: { obj: this }})\">&laquo; Previous</a>");

        
      out.write("</div>");

    }
    if (list.getNextPageLink() != null) {
        
      out.write("<div class=\"next\">");

            
      out.write("<a href=\"");
      out.print( list.getNextPageLink() );
      out.write("\" onclick=\"CQ_Analytics.record({event: 'listNextPage', values: { listPageStart: '");
      out.print( list.getPageStart() );
      out.write("' }, collect:  false, options: { obj: this }})\">Next &raquo;</a>");

        
      out.write("</div>");

    }

      out.write("</div>");
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
