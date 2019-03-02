package com.lanchong.mobile.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lanchong.base.FileTypeUtil;
import com.lanchong.base.FileUtils;
import com.lanchong.mobile.entity.AttachmentInfo;
import com.lanchong.mobile.entity.AttachmentPost;
import com.lanchong.mobile.mapper.AttachmentInfoMapper;
import com.lanchong.mobile.mapper.AttachmentPostMapper;
import com.lanchong.ucenter.service.MemberService;
import com.lanchong.util.DateUtils;
import com.lanchong.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AttachmentInfoService {
    @Autowired
    AttachmentInfoMapper attachmentInfoMapper;
    @Autowired
    AttachmentPostMapper attachmentPostMapper;
    @Autowired
    MemberService memberService;

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
    @Value("${discuz.url}")
    String discuzUrl;

    public String genFilePath(Integer aType){
        if(0 == aType){
            return paiDir;
        }else  if(1 == aType) {
            return docDir;
        }else if( 2 == aType){
            return myvideoDir;
        }else{
            return imageDir;
        }
    }

    public String getAccessPath(AttachmentInfo ai){
        String accessPath = "";
        if(null == ai || StringUtil.isEmpty(ai.getPathUrl())){
            return accessPath;
        }
        if(3 == ai.getAType()){
            List<String> paths = Arrays.asList(ai.getPathUrl().split(","))
                    .stream().map(pathUrl->
                            discuzUrl + genFilePath(ai.getAType())+ai.getPathUrl()
                    ).collect(Collectors.toList());
            accessPath =    String.join(",",paths);

        }else{
            accessPath = discuzUrl + genFilePath(ai.getAType())+ai.getPathUrl();
        }
        return accessPath;
    }

    public AttachmentInfo getById(Long id){
        return Optional.ofNullable(attachmentInfoMapper.selectByPrimaryKey(id)).orElse(null);
    }

    public PageInfo<AttachmentInfo> search(Integer aType,String keywords,int page,int pageSize) {
        PageHelper.startPage(page,pageSize);
        return new PageInfo<>(attachmentInfoMapper.searchVideo(keywords,aType));
    }

    public PageInfo<AttachmentInfo> searchDoc(String keywords,int page,int pageSize) {
        PageHelper.startPage(page,pageSize);
        return new PageInfo<>(attachmentInfoMapper.searchDoc(keywords));
    }

    public AttachmentInfo save(Long uid,String filePath,String fileName,String subject,String content,String descs,String marks,Integer aType){
        AttachmentInfo aif = new AttachmentInfo();
        aif.setCreateTm(new Date());
        String authorName = memberService.getBasicMember(uid.intValue()).get().getUsername();
        aif.setAuthor(authorName);
        aif.setSubject(subject);
        aif.setAuthorId(uid);
        aif.setContent(content);
        aif.setDescs(descs);
        aif.setType(FileTypeUtil.getFileType(filePath));
        aif.setMarks(marks);
        aif.setAType(aType);
        aif.setViews(0L);
        aif.setName(fileName);
        aif.setPathUrl(filePath);
        if(2 == aType || 0 == aType){
            aif.setDuration(FileUtils.ReadVideoTime(new File(filePath)));
        }
        aif.setSize(FileUtils.ReadFileSize(new File(filePath)));
        //
        return  aif;
    }


    public Boolean idDocument(AttachmentInfo aif){
        return aif != null && Arrays.asList("doc","docx","ppt","pptx","xls","xlsx","pdf","txt").contains(aif.getType());
    }

    public AttachmentPost post(Long aid,Long uid,String message){
        AttachmentInfo attachmentInfo = getById(aid);
        if(attachmentInfo == null){
            return null;
        }
        AttachmentPost attachmentPost = new AttachmentPost();
        attachmentPost.setAid(aid);
        attachmentPost.setPosition(1);
        attachmentPost.setAuthor(attachmentInfo.getAuthor());
        attachmentPost.setAuthorId(attachmentInfo.getAuthorId());
        attachmentPost.setCreateTime(new Date());
        attachmentPost.setMessage(message);
        attachmentPost.setPosition(getNextPosition(aid));
        attachmentPostMapper.insertUseGeneratedKeys(attachmentPost);
        return attachmentPost;
    }

    public Integer getNextPosition(Long aid){
        return attachmentPostMapper.getNextPosition(aid) + 1;
    }


    public PageInfo<AttachmentPost> getList(Long aid, Integer page, Integer pageSize) {
        PageHelper.startPage(page,pageSize);
        return new PageInfo<>(attachmentPostMapper.getPosts(aid));
    }

    public PageInfo<AttachmentInfo> getMyFavors(Long uid, Integer aType, Integer page, Integer pageSize) {
        PageHelper.startPage(page,pageSize);
        return new PageInfo<>(attachmentInfoMapper.getMyFavors(uid,aType));
    }
}
