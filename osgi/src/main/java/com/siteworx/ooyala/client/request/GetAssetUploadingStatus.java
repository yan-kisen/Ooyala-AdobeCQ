package com.siteworx.ooyala.client.request;

import com.siteworx.ooyala.client.OoyalaApiCredential;

public class GetAssetUploadingStatus extends OoyalaRequest {

	public GetAssetUploadingStatus(OoyalaApiCredential credentials, String assetID) {
		super(credentials, HTTPMethod.GET, new StringBuilder().append("/v2/assets/").append(assetID).append("/upload_status").toString());
	}
	
}