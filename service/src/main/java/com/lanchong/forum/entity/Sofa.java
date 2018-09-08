package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_sofa",  catalog = "")
public class Sofa {
    private Integer tid;
    private Integer fid;

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
    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sofa sofa = (Sofa) o;

        if (tid != null ? !tid.equals(sofa.tid) : sofa.tid != null) return false;
        if (fid != null ? !fid.equals(sofa.fid) : sofa.fid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tid != null ? tid.hashCode() : 0;
        result = 31 * result + (fid != null ? fid.hashCode() : 0);
        return result;
    }
}
