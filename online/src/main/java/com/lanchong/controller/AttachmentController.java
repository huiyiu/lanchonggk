package com.lanchong.controller;

import com.github.pagehelper.PageInfo;
import com.lanchong.common.CookieUtils;
import com.lanchong.common.entity.Member;
import com.lanchong.mobile.entity.AttachmentInfo;
import com.lanchong.mobile.service.AttachmentInfoService;
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
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.stream.Collectors;

@RestController
@RequestMapping("attachment")
@Slf4j
public class AttachmentController {

    @Autowired
    MemberService memberService;
    @Autowired
    AttachmentInfoService attachmentInfoService;
    @Value("${discuz.dir}")
    String discuzDir;
    @Value("${attachment.forum.dir}")
    String attachmentDir;

    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "附件名称", paramType = "query",required = true),
            @ApiImplicitParam(name = "uid", value = "用户编号", paramType = "query",required = true),
            @ApiImplicitParam(defaultValue = "0", name = "readaccess", value = "阅读权限", paramType = "query"),
            @ApiImplicitParam(defaultValue = "", name = "marks", value = "附件标签，以','分隔", paramType = "query"),
            @ApiImplicitParam(defaultValue = "", name = "descs", value = "描述信息", paramType = "query"),
            @ApiImplicitParam(defaultValue = "0", name = "price", value = "价格", paramType = "query"),
    })
    @PostMapping("/upload")
    @ApiOperation(value = "上传图片或者附件", notes = "上传图片或者附件")
    public String upload(@RequestParam("file") MultipartFile file, String uid, Integer readaccess, String name, String marks, String descs, Short price) {
        //Member userInfo = CookieUtils.getUserIfo(true);
        memberService.existMember(Integer.parseInt(uid));
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
            attachmentInfoService.save(uid,filepath+fileNameNew,fileNameNew,name,descs,marks);
        }
        return new JsonResult().toJson();
    }

    /**
     * 搜索视频
     * @param page
     * @param pageSize
     * @return
     */
    @GetMapping("search")
    @ApiImplicitParams({
            @ApiImplicitParam(defaultValue = "", name = "keyWords", value = "关注字", paramType = "query"),
            @ApiImplicitParam(defaultValue = "1", name = "page", value = "页数", paramType = "query"),
            @ApiImplicitParam(defaultValue = "10", name = "pageSize", value = "页面大小", paramType = "query")})
    @ApiOperation(value = "搜索视频", notes = "搜索视频")
    public String search(String keyWords,@RequestParam(defaultValue = "1")Integer page,@RequestParam(defaultValue = "10")Integer pageSize){

        JsonResult jr = new JsonResult();
        PageInfo<AttachmentInfo> pages= attachmentInfoService.search(keyWords,page,pageSize);
        jr.setList(pages.getList().stream().map(attach->{
            String path = attachmentDir+attach.getPathUrl();
            attach.setPathUrl(path);
            return attach;
        }).collect(Collectors.toList()));
        jr.setTotalCount(pages.getTotal());
        return jr.toJson();
    }
}
