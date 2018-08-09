package com.lanchong.ucenter.service;

import com.lanchong.ucenter.entity.Members;
import com.lanchong.ucenter.mapper.MembersMapper;
import com.lanchong.ucenter.repository.MembersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    @Autowired
    MembersMapper membersMapper;
    @Autowired
    MembersRepository membersRepository;

    public Members getById(){
        return membersMapper.selectByPrimaryKey(2202);
    }

    public Members getByEmail(){
        return membersRepository.findMembersByEmail("494930769@qq.com");
    }
}
