package com.lanchong.mobile.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lanchong.base.FileTypeUtil;
import com.lanchong.base.FileUtils;
import com.lanchong.mobile.entity.AttachmentInfo;
import com.lanchong.mobile.mapper.AttachmentInfoMapper;
import com.lanchong.ucenter.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.Optional;

@Service
public class AttachmentInfoService {
    @Autowired
    AttachmentInfoMapper attachmentInfoMapper;
    @Autowired
    MemberService memberService;

    public AttachmentInfo getById(String id){
        return Optional.ofNullable(attachmentInfoMapper.selectByPrimaryKey(id)).orElse(null);
    }

    public PageInfo<AttachmentInfo> searchVideo(String keywords,int page,int pageSize) {
        PageHelper.startPage(page,pageSize);
        return new PageInfo<>(attachmentInfoMapper.searchVideo(keywords));
    }

    public PageInfo<AttachmentInfo> searchDoc(String keywords,int page,int pageSize) {
        PageHelper.startPage(page,pageSize);
        return new PageInfo<>(attachmentInfoMapper.searchDoc(keywords));
    }

    public AttachmentInfo save(String uid,String filePath,String pathUrl,String name,String descs,String marks){
        AttachmentInfo aif = new AttachmentInfo();
        aif.setCreateTm(new Date());
        aif.setMemberNm(memberService.getBasicMember(Integer.parseInt(uid)).get().getUsername());
        aif.setName(name);
        aif.setMemberId(uid);
        aif.setDescs(descs);
        aif.setType(FileTypeUtil.getFileType(filePath));
        aif.setMarks(marks);
        aif.setImage(FileTypeUtil.isImage(aif.getType()));
        aif.setVideo(FileTypeUtil.isVideo(aif.getType()));
        aif.setPathUrl(pathUrl);
        if(aif.getVideo()){
            aif.setDuration(FileUtils.ReadVideoTime(new File(filePath)));
            aif.setSize(FileUtils.ReadVideoSize(new File(filePath)));
        }
        //aif.set
        attachmentInfoMapper.insertUseGeneratedKeys(aif);
        return  aif;
    }


    public Boolean idDocument(AttachmentInfo aif){
        return aif != null && Arrays.asList("doc","docx","ppt","pptx","xls","xlsx","pdf").contains(aif.getType());
    }


}
