package com.lanchong.forum.mapper;

import com.lanchong.common.MyMapper;
import com.lanchong.forum.entity.Post;
import com.lanchong.forum.entity.PostTableid;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PostTableidMapper extends MyMapper<PostTableid> {

    Integer findMaxId();
}
