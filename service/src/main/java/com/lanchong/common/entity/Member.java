package com.lanchong.common.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_common_member")
public class Member {
    private Integer uid;
    private String email;
    private String username;
    private String password;
    private Byte status;
    private Byte emailstatus;
    private Byte avatarstatus;
    private Byte videophotostatus;
    private Byte adminid;
    private Short groupid;
    private Integer groupexpiry;
    private String extgroupids;
    private Integer regdate;
    private Integer credits;
    private Byte notifysound;
    private String timeoffset;
    private Short newpm;
    private Short newprompt;
    private Byte accessmasks;
    private Byte allowadmincp;
    private Byte onlyacceptfriendpm;
    private Byte conisbind;
    private Byte freeze;

    @Id
    @Column(name = "uid")
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
    @Column(name = "emailstatus")
    public Byte getEmailstatus() {
        return emailstatus;
    }

    public void setEmailstatus(Byte emailstatus) {
        this.emailstatus = emailstatus;
    }

    @Basic
    @Column(name = "avatarstatus")
    public Byte getAvatarstatus() {
        return avatarstatus;
    }

    public void setAvatarstatus(Byte avatarstatus) {
        this.avatarstatus = avatarstatus;
    }

    @Basic
    @Column(name = "videophotostatus")
    public Byte getVideophotostatus() {
        return videophotostatus;
    }

    public void setVideophotostatus(Byte videophotostatus) {
        this.videophotostatus = videophotostatus;
    }

    @Basic
    @Column(name = "adminid")
    public Byte getAdminid() {
        return adminid;
    }

    public void setAdminid(Byte adminid) {
        this.adminid = adminid;
    }

    @Basic
    @Column(name = "groupid")
    public Short getGroupid() {
        return groupid;
    }

    public void setGroupid(Short groupid) {
        this.groupid = groupid;
    }

    @Basic
    @Column(name = "groupexpiry")
    public Integer getGroupexpiry() {
        return groupexpiry;
    }

    public void setGroupexpiry(Integer groupexpiry) {
        this.groupexpiry = groupexpiry;
    }

    @Basic
    @Column(name = "extgroupids")
    public String getExtgroupids() {
        return extgroupids;
    }

    public void setExtgroupids(String extgroupids) {
        this.extgroupids = extgroupids;
    }

    @Basic
    @Column(name = "regdate")
    public Integer getRegdate() {
        return regdate;
    }

    public void setRegdate(Integer regdate) {
        this.regdate = regdate;
    }

    @Basic
    @Column(name = "credits")
    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    @Basic
    @Column(name = "notifysound")
    public Byte getNotifysound() {
        return notifysound;
    }

    public void setNotifysound(Byte notifysound) {
        this.notifysound = notifysound;
    }

    @Basic
    @Column(name = "timeoffset")
    public String getTimeoffset() {
        return timeoffset;
    }

    public void setTimeoffset(String timeoffset) {
        this.timeoffset = timeoffset;
    }

    @Basic
    @Column(name = "newpm")
    public Short getNewpm() {
        return newpm;
    }

    public void setNewpm(Short newpm) {
        this.newpm = newpm;
    }

    @Basic
    @Column(name = "newprompt")
    public Short getNewprompt() {
        return newprompt;
    }

    public void setNewprompt(Short newprompt) {
        this.newprompt = newprompt;
    }

    @Basic
    @Column(name = "accessmasks")
    public Byte getAccessmasks() {
        return accessmasks;
    }

    public void setAccessmasks(Byte accessmasks) {
        this.accessmasks = accessmasks;
    }

    @Basic
    @Column(name = "allowadmincp")
    public Byte getAllowadmincp() {
        return allowadmincp;
    }

    public void setAllowadmincp(Byte allowadmincp) {
        this.allowadmincp = allowadmincp;
    }

    @Basic
    @Column(name = "onlyacceptfriendpm")
    public Byte getOnlyacceptfriendpm() {
        return onlyacceptfriendpm;
    }

    public void setOnlyacceptfriendpm(Byte onlyacceptfriendpm) {
        this.onlyacceptfriendpm = onlyacceptfriendpm;
    }

    @Basic
    @Column(name = "conisbind")
    public Byte getConisbind() {
        return conisbind;
    }

    public void setConisbind(Byte conisbind) {
        this.conisbind = conisbind;
    }

    @Basic
    @Column(name = "freeze")
    public Byte getFreeze() {
        return freeze;
    }

    public void setFreeze(Byte freeze) {
        this.freeze = freeze;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(uid, member.uid) &&
                Objects.equals(email, member.email) &&
                Objects.equals(username, member.username) &&
                Objects.equals(password, member.password) &&
                Objects.equals(status, member.status) &&
                Objects.equals(emailstatus, member.emailstatus) &&
                Objects.equals(avatarstatus, member.avatarstatus) &&
                Objects.equals(videophotostatus, member.videophotostatus) &&
                Objects.equals(adminid, member.adminid) &&
                Objects.equals(groupid, member.groupid) &&
                Objects.equals(groupexpiry, member.groupexpiry) &&
                Objects.equals(extgroupids, member.extgroupids) &&
                Objects.equals(regdate, member.regdate) &&
                Objects.equals(credits, member.credits) &&
                Objects.equals(notifysound, member.notifysound) &&
                Objects.equals(timeoffset, member.timeoffset) &&
                Objects.equals(newpm, member.newpm) &&
                Objects.equals(newprompt, member.newprompt) &&
                Objects.equals(accessmasks, member.accessmasks) &&
                Objects.equals(allowadmincp, member.allowadmincp) &&
                Objects.equals(onlyacceptfriendpm, member.onlyacceptfriendpm) &&
                Objects.equals(conisbind, member.conisbind) &&
                Objects.equals(freeze, member.freeze);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uid, email, username, password, status, emailstatus, avatarstatus, videophotostatus, adminid, groupid, groupexpiry, extgroupids, regdate, credits, notifysound, timeoffset, newpm, newprompt, accessmasks, allowadmincp, onlyacceptfriendpm, conisbind, freeze);
    }
}
