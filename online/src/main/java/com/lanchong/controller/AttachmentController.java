package com.lanchong.controller;

import com.github.pagehelper.PageInfo;
import com.lanchong.base.AccessLimitService;
import com.lanchong.mobile.entity.AttachmentFavor;
import com.lanchong.mobile.entity.AttachmentInfo;
import com.lanchong.mobile.entity.AttachmentPost;
import com.lanchong.mobile.mapper.AttachmentFavorMapper;
import com.lanchong.mobile.mapper.AttachmentInfoMapper;
import com.lanchong.mobile.mapper.AttachmentPostMapper;
import com.lanchong.mobile.service.AttachmentInfoService;
import com.lanchong.ucenter.service.MemberService;
import com.lanchong.util.JsonResult;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("attachment")
@Slf4j
public class AttachmentController {

    @Autowired
    MemberService memberService;
    @Autowired
    AttachmentInfoService attachmentInfoService;
    @Autowired
    AccessLimitService accessLimitService;
    @Value("${discuz.dir}")
    String discuzDir;
    @Value("${attachment.forum.dir}")
    String attachmentDir;
    @Value("${filePreview.url}")
    String filePreviewUrl;
    @Value("${discuz.url}")
    String discuzUrl;
    @Autowired
    AttachmentPostMapper attachmentPostMapper;
    @Autowired
    AttachmentFavorMapper attachmentFavorMapper;
    @Autowired
    AttachmentInfoMapper attachmentInfoMapper;

/*
    @ApiImplicitParams({
            @ApiImplicitParam(name = "subject", value = "标题", paramType = "query",required = true),
            @ApiImplicitParam(name = "name", value = "附件名称", paramType = "query"),
            @ApiImplicitParam(name = "uid", value = "用户编号", paramType = "query",required = true),
            @ApiImplicitParam(defaultValue = "", name = "marks", value = "附件标签，以','分隔", paramType = "query"),
            @ApiImplicitParam(defaultValue = "", name = "descs", value = "描述信息", paramType = "query"),
            @ApiImplicitParam(name = "content", value = "内容", paramType = "query",required = true)
    })
    @PostMapping("/upload")
    @ApiOperation(value = "上传图片或者附件", notes = "上传图片或者附件")
    public String upload(@RequestParam("file") MultipartFile file, Long uid, String subject, String content, String marks, String descs, Short price) {
        //Member userInfo = CookieUtils.getUserIfo(true);
        memberService.existMember(uid.intValue());
        String dateStr = new DateTime().toString("yyyyMM/dd");
        if (null != file) {
            //取得当前上传文件的文件名称
            String fileName = file.getOriginalFilename();
            String ext = "";
            if(-1 != fileName.lastIndexOf(".")){
                ext = fileName.substring(fileName.lastIndexOf("."));
            }
            //如果名称不为“”,说明该文件存在，否则说明该文件不存在
            //本地上传图片方式
            String fileNameNew = RandomStringUtils.randomAlphanumeric(16) + ext;
            String filepath = discuzDir + attachmentDir ;
            File newFile = new File(new File(filepath).getAbsolutePath(),fileNameNew);
            try {
                if (!newFile.getParentFile().exists()){
                    newFile.getParentFile().mkdirs();
                }
                file.transferTo(newFile);
            } catch (Exception e) {
                log.error("文件上传失败："+e.getMessage());
                return  new JsonResult(false,"附件上传失败！").toJson();
            }
            //todo
            attachmentInfoService.save(uid,filepath+fileNameNew,fileNameNew,subject,content,descs,marks);
        }
        return new JsonResult().toJson();
    }*/

    /**
     * 搜索（不加关键字获取最新）视频,秒拍，文档，图片
     * @param page
     * @param pageSize
     * @return
     */
    @GetMapping("search")
    @ApiImplicitParams({
            @ApiImplicitParam(defaultValue = "", name = "keyWords", value = "关键字", paramType = "query"),
            @ApiImplicitParam(defaultValue = "1", name = "page", value = "页数", paramType = "query"),
            @ApiImplicitParam(name = "page", value = "aType,文档类型", paramType = "query",required = true),
            @ApiImplicitParam(defaultValue = "10", name = "pageSize", value = "页面大小", paramType = "query")})
    @ApiOperation(value = "搜索视频,秒拍，文档", notes = "搜索视频,秒拍，文档")
    public String search(String keyWords,Integer aType,@RequestParam(defaultValue = "1")Integer page,@RequestParam(defaultValue = "10")Integer pageSize){

        JsonResult jr = new JsonResult();
        PageInfo<AttachmentInfo> pages= attachmentInfoService.search(aType,keyWords,page,pageSize);
        jr.setList(pages.getList().stream().map(attach->{
            /*String path = discuzUrl +attachmentInfoService.genFilePath(attach.getAType())+attach.getPathUrl();
            attach.setPathUrl(path);*/
            attach.setPathUrl(attachmentInfoService.getAccessPath(attach));
            return attach;
        }).collect(Collectors.toList()));
        jr.setTotalCount(pages.getTotal());
        return jr.toJson();
    }

