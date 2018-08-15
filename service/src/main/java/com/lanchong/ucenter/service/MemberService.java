package com.lanchong.ucenter.service;

import com.lanchong.common.entity.*;
import com.lanchong.common.mapper.*;
import com.lanchong.common.repository.MemberProfileRepository;
import com.lanchong.ucenter.entity.MemberFields;
import com.lanchong.ucenter.entity.Members;
import com.lanchong.ucenter.mapper.MemberFieldsMapper;
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
    @Autowired
    MemberStatusMapper memberStatusMapper;
    @Autowired
    MemberFieldsMapper memberFieldsMapper;
    @Autowired
    OnlineTimeMapper onlineTimeMapper;
    @Autowired
    StatusUserMapper statusUserMapper;
    @Autowired
    MemberFeildHomeMapper memberFeildHomeMapper;
    @Autowired
    MemberFieldForumMapper memberFieldForumMapper;

    /**
     * 手机号是否注册
     * @param telephone
     * @return
     */
    public boolean isSignedIn(String telephone){
        return memberProfileRepository.findByTelephone(telephone) != null;
    }

    @Transactional(rollbackFor = Exception.class)
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
/*`uid`,`regip`,`lastip`,`port`,`lastvisit`,`lastactivity`,`lastpost`,`lastsendmail`,`invisible`,`buyercredit`,`sellercredit`,`favtimes`,`sharetimes`,`profileprogress`) values
                (2247,'58.247.91.82','58.247.91.82',0,1533783966,1533783966,0,0,0,0,0,0,0,0);*/
        MemberStatus memberStatus = new MemberStatus();
        memberStatus.setUid(uid);
        memberStatus.setRegip(ip);
        memberStatus.setLastip(ip);
        memberStatus.setLastvisit(DateUtils.now());
        memberStatus.setLastpost(DateUtils.now());
        memberStatusMapper.insertSelective(memberStatus);


        MemberFields memberFields = new MemberFields();
        memberFields.setUid(uid);
        memberFields.setBlacklist("");
        memberFieldsMapper.insertSelective(memberFields);


        Onlinetime onlinetime = new Onlinetime();
        onlinetime.setLastupdate(DateUtils.now());
        onlinetime.setUid(uid);
        onlinetime.setThismonth((short)1); //todo
        onlinetime.setTotal(1);//todo
        onlineTimeMapper.insertSelective(onlinetime);

        StatUser statUser = new StatUser();
        statUser.setDaytime(DateUtils.dayTime());
        statUser.setUid(uid);
        statUser.setType("login");
        statusUserMapper.insertSelective(statUser);

        MemberFieldHome memberFieldHome = new MemberFieldHome();
        memberFieldHome.setUid(uid);
        memberFieldHome.setSpacecss("");
        memberFieldHome.setBlockposition("");
        memberFieldHome.setPrivacy("");
        memberFieldHome.setFeedfriend("");
        memberFieldHome.setRecentnote("");
        memberFieldHome.setSpacenote("");
        memberFieldHome.setAcceptemail("");
        memberFieldHome.setMagicgift("");
        memberFieldHome.setStickblogs("");
        memberFeildHomeMapper.insertSelective(memberFieldHome);

        /*insert  into `ldp_common_member_field_forum`(`uid`,`medals`,`sightml`,`groupterms`,`groups`) values
                (4446,'','','','');*/
        MemberFieldForum memberFieldForum = new MemberFieldForum();
        memberFieldForum.setUid(uid);
        memberFieldForum.setGroups("");
        memberFieldForum.setMedals("");
        memberFieldForum.setSightml("");
        memberFieldForum.setGroupterms("");
        memberFieldForumMapper.insertSelective(memberFieldForum);

    }

    @Transactional
    public  String salt(){
        return UUID.randomUUID().toString().substring(0,6);
    }
}
