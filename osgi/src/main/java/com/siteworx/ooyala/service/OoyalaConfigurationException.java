package com.siteworx.ooyala.service;



public class OoyalaConfigurationException extends Exception {
	
	private static final long serialVersionUID = 1L;
	
	public OoyalaConfigurationException(String message) {
		super(message);
	}
	
	public OoyalaConfigurationException(String message, Throwable cause) {
        super(message, cause);
    }
	
}