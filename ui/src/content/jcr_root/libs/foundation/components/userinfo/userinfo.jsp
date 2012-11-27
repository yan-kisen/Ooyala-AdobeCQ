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

  Shows information about the currently logged in user.

--%><%@include file="/libs/foundation/global.jsp"%><%
%><%@ page import="com.day.cq.i18n.I18n,
                   com.day.cq.personalization.ProfileUtil,
                   com.day.cq.security.profile.Profile,
                   com.day.cq.wcm.api.WCMMode" %><%
%><%@taglib prefix="personalization" uri="http://www.day.com/taglibs/cq/personalization/1.0" %><%

    final I18n i18n = new I18n(slingRequest);
    final Profile currentProfile = slingRequest.adaptTo(Profile.class);
    final boolean isAnonymous = ProfileUtil.isAnonymous(currentProfile);
    final boolean isDisabled = WCMMode.DISABLED.equals(WCMMode.fromRequest(request));
    final String logoutPath = request.getContextPath() + "/system/sling/logout.html";
    final String profilePagePath = currentStyle.get("profilePage", String.class);
    final String myProfileLink = "${profile.path}.form.html" + profilePagePath;
    final String loginPagePath = currentStyle.get("loginPage", String.class);
    final String signupPagePath = currentStyle.get("signupPage", String.class);
%>
<script type="text/javascript">function logout() {
<% if( !isDisabled ) { %>
    if (CQ_Analytics && CQ_Analytics.CCM) {
        CQ_Analytics.ProfileDataMgr.loadProfile("anonymous");
        CQ.shared.Util.reload();
    }
<% } else { %>
    if (CQ_Analytics && CQ_Analytics.CCM) {
        CQ_Analytics.ProfileDataMgr.clear();
        CQ_Analytics.CCM.reset();
    }
    CQ.shared.Util.load("<%= logoutPath %>");
<% } %>
}</script>
<nav>
    <ul>
        <%
            if (isDisabled) {

                //in publish mode, only display the name if !anonymous
                if (!isAnonymous) {
        %>
        <li class="user">
            <personalization:contextProfileProperty propertyName="formattedName" prefix="(" suffix=")"/>
        </li>
        <%
            if (null != profilePagePath) {
        %>
        <li class="profilepage">
            <personalization:contextProfileLink displayValue="<%= i18n.get("My Profile") %>"
                                                href="<%= myProfileLink %>"
                                                id="myprofile-link"/>
        </li>
        <%
            }
        %>
        <li class="signout">
            <a href="javascript:logout();"><%= i18n.get("Sign Out") %></a>
        </li>
        <%
        } else {

            if (null != loginPagePath) {
        %>
        <li class="login"><a href="<%= loginPagePath %>.html"><%= i18n.get("Sign In") %></a></li>
        <%
            }

            if (null != signupPagePath) {
        %>
        <li class="signup"><a href="<%= signupPagePath %>.html"><%= i18n.get("Sign Up") %></a></li>
        <%
                }
            }

        } else {

            //on author handle link from the ContextCloud
        %>
        <li class="user cq-cc-profile-not-anonymous">
            <personalization:contextProfileProperty propertyName="formattedName" prefix="(" suffix=")"/>
        </li>
        <%
            if (null != profilePagePath) {
        %>
        <li class="profilepage cq-cc-profile-not-anonymous">
            <personalization:contextProfileLink displayValue="<%= i18n.get("My Profile") %>"
                                                href="<%= myProfileLink %>"
                                                id="myprofile-link"/>
        </li>
        <%
            }
        %>
        <li class="signout cq-cc-profile-not-anonymous">
            <a href="javascript:logout();"><%= i18n.get("Sign Out") %></a>
        </li>
        <%
            if (null != loginPagePath) {
        %>
        <li class="login cq-cc-profile-anonymous"><a href="<%= loginPagePath %>.html"><%= i18n.get("Sign In") %></a></li>
        <%
            }

            if (null != signupPagePath) {
        %>
        <li class="signup cq-cc-profile-anonymous"><a href="<%= signupPagePath %>.html"><%= i18n.get("Sign Up") %></a></li>
        <%
                }
            }
        %>
    </ul>
</nav>