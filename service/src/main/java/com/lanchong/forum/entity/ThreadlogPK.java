package com.lanchong.forum.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ThreadlogPK implements Serializable {
    private Integer tid;
    private Short fid;
    private Integer uid;

    @Column(name = "tid")
    @Id
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Column(name = "fid")
    @Id
    public Short getFid() {
        return fid;
    }

    public void setFid(Short fid) {
        this.fid = fid;
    }

    @Column(name = "uid")
    @Id
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ThreadlogPK that = (ThreadlogPK) o;
        return Objects.equals(tid, that.tid) &&
                Objects.equals(fid, that.fid) &&
                Objects.equals(uid, that.uid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tid, fid, uid);
    }
}
