package com.siteworx.ooyala.client.request;

import org.apache.sling.commons.json.JSONObject;

import com.siteworx.ooyala.client.OoyalaApiCredential;

public class OoyalaPostRequest extends OoyalaRequest {

	private JSONObject body;
	
	public OoyalaPostRequest(OoyalaApiCredential credentials) {
		super(credentials, HTTPMethod.POST, "/v2/assets");
	}

	public JSONObject getBody() {
		return body;
	}

	public void setBody(JSONObject body) {
		this.body = body;
	}
}
