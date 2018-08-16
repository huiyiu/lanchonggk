package com.lanchong.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class SpringEnviroment {

    @Autowired
    Environment env;

    public String get(String key){
        if(env!=null)return env.getProperty(key);
        return "";
    }

    public static String getFromEnv(String key){
        SpringEnviroment springEnviroment = SpringContextUtil.getBeanByType("springEnviroment", SpringEnviroment.class);
        if(springEnviroment!=null)return springEnviroment.get(key);
        return "";
    }
}