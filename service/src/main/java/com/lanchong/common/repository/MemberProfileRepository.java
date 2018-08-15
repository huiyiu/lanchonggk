package com.lanchong.common.repository;

import com.lanchong.common.entity.Member;
import com.lanchong.common.entity.MemberProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberProfileRepository extends JpaRepository<MemberProfile,Integer> {
    MemberProfile findByTelephone(String telephone);
}
