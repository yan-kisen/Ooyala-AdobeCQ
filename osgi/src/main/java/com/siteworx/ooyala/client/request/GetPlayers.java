package com.siteworx.ooyala.client.request;

import com.siteworx.ooyala.client.OoyalaApiCredential;

/**
 * An extension of {@link OoyalaRequest} for retrieving players via Ooyala's RESTful API.
 *
 * @author leonardo@siteworx.com
 * @author rboll@siteworx.com
 *
 */
public class GetPlayers extends OoyalaRequest {

	/**
	 * Constructs an instance of GetPlayers with the provided credentials and the proper url,
	 * based on Ooyala's RESTful API (v2).
	 * @param credentials The {@link OoyalaApiCredential} object for authenticating the API request.
	 * @param includeMetadata A boolean value indicating whether the response should include asset metadata.
	 */
	public GetPlayers(OoyalaApiCredential credentials, boolean includeMetadata) {
		super(credentials, HTTPMethod.GET, "/v2/players");
		this.getParameters().put("include", "metadata");
	}
	
}