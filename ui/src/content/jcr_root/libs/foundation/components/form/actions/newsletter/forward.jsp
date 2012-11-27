<%--
  Copyright 1997-2008 Day Management AG
  Barfuesserplatz 6, 4001 Basel, Switzerland
  All Rights Reserved.

  This software is the confidential and proprietary information of
  Day Management AG, ("Confidential Information"). You shall not
  disclose such Confidential Information and shall use it only in
  accordance with the terms of the license agreement you entered into
  with Day.

  ==============================================================================

  Form 'action' component

  Return the action path for the newsletter form handling

--%><%@page session="false" %><%
%><%@page import="com.day.cq.wcm.foundation.forms.FormsHelper"%><%
%><%@ page import="com.day.cq.wcm.newsletter.NewsletterService" %><%
%><%@taglib prefix="sling" uri="http://sling.apache.org/taglibs/sling/1.0" %><%
%><sling:defineObjects/><%
    final NewsletterService nlService = sling.getService(NewsletterService.class);
    if ( nlService != null ) {
      FormsHelper.setForwardPath(slingRequest, "/libs/wcm/bin/newsletter");
    } else {
        log.debug("Newsletter Service not available, can't process form");
        response.sendError(HttpServletResponse.SC_SERVICE_UNAVAILABLE);
    }
%>