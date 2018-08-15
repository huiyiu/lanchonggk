package com.lanchong.exception;

public class JsonRequestException extends BaseException {
	private static final long serialVersionUID = 2146459618953517636L;

	public JsonRequestException(String message, String code){
		super(message, code);
	}

	public JsonRequestException(String message, String detailMessage,
								String code) {
		super(message, detailMessage, code);
	}

}