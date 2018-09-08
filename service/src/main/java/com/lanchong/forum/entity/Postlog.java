package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_postlog",  catalog = "")
@IdClass(PostlogPK.class)
public class Postlog {
    private Integer pid;
    private Integer tid;
    private Short fid;
    private Integer uid;
    private String action;
    private Integer dateline;

    @Id
    @Column(name = "pid")
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Id
    @Column(name = "tid")
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Basic
    @Column(name = "fid")
    public Short getFid() {
        return fid;
    }

    public void setFid(Short fid) {
        this.fid = fid;
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
    @Column(name = "action")
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
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

        Postlog postlog = (Postlog) o;

        if (pid != null ? !pid.equals(postlog.pid) : postlog.pid != null) return false;
        if (tid != null ? !tid.equals(postlog.tid) : postlog.tid != null) return false;
        if (fid != null ? !fid.equals(postlog.fid) : postlog.fid != null) return false;
        if (uid != null ? !uid.equals(postlog.uid) : postlog.uid != null) return false;
        if (action != null ? !action.equals(postlog.action) : postlog.action != null) return false;
        if (dateline != null ? !dateline.equals(postlog.dateline) : postlog.dateline != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pid != null ? pid.hashCode() : 0;
        result = 31 * result + (tid != null ? tid.hashCode() : 0);
        result = 31 * result + (fid != null ? fid.hashCode() : 0);
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        result = 31 * result + (action != null ? action.hashCode() : 0);
        result = 31 * result + (dateline != null ? dateline.hashCode() : 0);
        return result;
    }
}
