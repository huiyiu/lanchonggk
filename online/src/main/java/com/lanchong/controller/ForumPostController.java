package com.lanchong.controller;

import com.lanchong.common.CookieUtils;
import com.lanchong.common.UserInfo;
import com.lanchong.exception.Assert;
import com.lanchong.forum.entity.Post;
import com.lanchong.forum.service.PostService;
import com.lanchong.util.JsonResult;
import com.lanchong.util.StringUtil;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Action;

@RestController
@RequestMapping("post")
public class ForumPostController {

    @Autowired
    PostService postService;

    @GetMapping
    @ApiOperation(value = "我的帖子", notes = "我的帖子")
    @ApiImplicitParams({ @ApiImplicitParam(defaultValue = "0", name = "page", value = "页数", paramType = "query"),
            @ApiImplicitParam(defaultValue = "10", name = "pageSize", value = "页面大小", paramType = "query")})
    public String phoneCheck(@RequestParam(defaultValue = "1")int page, @RequestParam(defaultValue = "10")int pageSize){
        UserInfo userInfo = CookieUtils.getUserIfo(true);
        Page pageInfo = postService.getByUid(userInfo.getUid(),page,pageSize);
        JsonResult jr = new JsonResult();
        jr.setTotalCount(pageInfo.getTotalElements());
        jr.setList(pageInfo.getContent());
        return jr.toJson();
    }

}
