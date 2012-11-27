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

  Login component

--%><%
%><%@ page import="com.day.cq.i18n.I18n,
                   com.day.cq.wcm.api.WCMMode,
                   com.day.cq.wcm.foundation.forms.FormsHelper,
                   com.day.text.Text" %><%
%><%@include file="/libs/foundation/global.jsp"%><%
    String id = Text.getName(resource.getPath());
    I18n i18n = new I18n(slingRequest);

    String action = currentPage.getPath() + "/j_security_check";

    String validationFunctionName = "cq5forms_validate_" + id;

    String usernameLabel = properties.get("./usernameLabel", String.class);
    if (usernameLabel == null) {
        usernameLabel = i18n.get("Username");
    } else {
        usernameLabel = i18n.getVar(usernameLabel);
    }
    String passwordLabel = properties.get("./passwordLabel", String.class);
    if (passwordLabel == null) {
        passwordLabel = i18n.get("Password");
    } else {
        passwordLabel = i18n.getVar(passwordLabel);
    }

    String referer = request.getHeader("Referer");
    String defaultRedirect = currentPage.getPath();
    if( referer != null ) {
        //TODO check if referer is inside app
        defaultRedirect = referer;
    }

    // managed URIs should respect sling mapping
    String redirectTo = slingRequest.getResourceResolver().map(request, properties.get("./redirectTo",defaultRedirect));
    if( !redirectTo.endsWith(".html")) {
        redirectTo += ".html";
    }

    boolean isDisabled = WCMMode.fromRequest(request).equals(WCMMode.DISABLED);
%>
<script type="text/javascript">
    function <%=validationFunctionName%>() {
        if (CQ_Analytics) {
            var u = document.forms['<%=id%>']['j_username'].value;
            if (CQ_Analytics.Sitecatalyst) {
                CQ_Analytics.record({ event: "loginAttempt", values: {
                    username:u,
                    loginPage:"${currentPage.path}.html",
                    destinationPage:"<%= xssAPI.encodeForJSString(redirectTo) %>"
                }});
                if (CQ_Analytics.ClickstreamcloudUI && CQ_Analytics.ClickstreamcloudUI.isVisible()) {
                    return false;
                }
            }
            <% if ( !isDisabled ) { %>
                if (CQ_Analytics.ProfileDataMgr) {
                    if (u) {
                        /*
                         * AdobePatentID="B1393"
                         */
                        var loaded = CQ_Analytics.ProfileDataMgr.loadProfile(u);
                        if (loaded) {
                            var url = CQ.shared.HTTP.noCaching("<%= xssAPI.encodeForJSString(redirectTo) %>");
                            CQ.shared.Util.load(url);
                        } else {
                            alert("<%=i18n.get("The user could not be found.")%>");
                        }
                        return false;
                    }
                }
                return true;
            <% } else { %>
                if (CQ_Analytics.ProfileDataMgr) {
                    CQ_Analytics.ProfileDataMgr.clear();
                }
                return true;
            <% } %>
        }
    }
</script>

<%
    String jReason = request.getParameter("j_reason");

    if (null != jReason) {
        %><div class="loginerror"><%=xssAPI.encodeForHTML(i18n.getVar(jReason))%></div>
<%
    }
%>

<form method="POST"
      action="<%= xssAPI.getValidHref(action) %>"
      id="<%= xssAPI.encodeForHTMLAttr(id) %>"
      name="<%= xssAPI.encodeForHTMLAttr(id) %>"
      enctype="multipart/form-data"
      onsubmit="return <%=validationFunctionName%>();">
    <input type="hidden" name="resource" value="<%= xssAPI.encodeForHTMLAttr(redirectTo) %>">
    <input type="hidden" name="_charset_" value="UTF-8"/>
    <table class="login-form">
        <tr>
            <td class="label"><label for="<%= xssAPI.encodeForHTMLAttr(id + "_username")%>"><%= xssAPI.encodeForHTML(usernameLabel) %></label></td>
            <td><input id="<%= xssAPI.encodeForHTMLAttr(id + "_username")%>"
                   class="<%= FormsHelper.getCss(properties, "form_field form_field_text form_" + id + "_username") %>"
                   name="j_username"/></td>
        </tr>
            <tr>
                <td class="label"><label for="<%= xssAPI.encodeForHTMLAttr(id + "_password")%>"><%= xssAPI.encodeForHTML(passwordLabel) %></label></td>
                <td><input id="<%= xssAPI.encodeForHTMLAttr(id + "_password")%>"
                           class="<%= FormsHelper.getCss(properties, "form_field form_field_text form_" + id + "_password") %>"
                   type="password" name="j_password"/></td>
            </tr>
        <tr>
            <td></td>
            <td>
                <input class="form_button_submit" type="submit" value="Login">
            </td>
        </tr>
    </table>
</form>