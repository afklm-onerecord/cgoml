package com.afklm.cargo.cgoml.api.exceptions;

import org.sklsft.commons.api.exception.ApplicationException;

public class UndetectedCxmlMessageTypeException extends ApplicationException {

	private static final long serialVersionUID = 1L;
	
	public UndetectedCxmlMessageTypeException(){
		super();
	}
	
	public UndetectedCxmlMessageTypeException(String message) {
		super(message);

	}

	public UndetectedCxmlMessageTypeException(String message, Throwable cause) {
		super(message, cause);
	}

}
