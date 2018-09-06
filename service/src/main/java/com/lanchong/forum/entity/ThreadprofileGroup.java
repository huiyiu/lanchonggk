package com.lanchong.forum.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_forum_threadprofile_group",  catalog = "")
public class ThreadprofileGroup {
    private Integer gid;
    private Integer tpid;

    @Id
    @Column(name = "gid")
    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    @Basic
    @Column(name = "tpid")
    public Integer getTpid() {
        return tpid;
    }

    public void setTpid(Integer tpid) {
        this.tpid = tpid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ThreadprofileGroup that = (ThreadprofileGroup) o;
        return Objects.equals(gid, that.gid) &&
                Objects.equals(tpid, that.tpid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(gid, tpid);
    }
}
