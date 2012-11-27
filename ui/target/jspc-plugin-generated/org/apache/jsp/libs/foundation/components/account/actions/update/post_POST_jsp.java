package org.apache.jsp.libs.foundation.components.account.actions.update;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.jcr.RepositoryException;
import javax.jcr.Session;
import javax.jcr.SimpleCredentials;
import org.apache.commons.codec.binary.Base64;
import org.apache.sling.api.request.RequestParameter;
import org.apache.sling.api.request.RequestParameterMap;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceUtil;
import org.apache.sling.api.resource.ValueMap;
import org.apache.sling.jcr.api.SlingRepository;
import com.day.cq.security.AccountManager;
import com.day.cq.security.AccountManagerFactory;
import com.day.cq.security.User;
import com.day.cq.wcm.foundation.forms.FormsHelper;
import java.io.InputStream;
import java.io.IOException;

public final class post_POST_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {



    final String LOGIN = "rep:userId";
    final String PWD = "rep:password";
    final String PWD_CONFIRM = PWD +"_confirm";
    final String CREATE = "cq:create";
    final String SUBMIT = "submit";
    
    final String PF_REP = "rep:";
    final String PF_CQ = "cq:";
    final String EMAIL = PF_REP + "e-mail";
    final String MEMBER_OF = PF_REP + "memberOf";

    private boolean authenticate(SlingRepository repos, String auth, String pwd) {
        Session session = null;
        try {
            SimpleCredentials creds = new SimpleCredentials(auth, pwd.toCharArray());
            session = repos.login(creds);
            return true;
        } catch (RepositoryException e) {
            return false;
        } finally {
            if (session!=null) {
                session.logout();
            }
        }
    }

    private Map<String, RequestParameter[]> filterParameter(Iterator<Resource> itr, RequestParameterMap paras) {
        Map<String, RequestParameter[]> prefs = new HashMap<String, RequestParameter[]>();
        while(itr.hasNext()) {
            String name = FormsHelper.getParameterName(itr.next());
            if (!paras.containsKey(name)
                    || name.startsWith(SUBMIT)
                    || name.startsWith("_")
                    || name.startsWith(LOGIN)) {
                continue; // filter all rep, anc cq properties but save the email in the profile
            }
            prefs.put(name, paras.getValues(name));
        }
        return prefs;
    }

    private final class IntermediatePathParam implements RequestParameter {

        private final String intermediatePath;

        private IntermediatePathParam(String intermediatePath) {
            this.intermediatePath = intermediatePath;
        }

        public boolean isFormField() {
            return true;
        }

        public String getContentType() {
            return null;
        }

        public long getSize() {
            return intermediatePath.length();
        }

        public byte[] get() {
            return intermediatePath.getBytes();
        }

        public InputStream getInputStream() throws IOException {
            return null;
        }

        public String getFileName() {
            return null;
        }

        public String getString() {
            return intermediatePath;
        }

        public String getString(String s) throws UnsupportedEncodingException {
            return new String(intermediatePath.getBytes(s));
        }
    }


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
      out.write("\n");
      out.write("\n");
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

    final ValueMap properties = ResourceUtil.getValueMap(resource);
    final SlingRepository repos = sling.getService(SlingRepository.class);
    final AccountManagerFactory af = sling.getService(AccountManagerFactory.class);
    boolean create = false; 
    boolean login = false;
    Session session = null;
    String error = null;
    try {
        session = repos.loginAdministrative(null);
        final String group = properties.get("memberOf", "");
        String intermediatePath = properties.get("intermediatePath", null);
        final AccountManager am = af.createAccountManager(session);
        final String auth = request.getParameter(LOGIN)==null? null : slingRequest.getRequestParameter(LOGIN).getString();
        String pwd = request.getParameter(PWD)==null? null : slingRequest.getRequestParameter(PWD).getString();
        final String createPara = request.getParameter(CREATE)==null? null : slingRequest.getRequestParameter(CREATE).getString();
        final String pwdConfirm = request.getParameter(PWD_CONFIRM)==null? null : slingRequest.getRequestParameter(PWD_CONFIRM).getString();

        final boolean hasAuth = auth!=null && auth.length()>0;
        final boolean hasPwd = pwd!=null && pwd.length()>0;
        final boolean isCreate = createPara!=null && Boolean.valueOf(createPara);
        login = hasAuth && hasPwd;
        create = hasAuth &&((pwdConfirm!=null && pwdConfirm.length()>0) || (isCreate && hasPwd));
        
        if (!(login || create)) {
            error = "Request incomplete no user-id or no password";
            log.debug(error);
        } else if (create) {
            if (!hasPwd) {
                pwd = pwdConfirm;
            }
        } else if (login) {
            if (!authenticate(repos, auth, pwd)) {
                error = "Error credentials do not authenticate";
            } 
        }
        if (error==null) {
            Map<String, RequestParameter[]> userProps = filterParameter(FormsHelper.getFormElements(resource), slingRequest.getRequestParameterMap());
            // pass the intermediate path action as additional parameter (see bug #38146)
            if (intermediatePath != null) {
                userProps.put("rep:intermediatePath", new RequestParameter[] {new IntermediatePathParam(intermediatePath)});
            }
            try {
                // may fail when email cannot be send
                am.getOrCreateAccount(auth, pwd, group, userProps);
            } catch (Exception e) {
                log.warn("error while creating account: " + e.getMessage());
            }
        }
    } catch (Exception e) {
        error = e.getMessage();
    } finally {
        if (session!=null) {
            session.logout();
        }
    }


    if (error!=null) {
        log.error(error);
    }
    String path = create ?  properties.get("thankyouPage", "") : properties.get("home", "");
    if ("".equals(path)) {
        FormsHelper.redirectToReferrer(slingRequest, slingResponse, new HashMap<String, String[]>());
    } else {
        if (path.indexOf(".")<0) {
            path += ".html"; 
        }
        response.sendRedirect(slingRequest.getResourceResolver().map(request, path));
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
