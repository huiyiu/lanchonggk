package com.lanchong.controller;

import com.lanchong.common.Common;
import com.lanchong.common.CookieUtils;
import com.lanchong.common.repository.MemberProfileRepository;
import com.lanchong.exception.Assert;
import com.lanchong.ucenter.entity.Members;
import com.lanchong.ucenter.service.MemberService;
import com.lanchong.util.JsonResult;
import com.lanchong.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("member")
public class MemberController {

    //@Autowired
    //MemberProfileRepository memberProfileRepository;、
    @Autowired
    MemberService memberService;


    @PostMapping("signUp")
    public String register(HttpServletRequest request,String phone, String pwd) {
        Assert.isTrue(StringUtil.isTelephone(phone),"请检查手机号码格式");
        Assert.notTrue(memberService.isSignedIn(phone),"该手机号码已经注册！");
        memberService.addMember(phone,pwd,Common.getIpAddr(request));
        return new JsonResult().toJson();
    }


    @PostMapping("login")
    public String login(HttpServletRequest request,HttpServletResponse response,String phone, String pwd) {
        Assert.isTrue(StringUtil.isTelephone(phone),"请检查手机号码格式");
        Members members = memberService.login(phone,pwd);
        CookieUtils.markLogin(request,response,members);
        return new JsonResult().toJson();
    }




    @GetMapping("phoneIsSign")
    public String phoneCheck(String phone){
        Assert.isTrue(StringUtil.isTelephone(phone),"请检查手机号码格式");
        boolean isSign =  memberService.isSignedIn(phone);
        return new JsonResult(isSign,"").toJson();
    }


}
