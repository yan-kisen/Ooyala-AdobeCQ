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

  Inheritance Paragraph System

--%><%@ page import="java.util.Iterator,
            com.day.cq.wcm.api.WCMMode,
            com.day.cq.wcm.api.components.IncludeOptions" %><%
%><%@include file="/libs/foundation/global.jsp"%><%

    if(editContext!=null && WCMMode.fromRequest(request) == WCMMode.EDIT) {
        editContext.getEditConfig().setOrderable(false);
    }

    boolean hasFake = false;
    Iterator<Resource> iter = resourceResolver.listChildren(resource);
    while (iter.hasNext()) {
        Resource r = iter.next();
        if (r.getResourceType().endsWith("/iparsys/par")) {
            hasFake = true;
            IncludeOptions.getOptions(request, true).forceCellName("");
            %><div class="iparys_inherited"><cq:include path="<%= r.getPath() %>" resourceType="<%= r.getResourceType() %>"/></div><%
        } else {
            %><div class="section"><cq:include path="<%= r.getPath() %>" resourceType="<%= r.getResourceType() %>"/></div><%
        }
    }
    // include fake inheritance if not present in the content
    if (!hasFake) {
        // draw new bar before inherited ones
        String newType = resource.getResourceType() + "/new";
        %><div class="section"><cq:include path="*" resourceType="<%= newType %>"/></div><%

        IncludeOptions.getOptions(request, true).forceCellName("");
        //String path = resource.getPath() + "/iparsys_fake_par";
        String path = resource.getPath() + "/iparsys_fake_par";
        String resType = resource.getResourceType() + "/par";
        %><div class="iparys_inherited"><cq:include path="<%= path %>" resourceType="<%= resType %>"/></div><%
    } else {
        // new bar
        String newType = resource.getResourceType() + "/new";
        %><div class="section"><cq:include path="*" resourceType="<%= newType %>"/></div><%
    }

%>
