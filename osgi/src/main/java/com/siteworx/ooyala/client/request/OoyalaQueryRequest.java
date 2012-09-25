package com.siteworx.ooyala.client.request;

import java.util.Map;
import java.util.TreeMap;

import com.siteworx.ooyala.client.OoyalaApiCredential;

/**
 * Provides additional query parameters to {@link OoyalaRequest} to support a
 * where clause.
 * 
 * @author leonardo@siteworx.com
 * @author rboll@siteworx.com
 * 
 */
public class OoyalaQueryRequest extends OoyalaRequest {
	
	final Map<String, String> queryParameters = new TreeMap<String, String>();

	/**
	 * Constructs an instance of OoyalaQueryRequest with the provided
	 * credentials and the proper url, based on Ooyala's RESTful API (v2).
	 * 
	 * @param credentials
	 *            The {@link OoyalaApiCredential} object for authenticating the
	 *            API request.
	 * @param method
	 *            The HTTP method to be used when connecting to Ooyala. Usually
	 *            GET.
	 * @param requestPath
	 *            The request path for the type of object expected in the API
	 *            response.
	 */
	public OoyalaQueryRequest(OoyalaApiCredential credentials, HTTPMethod method, String requestPath) {
		super(credentials, method, requestPath);
	}
	/**
	 * A getter for the queryParameters map.
	 * @return The current queryParameters map.
	 */
	public Map<String, String> getQueryParameters() {
		return this.queryParameters;
	}
	
}
