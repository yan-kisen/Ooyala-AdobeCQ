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
--%><%@include file="/libs/foundation/global.jsp"%><%
%><%@page contentType="text/html"
            pageEncoding="utf-8"
            import="java.util.Iterator,
                    org.apache.sling.api.resource.Resource,
                    org.apache.sling.api.resource.ValueMap,
                    com.day.cq.wcm.api.Page,
                    com.day.cq.wcm.webservicesupport.ConfigurationUtil"%><%
%><%!
    /**
     * Generates HTML code for a service {@link Page}'s configuration children.
     * 
     * @param page
     * @return an indented HTML list of hyperlinks
     */
    protected String printChildren(Page page) {
        StringBuffer sb = new StringBuffer();
        Iterator<Page> configPages = page.listChildren();
        if (configPages.hasNext()) {
            sb.append("<ul style='margin-bottom: 0px;'>");
            while (configPages.hasNext()) {
                Page child = configPages.next();
                Resource tmpl = child.getTemplate().adaptTo(Resource.class);
                ValueMap tmplVals =  tmpl.getResourceResolver().getResource(tmpl.getPath() + "/jcr:content").adaptTo(ValueMap.class);
                String compPath = tmplVals.get("sling:resourceType", "");
                ValueMap comp = tmpl.getResourceResolver().getResource(compPath).adaptTo(ValueMap.class);
                String view = "contentfinder".equals(comp.get("cq:defaultView", "")) ? "/cf#" : "";
                if (child != null) {
                    sb.append("<li class=\"config\">&raquo; <a href=\"");
                    sb.append(view + child.getPath());
                    sb.append(".html\">");
                    sb.append(child.getTitle());
                    sb.append(" (");
                    sb.append(child.getTemplate().getTitle().replace( "Adobe ", ""));
                    sb.append(")");
                    sb.append("</a>");
                    if (child.getTemplate().getTitle().contains("SiteCatalyst")) {
                        sb.append(" [<a href=\"javascript: CQ.cloudservices.editNewConfiguration('");
                        sb.append(child.getPath() + "','" + child.getPath() +"', false, 'Create Framework')\"");
                        sb.append(" style=\"color: #336600;\" title=\"Create Child Framework\">");
                        sb.append("<b>+</b></a>]");  
                    }
                    sb.append("</li>");
                    if (child.listChildren().hasNext()) {
                        sb.append(printChildren(child));
                    }
                }
            }
            sb.append("</ul>");
        }
        return sb.toString();
    }
%>
