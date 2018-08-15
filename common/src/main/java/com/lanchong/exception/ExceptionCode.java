package com.lanchong.exception;

public class ExceptionCode {
	/**
	 * 未登录
	 */
	public final static String UNLOGIN = "700000";

	public final static String PARAM_NULL = "000001";
	public final static String PARAM_NOTNULL = "000002";
	public final static String PARAM_FALSE = "000003";
	public final static String PARAM_TRUE = "000004";

	public final static String PARAM_NOTNUMBER = "000005";
	public final static String PARAM_NOTDATE = "000006";

	public final static String PARAM_EMPTY = "000007";
	public final static String PARAM_OUT_OF_RANGE = "000008";

	/**
	 * 网络异常
	 */
	public final static String NETWORK_ERROR = "000101";

	/**
	 * 签名不正确
	 */
	public final static String NO_ACCESS_AUTH = "000102";
	/**
	 * 类不存在
	 */
	public final static String CLASS_NOT_FOUND = "000103";

	public final static String UPLOAD_SIZE_LIMITED = "000104";

	public final static String IMAGE_CODE_ERROR = "000105";
}
