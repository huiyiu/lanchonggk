package com.lanchong.controller;

import com.github.pagehelper.PageInfo;
import com.lanchong.common.CookieUtils;
import com.lanchong.common.UserInfo;
import com.lanchong.forum.entity.Post;
import com.lanchong.forum.service.PostService;
import com.lanchong.util.JsonResult;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("post")
public class ForumPostController {

    @Autowired
    PostService postService;

    @GetMapping
    @ApiImplicitParams({
            @ApiImplicitParam(defaultValue = "1", name = "page", value = "页数", paramType = "query"),
            @ApiImplicitParam(defaultValue = "100", name = "pageSize", value = "页面大小", paramType = "query")
    })
    @ApiOperation(value = "我的帖子", notes = "我的帖子")
    public String phoneCheck(@RequestParam(value = "page",defaultValue = "1",required = false)int page,
                             @RequestParam(value = "pageSize",defaultValue = "10",required = false)int pageSize){
        UserInfo userInfo = CookieUtils.getUserIfo(true);
        PageInfo<Post> pageInfo = postService.getByUid(userInfo.getUid(),page,pageSize);
        JsonResult jr = new JsonResult();
        jr.setList(pageInfo.getList());
        jr.setTotalCount(pageInfo.getTotal());
        return jr.toJson();
    }

}
