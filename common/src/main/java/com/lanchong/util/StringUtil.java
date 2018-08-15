package com.lanchong.util;

import java.util.Random;
import java.util.UUID;

public class StringUtil {
    /**
     * 判断字符串是否为空串
     *
     * @param s
     * @return
     */
    public static boolean isEmpty(String s) {
        return s == null || "".equals(s.trim());
    }

    /**
     * 判断字符串是否为有效手机号
     *
     * @param m
     * @return
     */
    public static boolean isTelephone(String m) {
        return !isEmpty(m) && m.matches("^1[3-9]\\d{9}$");
    }

    public static boolean isIpAddr(String ip){
        return !isEmpty(ip) && ip.matches("\\d+(\\.\\d+){3}");
    }

    /**
     * 将Object数组以split串为分隔符合并成新的字符串。
     *
     * @param l
     * @param split
     * @return
     */
    public static String join(Object[] l, String split) {
        StringBuffer sb = new StringBuffer();
        for (Object s : l) {
            sb.append(s).append(split);
        }
        if (sb.length() > 0)
            sb.delete(sb.length() - split.length(), sb.length());
        return sb.toString();
    }

  /*  public static String salt(){
        return UUID.randomUUID().toString();
    }*/

    /**
     * 字符串v如果为空串，则返回默认值d，否则为v本身。
     *
     * @param v
     * @param d
     * @return
     */
    public static String getDefault(String v, String d) {
        return isEmpty(v) ? d : v;
    }
}
