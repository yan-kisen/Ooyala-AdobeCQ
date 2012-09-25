package com.siteworx.ooyala.client.request;

import com.siteworx.ooyala.client.OoyalaApiCredential;

public class GetAssetUploadingURL extends OoyalaRequest {

	public GetAssetUploadingURL(OoyalaApiCredential credentials, String assetID) {
		super(credentials, HTTPMethod.GET, new StringBuilder().append("/v2/assets/").append(assetID).append("/uploading_urls").toString());
	}
	
}