package com.lanchong.forum.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ThreadhotPK implements Serializable {
    private Integer cid;
    private Integer tid;

    @Column(name = "cid")
    @Id
    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Column(name = "tid")
    @Id
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
        ThreadhotPK that = (ThreadhotPK) o;
        return Objects.equals(cid, that.cid) &&
                Objects.equals(tid, that.tid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(cid, tid);
    }
}
