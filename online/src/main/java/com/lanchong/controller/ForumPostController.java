package com.lanchong.controller;

import com.lanchong.common.CookieUtils;
import com.lanchong.common.entity.Member;
import com.lanchong.cons.UserInfo;
import com.lanchong.forum.entity.Post;
import com.lanchong.forum.service.PostService;
import com.lanchong.util.JsonResult;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("post")
public class ForumPostController {

    @Autowired
    PostService postService;

    @GetMapping
    @ApiOperation(value = "我的帖子", notes = "我的帖子",response = Post.class)
    @ApiImplicitParams({ @ApiImplicitParam(defaultValue = "0", name = "page", value = "页数", paramType = "query"),
            @ApiImplicitParam(defaultValue = "10", name = "pageSize", value = "页面大小", paramType = "query")})
    public String myPost(@RequestParam(defaultValue = "1")int page, @RequestParam(defaultValue = "10")int pageSize){
        Member userInfo = CookieUtils.getUserIfo(true);
        Page pageInfo = postService.getByUid(userInfo.getUid(),page,pageSize);
        JsonResult jr = new JsonResult();
        jr.setTotalCount(pageInfo.getTotalElements());
        jr.setList(pageInfo.getContent());
        return jr.toJson();
    }


    @GetMapping("{pid}")
    @ApiOperation(value = "帖子详情", notes = "帖子详情",response = Post.class)
    @ApiImplicitParam(name = "pid", value = "帖子编号", paramType = "path",dataType = "Integer")
    public String postDetail(@PathVariable Integer pid){
        Member userInfo = CookieUtils.getUserIfo(false);
        Post post = postService.getByPid(pid,userInfo);
        JsonResult jr = new JsonResult();
        jr.attr("post",post);
        return jr.toJson();
    }

    @GetMapping("favor")
    @ApiOperation(value = "我的收藏", notes = "我的收藏",response = Post.class)
    @ApiImplicitParams({ @ApiImplicitParam(defaultValue = "0", name = "page", value = "页数", paramType = "query"),
            @ApiImplicitParam(defaultValue = "10", name = "pageSize", value = "页面大小", paramType = "query")})
    public String myFavorite(@RequestParam(defaultValue = "1")int page, @RequestParam(defaultValue = "10")int pageSize){
        Member userInfo = CookieUtils.getUserIfo(true);
        Page pageInfo = postService.getFavoriteByUid(userInfo.getUid(),page,pageSize);
        JsonResult jr = new JsonResult();
        jr.setTotalCount(pageInfo.getTotalElements());
        jr.setList(pageInfo.getContent());
        return jr.toJson();
    }

}
