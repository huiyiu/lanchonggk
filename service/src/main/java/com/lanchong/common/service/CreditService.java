package com.lanchong.common.service;

import com.lanchong.common.entity.Member;
import com.lanchong.common.entity.MemberCount;
import com.lanchong.common.entity.Setting;
import com.lanchong.common.repository.MemberCountRepository;
import com.lanchong.common.repository.MemberRepository;
import com.lanchong.common.repository.SettingRepository;
import com.lanchong.util.JsonResult;
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
    @Autowired
    MemberRepository memberRepository;

    public  Map<String,String> summary(Integer uid) {
        //公式
        Setting creditsformula = settingRepository.findBySkey("creditsformula");
        /*MemberCount mc = memberCountRepository.getByUid(uid);
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
        Object  result = fel.eval(creditsformula.getSvalue());*/
        Map<String,String> tables = new HashMap<>();
        MixedArray list;
        list = Pherialize.unserialize(settingRepository.findBySkey("extcredits").getSvalue()).toArray();

        tables.put("extcredits1",""+list.getArray(1).get("title")) ;
        tables.put("extcredits2",""+list.getArray(2).get("title")) ;
        tables.put("extcredits3",""+list.getArray(3).get("title")) ;
        tables.put("extcredits4",""+list.getArray(4).get("title")) ;
        tables.put("extcredits5",""+list.getArray(5).get("title")) ;
        tables.put("extcredits6",""+list.getArray(6).get("title")) ;
        tables.put("extcredits7",""+list.getArray(7).get("title")) ;
        tables.put("extcredits8",""+list.getArray(8).get("title")) ;
        //tables.put("extcredits1",""+list.getArray(8).get("title"),mc.getExtcredits8()) ;
        // 发帖数  主题数  精华帖数  在线时间(小时)  好友数  记录数  日志数  相册数  分享数
        tables.put("posts","发帖数") ;//
        tables.put("digestposts","精华帖数") ;
        tables.put("threads","主题数") ;//主题数
        //tables.put("posts","",mc.getPosts()) ;
        tables.put("sharings","分享数") ;//分享数
        tables.put("blogs","日志数") ;//日志数
        tables.put("albums","相册数") ;// 相册数
        tables.put("oltime","在线时间(小时)") ;//在线时间(小时)
        tables.put("friends","好友数") ;//好友数
        tables.put("doings","记录数") ;// 记录数
        tables.put("credit","积分");
        tables.put("creditFormulaExp",settingRepository.findBySkey("creditsformulaexp").getSvalue());
        return tables;
    }

    /**
     * 获取个人积分统计
     * @param uid
     * @return
     */
    public JsonResult getCredits(Integer uid) {
        MemberCount mc = memberCountRepository.getByUid(uid);
        Member member = memberRepository.findByUid(uid);
        Map<String,String> t = summary(uid);
        mc.setCreditFormulaExp(t.get("creditFormulaExp"));
        mc.setCredits(member.getCredits());
        JsonResult jr = new JsonResult();
        jr.attr("credits",mc);
        jr.adMap(t);
        return jr;
    }
}
