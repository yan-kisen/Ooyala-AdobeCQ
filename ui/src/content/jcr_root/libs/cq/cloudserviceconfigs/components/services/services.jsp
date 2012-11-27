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
                    com.day.cq.wcm.webservicesupport.Service,
                    com.day.cq.wcm.webservicesupport.ConfigurationManager,
                    com.day.cq.wcm.webservicesupport.ConfigurationUtil"%><%
%><%

    ConfigurationManager cfgMgr = sling.getService(ConfigurationManager.class);
    String pageTitle = properties.get("jcr:title", "Cloud Services");
    
%><!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN">
<html>
<head>
    <title>CQ5 Cloud Services | <%= pageTitle %></title>
    <meta http-equiv="Content-Type" content="text/html; utf-8" />
    <script src="/libs/cq/ui/resources/cq-ui.js" type="text/javascript"></script>
    <cq:includeClientLib categories="cq.wcm.edit,cq.cloudserviceconfigs"/>
</head>

<script language="javascript" type="text/javascript">

function thumbClick(id){ 
      if (document.getElementById(id+"-border").style.visibility == "hidden")
      {
         document.getElementById(id+"-border").style.visibility="visible"; 
         document.getElementById(id+"-border").style.display="block"; 
         document.getElementById(id+"-more").style.visibility="visible";
         document.getElementById(id+"-more").style.display="block";
      }
      else
      {
        document.getElementById(id+"-border").style.visibility="hidden"; 
        document.getElementById(id+"-border").style.display="none";
        document.getElementById(id+"-more").style.visibility="hidden";
        document.getElementById(id+"-more").style.display="none";
      } 
}
 
</script>

<body style="background-color: #ffffff; padding: 70px 40px 40px 40px"> 

