package com.siteworx.ooyala.client.request;

import com.siteworx.ooyala.client.OoyalaApiCredential;

/**
 * An extension of {@link OoyalaRequest} for retrieving labels via Ooyala's RESTful API.
 *
 * @author leonardo@siteworx.com
 * @author rboll@siteworx.com
 *
 */
public class GetLabels extends OoyalaRequest {
	
	/**
	 * Constructs an instance of GetLabels with the provided credentials and the proper url, 
	 * based on Ooyala's RESTful API (v2).
	 * @param credentials The {@link OoyalaApiCredential} object for authenticating the API request.
	 */
	public GetLabels(OoyalaApiCredential credentials) {
		super(credentials, HTTPMethod.GET, "/v2/labels");
	}
	
}