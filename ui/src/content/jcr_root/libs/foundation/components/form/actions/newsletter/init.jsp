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

  Initialize the newsletter

--%><%@page session="false" %><%
%><%@ page import="org.apache.sling.api.resource.Resource,
                 com.day.cq.wcm.foundation.forms.FormsHelper,
                 com.day.cq.wcm.newsletter.NewsletterService" %><%
%><%@taglib prefix="sling" uri="http://sling.apache.org/taglibs/sling/1.0" %><%
%><sling:defineObjects/><%
%><%
    final NewsletterService nlService = sling.getService(NewsletterService.class);
    if ( nlService != null ) {
        final String path = nlService.getSubscriptionPath(slingRequest);
        if ( path != null ) {
            final Resource loadResource = resource.getResourceResolver().getResource(path);
            if ( loadResource != null ) {
                FormsHelper.setFormLoadResource(slingRequest, loadResource);
            }
        }
    }
%>