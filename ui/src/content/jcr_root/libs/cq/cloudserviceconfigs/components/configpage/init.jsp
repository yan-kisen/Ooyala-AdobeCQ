<%--
  Copyright 1997-2009 Day Management AG
  Barfuesserplatz 6, 4001 Basel, Switzerland
  All Rights Reserved.

  This software is the confidential and proprietary information of
  Day Management AG, ("Confidential Information"). You shall not
  disclose such Confidential Information and shall use it only in
  accordance with the terms of the license agreement you entered into
  with Day.

  ==============================================================================

  Init script.

  Draws the WCM initialization code. This is usually called by the head.jsp
  of the page. If the WCM is disabled, no output is written.

  ==============================================================================
  
--%><%@page import="com.day.cq.wcm.webservicesupport.Configuration,
                    com.day.cq.wcm.webservicesupport.Service"%>
<%@include file="/libs/foundation/global.jsp"%> 
<%@page import="com.day.cq.wcm.api.WCMMode" %>
<cq:includeClientLib categories="cq.wcm.edit"/>
<%--

if (WCMMode.fromRequest(request) != WCMMode.DISABLED) {
    %><cq:includeClientLib categories="cq.wcm.edit"/><%
    String dlgPath = null;
    if (editContext != null && editContext.getComponent() != null) {
        dlgPath = editContext.getComponent().getDialogPath();
    }
    %>
    <script type="text/javascript" >
        CQ.WCM.launchSidekick("<%= currentPage.getPath() %>", {
            propsDialog: "<%= dlgPath == null ? "" : dlgPath %>",
            locked: <%= currentPage.isLocked() %>
        });
    </script><%
}
else {
    %><cq:includeClientLib categories="cq.wcm.edit"/><%
}
--%>
<%
    String serviceUrl = null;
    String serviceUrlLabel = "Go to service provider";

    String thumbnailPath = "/libs/cq/cloudserviceconfigs/widgets/themes/default/widgets/CloudServiceDialog/thumbnail.png";
    String serviceName = "Cloud service";

    Configuration configuration = resourcePage.adaptTo(Configuration.class);   
    if (configuration != null ){
        serviceUrl = configuration.getInherited("serviceAdminUrl", null);
        Service service = configuration.getParent().adaptTo(Service.class);
        if (service!= null ){
            serviceName = service.getTitle();
            serviceUrlLabel = "Go to " + serviceName;
            thumbnailPath = service.getThumbnailPath();
        }
    }
%>