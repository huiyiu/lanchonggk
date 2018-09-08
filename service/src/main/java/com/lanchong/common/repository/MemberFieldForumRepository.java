package com.lanchong.common.repository;

import com.lanchong.common.entity.MemberFieldForum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberFieldForumRepository extends JpaRepository<MemberFieldForum,Integer> {
    MemberFieldForum findByUid(Integer uid);
}
