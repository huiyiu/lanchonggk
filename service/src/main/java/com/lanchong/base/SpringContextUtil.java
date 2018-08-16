package com.lanchong.base;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Slf4j
public class SpringContextUtil implements ApplicationContextAware {

	private static ApplicationContext ctx = null;

	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		SpringContextUtil.ctx = applicationContext;
	}

	public ApplicationContext getApplicationContext() {
		return ctx;
	}
	public static ApplicationContext getAppContext() {
		return ctx;
	}
	public static <T> Map<String , T> getBeansByType(Class<T> cl){
		if(null == getAppContext()){
			log.warn("Spring Application Context NOT FOUND!");
			return null;
		}
		return getAppContext().getBeansOfType(cl);
	}
	public static <T> T getBeanByType(String beanName, Class<T> cl){
		Map<String, T> beansByType = getBeansByType(cl);
		return beansByType==null?null:beansByType.get(beanName);
	}
	public <T> T getBean(String beanName, Class<T> cl){
		return getBeanByType(beanName, cl);
	}
}
