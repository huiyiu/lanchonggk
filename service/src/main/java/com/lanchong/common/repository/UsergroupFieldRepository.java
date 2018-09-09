package com.lanchong.common.repository;

import com.lanchong.common.entity.Usergroup;
import com.lanchong.common.entity.UsergroupField;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsergroupFieldRepository extends JpaRepository<UsergroupField,Short> {
    UsergroupField findByGroupid(Short groupid);
}
