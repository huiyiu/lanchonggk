package com.lanchong.controller;

import com.lanchong.common.CookieUtils;
import com.lanchong.common.UserInfo;
import com.lanchong.exception.Assert;
import com.lanchong.forum.service.PostService;
import com.lanchong.util.JsonResult;
import com.lanchong.util.StringUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Action;

@RestController
@RequestMapping("post")
public class ForumPostController {

    @Autowired
    PostService postService;

    @GetMapping
    @ApiOperation(value = "我的帖子", notes = "我的帖子")
    public String phoneCheck(){
        UserInfo userInfo = CookieUtils.getUserIfo(true);
        postService.getByUid(userInfo.getUid());
        return new JsonResult().toJson();
    }

}
