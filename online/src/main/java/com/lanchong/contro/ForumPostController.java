package com.lanchong.contro;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.lanchong.base.FileUtils;
import com.lanchong.common.CookieUtils;
import com.lanchong.common.entity.Member;
import com.lanchong.forum.entity.Forum;
import com.lanchong.forum.entity.Post;
import com.lanchong.forum.entity.Thread0;
import com.lanchong.forum.service.PostService;
import com.lanchong.home.entity.Favorite;
import com.lanchong.ucenter.service.AttachmentService;
import com.lanchong.ucenter.service.MemberService;
import com.lanchong.util.JsonResult;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

@RestController
@RequestMapping("post")
@Slf4j
public class ForumPostController {

    @Autowired
    PostService postService;
    @Value("${attachment.forum.dir}")
    String attachmentDir;
    @Value("${discuz.dir}")
    String discuzDir;
    @Autowired
    AttachmentService attachmentService;
    @Autowired
    MemberService memberService;

    @GetMapping("myThread")
    @ApiOperation(value = "我的帖子", notes = "我的帖子",response = Post.class)
    @ApiImplicitParams({ @ApiImplicitParam(defaultValue = "0", name = "page", value = "页数", paramType = "query"),
            @ApiImplicitParam(defaultValue = "10", name = "pageSize", value = "页面大小", paramType = "query")})
    public String myThread(@RequestParam(defaultValue = "1")int page, @RequestParam(defaultValue = "10")int pageSize){
        Member userInfo = CookieUtils.getUserIfo(true);
        Page pageInfo = postService.getThreadByUid(userInfo.getUid(),page-1,pageSize);
        JsonResult jr = new JsonResult();
        jr.setTotalCount(pageInfo.getTotalElements());
        jr.setList(pageInfo.getContent());
        return jr.toJson();
    }


    @GetMapping("posts")
    @ApiOperation(value = "帖子回帖", notes = "帖子回帖",response = Post.class)
    @ApiImplicitParams({ @ApiImplicitParam(defaultValue = "1", name = "page", value = "页数", paramType = "query"),
            @ApiImplicitParam( name = "tid", value = "帖子编号", paramType = "query"),
            @ApiImplicitParam(defaultValue = "10", name = "pageSize", value = "页面大小", paramType = "query")})
    public String myPost(int page, int pageSize,Integer tid){
        Member userInfo = CookieUtils.getUserIfo(true);
        Page<Post> pageInfo = postService.getPostByTid(tid,page-1,pageSize);
        JsonResult jr = new JsonResult();
        jr.setTotalCount(pageInfo.getTotalElements());
        jr.setList(pageInfo.getContent());
        return jr.toJson();
    }


    @GetMapping("{tid}")
    @ApiOperation(value = "帖子详情", notes = "帖子详情",response = Thread0.class)
    @ApiImplicitParam(name = "tid", value = "帖子编号", paramType = "path",dataType = "Integer")
    public String postDetail(@PathVariable Integer tid){
        Member userInfo = CookieUtils.getUserIfo(false);
        Thread0 thread = postService.getByTid(tid,userInfo);
        JsonResult jr = new JsonResult();
        jr.attr("thread",thread);
        return jr.toJson();
    }

    @GetMapping("favorThread")
    @ApiOperation(value = "我收藏的帖子", notes = "我收藏的帖子",response = Favorite.class)
    @ApiImplicitParams({ @ApiImplicitParam(defaultValue = "0", name = "page", value = "页数", paramType = "query"),
            @ApiImplicitParam(defaultValue = "10", name = "pageSize", value = "页面大小", paramType = "query")})
    public String myFavorite(@RequestParam(defaultValue = "1")int page, @RequestParam(defaultValue = "10")int pageSize){
        Member userInfo = CookieUtils.getUserIfo(true);
        Page pageInfo = postService.getFavoriteByUid(userInfo,page-1,pageSize);
        JsonResult jr = new JsonResult();
        jr.setTotalCount(pageInfo.getTotalElements());
        jr.setList(pageInfo.getContent());
        return jr.toJson();
    }

    @PostMapping("favorThread")
    @ApiOperation(value = "收藏帖子", notes = "收藏帖子")
    public String favorThread(int tid){
        Member userInfo = CookieUtils.getUserIfo(true);
        postService.setFavorThread(userInfo,tid);
        JsonResult jr = new JsonResult();
        return jr.toJson();
    }

    @PostMapping("unfavorThread")
    @ApiOperation(value = "取消收藏帖子", notes = "取消收藏帖子")
    public String unfavorThread(int tid){
        Member userInfo = CookieUtils.getUserIfo(true);
        postService.unFavorThread(userInfo,tid);
        JsonResult jr = new JsonResult();
        return jr.toJson();
    }

    @PostMapping("favorForum")
    @ApiOperation(value = "关注小板块", notes = "关注小板块")
    public String favorForum(int fid){
        Member userInfo = CookieUtils.getUserIfo(true);
        postService.setFavorForum(userInfo,fid);
        JsonResult jr = new JsonResult();
        return jr.toJson();
    }

    @PostMapping("unfavorForum")
    @ApiOperation(value = "取消关注小板块", notes = "取消关注小板块")
    public String unFavorForum(int fid){
        Member userInfo = CookieUtils.getUserIfo(true);
        postService.unFavorForum(userInfo,fid);
        JsonResult jr = new JsonResult();
        return jr.toJson();
    }


