package com.lanchong.controller;

import com.lanchong.base.AccessLimitService;
import com.lanchong.mobile.entity.AttachmentFavor;
import com.lanchong.mobile.entity.AttachmentInfo;
import com.lanchong.mobile.entity.AttachmentPost;
import com.lanchong.mobile.mapper.AttachmentFavorMapper;
import com.lanchong.mobile.mapper.AttachmentInfoMapper;
import com.lanchong.mobile.mapper.AttachmentPostMapper;
import com.lanchong.mobile.repository.AttachmentFavorRepository;
import com.lanchong.mobile.repository.AttachmentInfoRepository;
import com.lanchong.mobile.repository.AttachmentPostRepository;
import com.lanchong.mobile.service.AttachmentInfoService;
import com.lanchong.ucenter.service.MemberService;
import com.lanchong.util.DateUtils;
import com.lanchong.util.JsonResult;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("attachmentFavor")
@Slf4j
public class AttachmentFavorController {

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
    @Autowired
    AttachmentInfoRepository attachmentInfoRepository;
    @Autowired
    AttachmentPostRepository attachmentPostRepository;
    @Autowired
    AttachmentFavorRepository attachmentFavorRepository;
    @Autowired
    AttachmentPostMapper attachmentPostMapper;
    @Autowired
    AttachmentFavorMapper attachmentFavorMapper;
    @Autowired
    AttachmentInfoMapper attachmentInfoMapper;


    @ApiImplicitParams({
            @ApiImplicitParam(name = "uid", value = "用户编号", paramType = "query",required = true),
            @ApiImplicitParam( name = "pid", value = "帖子编号", paramType = "query",required = true),
            @ApiImplicitParam( name = "pidType", value = "0：帖子；1：跟帖", paramType = "query",required = true)
    })
    @PostMapping("/follow")
    @ApiOperation(value = "帖子点赞", notes = "帖子点赞")
    public String follow(Long uid, Long pid, Integer pidType) {
        //Member userInfo = CookieUtils.getUserIfo(true);
        memberService.existMember(uid.intValue());
        AttachmentFavor af = new AttachmentFavor();
        if(pidType == 0){
            AttachmentInfo ai = attachmentInfoRepository.findById(pid).orElse(null);
            if(null == ai){
                return  new JsonResult(false,"该帖子不存在！").toJson();
            }
        }else{
            AttachmentPost ap = attachmentPostRepository.findById(pid).orElse(null);
            if(null == ap){
                return new JsonResult(false,"该回帖不存在！").toJson();
            }
        }
        af.setPid(pid.intValue());
        af.setUserId(uid.intValue());
        af.setPidType(pidType);
        af.setCreateTime(DateUtils.dayTime());
        attachmentFavorMapper.insertSelective(af);
        //返回帖子的点赞数
        Long favors = attachmentFavorMapper.getFavorCount(pid,pidType);
        JsonResult jr = new JsonResult();
        jr.attr("pid",pid);
        jr.attr("favors",favors);
        return jr.toJson();
    }

    @ApiImplicitParams({
            @ApiImplicitParam(name = "uid", value = "用户编号", paramType = "query",required = true),
            @ApiImplicitParam( name = "pid", value = "帖子编号", paramType = "query",required = true),
            @ApiImplicitParam( name = "pidType", value = "0：帖子；1：跟帖", paramType = "query",required = true)
    })
    @PostMapping("/follow")
    @ApiOperation(value = "帖子取消点赞", notes = "帖子取消点赞")
    public String unFlollow(Long uid, Long pid, Integer pidType) {
        //Member userInfo = CookieUtils.getUserIfo(true);
        memberService.existMember(uid.intValue());
        if(pidType == 0){
            AttachmentInfo ai = attachmentInfoRepository.findById(pid).orElse(null);
            if(null == ai){
                return  new JsonResult(false,"该帖子不存在！").toJson();
            }
        }else{
            AttachmentPost ap = attachmentPostRepository.findById(pid).orElse(null);
            if(null == ap){
                return new JsonResult(false,"该回帖不存在！").toJson();
            }
        }
        attachmentFavorMapper.deleteFavor(pid,pidType,uid);
        //返回帖子的点赞数
        Long favors = attachmentFavorMapper.getFavorCount(pid,pidType);
        JsonResult jr = new JsonResult();
        jr.attr("pid",pid);
        jr.attr("favors",favors);
        return jr.toJson();
    }
}
