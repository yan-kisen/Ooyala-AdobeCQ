package com.siteworx.ooyala.client;

public class OoyalaClientException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public OoyalaClientException(String message) {
		super(message);
	}
	
	public OoyalaClientException(Throwable cause) {
        super(cause);
    }
	
	public OoyalaClientException(String message, Throwable cause) {
        super(message, cause);
    }
	
}