package com.lanchong.common.repository;

import com.lanchong.common.entity.MemberCount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberCountRepository extends JpaRepository<MemberCount,Integer> {
    MemberCount getByUid(Integer uid);
}
