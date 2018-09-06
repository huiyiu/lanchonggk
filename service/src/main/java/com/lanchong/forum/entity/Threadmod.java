package com.lanchong.forum.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

//@Entity
@Table(name = "ldp_forum_threadmod",  catalog = "")
public class Threadmod {
    private Integer tid;
    private Integer uid;
    private String username;
    private Integer dateline;
    private Integer expiration;
    private String action;
    private Byte status;
    private Short magicid;
    private Byte stamp;
    private String reason;

    @Basic
    @Column(name = "tid")
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
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
    @Column(name = "dateline")
    public Integer getDateline() {
        return dateline;
    }

    public void setDateline(Integer dateline) {
        this.dateline = dateline;
    }

    @Basic
    @Column(name = "expiration")
    public Integer getExpiration() {
        return expiration;
    }

    public void setExpiration(Integer expiration) {
        this.expiration = expiration;
    }

    @Basic
    @Column(name = "action")
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
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
    @Column(name = "magicid")
    public Short getMagicid() {
        return magicid;
    }

    public void setMagicid(Short magicid) {
        this.magicid = magicid;
    }

    @Basic
    @Column(name = "stamp")
    public Byte getStamp() {
        return stamp;
    }

    public void setStamp(Byte stamp) {
        this.stamp = stamp;
    }

    @Basic
    @Column(name = "reason")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Threadmod threadmod = (Threadmod) o;
        return Objects.equals(tid, threadmod.tid) &&
                Objects.equals(uid, threadmod.uid) &&
                Objects.equals(username, threadmod.username) &&
                Objects.equals(dateline, threadmod.dateline) &&
                Objects.equals(expiration, threadmod.expiration) &&
                Objects.equals(action, threadmod.action) &&
                Objects.equals(status, threadmod.status) &&
                Objects.equals(magicid, threadmod.magicid) &&
                Objects.equals(stamp, threadmod.stamp) &&
                Objects.equals(reason, threadmod.reason);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tid, uid, username, dateline, expiration, action, status, magicid, stamp, reason);
    }
}
