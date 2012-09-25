package com.siteworx.ooyala.client;

/**
 * A container class for API Key and Secret for the Ooyala v2 RESTful API.
 *
 * @author leonardo@siteworx.com
 * @author rboll@siteworx.com
 *
 */
public class OoyalaApiCredential {

	private String apiKey;
	private String apiSecret;
	
	/**
	 * Constructs an instance of this class with the provided apiKey and apiSecret. No validation is performed.
	 *
	 * @param apiKey The Ooyala API key, obtained from Ooyala Backlot.
	 * @param apiSecret The Ooyala API secret, obtained from Ooyala Backlot.
	 */
	public OoyalaApiCredential(String apiKey, String apiSecret) {
		this.apiKey = apiKey;
		this.apiSecret = apiSecret;
	}

	/**
	 * A getter for the API key.
	 *
	 * @return The current API key.
	 */
	public String getApiKey() {
		return apiKey;
	}

	/**
	 * A setter for the API key.
	 *
	 * @param apiKey The API key to set.
	 */
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	/**
	 * A getter for the API secret.
	 *
	 * @return The current API secret.
	 */
	public String getApiSecret() {
		return apiSecret;
	}

	/**
	 * A setter for the API secret.
	 *
	 * @param apiSecret The API secret to set.
	 */
	public void setApiSecret(String apiSecret) {
		this.apiSecret = apiSecret;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OoyalaApiCredential [apiKey=").append(apiKey)
				.append(", apiSecret=").append("****************************************").append("]");
		return builder.toString();
	}
}
