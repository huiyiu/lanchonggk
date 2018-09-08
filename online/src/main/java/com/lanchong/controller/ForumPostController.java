package com.lanchong.controller;

import com.lanchong.common.CookieUtils;
import com.lanchong.common.entity.Member;
import com.lanchong.cons.UserInfo;
import com.lanchong.forum.entity.Post;
import com.lanchong.forum.entity.Thread0;
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

    @GetMapping("myThread")
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


    @GetMapping("{tid}")
    @ApiOperation(value = "帖子详情", notes = "帖子详情",response = Post.class)
    @ApiImplicitParam(name = "tid", value = "帖子编号", paramType = "path",dataType = "Integer")
    public String postDetail(@PathVariable Integer tid){
        Member userInfo = CookieUtils.getUserIfo(false);
        Thread0 thread = postService.getByTid(tid,userInfo);
        JsonResult jr = new JsonResult();
        jr.attr("thread",thread);
        return jr.toJson();
    }

    @GetMapping("favorThread")
    @ApiOperation(value = "我收藏的帖子", notes = "我收藏的帖子",response = Post.class)
    @ApiImplicitParams({ @ApiImplicitParam(defaultValue = "0", name = "page", value = "页数", paramType = "query"),
            @ApiImplicitParam(defaultValue = "10", name = "pageSize", value = "页面大小", paramType = "query")})
    public String myFavorite(@RequestParam(defaultValue = "1")int page, @RequestParam(defaultValue = "10")int pageSize){
        Member userInfo = CookieUtils.getUserIfo(true);
        Page pageInfo = postService.getFavoriteByUid(userInfo,page,pageSize);
        JsonResult jr = new JsonResult();
        jr.setTotalCount(pageInfo.getTotalElements());
        jr.setList(pageInfo.getContent());
        return jr.toJson();
    }


    @GetMapping("favorForum")
    @ApiOperation(value = "我收藏的板块", notes = "我收藏的板块",response = Post.class)
    @ApiImplicitParams({ @ApiImplicitParam(defaultValue = "0", name = "page", value = "页数", paramType = "query"),
            @ApiImplicitParam(defaultValue = "10", name = "pageSize", value = "页面大小", paramType = "query")})
    public String myFavorForum(@RequestParam(defaultValue = "1")int page, @RequestParam(defaultValue = "10")int pageSize){
        Member userInfo = CookieUtils.getUserIfo(true);
        Page pageInfo = postService.getFavorforumByUid(userInfo,page,pageSize);
        JsonResult jr = new JsonResult();
        jr.setTotalCount(pageInfo.getTotalElements());
        jr.setList(pageInfo.getContent());
        return jr.toJson();
    }


}
