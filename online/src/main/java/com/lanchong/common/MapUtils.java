package com.lanchong.common;

import com.lanchong.util.StringUtil;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Administrator on 2016/11/4.
 */
public class MapUtils {
    private static Logger logger = LoggerFactory.getLogger(MapUtils.class);

    public static String getXmlFromRequest(HttpServletRequest request){
        String requestXml = "";//请求过来的xml报文
        Document doc = null;
        SAXReader saxReader = new SAXReader();
        try{
            doc = saxReader.read(request.getInputStream());
            requestXml = doc.asXML();
        }catch(Exception e){
            logger.error("解析xml请求数据包出错："+e.getMessage());
        }
        return requestXml;
    }
    public static MultiValueMap<String, String> fromXmlRequest(HttpServletRequest request) {
        MultiValueMap<String, String> params = fromRequest(request);
        String xml = "";
        Document doc = null;
        SAXReader saxReader = new SAXReader();
        try{
            doc = saxReader.read(request.getInputStream());
            xml = doc.asXML();
            params.add("xml", xml);
            Element rootElm = doc.getRootElement();
            for(Object e:rootElm.elements()){
                Element ne = (Element)e;
                params.add(ne.getName(), ne.getText());
            }
        }catch(Exception e){
            logger.error("解析xml请求数据包出错："+e.getMessage());
        }

        return params;
    }
    /**
     * 将request中的信息封装成MultiValueMap
     *
     * @param request
     * @return
     */
    public static MultiValueMap<String, String> fromRequest(HttpServletRequest request) {
        MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();

        Enumeration<?> enumration = request.getParameterNames();
        while (enumration.hasMoreElements()) {
            String parameter = enumration.nextElement().toString();
            String[] parameterValues = request.getParameterValues(parameter);
            for (String paramterValue : parameterValues) {
                params.add(parameter, paramterValue);
            }
        }
        // 支持从attribute中获取，过滤重复parameter
        enumration = request.getAttributeNames();
        while (enumration.hasMoreElements()) {
            String parameter = enumration.nextElement().toString();
            Object object = request.getAttribute(parameter);
            if (!params.containsKey(parameter)) {
                params.add(parameter, object.toString());
            }
        }

        return params;
    }
    public static MultiValueMap<String, String> changeMap(Map<String, String> map){
        MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
        for(String k : map.keySet()){
            params.add(k, map.get(k));
        }
        return params;
    }
    public static TreeMap<String, String> getSortedParameter(
            HttpServletRequest request) {
        TreeMap<String, String> t = new TreeMap<String, String>();
        Enumeration<?> enumration = request.getParameterNames();
        while (enumration.hasMoreElements()) {
            String parameter = enumration.nextElement().toString();
            t.put(parameter, request.getParameter(parameter));
        }
        return t;
    }
    public static Map<String, String> getParameters(HttpServletRequest request) {
        Map<String, String> params = new HashMap<String, String>();
        Enumeration<String> enumeration = request.getParameterNames();
        while (enumeration.hasMoreElements()) {
            String parameter = enumeration.nextElement().toString();
            String[] parameterValues = request.getParameterValues(parameter);
            params.put(parameter, StringUtil.join(parameterValues, ","));
        }
        return params;
    }
}
