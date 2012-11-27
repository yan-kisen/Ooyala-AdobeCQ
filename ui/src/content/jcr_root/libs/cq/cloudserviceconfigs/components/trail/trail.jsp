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

--%><%@include file="/libs/foundation/global.jsp"%><%
%><%@ page import="java.util.Iterator,
        com.day.text.Text,
        com.day.cq.wcm.api.PageFilter,
        com.day.cq.wcm.api.NameConstants,
        org.apache.commons.lang3.StringEscapeUtils,
        com.day.cq.wcm.api.Page" %><%

    // get starting point of trail
    long level = 2L;
    long endLevel = 1L;
    String delimStr = "&nbsp;&gt;&nbsp;";
    int currentLevel = currentPage.getDepth();
    String delim = "&nbsp;&gt;&nbsp;"; 
    %>
    <p class="breadcrumb">
    <a href="<%= request.getContextPath() %>/etc/cloudservices.html" onclick="window.top.location=this.href">Cloud Services</a>
    <%
    while (level < currentLevel - endLevel) {
        Page trail = currentPage.getAbsoluteParent((int) level);
        if (trail == null) {
            break;
        }
        String title = trail.getNavigationTitle();
        if (title == null || title.equals("")) {
            title = trail.getNavigationTitle();
        }
        if (title == null || title.equals("")) {
            title = trail.getTitle();
        }
        if (title == null || title.equals("")) {
            title = trail.getName();
        }
        %><%= delim %><%
        %><a href="<%= Text.escape(trail.getPath(), '%', true) %>.html" onclick="openPage('<%= Text.escape(trail.getPath(), '%', true) %>')"><%
        %><%= StringEscapeUtils.escapeHtml4(title) %><%
        %></a><%

        delim = delimStr;
        level++;
    }%>
    </p>
    <script type="text/javascript">
    function openPage(path) {
        path = CQ.HTTP.internalize(path);
        var url = CQ.HTTP.externalize("/bin/wcmcommand") + "?cmd=open";
        url+= "&_charset_=utf-8";
        url+= "&path=" + encodeURIComponent(path);
        window.top.location = url;
    }
    </script>