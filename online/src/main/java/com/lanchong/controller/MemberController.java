package com.lanchong.controller;

import com.lanchong.common.Common;
import com.lanchong.common.CookieUtils;
import com.lanchong.common.UserInfo;
import com.lanchong.exception.Assert;
import com.lanchong.ucenter.entity.Members;
import com.lanchong.ucenter.service.MemberService;
import com.lanchong.util.JsonResult;
import com.lanchong.util.StringUtil;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("member")
public class MemberController {

    @Autowired
    MemberService memberService;

    @PostMapping("signUp")
    @ApiOperation(value = "注册", notes = "注册")
    public String register(HttpServletRequest request,String phone, String pwd) {
        Assert.isTrue(StringUtil.isTelephone(phone),"请检查手机号码格式");
        Assert.notTrue(memberService.isSignedIn(phone),"该手机号码已经注册！");
        memberService.addMember(phone,pwd,Common.getIpAddr(request));
        return new JsonResult().toJson();
    }


    @PostMapping("login")
    @ApiOperation(value = "登陆", notes = "登陆")
    public String login(HttpServletRequest request,HttpServletResponse response,String phone, String pwd) {
        Assert.isTrue(StringUtil.isTelephone(phone),"请检查手机号码格式");
        Members members = memberService.login(phone,pwd);
        JsonResult jr = new JsonResult();
        jr.adMap(CookieUtils.markLogin(request,response,new UserInfo(members.getUid(),phone)));
        return jr.toJson();
    }


    @GetMapping
    @ApiOperation(value = "获取用户信息", notes = "获取用户信息")
    public String getUserInfo(){
        UserInfo userInfo = CookieUtils.getUserIfo(true);
        JsonResult jr = new JsonResult();
        jr.attr("member",memberService.getMember(userInfo.getUid()));
        return jr.toJson();
    }




    @GetMapping("phoneIsSign")
    @ApiOperation(value = "手机号是否注册", notes = "手机号是否注册")
    public String phoneCheck(String phone){
        Assert.isTrue(StringUtil.isTelephone(phone),"请检查手机号码格式");
        boolean isSign =  memberService.isSignedIn(phone);
        return new JsonResult(isSign,"").toJson();
    }

    /**
     * 检查图形验证是否正确
     * @param verifyCode
     * @return
     */
    @GetMapping("check")
    @ApiOperation(value = "图形验证码校验", notes = "图形验证码校验")
    public String verifyCodeCheck(String verifyCode){
        return new JsonResult(checkVerifyCode(verifyCode),"").toJson();
    }

    /**
     * 检查图形验证码
     * @param verifyCode
     * @return
     */
    public static boolean checkVerifyCode(String verifyCode){
        String verifyCodeTmp =  CookieUtils.get().get("vc");
        return !StringUtil.isEmpty(verifyCodeTmp) && DigestUtils.md5Hex(DigestUtils.md5Hex(verifyCode)+"TH").equalsIgnoreCase(verifyCodeTmp);
    }

}