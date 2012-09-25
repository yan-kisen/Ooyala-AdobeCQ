package com.siteworx.ooyala.client.request;

import org.apache.sling.commons.json.JSONObject;

import com.siteworx.ooyala.client.OoyalaApiCredential;

public class OoyalaPutRequest extends OoyalaRequest {

	private JSONObject body;
	
	public OoyalaPutRequest(OoyalaApiCredential credentials) {
		super(credentials, HTTPMethod.PUT, "/v2/assets");
	}
	
	public OoyalaPutRequest(OoyalaApiCredential credentials, String pathSuffix) {
		super (credentials, HTTPMethod.PUT, "/v2/assets/" +pathSuffix);
	}

	public JSONObject getBody() {
		return body;
	}

	public void setBody(JSONObject body) {
		this.body = body;
	}
}
