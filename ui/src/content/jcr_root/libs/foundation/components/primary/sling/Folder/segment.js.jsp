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

 Segment renderer for sling:Folder nodes

 Creates the segmentation registration for the current folder.

--%><%@ page session="false"
             contentType="application/x-javascript"
             pageEncoding="utf-8"
             import="com.day.cq.wcm.api.NameConstants,
                     com.day.text.Text,
                     org.apache.sling.api.SlingHttpServletResponse,
                     org.apache.sling.api.resource.Resource,
                     org.apache.sling.api.wrappers.SlingHttpServletResponseWrapper,
                     org.slf4j.Logger,
                     org.slf4j.LoggerFactory,
                     java.io.PrintWriter,
                     java.io.StringWriter,
                     java.util.Iterator" %><%!
    private final Logger logger = LoggerFactory.getLogger(getClass());
%><%@ taglib prefix="sling" uri="http://sling.apache.org/taglibs/sling/1.0" %><sling:defineObjects /><%
    Iterator<Resource> iter = resourceResolver.listChildren(resource);
    while(iter.hasNext()) {
        Resource child = iter.next();
        //exclude jcr:content nodes
        if(!NameConstants.NN_CONTENT.equals(Text.getName(child.getPath()))) {
            try {
                CustomResponseWrapper responseWrapper = new CustomResponseWrapper(slingResponse);
                RequestDispatcher rd = slingRequest.getRequestDispatcher(child.getPath() + ".segment.js");
                rd.include(request, responseWrapper);
                String res = responseWrapper.getString();
                out.println(res);
            } catch (Exception e) {
                logger.warn("Error while including sub segment",child.getPath(), e);
            }
        }
    }
    response.setContentType("application/x-javascript");
%><%!
    class CustomResponseWrapper extends SlingHttpServletResponseWrapper {
        private StringWriter string = new StringWriter();
        private PrintWriter writer = new PrintWriter(string);
        public CustomResponseWrapper(SlingHttpServletResponse slingHttpServletResponse) {
            super(slingHttpServletResponse);
        }

        public PrintWriter getWriter() {
            return writer;
        }

        public String getString() {
            return string.toString();
        }

        public void clearWriter() {
            writer.close();
            string = new StringWriter();
            writer = new PrintWriter(string);
        }
    }
%>