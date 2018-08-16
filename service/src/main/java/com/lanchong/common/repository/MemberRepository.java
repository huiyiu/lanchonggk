package com.lanchong.common.repository;

import com.lanchong.common.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Integer> {
    Member findByUid(Integer uid);
}
