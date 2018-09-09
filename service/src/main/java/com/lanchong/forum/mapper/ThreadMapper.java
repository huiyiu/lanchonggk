package com.lanchong.forum.mapper;

import com.lanchong.common.MyMapper;
import com.lanchong.forum.entity.Thread0;
import org.apache.ibatis.annotations.Param;


public interface ThreadMapper extends MyMapper<Thread0> {
    Thread0 findMaxByUid(@Param("uid") Integer uid);
}
