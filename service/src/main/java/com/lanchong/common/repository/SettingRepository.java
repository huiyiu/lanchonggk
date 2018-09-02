package com.lanchong.common.repository;

import com.lanchong.common.entity.Setting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SettingRepository extends JpaRepository<Setting,String> {

    Setting findBySkey(String skey);
}
