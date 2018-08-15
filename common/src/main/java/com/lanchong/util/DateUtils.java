package com.lanchong.util;

import java.text.SimpleDateFormat;

public class DateUtils {
    public static Integer now(){
        return Integer.parseInt (""+System.currentTimeMillis()/1000);
    }

    public static void main(String[] args){
        System.out.println(now());//1534210316
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(1534210316000L));
    }
}
