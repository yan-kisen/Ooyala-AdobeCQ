<%@page import="com.siteworx.ooyala.service.OoyalaService"%>
<%@page import="com.siteworx.ooyala.service.OoyalaConfigurationService"%>
<%@page import="org.apache.sling.commons.json.JSONArray"%>
<%@page import="org.apache.sling.commons.json.JSONObject"%>
<%@taglib prefix="sling" uri="http://sling.apache.org/taglibs/sling/1.0"%>
<sling:defineObjects />

<%
    response.setContentType("application/json");

    final OoyalaService ooyalaService = sling.getService(OoyalaService.class);
    final String playersString = ooyalaService.getAllPlayers(OoyalaConfigurationService.OOYALA_CONFIG_PATH);
    final JSONObject playersJSON = new JSONObject(playersString);

    final JSONArray responseJSON = new JSONArray();
    
    final JSONArray items = (JSONArray) playersJSON.get("items");
    for(int i=0; i < items.length(); i++){
        final JSONObject currItem = (JSONObject) items.get(i);
        final JSONObject jobject=new JSONObject();
        jobject.put("value",currItem.get("id"));
        jobject.put("text",currItem.get("name"));
        responseJSON.put(jobject);
    }
    out.println(responseJSON.toString());
%>