package com.customexception;

public class InvalidParameter extends RuntimeException {

	private static final long serialVersionUID = -4966045942593316866L;

	public InvalidParameter() {
		super();
	}

	public InvalidParameter(final String message) {
		super(message);
	}

	public InvalidParameter(final String message, final Throwable throwable) {
		super(message, throwable);
	}

	public InvalidParameter(final Throwable throwable) {
		super(throwable);
	}

}
