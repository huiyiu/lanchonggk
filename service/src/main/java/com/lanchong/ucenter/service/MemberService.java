package com.lanchong.ucenter.service;

import com.lanchong.common.entity.Member;
import com.lanchong.common.entity.MemberCount;
import com.lanchong.common.entity.MemberProfile;
import com.lanchong.common.mapper.MemberCountMapper;
import com.lanchong.common.mapper.MemberMapper;
import com.lanchong.common.mapper.MemberProfileMapper;
import com.lanchong.common.repository.MemberProfileRepository;
import com.lanchong.ucenter.entity.Members;
import com.lanchong.ucenter.mapper.MembersMapper;
import com.lanchong.ucenter.repository.MembersRepository;
import com.lanchong.util.DateUtils;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class MemberService {
    @Autowired
    MembersRepository membersRepository;
    @Autowired
    MembersMapper membersMapper;
    @Autowired
    MemberProfileRepository memberProfileRepository;
    @Autowired
    MemberMapper memberMapper;
    @Autowired
    MemberProfileMapper memberProfileMapper;
    @Autowired
    MemberCountMapper memberCountMapper;

    /**
     * 手机号是否注册
     * @param telephone
     * @return
     */
    public boolean isSignedIn(String telephone){
        return memberProfileRepository.findByTelephone(telephone) != null;
    }

    @Transactional
    public void addMember(String phone, String pwd, String ip){
        // md5(md5('pwd').'salt')
        //salt
        pwd = DigestUtils.md5Hex(pwd);
        String salt = salt();
        String pwdEnytp = DigestUtils.md5Hex(pwd+"."+salt);

        Members members = new Members();
        members.setEmail("");
        members.setPassword(pwdEnytp);
        members.setRegip(ip);
        members.setUsername(phone); //默认为 手机号
        members.setSalt(salt);
        members.setRegdate(DateUtils.now());
        members.setMyid("");
        members.setMyidkey("");
        members.setLastloginip(0);
        members.setLastlogintime(0);
        members.setSecques("");
        membersMapper.insert(members);

        Member member = new Member();
        member.setUsername(phone);
        member.setPassword(pwd);
//        member.setStatus((byte)0);
//        member.setEmailstatus((byte)0);
//        member.setAvatarstatus((byte)0);
//        member.setVideophotostatus((byte)0);
//        member.setAdminid((byte)0);
        member.setGroupid((short)10);  //10是什么组
//        member.setGroupexpiry(0);
        member.setRegdate(DateUtils.now());
//        member.setCredits(0);
//        member.setNotifysound((byte)0);
        member.setTimeoffset("9999");
//        member.setNewpm((short)0);
        member.setNewprompt((short)1);
//        member.setAccessmasks((byte)0);
//        member.setAllowadmincp((byte)0);
//        member.setOnlyacceptfriendpm((byte)0);
//        member.setConisbind((byte)0);
//        member.setFreeze((byte)0);
        memberMapper.insertSelective(member);

        Members membersDb = membersRepository.findByUsername(phone);
        Integer uid = membersDb.getUid();

        MemberProfile memberProfile = new MemberProfile();
        memberProfile.setUid(uid);
        //gender`,`birthyear`,`birthmonth`,`birthday
        //memberProfile.setGender((byte)0);
        //memberProfile.setBirthyear((short)0);
        //memberProfile.setBirthmonth((byte)0);
        //memberProfile.setBirthday((byte)0);
        memberProfile.setIdcardtype("身份证");
        memberProfile.setBio("");
        memberProfile.setInterest("");
        memberProfile.setField1("");
        memberProfile.setField2("");
        memberProfile.setField3("");
        memberProfile.setField4("");
        memberProfile.setField5("");
        memberProfile.setField6("");
        memberProfile.setField7("");
        memberProfile.setField8("");
        memberProfileMapper.insertSelective(memberProfile);

        MemberCount memberCount = new MemberCount();
        memberCount.setUid(uid);
        memberCountMapper.insertSelective(memberCount);
    }

    @Transactional
    public  String salt(){
        return UUID.randomUUID().toString().substring(0,6);
    }
}
