<%--
  Copyright 1997-2010 Day Management AG
  Barfuesserplatz 6, 4001 Basel, Switzerland
  All Rights Reserved.

  This software is the confidential and proprietary information of
  Day Management AG, ("Confidential Information"). You shall not
  disclose such Confidential Information and shall use it only in
  accordance with the terms of the license agreement you entered into
  with Day.
--%><%@page session="false" %><%
%><%@ page import="com.day.cq.security.AccountManager" %>
<%@ page import="com.day.cq.security.AccountManagerFactory" %>
<%@ page import="com.day.cq.security.User" %>
<%@ page import="com.day.cq.wcm.foundation.forms.FormsHelper" %>
<%@ page import="org.apache.sling.api.resource.ResourceUtil" %>
<%@ page import="org.apache.sling.api.resource.ValueMap" %>
<%@ page import="org.apache.sling.jcr.api.SlingRepository" %>
<%@ page import="javax.jcr.Session" %>
<%@ page import="java.util.HashMap" %>
<%@taglib prefix="sling" uri="http://sling.apache.org/taglibs/sling/1.0" %>
<sling:defineObjects/><%
    final ValueMap properties = ResourceUtil.getValueMap(resource);
    final String key = request.getParameter("ky") == null ? null : slingRequest.getRequestParameter("ky").getString();
    final String uid = request.getParameter("uid") == null ? null : slingRequest.getRequestParameter("uid").getString();
    final String pwd = request.getParameter("passwordreset") == null ? null : slingRequest.getRequestParameter("passwordreset").getString();

    // todo deny anonymous, admin

    SlingRepository repository = sling.getService(SlingRepository.class);
    Session session = repository.loginAdministrative(null);
    try {
        AccountManagerFactory factory = sling.getService(AccountManagerFactory.class);
        AccountManager accountManager = factory.createAccountManager(session);

        if (key == null || uid == null) {
            User user = resourceResolver.adaptTo(User.class);
            user.changePassword(pwd);
        }
        else {
            User user = accountManager.findAccount(uid);
            if (!accountManager.setPassword(user, key, pwd)) {
                // todo handle error
            }
        }
    }
    finally {
        session.logout();
    }

    String path = properties.get("pwdChangedPage", "");
    if ("".equals(path)) {
        FormsHelper.redirectToReferrer(slingRequest, slingResponse, new HashMap<String, String[]>());
    } else {
        if (path.indexOf(".") < 0) {
            path += ".html";
        }
        response.sendRedirect(path);
    }

%>