    @GetMapping("favorForum")
    @ApiOperation(value = "我收藏的板块", notes = "我收藏的板块",response = Favorite.class)
    @ApiImplicitParams({ @ApiImplicitParam(defaultValue = "0", name = "page", value = "页数", paramType = "query"),
            @ApiImplicitParam(defaultValue = "10", name = "pageSize", value = "页面大小", paramType = "query")})
    public String myFavorForum(@RequestParam(defaultValue = "1")int page, @RequestParam(defaultValue = "10")int pageSize){
        Member userInfo = CookieUtils.getUserIfo(true);
        Page pageInfo = postService.getFavorforumByUid(userInfo,page-1,pageSize);
        JsonResult jr = new JsonResult();
        jr.setTotalCount(pageInfo.getTotalElements());
        jr.setList(pageInfo.getContent());
        return jr.toJson();
    }

    @GetMapping("forms")
    @ApiOperation(value = "获取所有板块", notes = "获取所有板块",response = Forum.class)
    public String forums(){
        Member userInfo = CookieUtils.getUserIfo(true);
        JsonResult jr = new JsonResult();
        jr.setList(postService.listForums(userInfo.getUid()));
        return jr.toJson();
    }


    @PostMapping("/thread")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "fid", value = "帖子所属板块", paramType = "query",required = true),
            @ApiImplicitParam(name = "subject", value = "主题", paramType = "query",required = true),
            @ApiImplicitParam(name = "message", value = "内容", paramType = "query",required = true),
            @ApiImplicitParam( name = "readaccess", value = "阅读权限", paramType = "query",defaultValue = "0"),
            @ApiImplicitParam(name = "price", value = "价格", paramType = "query",defaultValue = "0"),
    })
    @ApiOperation(value = "发表帖子", notes = "发表帖子")
    public String submitThread(Integer fid,String subject,String message,Integer readaccess,Short price,@RequestParam("files") MultipartFile[] files){
        Member userInfo = CookieUtils.getUserIfo(true);
        Table<String,Long,String> table = HashBasedTable.create();
        Integer attach = 0;
        if(null != files && files.length > 0){
            String dateStr = new DateTime().toString("yyyyMM/dd/");
            attach = 2;
            for(MultipartFile file : files){
                String fileName = file.getOriginalFilename();
                String attachmentUrl = dateStr + RandomStringUtils.randomAlphanumeric(16)+fileName.substring(fileName.lastIndexOf("."));
                try {

                    FileUtils.saveAsFile(file.getBytes(),discuzDir + attachmentDir + attachmentUrl);
                } catch (Exception e) {
                    return  new JsonResult(false,"附件上传失败！").toJson();
                }
                table.put(fileName,file.getSize(),attachmentUrl);
            }
        }
        postService.postThread(userInfo,fid,subject,message,readaccess,price,table,attach);
        files = null;
        return new JsonResult<>().toJson();
    }



    @PostMapping("/submitPost")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "fid", value = "帖子所属板块", paramType = "query",required = true),
            @ApiImplicitParam(name = "tid", value = "帖子编号", paramType = "query",required = true),
            @ApiImplicitParam(name = "uid", value = "回帖人", paramType = "query",required = true),
            @ApiImplicitParam(name = "pid", value = "回帖编号（如果传回帖编号，表示在帖子回帖上 进行回帖）", paramType = "query"),
            @ApiImplicitParam(name = "message", value = "内容", paramType = "query",required = true),
            @ApiImplicitParam( name = "imgUrl", value = "图片地址", paramType = "query",defaultValue = "")
    })
    @ApiOperation(value = "发表回复", notes = "发表回复")
    public String submitThread(Integer fid,String message,Integer tid,String imgUrl,Integer uid,Integer pid){
        postService.submitPost(fid,message,imgUrl,tid,uid,pid);
        return new JsonResult<>().toJson();
    }



    @ApiImplicitParams({
            @ApiImplicitParam(name = "tid", value = "帖子编号", paramType = "query",required = true),
            @ApiImplicitParam(name = "uid", value = "用户编号", paramType = "query",required = true),
            @ApiImplicitParam(defaultValue = "0", name = "readaccess", value = "阅读权限", paramType = "query"),
            @ApiImplicitParam(defaultValue = "1", name = "isImage", value = "是否图片（1为图片，-1为附件）", paramType = "query"),
            @ApiImplicitParam(defaultValue = "", name = "desc", value = "描述信息", paramType = "query"),
            @ApiImplicitParam(defaultValue = "0", name = "price", value = "价格", paramType = "query"),
    })
    @PostMapping("/upload")
    @ApiOperation(value = "上传图片或者附件", notes = "上传图片或者附件")
    public String upload(Integer pid,@RequestParam("file") MultipartFile file,Integer uid,Integer readaccess,Integer isImage, Integer tid,String desc,Short price) {
        //Member userInfo = CookieUtils.getUserIfo(true);
        memberService.existMember(uid);
        String dateStr = new DateTime().toString("yyyy/MM/dd");
        if (null != file) {
            //取得当前上传文件的文件名称
            String fileName = file.getOriginalFilename();
            //如果名称不为“”,说明该文件存在，否则说明该文件不存在
            //本地上传图片方式
            String attachmentUrl = dateStr + RandomStringUtils.random(16);
            File newFile = new File(discuzDir + attachmentDir +attachmentUrl);
            try {
                file.transferTo(newFile);
            } catch (Exception e) {
               return  new JsonResult(false,"附件上传失败！").toJson();
            }
            attachmentService.uploadAttachment(uid,tid,pid,fileName,readaccess,isImage,desc,price,(int)file.getSize(),attachmentUrl);
        }
        return new JsonResult().toJson();
    }
}
