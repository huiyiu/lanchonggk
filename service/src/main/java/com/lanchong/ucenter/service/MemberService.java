package com.lanchong.ucenter.service;

import com.lanchong.base.AvatarUtils;
import com.lanchong.common.entity.*;
import com.lanchong.common.mapper.*;
import com.lanchong.common.repository.MemberFieldForumRepository;
import com.lanchong.common.repository.MemberProfileRepository;
import com.lanchong.common.repository.MemberRepository;
import com.lanchong.cons.UserInfo;
import com.lanchong.exception.Assert;
import com.lanchong.ucenter.entity.MemberFields;
import com.lanchong.ucenter.entity.Members;
import com.lanchong.ucenter.mapper.MemberFieldsMapper;
import com.lanchong.ucenter.mapper.MembersMapper;
import com.lanchong.ucenter.repository.MembersRepository;
import com.lanchong.util.DateUtils;
import com.lanchong.util.JsonResult;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
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
    MemberFieldHomeMapper memberFeildHomeMapper;
    @Autowired
    MemberFieldForumMapper memberFieldForumMapper;
    @Autowired
    MemberRepository memberRepository;
    @Autowired
    MemberFieldForumRepository memberFieldForumRepository;

    /**
     * 手机号是否注册
     * @param telephone
     * @return
     */
    public boolean isSignedIn(String telephone){
        return memberProfileRepository.findByMobile(telephone) != null;
    }

    @Transactional(rollbackFor = Exception.class)
    public void addMember(String phone, String pwd, String ip){
        // md5(md5('pwd').'salt')
        //salt
        pwd = DigestUtils.md5Hex(pwd);
        String salt = salt();
        //String pwdEnytp = DigestUtils.md5Hex(pwd+"."+salt);
        String pwdEnytp = DigestUtils.md5Hex(pwd + salt);
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
        member.setGroupid((short)10);  //10是什么组
        member.setRegdate(DateUtils.now());
        member.setTimeoffset("9999");
        member.setNewprompt((short)1);
        memberMapper.insertSelective(member);

        Members membersDb = membersRepository.findByUsername(phone);
        Integer uid = membersDb.getUid();

        MemberProfile memberProfile = new MemberProfile();
        memberProfile.setUid(uid);
        memberProfile.setIdcardtype("身份证");
        memberProfile.setBio("");
        memberProfile.setTelephone(phone);
        memberProfile.setMobile(phone);
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


        MemberFieldForum memberFieldForum = new MemberFieldForum();
        memberFieldForum.setUid(uid);
        memberFieldForum.setGroups("");
        memberFieldForum.setMedals("");
        memberFieldForum.setSightml("");
        memberFieldForum.setGroupterms("");
        memberFieldForumMapper.insert2(memberFieldForum);

    }

    @Transactional
    public  String salt(){
        return UUID.randomUUID().toString().substring(0,6);
    }

    /**
     *
     * @param phone
     * @param pwd
     * @return
     */
    public Member login(String phone, String pwd){
        pwd = DigestUtils.md5Hex(pwd);
        MemberProfile mp =  memberProfileRepository.findByMobile(phone);
        Assert.notNull(mp,"该用户不存在！");
        Members members = membersRepository.findByUid(mp.getUid());
        //Assert.isTrue(DigestUtils.md5Hex(pwd+"."+members.getSalt()).equals(members.getPassword()),"用户名或者密码不正确！");
        Assert.isTrue(DigestUtils.md5Hex(pwd + members.getSalt()).equals(members.getPassword()),"用户名或者密码不正确！");
        Member member = memberRepository.findByUid(mp.getUid());
        member.setMobile(mp.getMobile());
        member.setPassword("");
        return member;
    }

    public Member getMember(Integer uid) {
        Member m = memberRepository.findByUid(uid);
        m.setAvatarUrl(AvatarUtils.getAvatarDir(uid,m.getAvatarstatus()));//头像
        m.setSightml(memberFieldForumRepository.findByUid(uid).getSightml()); //签名
        return m;
    }

    public Optional<Member> getBasicMember(Integer uid) {
        return Optional.ofNullable(memberRepository.findByUid(uid));
    }

    public Member existMember(Integer uid){
        Member m = memberRepository.findByUid(uid);
        Assert.notNull(m,"用户不存在！");
        return m;
    }


    public boolean userNameSignedIn(String username) {
        return membersRepository.findByUsername(username) != null;
    }

    public void setAvatar(Member member) {
        memberMapper.setAvartarstatus(member.getUid());
    }

    public void setSignhtml(Integer uid,String signhtml){
        memberFieldForumMapper.setSignhtml(uid,signhtml);
    }

    public void adminGroup(Long uid) {
        Member m = existMember(uid.intValue());
        Assert.isTrue(1== m.getGroupid(),"当前用户没有权限发布！");
    }
}
