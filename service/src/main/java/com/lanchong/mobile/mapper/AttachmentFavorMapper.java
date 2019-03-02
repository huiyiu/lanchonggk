package com.lanchong.mobile.mapper;

import com.lanchong.common.MyMapper;
import com.lanchong.mobile.entity.AttachmentFavor;
import com.lanchong.mobile.entity.AttachmentInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AttachmentFavorMapper extends MyMapper<AttachmentFavor> {

    /**
     * 获取回帖点赞列表
     * @param pid
     * @return
     */
    List<AttachmentFavor> getByPid(@Param("pid") Long pid, @Param("pidType") Integer idType);




    /**
     * 获取帖子点赞数
     * @param pid
     * @param idType
     * @return
     */
    Long getFavorCount(@Param("pid") Long pid, @Param("pidType") Integer idType);

    /**
     * 帖子取消点赞
     * @param pid
     * @param pidType
     * @param uid
     */
    void deleteFavor(@Param("pid") Long pid, @Param("pidType") Integer pidType, @Param("uid") Long uid);


}