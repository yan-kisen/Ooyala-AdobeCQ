package org.apache.jsp.libs.foundation.components.profile.form.constraints.userid;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ResourceBundle;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;
import org.apache.sling.jcr.api.SlingRepository;
import com.day.cq.security.User;
import com.day.cq.security.UserManager;
import com.day.cq.security.UserManagerFactory;
import com.day.cq.wcm.api.WCMMode;
import com.day.cq.wcm.foundation.forms.ValidationInfo;

public final class servervalidation_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody.release();
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



      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");




      //  sling:defineObjects
      org.apache.sling.scripting.jsp.taglib.DefineObjectsTag _jspx_th_sling_005fdefineObjects_005f0 = (org.apache.sling.scripting.jsp.taglib.DefineObjectsTag) _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody.get(org.apache.sling.scripting.jsp.taglib.DefineObjectsTag.class);
      _jspx_th_sling_005fdefineObjects_005f0.setPageContext(_jspx_page_context);
      _jspx_th_sling_005fdefineObjects_005f0.setParent(null);
      int _jspx_eval_sling_005fdefineObjects_005f0 = _jspx_th_sling_005fdefineObjects_005f0.doStartTag();
      if (_jspx_th_sling_005fdefineObjects_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody.reuse(_jspx_th_sling_005fdefineObjects_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody.reuse(_jspx_th_sling_005fdefineObjects_005f0);
      org.apache.sling.api.SlingHttpServletRequest slingRequest = null;
      org.apache.sling.api.SlingHttpServletResponse slingResponse = null;
      org.apache.sling.api.resource.Resource resource = null;
      javax.jcr.Node currentNode = null;
      org.apache.sling.api.resource.ResourceResolver resourceResolver = null;
      org.apache.sling.api.scripting.SlingScriptHelper sling = null;
      org.slf4j.Logger log = null;
      org.apache.sling.api.scripting.SlingBindings bindings = null;
      slingRequest = (org.apache.sling.api.SlingHttpServletRequest) _jspx_page_context.findAttribute("slingRequest");
      slingResponse = (org.apache.sling.api.SlingHttpServletResponse) _jspx_page_context.findAttribute("slingResponse");
      resource = (org.apache.sling.api.resource.Resource) _jspx_page_context.findAttribute("resource");
      currentNode = (javax.jcr.Node) _jspx_page_context.findAttribute("currentNode");
      resourceResolver = (org.apache.sling.api.resource.ResourceResolver) _jspx_page_context.findAttribute("resourceResolver");
      sling = (org.apache.sling.api.scripting.SlingScriptHelper) _jspx_page_context.findAttribute("sling");
      log = (org.slf4j.Logger) _jspx_page_context.findAttribute("log");
      bindings = (org.apache.sling.api.scripting.SlingBindings) _jspx_page_context.findAttribute("bindings");

    final User user = slingRequest.getResourceResolver().adaptTo(User.class);
    final ResourceBundle resBundle = slingRequest.getResourceBundle(request.getLocale());
    final String name = "cq:login";
    final String userId = request.getParameter(name);
    final SlingRepository repos = sling.getService(SlingRepository.class);
    if (!user.getID().equals("anonymous") && WCMMode.fromRequest(request).equals(WCMMode.DISABLED)) {
        log.warn("Won't create new user if logged in on publish");

    // form fileds for existing user are filled in, test if the credentials provided would validate
    } else if (userId!=null && userId.length()>0) {
        log.debug("Attempt to login for form as {}", userId);
        final String pw = request.getParameter("cq:password");
        if (pw==null || pw.length()==0) {
            ValidationInfo.createValidationInfo(slingRequest).addErrorMessage("cq:password", resBundle.getString("No password to login"));
        } else{
            Session check = null;
            try {
                check = repos.login(new SimpleCredentials(userId, pw.toCharArray()));
            } catch (RepositoryException e) {
                ValidationInfo.createValidationInfo(slingRequest).addErrorMessage(name, resBundle.getString("Userid / Password do not match"));
            } finally {
                if (check!=null) {
                    check.logout();
                }
            }
        }
    // the form fields to create a new user have been filled in
    // validate if the users id is available
    } else {
        final String newId = request.getParameter("rep:userId");
        final String newPw = request.getParameter("rep:password");
        if (newId!=null && newPw!=null && newId.length()>0 && newPw.length()>0) {
            log.debug("Attempt to create new account");
            final UserManagerFactory fact = sling.getService(UserManagerFactory.class);
            if (!(repos==null || fact==null)) {
                Session session = null;
                try {
                    session = repos.loginAdministrative(null);
                    final UserManager umgr = fact.createUserManager(session);
                    if (umgr.hasAuthorizable(newId)) {
                        ValidationInfo.createValidationInfo(slingRequest).addErrorMessage("rep:userId", resBundle.getString("User-Id not available"));
                    }
                } finally {
                    if (session!=null) {
                        session.logout();
                    }
                }
            }
        } else {
            ValidationInfo.createValidationInfo(slingRequest).addErrorMessage("rep:userId", resBundle.getString("User-Id and Password needed for registration"));
        }
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
