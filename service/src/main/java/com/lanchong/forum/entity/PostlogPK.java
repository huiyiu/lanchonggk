package com.lanchong.forum.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class PostlogPK implements Serializable {
    private Integer pid;
    private Integer tid;

    @Column(name = "pid")
    @Id
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
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

        PostlogPK postlogPK = (PostlogPK) o;

        if (pid != null ? !pid.equals(postlogPK.pid) : postlogPK.pid != null) return false;
        if (tid != null ? !tid.equals(postlogPK.tid) : postlogPK.tid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pid != null ? pid.hashCode() : 0;
        result = 31 * result + (tid != null ? tid.hashCode() : 0);
        return result;
    }
}