<div style="font-size: 20px; color: #336600; padding: 0px 0px 5px 0px; width: 615px; border-bottom: 1px solid #f1f1f1; margin-bottom: 35px"><b>Adobe Digital Marketing Suite</b></div>

    <%
        for (Iterator<Resource> iter = resource.listChildren(); iter.hasNext();) {
            Resource child = iter.next();
            
            if (ConfigurationUtil.isService(child) ) {
                Service service = cfgMgr.getService(child.getName());
                String id = child.getName();
                ValueMap content = child.getChild("./jcr:content").adaptTo(ValueMap.class);
                if (content == null) {
                    content = ValueMap.EMPTY;
                }
                //select only adobe products
                if ( content.get("jcr:title", "").contains("Adobe") ){
                    String title = content.get("jcr:title", "");
                    String description = content.get("jcr:description", "");       
    
                    Boolean isEnabled = ConfigurationUtil.hasConfigurations(child);                  
                    String status =  isEnabled ? "enabled" : "disabled";
        
                    %>
                    <div class="cq-cloudservice-dms">  
                            <%
                            String thumbnailPath = service.getThumbnailPath();
                            if (thumbnailPath == null) {
                                thumbnailPath = "/libs/cq/cloudserviceconfigs/widgets/themes/default/widgets/CloudServiceDialog/thumbnail.png";
                            }
                            thumbnailPath = request.getContextPath() + thumbnailPath;
                            %>
                        <div class="cq-cloudservice-thumb" style="background: url('<%=thumbnailPath%>');" id="<%= id %>" onClick="thumbClick('<%= id %>')">    
                            <img src="/libs/cq/cloudserviceconfigs/widgets/themes/default/thumbnailBorder.png" id="<%= id %>-border" style="visibility: hidden; display: none;" />
                        </div>
                    
                        <div style="padding: 0px 0px 0px 15px; width: 520px; float:left;"> 
                            <span style="font-size: 18px; color: #336600; font-weight: bold; cursor: pointer"  onClick="thumbClick('<%= id %>')"><%= title %></span><br/> 
                            <span>
                                <%= content.get("description", "") %>
                            </span>
                            
                            <div id="<%= id %>-more" style="visibility: hidden; display: none; padding: 15px 0px 0px 0px;"> 
                            <% if (!isEnabled){ %>
                            
                                <span> 
                                <%= content.get("descriptionExtended", "") %>
                                </span>
                                
                                <div style="padding: 20px 0px 20px 0px">
                                    <div style="float: left; width: 245px; border-left: 1px solid #f1f1f1; padding: 0px 0px 0px 10px;">
                                        <div style="color: #336600; font-weight: bold; padding: 0px 2px 5px 2px; margin-top: -2px;">Not a <%= title.replace("Adobe ", "") %> customer yet?</div> 
                                        <input type="button" value="Learn More" onClick="javascript: window.open('<%= content.get("serviceUrl", "") %>', '_blank')" style="margin-bottom: 0px;">
                                    </div>
                                    
                                    <div style="float: left; width: 245px; border-left: 1px solid #f1f1f1; padding: 0px 0px 0px 10px;">
                                        <div style="color: #336600; font-weight: bold; padding: 0px 2px 5px 2px; margin-top: -2px;">Already a <%= title.replace("Adobe ", "") %> customer?</div>
                                        <input type="button" value="Configure Now" style="margin-bottom: 0px;"
                                               onclick="CQ.cloudservices.editNewConfiguration('<%=child.getPath()%>','<%=child.getPath()%>', undefined, 'Create Configuration')">
                                    </div>
                                </div>
                                
                             <% }else{ %>  
                                 <div style="clear:both; padding:0px; border-top: 1px solid #f5f5f5; margin: 0px 0px 0px 0px"> 
                                        <%
                                        Resource statistics = child.getChild("statistics"); 
                                        if (statistics != null) {
                                            int cnt = 0;
                                            for(Iterator<Resource> it = statistics.listChildren(); it.hasNext();) {
                                                cnt++;
                                                Resource stat = it.next();
                                                ValueMap stats = stat.adaptTo(ValueMap.class);
                                                String name = stats.get("jcr:title",stat.getName());
                                                String value = stats.get("total", "0");
                                            %> 
                                                <div style="padding: 2px 0px 2px 0px;  border-bottom: 1px solid #f5f5f5; height: 18px; <%= (cnt%2 == 1) ? "background-color: #f9f9f9;" : "" %>">
                                                    <div style="padding-left: 12px; width: 250px; float: left;"><%=name%></div>
                                                    <div style="padding-left: 10px; width: 100px; float: left;"><strong><%=value%></strong></div>
                                                </div>    
                                            <%
                                            }
                                        }
                                        %>
                                  </ul>      
                                  </div>   
                                  <div style="padding:20px 10px 20px 0px">
                                    <div style="float: left; width: 245px; border-left: 1px solid #f1f1f1; padding: 0px 0px 0px 10px;"> 
                                        <div style="color: #336600; font-weight: bold; padding: 0px 2px 5px 2px; margin-top: -2px;"><%= title.replace("Adobe ", "") %> is configured</div> 
                                        <input type="button" value="Show configurations" onClick="document.getElementById('<%=title%>-configurations').style.display='block';" 
                                               style="margin-bottom: 0px;" /> 
                                    </div> 
                                    <div  class="available-configs" id="<%=title%>-configurations" style="float: left; display: none;">
                                        <div style="color: #336600; font-weight: bold; padding: 20px 0px 0px 02px; margin-top: 0px; border-bottom: 1px solid #f1f1f1;">Available Configurations 
                                            [<a href="javascript: CQ.cloudservices.editNewConfiguration('<%=child.getPath()%>','<%=child.getPath()%>', true);"
                                                style="color: #336600;" title="Add new configuration"><b>+</b></a>]
                                        </div>
                                        <%@include file="/libs/cq/cloudserviceconfigs/components/childlist/childlist.jsp"%><%-- cq:include accepts no params --%>
                                        <%=printChildren(child.adaptTo(Page.class))%>
                                    </div>
                                </div>

                             <% } %>   
                            </div>    
                                                        
                        </div>    
                  
                    </div> 
                <% 
                }
            }
    }
 %>
</body>
</html>
