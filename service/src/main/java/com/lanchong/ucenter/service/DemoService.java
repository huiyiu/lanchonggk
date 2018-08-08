package com.lanchong.ucenter.service;

import com.lanchong.ucenter.entity.Members;
import com.lanchong.ucenter.mapper.MembersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    @Autowired
    MembersMapper membersMapper;

    public Members getById(){
        return membersMapper.selectByPrimaryKey(2202);
    }
}
