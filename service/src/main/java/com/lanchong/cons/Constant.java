package com.lanchong.cons;

import com.google.common.collect.ImmutableMap;

public class Constant {

    public static String getFriendGroup(String key){
       return  new ImmutableMap.Builder<String, String>()
               .put("default" ,"其他")
               .put("1" , "通过本站认识" )
               .put("2" , "通过活动认识" )
               .put("3" , "通过朋友认识" )
               .put("4" , "亲人")
               .put("5" , "同事")
               .put("6" , "同学")
               .put("7" , "不认识")
               .put("" , "自定义"  )
               .build()
               .get(key);
    }
}
