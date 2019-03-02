package com.lanchong.controller;

import com.lanchong.base.AccessLimitService;
import com.lanchong.common.entity.Member;
import com.lanchong.mobile.mapper.AttachmentFavorMapper;
import com.lanchong.mobile.mapper.AttachmentPostMapper;
import com.lanchong.mobile.service.AttachmentInfoService;
import com.lanchong.ucenter.service.MemberService;
import com.lanchong.util.JsonResult;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("pub")
@Slf4j
public class PubController {
    @Autowired
    MemberService memberService;
    @Autowired
    AttachmentInfoService attachmentInfoService;
    @Autowired
    AccessLimitService accessLimitService;
    @Value("${discuz.dir}")
    String discuzDir;
    @Value("${attachment.doc.dir}")
    String docDir;
    @Value("${attachment.video.dir}")
    String myvideoDir;
    @Value("${attachment.image.dir}")
    String imageDir;
    @Value("${attachment.pai.dir}")
    String paiDir;
    @Autowired
    AttachmentPostMapper attachmentPostMapper;
    @Autowired
    AttachmentFavorMapper attachmentFavorMapper;


    @ApiImplicitParams({
            @ApiImplicitParam(name = "subject", value = "标题", paramType = "query",required = true),
            @ApiImplicitParam(name = "name", value = "文档(视频)名称", paramType = "query",required = true),
            @ApiImplicitParam(name = "uid", value = "用户编号", paramType = "query",required = true),
            @ApiImplicitParam(name = "aType", value = "发布类型(0：秒拍，1：文档，2：视频，3：图片)", paramType = "query",required = true),
            @ApiImplicitParam(defaultValue = "", name = "marks", value = "附件标签，以','分隔", paramType = "query"),
            @ApiImplicitParam(defaultValue = "", name = "descs", value = "描述信息", paramType = "query"),
            @ApiImplicitParam(name = "content", value = "内容", paramType = "query")
    })
    @PostMapping("/submit")
    @ApiOperation(value = "发布文档、秒拍、视频", notes = "发布文档、秒拍、视频")
    public String upload(@RequestParam("file") MultipartFile file, Long uid, String subject, String content, String marks, String descs, String name,Integer aType) {
        //Member userInfo = CookieUtils.getUserIfo(true);
        Member m = memberService.existMember(uid.intValue());
        if(1== aType || 2 == aType){
            memberService.adminGroup(uid);
        }
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
            String filepath = discuzDir + attachmentInfoService.genFilePath(aType) ;
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
            //String relativePath = genFilePath(aType) + fileNameNew;
            //todo
            attachmentInfoService.save(uid,fileNameNew,name,subject,content,descs,marks,aType);
        }
        return new JsonResult().toJson();
    }


    @ApiImplicitParams({
            @ApiImplicitParam(name = "subject", value = "标题", paramType = "query",required = true),
            @ApiImplicitParam(name = "name", value = "文档(视频)名称", paramType = "query"),
            @ApiImplicitParam(name = "uid", value = "用户编号", paramType = "query",required = true),
           /* @ApiImplicitParam(name = "aType", value = "发布类型( 3：图片)", paramType = "query",required = true),*/
            @ApiImplicitParam(defaultValue = "", name = "marks", value = "附件标签，以','分隔", paramType = "query"),
            @ApiImplicitParam(defaultValue = "", name = "descs", value = "描述信息", paramType = "query"),
            @ApiImplicitParam(name = "content", value = "内容", paramType = "query")
    })
    @PostMapping("/image")
    @ApiOperation(value = "发布图片", notes = "发布图片")
    public String uploadPictures(@RequestParam("files") MultipartFile[] files, Long uid, String subject, String content, String marks, String descs, String name) {
        //Member userInfo = CookieUtils.getUserIfo(true);
        memberService.existMember(uid.intValue());

        if (null != files && files.length > 0 ) {
            //取得当前上传文件的文件名称
            List<String> pictures = new ArrayList<>();
            for(int i = 0;i< files.length ; i++){
                MultipartFile file = files[i];
                String fileName = file.getOriginalFilename();
                String ext = "";
                if(-1 != fileName.lastIndexOf(".")){
                    ext = fileName.substring(fileName.lastIndexOf("."));
                }
                //如果名称不为“”,说明该文件存在，否则说明该文件不存在
                //本地上传图片方式
                String fileNameNew = RandomStringUtils.randomAlphanumeric(16) + ext;
                String filepath = discuzDir + imageDir ;
                File newFile = new File(new File(filepath).getAbsolutePath(),fileNameNew);
                try {
                    if (!newFile.getParentFile().exists()){
                        newFile.getParentFile().mkdirs();
                    }
                    file.transferTo(newFile);
                    pictures.add(fileNameNew);
                } catch (Exception e) {
                    log.error("文件上传失败："+e.getMessage());
                    return  new JsonResult(false,"附件上传失败！").toJson();
                }
                //todo
                attachmentInfoService.save(uid, String.join(",", pictures),name,subject,content,descs,marks,3);
            }
        }
        return new JsonResult().toJson();
    }

}
