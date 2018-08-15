package com.lanchong.common.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_common_member_count", schema = "bdm186320220", catalog = "")
public class MemberCount {
    private Integer uid;
    private Integer extcredits1;
    private Integer extcredits2;
    private Integer extcredits3;
    private Integer extcredits4;
    private Integer extcredits5;
    private Integer extcredits6;
    private Integer extcredits7;
    private Integer extcredits8;
    private Short friends;
    private Integer posts;
    private Integer threads;
    private Short digestposts;
    private Short doings;
    private Short blogs;
    private Short albums;
    private Short sharings;
    private Integer attachsize;
    private Integer views;
    private Short oltime;
    private Short todayattachs;
    private Integer todayattachsize;
    private Integer feeds;
    private Integer follower;
    private Integer following;
    private Integer newfollower;
    private Integer blacklist;

    @Id
    @Column(name = "uid")
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "extcredits1")
    public Integer getExtcredits1() {
        return extcredits1;
    }

    public void setExtcredits1(Integer extcredits1) {
        this.extcredits1 = extcredits1;
    }

    @Basic
    @Column(name = "extcredits2")
    public Integer getExtcredits2() {
        return extcredits2;
    }

    public void setExtcredits2(Integer extcredits2) {
        this.extcredits2 = extcredits2;
    }

    @Basic
    @Column(name = "extcredits3")
    public Integer getExtcredits3() {
        return extcredits3;
    }

    public void setExtcredits3(Integer extcredits3) {
        this.extcredits3 = extcredits3;
    }

    @Basic
    @Column(name = "extcredits4")
    public Integer getExtcredits4() {
        return extcredits4;
    }

    public void setExtcredits4(Integer extcredits4) {
        this.extcredits4 = extcredits4;
    }

    @Basic
    @Column(name = "extcredits5")
    public Integer getExtcredits5() {
        return extcredits5;
    }

    public void setExtcredits5(Integer extcredits5) {
        this.extcredits5 = extcredits5;
    }

    @Basic
    @Column(name = "extcredits6")
    public Integer getExtcredits6() {
        return extcredits6;
    }

    public void setExtcredits6(Integer extcredits6) {
        this.extcredits6 = extcredits6;
    }

    @Basic
    @Column(name = "extcredits7")
    public Integer getExtcredits7() {
        return extcredits7;
    }

    public void setExtcredits7(Integer extcredits7) {
        this.extcredits7 = extcredits7;
    }

    @Basic
    @Column(name = "extcredits8")
    public Integer getExtcredits8() {
        return extcredits8;
    }

    public void setExtcredits8(Integer extcredits8) {
        this.extcredits8 = extcredits8;
    }

    @Basic
    @Column(name = "friends")
    public Short getFriends() {
        return friends;
    }

    public void setFriends(Short friends) {
        this.friends = friends;
    }

    @Basic
    @Column(name = "posts")
    public Integer getPosts() {
        return posts;
    }

    public void setPosts(Integer posts) {
        this.posts = posts;
    }

    @Basic
    @Column(name = "threads")
    public Integer getThreads() {
        return threads;
    }

    public void setThreads(Integer threads) {
        this.threads = threads;
    }

    @Basic
    @Column(name = "digestposts")
    public Short getDigestposts() {
        return digestposts;
    }

    public void setDigestposts(Short digestposts) {
        this.digestposts = digestposts;
    }

    @Basic
    @Column(name = "doings")
    public Short getDoings() {
        return doings;
    }

    public void setDoings(Short doings) {
        this.doings = doings;
    }

    @Basic
    @Column(name = "blogs")
    public Short getBlogs() {
        return blogs;
    }

    public void setBlogs(Short blogs) {
        this.blogs = blogs;
    }

    @Basic
    @Column(name = "albums")
    public Short getAlbums() {
        return albums;
    }

    public void setAlbums(Short albums) {
        this.albums = albums;
    }

    @Basic
    @Column(name = "sharings")
    public Short getSharings() {
        return sharings;
    }

    public void setSharings(Short sharings) {
        this.sharings = sharings;
    }

    @Basic
    @Column(name = "attachsize")
    public Integer getAttachsize() {
        return attachsize;
    }

    public void setAttachsize(Integer attachsize) {
        this.attachsize = attachsize;
    }

    @Basic
    @Column(name = "views")
    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }

    @Basic
    @Column(name = "oltime")
    public Short getOltime() {
        return oltime;
    }

    public void setOltime(Short oltime) {
        this.oltime = oltime;
    }

    @Basic
    @Column(name = "todayattachs")
    public Short getTodayattachs() {
        return todayattachs;
    }

    public void setTodayattachs(Short todayattachs) {
        this.todayattachs = todayattachs;
    }

    @Basic
    @Column(name = "todayattachsize")
    public Integer getTodayattachsize() {
        return todayattachsize;
    }

    public void setTodayattachsize(Integer todayattachsize) {
        this.todayattachsize = todayattachsize;
    }

    @Basic
    @Column(name = "feeds")
    public Integer getFeeds() {
        return feeds;
    }

    public void setFeeds(Integer feeds) {
        this.feeds = feeds;
    }

    @Basic
    @Column(name = "follower")
    public Integer getFollower() {
        return follower;
    }

    public void setFollower(Integer follower) {
        this.follower = follower;
    }

    @Basic
    @Column(name = "following")
    public Integer getFollowing() {
        return following;
    }

    public void setFollowing(Integer following) {
        this.following = following;
    }

    @Basic
    @Column(name = "newfollower")
    public Integer getNewfollower() {
        return newfollower;
    }

    public void setNewfollower(Integer newfollower) {
        this.newfollower = newfollower;
    }

    @Basic
    @Column(name = "blacklist")
    public Integer getBlacklist() {
        return blacklist;
    }

    public void setBlacklist(Integer blacklist) {
        this.blacklist = blacklist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberCount that = (MemberCount) o;
        return Objects.equals(uid, that.uid) &&
                Objects.equals(extcredits1, that.extcredits1) &&
                Objects.equals(extcredits2, that.extcredits2) &&
                Objects.equals(extcredits3, that.extcredits3) &&
                Objects.equals(extcredits4, that.extcredits4) &&
                Objects.equals(extcredits5, that.extcredits5) &&
                Objects.equals(extcredits6, that.extcredits6) &&
                Objects.equals(extcredits7, that.extcredits7) &&
                Objects.equals(extcredits8, that.extcredits8) &&
                Objects.equals(friends, that.friends) &&
                Objects.equals(posts, that.posts) &&
                Objects.equals(threads, that.threads) &&
                Objects.equals(digestposts, that.digestposts) &&
                Objects.equals(doings, that.doings) &&
                Objects.equals(blogs, that.blogs) &&
                Objects.equals(albums, that.albums) &&
                Objects.equals(sharings, that.sharings) &&
                Objects.equals(attachsize, that.attachsize) &&
                Objects.equals(views, that.views) &&
                Objects.equals(oltime, that.oltime) &&
                Objects.equals(todayattachs, that.todayattachs) &&
                Objects.equals(todayattachsize, that.todayattachsize) &&
                Objects.equals(feeds, that.feeds) &&
                Objects.equals(follower, that.follower) &&
                Objects.equals(following, that.following) &&
                Objects.equals(newfollower, that.newfollower) &&
                Objects.equals(blacklist, that.blacklist);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uid, extcredits1, extcredits2, extcredits3, extcredits4, extcredits5, extcredits6, extcredits7, extcredits8, friends, posts, threads, digestposts, doings, blogs, albums, sharings, attachsize, views, oltime, todayattachs, todayattachsize, feeds, follower, following, newfollower, blacklist);
    }
}
