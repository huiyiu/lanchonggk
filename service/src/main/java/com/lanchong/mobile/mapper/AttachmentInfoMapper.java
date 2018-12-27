package com.lanchong.mobile.mapper;

import com.lanchong.common.MyMapper;
import com.lanchong.mobile.entity.AttachmentInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AttachmentInfoMapper extends MyMapper<AttachmentInfo> {

    List<AttachmentInfo> search(@Param("keywords") String keywords);

}