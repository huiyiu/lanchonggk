package com.lanchong.common;

import com.github.jscookie.javacookie.CookieSerializationException;
import com.github.jscookie.javacookie.Cookies;
import com.lanchong.exception.Assert;
import com.lanchong.ucenter.entity.Members;
import com.lanchong.util.Blowfish;
import com.lanchong.util.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.security.Key;
import java.util.Base64;

@Slf4j
public class CookieUtils {

    private static final String CHARSET = "utf-8";

    private static final String DOMAIN = ".localhost";

    private static final String COOKIEKEY = "#@$%$^%2&&*&8(*)a";

    private static final Key key = Blowfish.keyGenerator();

    private static final String BLOWFISHKEY = "o#$%$^^%&DF3GH%&%^&b";


    private static final int COOKIEEXPIRE = 60 * 60 * 24;


    /**
     * 写加密cookie
     *
     * @param value
     * @throws UnsupportedEncodingException
     */
    public static String encodeBlowfishCookie(String value) throws Exception {
        byte[] tt = Blowfish.encrypt(key,value);
        value = Base64.getEncoder().encodeToString(tt);
        return value;
    }

    public static String decodeBlowfishCookie(String value) throws Exception {

        value = java.net.URLDecoder.decode(value, CHARSET);
        byte tempByte[] = Base64.getDecoder().decode(value);
//        byte[] keyByte = BLOWFISHKEY.getBytes();
        byte[] byteDe = Blowfish.decrypt(key,tempByte);
        return new String(byteDe);
    }


    /**
     * 写cookie
     *
     * @param response
     * @param name
     * @param value
     * @param time
     */
    public static void setCookie(HttpServletResponse response, String name, String value, int time) {
        try {
            value = java.net.URLEncoder.encode(value, CHARSET);
        }catch (Exception e){
            log.warn(e.getMessage(), e);
        }
        Cookie cookie = new Cookie(name, value);
//        cookie.setDomain(PropertyConfig.getPropertyValue("cookieHost"));
        cookie.setDomain(getCookieHost());
        cookie.setPath("/");
        if (time > 0) cookie.setMaxAge(time);
        else if (time < 0) cookie.setMaxAge(0);
        //cookie.setVersion(1);
        response.addCookie(cookie);
    }
    public static String getDomain(){
        return StringUtil.getDefault(
                getHeaderValueByName(getRequest(), "user-domain"),getRequest().getServerName());
    }
    public static String getCookieHost(){
        String host = getDomain();
        if(StringUtil.isEmpty(host))return "";
        if(StringUtil.isIpAddr(host))return host;
        return host.replaceAll("^(\\w+\\.)*?(\\w+\\.(?=com|cn|net)\\w+(\\.\\w+)*)$","$2");
    }
    public static String getSencodeDomain(){
        String host = getDomain();
        if(StringUtil.isEmpty(host))return "";
        if(StringUtil.isIpAddr(host))return "";
        String[] domains = host.replaceAll("\\.(com|cn|net)(\\.\\w+)*$","").split("\\.");
        return domains[domains.length-1];
    }

    /**
     * 获取cookie某个值
     *
     * @param request
     * @param name
     * @return
     */
    public static String getCookieValueByName(HttpServletRequest request, String name) {
        Cookie cookies[] = request.getCookies();
        if (cookies != null) {
            for (int i = 0; i < cookies.length; i++) {
                if (cookies[i].getName().equalsIgnoreCase(name)) {
                    try {
                        return URLDecoder.decode(cookies[i].getValue(), CHARSET);
                    } catch (UnsupportedEncodingException e) {
                        log.warn(e.getMessage(), e);
                    }
                }
            }
        }
        return null;
    }
    /**
     * 获取header某个值
     * @param request
     * @param name
     * @return
     */
    public static String getHeaderValueByName(HttpServletRequest request,String name){
        String value = request.getHeader(name);
        if (!StringUtil.isEmpty(value))
            value = URLDecoder.decode(value);
        return value;
    }

    /**
     * 添加cookie验证信息
     *
     * @param username
     * @param uid
     */
    public static String setVerify(String username, String uid) {
        String md5Value = DigestUtils.md5Hex(username + COOKIEKEY + uid);
        log.debug("setVerify:" + username + COOKIEKEY + uid);
        return md5Value;
    }


    public static void markLogin(HttpServletRequest request, HttpServletResponse response, Members members) {
        Cookies cookies = Cookies.initFromServlet(request,response);
        try {
            cookies.set("uid",members.getUid());
            cookies.set("username",members.getUsername());
        } catch (CookieSerializationException e) {
            Assert.error("cookie设置异常！");
        }
    }

    public static HttpServletRequest getRequest() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes()).getRequest();
        return request;
    }


    public static void main(String[] args) throws Exception  {

//        String ee = encodeBlowfishCookie("123456");
//        System.out.println(ee);
//        System.out.println(decodeBlowfishCookie(ee));

    }

}
