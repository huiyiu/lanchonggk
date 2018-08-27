package com.lanchong.forum.mapper;

import com.lanchong.common.MyMapper;
import com.lanchong.forum.entity.Post;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PostMapper extends MyMapper<Post> {
    List<Post> findByAuthorid(@Param("authorid") Integer authorid);
}
