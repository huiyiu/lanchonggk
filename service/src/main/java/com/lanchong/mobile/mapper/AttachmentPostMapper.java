package com.lanchong.mobile.mapper;

import com.lanchong.common.MyMapper;
import com.lanchong.mobile.entity.AttachmentPost;

public interface AttachmentPostMapper extends MyMapper<AttachmentPost> {


    Integer getNextPosition(String aid);
}