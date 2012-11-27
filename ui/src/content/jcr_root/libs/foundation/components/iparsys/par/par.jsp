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

  Inheritance Paragraph System - Par

--%><%@ page import="com.day.text.Text,
            java.util.Iterator,
            com.day.cq.wcm.api.WCMMode,
            com.day.cq.wcm.api.components.Toolbar,
            com.day.cq.wcm.api.components.IncludeOptions,
            java.util.LinkedList, java.util.List,
            org.apache.sling.api.resource.ResourceResolver,
            com.day.cq.wcm.api.Page" %><%
%><%@include file="/libs/foundation/global.jsp"%><%

    // if inheritance is canceled, do nothing
    if (properties != null && properties.get("inheritance", "").equals("cancel")) {
        if (editContext != null && WCMMode.fromRequest(request) == WCMMode.EDIT) {
            editContext.getEditConfig().getToolbar().set(0,
                new Toolbar.Label("Inheritance disabled"));
        }
        return;
    }

    // get page content relative path to the parsys
    String parSysPath = Text.getRelativeParent(resource.getPath(), 1);
    parSysPath = parSysPath.substring(currentPage.getContentResource().getPath().length() + 1);
    Page parent = currentPage.getParent();

    LinkedList<Resource> paras = new LinkedList<Resource>();
    if (!addParas(paras, resourceResolver, parent, parSysPath)) {
        if (editContext != null && WCMMode.fromRequest(request) == WCMMode.EDIT) {
            editContext.getEditConfig().getToolbar().set(0,
                new Toolbar.Label("Parent canceled inheritance"));
        }
        return;
    }

    // disable WCM for inherited components
    WCMMode mode = WCMMode.DISABLED.toRequest(request);
    try {
        for (Resource r: paras) {
            %><div class="section"><cq:include path="<%= r.getPath() %>" resourceType="<%= r.getResourceType() %>"/></div><%
        }
    } finally {
        mode.toRequest(request);
    }


%><%!

    private boolean addParas(List<Resource> paras, ResourceResolver resolver,
                             Page parent, String parSysPath) {
        if (parent == null) {
            return true;
        }
        // get the parent parsys
        Resource parsys = parent.getContentResource(parSysPath);

        // check if parent parsys canceled inheritance to its children
        if (parsys != null && parsys.adaptTo(ValueMap.class).get("inheritance", "").equals("cancel")) {
            return false;
        }

        // iterate over paras
        boolean hasFake = false;
        if (parsys != null) {
            Iterator<Resource> iter = resolver.listChildren(parsys);
            while (iter.hasNext()) {
                Resource r = iter.next();
                if (r.getResourceType().endsWith("/iparsys/par")) {
                    hasFake = true;
                    // if inheritance is canceled, do nothing
                    ValueMap properties = r.adaptTo(ValueMap.class);
                    if (!properties.get("inheritance", "").equals("cancel")) {
                        addParas(paras, resolver, parent.getParent(), parSysPath);
                    }
                } else {
                    paras.add(r);
                }
            }
        }
        if (!hasFake) {
            // if not fake paragraph is initialized, try to inherit anyways.
            addParas(paras, resolver, parent.getParent(), parSysPath);
        }
        return true;
    }


%>