package com.lanchong.ucenter.service;

import com.lanchong.forum.entity.Attachment;
import com.lanchong.forum.entity.AttachmentN;
import com.lanchong.forum.mapper.AttachmentMapper;
import com.lanchong.forum.repository.AttachmentRepository;
import com.lanchong.util.DateUtils;
import com.lanchong.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class AttachmentService {
    @Autowired
    AttachmentMapper attachmentMapper;
    @Autowired
    AttachmentRepository attachmentRepository;



    public JsonResult uploadAttachment(Integer uid,Integer tid,String fileName,Integer readaccess,Integer isImage,String desc,Short price,Integer fileSize,String attachmentUrl){
        List<Attachment> attachments = attachmentRepository.findByTidAndUid(tid,uid);
        Byte tableid = 1;
        if(null == attachments || attachments.isEmpty()){
            tableid = (byte)new Random().nextInt(10);
        }else{
            tableid = attachments.get(0).getTableid();
        }
        Attachment attachment = new Attachment();
        attachment.setTableid(tableid);
        attachment.setDownloads(0);
        attachment.setPid(tid);
        attachment.setUid(uid);
        attachment.setTid(tid);
        attachmentMapper.insertSelective(attachment);

        Attachment attachmentMax = attachmentMapper.findMaxByUid(uid);

        AttachmentN attachmentN = new AttachmentN();
        attachmentN.setAid(attachmentMax.getAid());
        attachmentN.setDateline(DateUtils.now());
        attachmentN.setDescription(desc);
        attachmentN.setFilename(fileName);
        attachmentN.setFilesize(fileSize);
        attachmentN.setIsimage(isImage);
        attachmentN.setPrice(price);
        attachmentN.setPid(tid);
        attachmentN.setUid(uid);
        attachmentN.setTid(tid);
        attachmentN.setAttachment(attachmentUrl);
        attachmentN.setReadperm(readaccess);
        attachmentMapper.insertN(tableid,attachmentN);
        return new JsonResult();
    }
}
