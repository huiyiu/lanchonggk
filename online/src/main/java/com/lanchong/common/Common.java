package com.lanchong.common;

import com.lanchong.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import java.security.MessageDigest;
import java.util.Random;


public class Common {
	private final static Logger logger = LoggerFactory.getLogger(Common.class);
	private final static String PASSPORT_DOMAIN="http:// /";
	


	public final static String webSiteDomain = "localhost";
	
	public static String getSecondDomain(String path){
		if(StringUtil.isEmpty(path))return "";
		if(!StringUtil.isIpAddr(path)){
			String[] domains = path.split("\\.");
			return domains.length>=3?domains[0]:"";
		}
//		Pattern p = Pattern.compile("(?:http://)?([^\\.]+?)\\.[^\\.]+?\\.(?:com|cn|net)");
//		Matcher m = p.matcher(path);
//		if(m.find())return m.group(1);
		return "";
	}

	public static Long getIpValue(HttpServletRequest request) {
		return getIpValue(getIpAddr(request));
	}


	public static Long getIpValue(String ip) {
		long ipv = 0;
		if(!StringUtil.isIpAddr(ip)){
			logger.warn("IP地址【{}】格式不正确！",ip);
			return ipv;
		}
		for(String ips : ip.split("\\.")){
			ipv = (ipv<<8)+Long.parseLong(ips);
		}
		return ipv;
	}
	/***
	 * 获取ip地址
	 * @param request
	 * @return
	 */
	public static String getIpAddr(HttpServletRequest request) {
		Object o=request.getParameter("_remote_ip");
		logger.debug("getIpAddr _remote_ip:"+ o);
		if(null!=o && !"".equals(o.toString())){
			return o.toString();
		}
		long start=System.currentTimeMillis();
		String ip = request.getHeader("x-forwarded-for");
		if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {      
	        ip = request.getHeader("X-Real-IP");
	    }
		if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {      
            ip = request.getHeader("REMOTE-HOST");
        }
		if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		logger.debug("time :"+ (System.currentTimeMillis()-start) +" getIpAddr:"+ip);
		return ip;
	}

	
	/**
	 * 随机数
	 * @return
	 */
	public static String getRandomCode() {
		Random select = new Random();
		int nowletter = 0;
		char nowlet = ' ';
		StringBuffer target = new StringBuffer(50);

		out: for (int i = 0; i < 10;) {
		
			nowletter = select.nextInt(90);
			int j = 1;
			if ((nowletter > 49 && nowletter < 58) || nowletter > 65) {
				if (nowletter > 49 && nowletter < 58) {
					j++;
				}
				if (j == 4)
					continue out;
				nowlet = (char) nowletter;
				target.append(nowlet);
				i++;
			} else {
				continue;
			}
		}
		return target.toString();
	}

	
	
	

	/**
	 * 
	 * @param counts 随机数位数
	 * @return
	 */
	public static String getRandomCode(int counts) {
		
		 Random random = new Random();
		 StringBuffer sb = new StringBuffer();
         for(int i = 0; i < counts;i++) {
        	 sb.append(Math.abs(random.nextInt())%10);
         }
		return sb.toString();	
	}

	
	
	/**
	 * 判断字符是否为数字
	 * @param str
	 * @return
	 */
	public static boolean isNumeric(String str) {
		if (str != null && str.trim().length()>0) {
			if (str.matches("\\d*")) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
	
	/**
	 * 检查字符是否为空
	 * @param st
	 * @return
	 */
	public static boolean checkSTIsNull(String st){
		return !StringUtil.isEmpty(st);
	}
	/**
	 * sql引号处理
	 * @param inStr
	 * @return
	 */
	public static String getSafeSQL(String inStr) {
	    StringBuffer result = new StringBuffer();
	    try {
	      inStr = inStr.trim();
	      char c;
	      int strLen = inStr.length();
	      for (int i = 0; i < strLen; i++) {
	        c = inStr.charAt(i);
	        switch (c) {
	        case '\'':
	        	result.append("''");
				break;
	        case '\\':
	        	result.append("\\\\");
	          break;
	        default:
	        	result.append(String.valueOf(c));
	          break;
	        }
	      }
	    } catch (Exception e) {
	      return "";
	    }
	    return result.toString();
	  }

	/**
	 * 生成手机验证码(只用于注册)
	 * @param source
	 * @return
	 */
	public static String getMobileCode(byte[] source) {
		String s = null;
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(source);
			byte tmp[] = md.digest();
			char str[] = new char[4];
			int k = 0;
			for (int i = 0; i < 4; i++) {
				byte byte0 = tmp[i];
				// 只取高位
				str[k++] = hexDigits[(byte0 >>> 4 & 0xf) % 10];
			}
			s = new String(str); // 换后的结果转换为字符串
		} catch (Exception e){
			e.printStackTrace();
		}
		return s;
	}
	public static <T>T getDefault(T v, T d){
		return v==null?d:v;
	}
}