package com.lanchong.forum.mapper;

import com.lanchong.common.MyMapper;
import com.lanchong.forum.entity.Attachment;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AttachmentMapper extends MyMapper<Attachment> {
    List<Attachment> findByPid(@Param("pid")Integer pid);
}