    /**
     * 获取关注用户 的 视频，帖子，文档，图片
     * @param page
     * @param pageSize
     * @return
     */
    @GetMapping("fovors")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "uid", value = "用户编号", paramType = "query",required = true),
            @ApiImplicitParam(defaultValue = "1", name = "page", value = "页数", paramType = "query"),
            @ApiImplicitParam(name = "page", value = "aType,文档类型", paramType = "query",required = true),
            @ApiImplicitParam(defaultValue = "10", name = "pageSize", value = "页面大小", paramType = "query")})
    @ApiOperation(value = "获取关注用户 的 视频，帖子，文档，图片", notes = "获取关注用户 的 视频，帖子，文档，图片")
    public String myFollow(Long uid,Integer aType,@RequestParam(defaultValue = "1")Integer page,@RequestParam(defaultValue = "10")Integer pageSize){
        memberService.existMember(uid.intValue());
        JsonResult jr = new JsonResult();
        PageInfo<AttachmentInfo> pages= attachmentInfoService.getMyFavors(uid,aType,page,pageSize);
        jr.setList(pages.getList().stream().map(attach->{
            /*String path = discuzUrl +attachmentInfoService.genFilePath(attach.getAType())+attach.getPathUrl();
            attach.setPathUrl(path);*/
            attach.setPathUrl(attachmentInfoService.getAccessPath(attach));
            return attach;
        }).collect(Collectors.toList()));
        jr.setTotalCount(pages.getTotal());
        return jr.toJson();
    }


    @GetMapping("detail")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "uid", value = "用户编号", paramType = "query",required = true),
            @ApiImplicitParam(name = "aid", value = "帖子编号", paramType = "query",required = true)
            })
    @ApiOperation(value = "帖子详情", notes = "帖子详情")
    public String detail(Long uid,Long aid){
        JsonResult jr = new JsonResult();
        AttachmentInfo ai = attachmentInfoService.getById(aid);
        if(null != ai){
            attachmentInfoMapper.addViews(aid);
            //当前登陆用户是否已点赞
            List<AttachmentFavor> favors= attachmentFavorMapper.getByPid(aid,0);
            ai.setFavored(favors.stream().anyMatch(af->af.getUserId().equals(uid.intValue())));
            //点赞数
            ai.setFavors(Long.valueOf(favors.size()));
            //评论数
            List<AttachmentPost> aps = attachmentPostMapper.getPosts(aid);
            ai.setComments((Long.valueOf(aps.size())));
            //点击数
            ai.setViews(Optional.ofNullable(ai.getViews()).orElse(0L)+1);
            //分享数 todo
            //ai.setShares();
            ai.setPathUrl(attachmentInfoService.getAccessPath(ai));
        }
        jr.attr("ai",ai);
        return jr.toJson();
    }



    @GetMapping("{id}")
    @ApiImplicitParam(name = "id", value = "文档编号", paramType = "path",required = true)
    @ApiOperation(value = "预览文档", notes = "预览文档，返回docId,在前端解析")
    public String getDoc(@PathVariable  Long id){
        JsonResult jr = new JsonResult();
        AttachmentInfo attachmentInfo = attachmentInfoService.getById(id);
        if(null == attachmentInfo){
            jr.setResultMsg("文档不存在！");
            return jr.toJson();
        }
        if(!attachmentInfoService.idDocument(attachmentInfo)){
            jr.setResultMsg("该文档不支持预览！");
            return jr.toJson();
        }
        //todo
        jr.attr("url",filePreviewUrl + attachmentInfo.getPathUrl());
        return jr.toJson();
    }

   /* @GetMapping("/reward")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "uid", value = "用户编号", paramType = "query",required = true),
            @ApiImplicitParam(name = "aid", value = "帖子编号", paramType = "query",required = true),
            @ApiImplicitParam(defaultValue = "1",name = "rewards", value = "金币数(默认1虫币)", paramType = "query",required = true)
    })
    @ApiOperation(value = "打赏", notes = "打赏")
    public String reward(@PathVariable  Long uid,Long aid,Integer rewards){
        JsonResult jr = new JsonResult();

        return jr.toJson();
    }*/


}
