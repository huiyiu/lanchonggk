package com.lanchong.common.service;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.FelEngineImpl;
import com.greenpineyu.fel.context.FelContext;
import com.lanchong.common.entity.MemberCount;
import com.lanchong.common.entity.Setting;
import com.lanchong.common.repository.MemberCountRepository;
import com.lanchong.common.repository.SettingRepository;
import de.ailis.pherialize.MixedArray;
import de.ailis.pherialize.Pherialize;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class CreditService {
    @Autowired
    SettingRepository settingRepository;
    @Autowired
    MemberCountRepository memberCountRepository;

    public  Table<String,String,Object> summary(Integer uid) {
        //公式
        Setting creditsformula = settingRepository.findBySkey("creditsformula");
        MemberCount mc = memberCountRepository.getByUid(uid);
        FelEngine fel = new FelEngineImpl();
        FelContext ctx = fel.getContext();
        Field[] declaredFields = mc.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            Object value = 0;
            try {
                value = field.get(mc);
            } catch (IllegalAccessException e) {
                log.warn("积分计算错误："+field.getName());
            }
            ctx.set(field.getName(), value);
        }
        Object  result = fel.eval(creditsformula.getSvalue());
        Table<String,String,Object> tables = HashBasedTable.create();
        Map<String,Object> summaryMap = new HashMap<>();
        MixedArray list;

        list = Pherialize.unserialize(settingRepository.findBySkey("extcredits").getSvalue()).toArray();

        tables.put("extcredits",""+list.getArray(1).get("title"),mc.getExtcredits1()) ;
        tables.put("extcredits",""+list.getArray(2).get("title"),mc.getExtcredits2()) ;
        tables.put("extcredits",""+list.getArray(3).get("title"),mc.getExtcredits3()) ;
        tables.put("extcredits",""+list.getArray(4).get("title"),mc.getExtcredits4()) ;
        tables.put("extcredits",""+list.getArray(5).get("title"),mc.getExtcredits5()) ;
        tables.put("extcredits",""+list.getArray(6).get("title"),mc.getExtcredits6()) ;
        tables.put("extcredits",""+list.getArray(7).get("title"),mc.getExtcredits7()) ;
        tables.put("extcredits",""+list.getArray(8).get("title"),mc.getExtcredits8()) ;
        //tables.put("extcredits1",""+list.getArray(8).get("title"),mc.getExtcredits8()) ;
        // 发帖数  主题数  精华帖数  在线时间(小时)  好友数  记录数  日志数  相册数  分享数
        tables.put("posts","发帖数",mc.getPosts()) ;//
        tables.put("digestposts","精华帖数",mc.getDigestposts()) ;
        tables.put("threads","主题数",mc.getThreads()) ;//主题数
        //tables.put("posts","",mc.getPosts()) ;
        tables.put("sharings","分享数",mc.getPosts()) ;//分享数
        tables.put("blogs","日志数",mc.getBlogs()) ;//日志数
        tables.put("albums","相册数",mc.getAlbums()) ;// 相册数
        tables.put("oltime","在线时间(小时)",mc.getOltime()) ;//在线时间(小时)
        tables.put("friends","好友数",mc.getFriends()) ;//好友数
        tables.put("doings","记录数",mc.getDoings()) ;// 记录数


        tables.put("credit","积分",result);
        tables.put("creditFormulaExp","总积分=",settingRepository.findBySkey("creditsformulaexp").getSvalue());
        return tables;
    }
}
