package com.lanchong.mobile.mapper;

import com.lanchong.common.MyMapper;
import com.lanchong.mobile.entity.AttachmentPost;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AttachmentPostMapper extends MyMapper<AttachmentPost> {


    Integer getNextPosition(Long aid);

    List<AttachmentPost> getPosts(@Param("aid") String aid);

}