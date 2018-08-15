package com.lanchong.exception;

public class BaseException extends RuntimeException {
	private static final long serialVersionUID = -1976999417705118829L;

	protected String code;
	protected String detailMessage;

	public BaseException(String message, String detailMessage, String code, Throwable cause){
		super(message, cause);
		this.code = code;
		this.detailMessage = detailMessage;
	}
	public BaseException(String message, String code) {
		this(message, message, code);
	}

	public BaseException(String message, String detailMessage, String code) {
		this(message, detailMessage, code, null);
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDetailMessage() {
		return detailMessage;
	}

	public void setDetailMessage(String detailMessage) {
		this.detailMessage = detailMessage;
	}

}