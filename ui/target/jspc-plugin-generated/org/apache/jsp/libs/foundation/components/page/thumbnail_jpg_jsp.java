package org.apache.jsp.libs.foundation.components.page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.day.cq.commons.SlingRepositoryException;
import com.day.cq.dam.api.Asset;
import com.day.cq.wcm.foundation.ImageHelper;
import com.day.image.Layer;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.resource.Resource;
import javax.jcr.Node;
import javax.jcr.RepositoryException;
import java.io.IOException;

public final class thumbnail_jpg_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {



    public void service(ServletRequest request, ServletResponse response)
            throws ServletException, IOException {
        try {
            service((SlingHttpServletRequest) request,
                    (SlingHttpServletResponse) response);
        } catch (RepositoryException e) {
            throw new SlingRepositoryException(e);
        }
    }

    private void service(SlingHttpServletRequest req,
                         SlingHttpServletResponse resp)
            throws RepositoryException, IOException {
        Resource res = req.getResource();
        Node node;
        String[] sels = req.getRequestPathInfo().getSelectors();
        int width = 48;
        int height = 48;
        if (sels.length > 1) {
            try {
                width = Integer.parseInt(sels[1]);
                height = Integer.parseInt(sels[2]);
            } catch (Exception e) { }
        }
        if (res.adaptTo(Asset.class) != null) {
            node = res.adaptTo(Asset.class).getOriginal().adaptTo(Node.class);
        } else {
            node = res.adaptTo(Node.class);
        }
        Layer img = ImageHelper.createLayer(node.getSession(), node.getPath() + "/image/file");
        if (img != null) {
            img.resize(width, height > 0 ? height : Math.round(width / img.getWidth() * img.getHeight()));
        } else if (node.hasNode("image") &&
                node.getNode("image").hasProperty("fileReference")) {
            // try to get referenced image
            try {
                Asset asset = req.getResourceResolver().getResource(
                        node.getNode("image").getProperty("fileReference").getString()).
                        adaptTo(Asset.class);
                img = ImageHelper.createLayer(node.getSession(),
                        asset.getRendition("cq5dam.thumbnail." + width + "." + height + ".png").getPath());
            } catch (Exception e) {
                // unable to load referenced image
            }
        }
        if (img != null) {
            resp.setContentType("image/jpeg");
            img.write("image/jpeg", 0.8, resp.getOutputStream());
        }
    }

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
