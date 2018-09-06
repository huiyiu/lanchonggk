package com.lanchong.forum.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_forum_threadlog",  catalog = "")
@IdClass(ThreadlogPK.class)
public class Threadlog {
    private Integer tid;
    private Short fid;
    private Integer uid;
    private Short otherid;
    private String action;
    private Integer expiry;
    private Integer dateline;

    @Id
    @Column(name = "tid")
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Id
    @Column(name = "fid")
    public Short getFid() {
        return fid;
    }

    public void setFid(Short fid) {
        this.fid = fid;
    }

    @Id
    @Column(name = "uid")
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "otherid")
    public Short getOtherid() {
        return otherid;
    }

    public void setOtherid(Short otherid) {
        this.otherid = otherid;
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
    @Column(name = "expiry")
    public Integer getExpiry() {
        return expiry;
    }

    public void setExpiry(Integer expiry) {
        this.expiry = expiry;
    }

    @Basic
    @Column(name = "dateline")
    public Integer getDateline() {
        return dateline;
    }

    public void setDateline(Integer dateline) {
        this.dateline = dateline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Threadlog threadlog = (Threadlog) o;
        return Objects.equals(tid, threadlog.tid) &&
                Objects.equals(fid, threadlog.fid) &&
                Objects.equals(uid, threadlog.uid) &&
                Objects.equals(otherid, threadlog.otherid) &&
                Objects.equals(action, threadlog.action) &&
                Objects.equals(expiry, threadlog.expiry) &&
                Objects.equals(dateline, threadlog.dateline);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tid, fid, uid, otherid, action, expiry, dateline);
    }
}
