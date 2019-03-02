package com.lanchong.mobile.mapper;

import com.lanchong.common.MyMapper;
import com.lanchong.mobile.entity.AttachmentInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AttachmentInfoMapper extends MyMapper<AttachmentInfo> {

    List<AttachmentInfo> searchVideo(@Param("keywords") String keywords,@Param("aType")Integer aType);

    List<AttachmentInfo> searchDoc(@Param("keywords") String keywords);

    void addViews(@Param("id") Long id);

    List<AttachmentInfo> getMyFavors(@Param("uid") Long uid, @Param("aType") Integer aType);

}