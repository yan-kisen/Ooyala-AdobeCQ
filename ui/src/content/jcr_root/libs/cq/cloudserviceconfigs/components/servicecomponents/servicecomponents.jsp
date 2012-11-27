<%--

  ADOBE CONFIDENTIAL
  __________________

   Copyright 2011 Adobe Systems Incorporated
   All Rights Reserved.

  NOTICE:  All information contained herein is, and remains
  the property of Adobe Systems Incorporated and its suppliers,
  if any.  The intellectual and technical concepts contained
  herein are proprietary to Adobe Systems Incorporated and its
  suppliers and are protected by trade secret or copyright law.
  Dissemination of this information or reproduction of this material
  is strictly forbidden unless prior written permission is obtained
  from Adobe Systems Incorporated.
  --%><%
%><%@include file="/libs/foundation/global.jsp" %><%
%><%@page import="org.apache.sling.api.resource.ResourceResolver,
				  org.apache.sling.api.resource.ResourceUtil,
				  com.day.cq.wcm.webservicesupport.ConfigurationManager,
				  com.day.cq.wcm.webservicesupport.Service"
%><%

    String[] services = pageProperties.getInherited("cq:cloudserviceconfigs", new String[]{});
    if (services.length > 0) {
        ResourceResolver resolver = resource.getResourceResolver();
        ConfigurationManager cfgMgr = (ConfigurationManager)sling.getService(ConfigurationManager.class);
        for (String path : services) {
            if (path.length() > 0) { 
            	String servicename = cfgMgr.getServiceName(path);
            	
            	Service service = cfgMgr.getService(servicename);
                if (service == null) {
                    continue;
                }
                
				String componentReference = service.getComponentReference();
				if (componentReference != null) {
				    %><cq:include path="cloudservice" resourceType="<%= componentReference %>"/><%
				} 
            }
        }
    } else {
        //backwards compatibility
        %><cq:include path="analytics" resourceType="cq/analytics/components/analytics"/><%
    }
%>