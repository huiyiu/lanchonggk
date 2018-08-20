package com.lanchong.base;

import com.lanchong.constant.RedisServerKeys;
import com.lanchong.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class VerifyCodeService {
	private  Logger logger = LoggerFactory.getLogger(VerifyCodeService.class);
	
	private  Map<String,String> vc = new HashMap<String, String>();
	
	private  String SUBFIX_TELEPHONE="MO:";
	private  String SUBFIX_EMAIL="EM:";
	private  String SUBFIX_NORMAL="NOR:";
	private  boolean redisEnabled = "true".equalsIgnoreCase(PropertyConfig.getPropertyValue("redis.enabled"));
	//短信验证码长度
	public final  int verifyCodeLength = 4;

	@Autowired
	StringRedisTemplate redisTemplate;


	public  boolean isTeletephoneVerifyCodeExpired(String key){
		return System.currentTimeMillis()-getExpired(SUBFIX_TELEPHONE+key)>=0L;
	}
	public  boolean isEmailVerifyCodeExpired(String key){
		return System.currentTimeMillis()-getExpired(SUBFIX_EMAIL+key)>=0;
	}
	public  boolean isCodeExpired(String key){
		return System.currentTimeMillis()-getExpired(SUBFIX_NORMAL+key)>=0;
	}
	public  boolean checkTelephoneVerifyCode(String key,String value){
		removeExpired();
		return StringUtil.isEmpty(value)?false:value.equals(getTelephoneVerifyCode(key));
	}
	public  boolean checkEmailVerifyCode(String key,String value){
		removeExpired();
		return StringUtil.isEmpty(value)?false:value.equals(getEmailVerifyCode(key));
	}
	public  boolean checkCode(String key,String value){
		removeExpired();
		return StringUtil.isEmpty(value)?false:value.equals(getCode(key));
	}
	public  String getTelephoneVerifyCode(String key){
		removeExpired();
		return getVerifyCode(SUBFIX_TELEPHONE, key);
	}
	public  String getEmailVerifyCode(String key){
		removeExpired();
		return getVerifyCode(SUBFIX_EMAIL, key);
	}
	public  String getCode(String key){
		removeExpired();
		return getVerifyCode(SUBFIX_NORMAL, key);
	}
	public  String regTelephoneVerifyCode(String key,long expired){
		removeExpired();
		String value = StringUtil.getRandomCode(verifyCodeLength);
		put(SUBFIX_TELEPHONE,key,value,expired);
		return value;
	}
	public  String regEmailVerifyCode(String key,long expired){
		removeExpired();
		String value = StringUtil.getRandomCode(verifyCodeLength);
		put(SUBFIX_EMAIL,key,value,expired);
		return value;
	}
	public  String regCode(String key,String value,long expired){
		removeExpired();
		put(SUBFIX_NORMAL,key,value,expired);
		return value;
	}
	/**
	 * 
	 * @param subFix 
	 * @param key
	 * @param value
	 * @param expired  为秒数
	 */
	private  void put(String subFix,String key,String value,long expired){
		long expired1 = System.currentTimeMillis()+expired*1000;
		key = subFix + key;
		if(expired1>System.currentTimeMillis()){
			if(redisEnabled){
				redisTemplate.opsForValue().set(RedisServerKeys.VERIFY_CODE+key, value+"::"+expired1, (int)expired);
			}else{
				vc.put(key, value+"::"+expired1);
			}
		}
	}
	private  String getVerifyCode(String subFix,String key){
		key = subFix + key;
		String v = redisEnabled ? redisTemplate.opsForValue().get(RedisServerKeys.VERIFY_CODE+key):vc.get(key);
		if(v!=null){
			v = v.replaceAll("::\\d+?$","");
		}
		return v;
	}
	private  long getExpired(String key){
		String v = redisEnabled ? redisTemplate.opsForValue().get(RedisServerKeys.VERIFY_CODE+key):vc.get(key);
		if(v!=null){
			try{
				String[] vs = v.split("::");
				return Long.parseLong(vs[vs.length-1], 10);
			}catch(Exception e){
				logger.error("获取超时时间出错:"+key+"->"+v+"["+redisEnabled+"]");
				return System.currentTimeMillis()+100000;
			}
		}
		return 0;
	}
	private  void remove(String subFix,String key){
		if(redisEnabled){
			redisTemplate.delete(RedisServerKeys.VERIFY_CODE+subFix+key);
		}else{
			vc.remove(subFix+key);
		}
	}
	public  void removeTelephoneVerifyCode(String key){
		remove(SUBFIX_TELEPHONE,key);
	}
	public  void removeEmailVerifyCode(String key){
		remove(SUBFIX_EMAIL,key);
	}
	public  void removeCode(String key){
		remove(SUBFIX_NORMAL,key);
	}
	public  void removeExpired(){
		//由redis自身的定期机制去清理
		if(redisEnabled)return;
		Object[] ks =  vc.keySet().toArray();
		for(Object ko : ks){
			String k = String.valueOf(ko);
			if(System.currentTimeMillis()>=getExpired(k)) vc.remove(k);
		}
	}

	public static void main(String[] args) {

	}
}