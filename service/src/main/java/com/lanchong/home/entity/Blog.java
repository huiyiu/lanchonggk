package com.lanchong.home.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_home_blog", schema = "lanchonggk", catalog = "")
public class Blog {
    private Integer blogid;
    private Integer uid;
    private String username;
    private String subject;
    private Short classid;
    private Short catid;
    private Integer viewnum;
    private Integer replynum;
    private Integer hot;
    private Integer dateline;
    private Byte picflag;
    private Byte noreply;
    private Byte friend;
    private String password;
    private Integer favtimes;
    private Integer sharetimes;
    private Byte status;
    private Short click1;
    private Short click2;
    private Short click3;
    private Short click4;
    private Short click5;
    private Short click6;
    private Short click7;
    private Short click8;

    @Id
    @Column(name = "blogid")
    public Integer getBlogid() {
        return blogid;
    }

    public void setBlogid(Integer blogid) {
        this.blogid = blogid;
    }

    @Basic
    @Column(name = "uid")
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "subject")
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Basic
    @Column(name = "classid")
    public Short getClassid() {
        return classid;
    }

    public void setClassid(Short classid) {
        this.classid = classid;
    }

    @Basic
    @Column(name = "catid")
    public Short getCatid() {
        return catid;
    }

    public void setCatid(Short catid) {
        this.catid = catid;
    }

    @Basic
    @Column(name = "viewnum")
    public Integer getViewnum() {
        return viewnum;
    }

    public void setViewnum(Integer viewnum) {
        this.viewnum = viewnum;
    }

    @Basic
    @Column(name = "replynum")
    public Integer getReplynum() {
        return replynum;
    }

    public void setReplynum(Integer replynum) {
        this.replynum = replynum;
    }

    @Basic
    @Column(name = "hot")
    public Integer getHot() {
        return hot;
    }

    public void setHot(Integer hot) {
        this.hot = hot;
    }

    @Basic
    @Column(name = "dateline")
    public Integer getDateline() {
        return dateline;
    }

    public void setDateline(Integer dateline) {
        this.dateline = dateline;
    }

    @Basic
    @Column(name = "picflag")
    public Byte getPicflag() {
        return picflag;
    }

    public void setPicflag(Byte picflag) {
        this.picflag = picflag;
    }

    @Basic
    @Column(name = "noreply")
    public Byte getNoreply() {
        return noreply;
    }

    public void setNoreply(Byte noreply) {
        this.noreply = noreply;
    }

    @Basic
    @Column(name = "friend")
    public Byte getFriend() {
        return friend;
    }

    public void setFriend(Byte friend) {
        this.friend = friend;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "favtimes")
    public Integer getFavtimes() {
        return favtimes;
    }

    public void setFavtimes(Integer favtimes) {
        this.favtimes = favtimes;
    }

    @Basic
    @Column(name = "sharetimes")
    public Integer getSharetimes() {
        return sharetimes;
    }

    public void setSharetimes(Integer sharetimes) {
        this.sharetimes = sharetimes;
    }

    @Basic
    @Column(name = "status")
    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Basic
    @Column(name = "click1")
    public Short getClick1() {
        return click1;
    }

    public void setClick1(Short click1) {
        this.click1 = click1;
    }

    @Basic
    @Column(name = "click2")
    public Short getClick2() {
        return click2;
    }

    public void setClick2(Short click2) {
        this.click2 = click2;
    }

    @Basic
    @Column(name = "click3")
    public Short getClick3() {
        return click3;
    }

    public void setClick3(Short click3) {
        this.click3 = click3;
    }

    @Basic
    @Column(name = "click4")
    public Short getClick4() {
        return click4;
    }

    public void setClick4(Short click4) {
        this.click4 = click4;
    }

    @Basic
    @Column(name = "click5")
    public Short getClick5() {
        return click5;
    }

    public void setClick5(Short click5) {
        this.click5 = click5;
    }

    @Basic
    @Column(name = "click6")
    public Short getClick6() {
        return click6;
    }

    public void setClick6(Short click6) {
        this.click6 = click6;
    }

    @Basic
    @Column(name = "click7")
    public Short getClick7() {
        return click7;
    }

    public void setClick7(Short click7) {
        this.click7 = click7;
    }

    @Basic
    @Column(name = "click8")
    public Short getClick8() {
        return click8;
    }

    public void setClick8(Short click8) {
        this.click8 = click8;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Blog blog = (Blog) o;
        return Objects.equals(blogid, blog.blogid) &&
                Objects.equals(uid, blog.uid) &&
                Objects.equals(username, blog.username) &&
                Objects.equals(subject, blog.subject) &&
                Objects.equals(classid, blog.classid) &&
                Objects.equals(catid, blog.catid) &&
                Objects.equals(viewnum, blog.viewnum) &&
                Objects.equals(replynum, blog.replynum) &&
                Objects.equals(hot, blog.hot) &&
                Objects.equals(dateline, blog.dateline) &&
                Objects.equals(picflag, blog.picflag) &&
                Objects.equals(noreply, blog.noreply) &&
                Objects.equals(friend, blog.friend) &&
                Objects.equals(password, blog.password) &&
                Objects.equals(favtimes, blog.favtimes) &&
                Objects.equals(sharetimes, blog.sharetimes) &&
                Objects.equals(status, blog.status) &&
                Objects.equals(click1, blog.click1) &&
                Objects.equals(click2, blog.click2) &&
                Objects.equals(click3, blog.click3) &&
                Objects.equals(click4, blog.click4) &&
                Objects.equals(click5, blog.click5) &&
                Objects.equals(click6, blog.click6) &&
                Objects.equals(click7, blog.click7) &&
                Objects.equals(click8, blog.click8);
    }

    @Override
    public int hashCode() {

        return Objects.hash(blogid, uid, username, subject, classid, catid, viewnum, replynum, hot, dateline, picflag, noreply, friend, password, favtimes, sharetimes, status, click1, click2, click3, click4, click5, click6, click7, click8);
    }
}
