package com.model;

public class ExceptionResponse {

	private String errorCode;
	private String errorMessage;

	public ExceptionResponse() {
	}

	public ExceptionResponse(String errorCode, String errorMessage) {
		super();
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		return "ExceptionResponse [errorCode=" + this.errorCode + ", errorMessage=" + this.errorMessage + "]";
	}

}
