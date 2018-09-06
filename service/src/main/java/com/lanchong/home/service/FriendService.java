package com.lanchong.home.service;


import com.lanchong.base.AvatarUtils;
import com.lanchong.common.entity.Member;
import com.lanchong.common.repository.MemberRepository;
import com.lanchong.cons.Constant;
import com.lanchong.cons.UserInfo;
import com.lanchong.home.entity.Follow;
import com.lanchong.home.entity.Friend;
import com.lanchong.home.mapper.FollowMapper;
import com.lanchong.home.repository.FollowRepository;
import com.lanchong.home.repository.FriendRepository;
import com.lanchong.util.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FriendService {
    @Autowired
    FriendRepository friendRepository;
    @Autowired
    MemberRepository memberRepository;
    @Autowired
    FollowRepository followRepository;
    @Autowired
    FollowMapper followMapper;

    public List<Friend> ofMine(Member userInfo, int page, int pageSize) {
        return friendRepository.findByUid(userInfo.getUid(),PageRequest.of(page,pageSize))
        .stream()
        .map(friend -> {
            friend.setgName(Constant.getFriendGroup(String.valueOf(friend.getGid())));
            friend.setAvatar(AvatarUtils.getAvatarDir(friend.getFuid(),userInfo.getAvatarstatus()));
            return friend;
        }).collect(Collectors.toList())
        ;
    }

    /**
     * 关注用户
     * @param ui
     * @param fuid
     */
    public void follow(Member ui, Integer fuid) {
        Follow follow = new Follow();
        follow.setFollowuid(fuid);
        follow.setUid(ui.getUid());
        follow.setDateline(DateUtils.now());
        follow.setUsername(ui.getUsername());
        follow.setFusername(memberRepository.findByUid(fuid).getUsername());
        followMapper.insertSelective(follow);
    }

    /**
     * 取消关注用户
     * @param userInfo
     * @param fuid
     */
    public void unfollow(Member userInfo, Integer fuid) {
        Follow follow = new Follow();
        follow.setUid(userInfo.getUid());
        follow.setFollowuid(fuid);
        followMapper.delete(follow);
    }
}
