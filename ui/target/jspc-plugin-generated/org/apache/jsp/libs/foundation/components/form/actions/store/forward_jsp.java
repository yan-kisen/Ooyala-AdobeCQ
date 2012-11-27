package org.apache.jsp.libs.foundation.components.form.actions.store;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.sling.api.resource.ResourceUtil;
import com.day.cq.collab.commons.CollabUtil;
import org.apache.sling.jcr.api.SlingRepository;
import org.apache.sling.api.resource.ValueMap;
import com.day.cq.wcm.foundation.forms.FormsConstants;
import com.day.cq.wcm.foundation.forms.FormsHelper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;
import java.util.HashMap;
import javax.jcr.Session;
import javax.jcr.Node;
import javax.jcr.security.Privilege;
import javax.jcr.RepositoryException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.day.cq.commons.jcr.JcrUtil;
import com.day.cq.security.UserManager;
import com.day.cq.security.UserManagerFactory;
import javax.jcr.security.AccessControlManager;
import javax.jcr.security.AccessControlPolicyIterator;
import javax.jcr.security.AccessControlPolicy;
import javax.jcr.security.AccessControlList;

public final class forward_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {



    private static final AtomicInteger uniqueIdCounter = new AtomicInteger();
    private final Logger log = LoggerFactory.getLogger(getClass());

    


    AccessControlList getAcl(AccessControlManager acMgr, String path) throws RepositoryException {
        AccessControlPolicyIterator it = acMgr.getApplicablePolicies(path);
        while (it.hasNext()) {
            AccessControlPolicy p = it.nextAccessControlPolicy();
            if (p instanceof AccessControlList) {
                return (AccessControlList) p;
            }
        }
        return null;
    }

    
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody;
  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsling_005fdefineObjects_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.release();
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
      out.write("    ");
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
      slingRequest = (org.apache.sling.api.SlingHttpServletRequest) _jspx_page_context.findAttribute("slingRequest");
      slingResponse = (org.apache.sling.api.SlingHttpServletResponse) _jspx_page_context.findAttribute("slingResponse");
      resource = (org.apache.sling.api.resource.Resource) _jspx_page_context.findAttribute("resource");
      currentNode = (javax.jcr.Node) _jspx_page_context.findAttribute("currentNode");
      resourceResolver = (org.apache.sling.api.resource.ResourceResolver) _jspx_page_context.findAttribute("resourceResolver");
      sling = (org.apache.sling.api.scripting.SlingScriptHelper) _jspx_page_context.findAttribute("sling");
      log = (org.slf4j.Logger) _jspx_page_context.findAttribute("log");
      bindings = (org.apache.sling.api.scripting.SlingBindings) _jspx_page_context.findAttribute("bindings");


    final SlingRepository repository = sling.getService(SlingRepository.class);
    final ValueMap props = ResourceUtil.getValueMap(resource);

    String path = props.get(FormsConstants.START_PROPERTY_ACTION_PATH, "");
    // create a default path if no path is specified:
    // For example if the form is at /content/geometrixx/en/formpage
    // then the default path is /content/usergenerated/content/geometrixx/en/formpage
    if ( path.length() == 0 ) {
        final String pagePath = currentPage.getPath();
        final int pos = pagePath.indexOf('/', 1);
        path = pagePath.substring(0, pos + 1) + "usergenerated/content" + pagePath.substring(pos) + "/*";
    }

    // If path ends with / or /*, compute a unique name ourselves for the node to create,
    // so that we can pass it to StartWorkflowPostProcessor. Sling might create ancestor
    // nodes of that one if they don't exist yet, so it's hard for the processor to
    // compute the right payload path without this
    for(String suffix : new String [] { "/", "/*" }) {
        if(path.endsWith(suffix)) {
            final String uniqueId = System.currentTimeMillis() + "_" + uniqueIdCounter.addAndGet(1);
            path = path.substring(0, path.length() - suffix.length() + 1) + uniqueId;
            Session userSession = slingRequest.getResourceResolver().adaptTo(Session.class);
            if (CollabUtil.canAddNode(userSession, path)) {
                // Create the parent node beforehand and set "formPath" and "sling:resourceType"
                // on it to allow bulk editor and forms payload summary respectively.
                final Session adminSession = repository.loginAdministrative(null);
                try {
                    final Node node = JcrUtil.createPath(path, "sling:Folder", adminSession);
                    final Node parent = node.getParent();
                    parent.setProperty("formPath", request.getParameter(FormsConstants.REQUEST_PROPERTY_FORM_START));
                    parent.setProperty("sling:resourceType", "foundation/components/form/actions/showbulkeditor");
                    adminSession.save();
                    // Now change anonymous user permissions before forward
                    // This is needed since we deligate the save (forward) to sling
                    final UserManager userManager = sling.getService(UserManagerFactory.class).createUserManager(adminSession);
                    final AccessControlManager acMgr = adminSession.getAccessControlManager();
                    final AccessControlList acl = getAcl(acMgr, path);
                    // if found, and if current session does not have appropriate privileges...
                    // ...add an entry for 'this' principal to allow modify properties...
                    // ... assign it to the newly created path (this policy will be revoked in cleanup action)
                    if (acl != null) {
                    	final Privilege[] privileges = new Privilege[] {acMgr.privilegeFromName(Privilege.JCR_MODIFY_PROPERTIES)};
                    	if (!userSession.getAccessControlManager().hasPrivileges(path, privileges)) {
                            acl.addAccessControlEntry(userManager.get(userSession.getUserID()).getPrincipal(), privileges);
                            acMgr.setPolicy(path, acl);
                            request.setAttribute("cq.form.temp.policy",acl);
                    	}
                    } else {
                    	log.error("No applicable policies found for {}", path);
                    }
                } catch (Exception e) {
                    log.error("Failed to create path or set permissions.", e);
                } finally {
                    if (adminSession != null) {
	                	if (adminSession.hasPendingChanges()) {
	                        adminSession.save();
	                	}
                        adminSession.logout();
                    }
                }
            } else {
                log.error("User does not have add_node permissions on {}", path);
            }
            break;
        }
    }
    request.setAttribute(FormsConstants.REQUEST_ATTR_WORKFLOW_PAYLOAD_PATH, path);

    // If a workflow model was specified, store it in
    // a request attribute for the StartWorkflowPostProcessor
    final String model = props.get(FormsConstants.START_PROPERTY_WORKFLOW_MODEL, null);
    if(model != null) {
        request.setAttribute(FormsConstants.REQUEST_ATTR_WORKFLOW_PATH, model);
    }

    FormsHelper.setForwardPath(slingRequest, path, true);
    FormsHelper.setRedirectToReferrer(request, true);

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
