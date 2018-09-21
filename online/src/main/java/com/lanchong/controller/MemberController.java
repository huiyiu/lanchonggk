package com.lanchong.controller;

import com.lanchong.base.AvatarUtils;
import com.lanchong.base.FileUtils;
import com.lanchong.common.Common;
import com.lanchong.common.CookieUtils;
import com.lanchong.common.entity.Member;
import com.lanchong.common.repository.MemberFieldForumRepository;
import com.lanchong.common.service.CreditService;
import com.lanchong.exception.Assert;
import com.lanchong.home.service.FriendService;
import com.lanchong.ucenter.service.MemberService;
import com.lanchong.util.JsonResult;
import com.lanchong.util.StringUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("member")
@Slf4j
public class MemberController{

    @Autowired
    MemberService memberService;
    @Autowired
    CreditService creditService;
    @Autowired
    FriendService friendService;
    @Autowired
    MemberFieldForumRepository memberFieldForumRepository;
    @Value("${discuz.dir}")
    String discuzDir;

    @PostMapping("signUp")
    @ApiOperation(value = "注册", notes = "注册")
    public String register(HttpServletRequest request,String phone, String pwd) {
        Assert.isTrue(StringUtil.isTelephone(phone),"请检查手机号码格式");
        Assert.notTrue(memberService.isSignedIn(phone),"该手机号码已经注册！");
        memberService.addMember(phone,pwd,Common.getIpAddr(request));
        return new JsonResult().toJson();
    }

    @PostMapping("login")
    @ApiOperation(value = "登陆(17011112222,admin)", notes = "登陆")
    public String login(HttpServletRequest request,HttpServletResponse response,String phone, String pwd) {
        Assert.isTrue(StringUtil.isTelephone(phone),"请检查手机号码格式");
        Member userInfo = memberService.login(phone,pwd);
        JsonResult jr = new JsonResult();
        jr.adMap(CookieUtils.markLogin(request,response,userInfo));
        return jr.toJson();
    }

    @PostMapping("logout")
    @ApiOperation(value = "登出", notes = "登出")
    public String logout(HttpServletRequest request,HttpServletResponse response) {
        CookieUtils.markLogout(request,response);
        return new JsonResult().toJson();
    }

    @GetMapping
    @ApiOperation(value = "获取用户信息", notes = "获取用户信息")
    public String getUserInfo(){
        Member userInfo = CookieUtils.getUserIfo(true);
        JsonResult jr = new JsonResult();
        jr.attr("member",memberService.getMember(userInfo.getUid()));
        return jr.toJson();
    }

    @PostMapping("/avatar")
    @ApiImplicitParam(name = "file", value = "头像", paramType = "query",required = true)
    @ApiOperation(value = "修改头像", notes = "修改头像")
    public String submitThread(@RequestParam("file") MultipartFile file){
        Member userInfo = CookieUtils.getUserIfo(true);
        if(null != file){
            try {
                FileUtils.saveAsFile(file.getBytes(), discuzDir+AvatarUtils.getAvatarDir(userInfo.getUid(),true));
            } catch (Exception e) {
                log.warn(userInfo.getUsername()+"头像上传失败!");
                return  new JsonResult(false,"头像上传失败！").toJson();
            }
        }
        memberService.setAvatar(userInfo);
        JsonResult jr = new JsonResult();
        jr.attr("avatarUrl",AvatarUtils.getAvatarDir(userInfo.getUid(),true));
        return jr.toJson();
    }



    @GetMapping("follow")
    @ApiImplicitParam( name = "好友的用户编号", value = "fuid", paramType = "query")
    @ApiOperation(value = "关注好友", notes = "关注好友")
    public String follows(Integer fuid){
        Member userInfo = CookieUtils.getUserIfo(true);
        friendService.follow(userInfo,fuid);
        return new JsonResult(true,"").toJson();
    }

    @GetMapping("unfollow")
    @ApiImplicitParam( name = "好友的用户编号", value = "fuid", paramType = "query")
    @ApiOperation(value = "取消关注好友", notes = "取消关注好友")
    public String unfollow(Integer fuid){
        Member userInfo = CookieUtils.getUserIfo(true);
        friendService.unfollow(userInfo,fuid);
        return new JsonResult(true,"").toJson();
    }


    @GetMapping("phoneIsSign")
    @ApiOperation(value = "手机号是否注册", notes = "手机号是否注册")
    public String phoneCheck(String phone){
        Assert.isTrue(StringUtil.isTelephone(phone),"请检查手机号码格式");
        boolean isSign =  memberService.isSignedIn(phone);
        return new JsonResult(isSign,"").toJson();
    }


    @PostMapping("nameIsSign")
    @ApiOperation(value = "用户名是否注册", notes = "用户名是否注册")
    public String userNameCheck(String username){
        Assert.isTrue(username.trim().length() >=3 && username.trim().length() <= 15,"用户名由3到15个字符组成！");
        boolean isSign =  memberService.userNameSignedIn(username);
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

    @GetMapping("credits")
    @ApiOperation(value = "我的积分", notes = "我的积分")
    public String myIntegral(){
        Member userInfo = CookieUtils.getUserIfo(true);
        return creditService.getCredits(userInfo.getUid()).toJson();
    }

    @PostMapping("sightml")
    @ApiOperation(value = "修改签名", notes = "修改签名")
    public String sightml(String sign){
        Member userInfo = CookieUtils.getUserIfo(true);
        memberService.setSignhtml(userInfo.getUid(),sign);
        return new JsonResult().toJson();
    }


    /**
     * 获取我的好友
     * @param page
     * @param pageSize
     * @return
     */
    @GetMapping("friends")
    @ApiImplicitParams({ @ApiImplicitParam(defaultValue = "0", name = "page", value = "页数", paramType = "query"),
            @ApiImplicitParam(defaultValue = "10", name = "pageSize", value = "页面大小", paramType = "query")})
    @ApiOperation(value = "我的好友", notes = "我的好友")
    public String myFriend(int page,int pageSize){
        Member userInfo = CookieUtils.getUserIfo(true);
        JsonResult jr = new JsonResult();
        jr.setList(friendService.ofMine(userInfo,page,pageSize));
        return jr.toJson();
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