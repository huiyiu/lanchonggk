package com.lanchong.forum.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class CollectionthreadPK implements Serializable {
    private Integer ctid;
    private Integer tid;

    @Column(name = "ctid")
    @Id
    public Integer getCtid() {
        return ctid;
    }

    public void setCtid(Integer ctid) {
        this.ctid = ctid;
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

        CollectionthreadPK that = (CollectionthreadPK) o;

        if (ctid != null ? !ctid.equals(that.ctid) : that.ctid != null) return false;
        if (tid != null ? !tid.equals(that.tid) : that.tid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ctid != null ? ctid.hashCode() : 0;
        result = 31 * result + (tid != null ? tid.hashCode() : 0);
        return result;
    }
}
