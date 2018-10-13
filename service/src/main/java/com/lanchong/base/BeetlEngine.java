package com.lanchong.base;

import org.beetl.core.Configuration;
import org.beetl.core.GroupTemplate;
import org.beetl.core.Template;
import org.beetl.core.resource.StringTemplateResourceLoader;

import java.io.IOException;
import java.util.Map;

public class BeetlEngine {

    public static String render(String template,String varName,Object varObject){

    StringTemplateResourceLoader resourceLoader =new StringTemplateResourceLoader();

        Configuration cfg =null;

        try {

            cfg =Configuration.defaultConfiguration();

        }catch (IOException e) {

            //log error

        }

        GroupTemplate gt =new GroupTemplate(resourceLoader, cfg);

        Template t =gt.getTemplate(template);

        t.binding(varName, varObject);

        return t.render();

    }


    public static String render(String template, Map<String,Object> params){

        StringTemplateResourceLoader resourceLoader =new StringTemplateResourceLoader();

        Configuration cfg =null;

        try {

            cfg =Configuration.defaultConfiguration();

        }catch (IOException e) {

            //log error

        }

        GroupTemplate gt =new GroupTemplate(resourceLoader, cfg);

        Template t =gt.getTemplate(template);

        for(Map.Entry<String,Object> entry : params.entrySet()){
            t.binding(entry.getKey(), entry.getValue());
        }
        return t.render();

    }

}