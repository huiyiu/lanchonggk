package com.lanchong.controller;

import com.github.pagehelper.PageInfo;
import com.lanchong.base.AccessLimitService;
import com.lanchong.base.AvatarUtils;
import com.lanchong.common.entity.Member;
import com.lanchong.mobile.entity.AttachmentFavor;
import com.lanchong.mobile.entity.AttachmentInfo;
import com.lanchong.mobile.entity.AttachmentPost;
import com.lanchong.mobile.mapper.AttachmentFavorMapper;
import com.lanchong.mobile.mapper.AttachmentInfoMapper;
import com.lanchong.mobile.mapper.AttachmentPostMapper;
import com.lanchong.mobile.repository.AttachmentInfoRepository;
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

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("attachmentPost")
@Slf4j
public class AttachmentPostController {

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
    AttachmentPostMapper attachmentPostMapper;
    @Autowired
    AttachmentFavorMapper attachmentFavorMapper;
    @Autowired
    AttachmentInfoMapper attachmentInfoMapper;


    @ApiImplicitParams({
            @ApiImplicitParam(name = "uid", value = "用户编号", paramType = "query",required = true),
            @ApiImplicitParam( name = "aid", value = "帖子编号", paramType = "query",required = true),
            @ApiImplicitParam( name = "message", value = "回帖内容", paramType = "query",required = true)
    })
    @PostMapping("/reply")
    @ApiOperation(value = "回帖", notes = "回帖")
    public String reply(Long uid, Long aid, String message) {
        //Member userInfo = CookieUtils.getUserIfo(true);
        Member m = memberService.existMember(uid.intValue());
        AttachmentInfo ai = attachmentInfoRepository.findById(aid).orElse(null);
        if(null == ai){
            new JsonResult(false,"该附件或视频不存在！");
        }
        AttachmentPost ap = new AttachmentPost();
        ap.setAid(aid);
        ap.setCreateTime(new Date());
        ap.setMessage(message);
        ap.setPosition(attachmentInfoService.getNextPosition(aid));
        ap.setAuthor(m.getUsername());
        ap.setAuthorId(uid);
        attachmentPostMapper.insertSelective(ap);
        /*ai.setCount(ai.getCount()+1);
        attachmentInfoMapper.updateByPrimaryKeySelective(ai);*/
        return new JsonResult().toJson();
    }

    /**
     * 获取回帖列表
     * @param page
     * @param pageSize
     * @return
     */
    @GetMapping("replies")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "uid", value = "用户编号", paramType = "query",required = true),
            @ApiImplicitParam(name = "aid", value = "帖子编号", paramType = "query",required = true),
            @ApiImplicitParam(defaultValue = "1", name = "page", value = "页数", paramType = "query"),
            @ApiImplicitParam(defaultValue = "10", name = "pageSize", value = "页面大小", paramType = "query")})
    @ApiOperation(value = "回帖列表", notes = "回帖列表")
    public String search(Long uid,Long aid,@RequestParam(defaultValue = "1")Integer page,@RequestParam(defaultValue = "10")Integer pageSize){

        JsonResult jr = new JsonResult();
        PageInfo<AttachmentPost> pages= attachmentInfoService.getList(aid,page,pageSize);
        jr.setList(pages.getList().stream().map(attach->{
            Long authorId = attach.getAuthorId();
            Member m = memberService.getMember(authorId.intValue());
            String path = AvatarUtils.getAvatarDir(authorId.intValue(),m.getAvatarstatus());
            attach.setUserAvatar(path);
            //获取回帖点赞数
            //点赞数
            attach.setFavorCounts(attachmentFavorMapper.getFavorCount(attach.getId(),1));
            //是否点过赞
            attach.setFavored(attachmentFavorMapper.getByPid(attach.getId(),1).stream().anyMatch(favor->favor.getUserId().equals(uid)));
            return attach;
        }).collect(Collectors.toList()));
        jr.setTotalCount(pages.getTotal());
        return jr.toJson();
    }
}
