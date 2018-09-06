package com.lanchong.common.repository;

import com.lanchong.common.entity.Member;
import com.lanchong.common.entity.Usergroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsergroupRepository extends JpaRepository<Usergroup,Short> {
    Usergroup findByGroupid(Short groupid);
}
