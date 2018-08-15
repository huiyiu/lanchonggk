package com.lanchong.exception;

public class Assert {
    public static void notNull(Object o, String msg) {
        if (o == null)
            throw new JsonRequestException(msg, ExceptionCode.PARAM_NULL);
    }

    public static void isNull(Object o, String msg) {
        if (o != null)
            throw new JsonRequestException(msg, ExceptionCode.PARAM_NOTNULL);
    }

    public static void notTrue(boolean o, String msg) {
        if (o)
            throw new JsonRequestException(msg, ExceptionCode.PARAM_FALSE);
    }

    public static void isTrue(boolean o, String msg) {
        if (!o)
            throw new JsonRequestException(msg, ExceptionCode.PARAM_TRUE);
    }

    public static void error(String msg) {
        throw new JsonRequestException(msg, ExceptionCode.NETWORK_ERROR);
    }
}
