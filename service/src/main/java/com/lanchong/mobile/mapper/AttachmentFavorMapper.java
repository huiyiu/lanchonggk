package com.lanchong.mobile.mapper;

import com.lanchong.common.MyMapper;
import com.lanchong.mobile.entity.AttachmentFavor;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AttachmentFavorMapper extends MyMapper<AttachmentFavor> {

    /**
     * 获取回帖点赞数量
     * @param pid
     * @return
     */
    List<AttachmentFavor> getByPid(@Param("pid") Long pid);

}