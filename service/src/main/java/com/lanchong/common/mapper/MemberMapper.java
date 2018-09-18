package com.lanchong.common.mapper;

import com.lanchong.common.MyMapper;
import com.lanchong.common.entity.Member;
import org.apache.ibatis.annotations.Param;

public interface MemberMapper extends MyMapper<Member> {

    void setAvartarstatus(@Param("uid") Integer uid);

}