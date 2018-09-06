package com.lanchong.forum.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_forum_threadhot",  catalog = "")
@IdClass(ThreadhotPK.class)
public class Threadhot {
    private Integer cid;
    private Integer fid;
    private Integer tid;

    @Id
    @Column(name = "cid")
    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Basic
    @Column(name = "fid")
    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    @Id
    @Column(name = "tid")
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Threadhot threadhot = (Threadhot) o;
        return Objects.equals(cid, threadhot.cid) &&
                Objects.equals(fid, threadhot.fid) &&
                Objects.equals(tid, threadhot.tid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(cid, fid, tid);
    }
}
