package com.lanchong.common.mapper;

import com.lanchong.common.MyMapper;
import com.lanchong.common.entity.MemberFieldForum;
import com.lanchong.common.entity.MemberFieldHome;
import org.apache.ibatis.annotations.Param;

public interface MemberFieldForumMapper extends MyMapper<MemberFieldForum> {

    int insert2(MemberFieldForum memberFieldForum);

    int setSignhtml(@Param("uid") Integer uid, @Param("sign") String sign);

}