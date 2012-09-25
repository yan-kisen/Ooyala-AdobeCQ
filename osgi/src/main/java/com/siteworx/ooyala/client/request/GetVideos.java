package com.siteworx.ooyala.client.request;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.siteworx.ooyala.client.OoyalaApiCredential;

/**
 * An extension of {@link OoyalaRequest} for retrieving videos via Ooyala's RESTful API.
 *
 * @author leonardo@siteworx.com
 * @author rboll@siteworx.com
 *
 */
public class GetVideos extends OoyalaQueryRequest {
	
	private static final Logger log = LoggerFactory.getLogger(GetVideos.class);
	
	/**
	 * Constructs an instance of GetVideos with the provided credentials and the proper url,
	 * based on Ooyala's RESTful API (v2).
	 * @param credentials The {@link OoyalaApiCredential} object for authenticating the API request.
	 * @param includeLabels A boolean value indicating whether the response should include asset labels.
	 * @param includeMetadata A boolean value indicating whether the response should include asset metadata.
	 */
	public GetVideos(OoyalaApiCredential credentials, boolean includeLabels, boolean includeMetadata) {
		super(credentials, HTTPMethod.GET, "/v2/assets");
		
		this.getParameters().put(ASSET_TYPE_PARAM, "video");
		
		if(includeLabels && includeMetadata){
			this.getParameters().put("include", "labels,metadata");
		}else if(includeLabels && !includeMetadata){
			this.getParameters().put("include", "labels");
		}else if(!includeLabels && includeMetadata){
			this.getParameters().put("include", "metadata");
		}
	}
	
	/**
	 * Adds a query for video title.
	 * @param titleQueryString The string to query Ooyala's API with.
	 */
	public void addTitleQuery(String titleQueryString) {
		getQueryParameters().put("name", "'" + titleQueryString + "'");
	}
	
	/**
	 * Adds a query for description.
	 * @param descQueryString The string to query Ooyala's API with.
	 */
	public void addDescriptionQuery(String descQueryString) {
		getQueryParameters().put("description", "'" + descQueryString + "'");
	}
	
	/**
	 * Adds a query for custom asset metadata. Note: The metadata key must exist.
	 * @param metaQueryString The string to query Ooyala's API with. Should be in the form <key>:<value>.
	 */
	public void addMetaQuery(String metaQueryString) {
		try {
			String[] params = metaQueryString.split(":");
			getQueryParameters().put("metadata."+params[0], "'"+params[1]+"'");
		} catch (Exception e) {
			e.printStackTrace();
			if (log.isDebugEnabled())
				log.debug("Meta query malformed: " + metaQueryString);
		}
	}
	
	/**
	 * Adds a query for labels.
	 * @param labelQueryString The string to query Ooyala's API with. Must be an exact match to an existing label name.
	 */
	public void addLabelQuery(String labelQueryString) {
		getQueryParameters().put("label", labelQueryString);
	}
	
}