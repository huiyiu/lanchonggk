package com.lanchong.forum.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class HotreplyMemberPK implements Serializable {
    private Integer pid;
    private Integer uid;

    @Column(name = "pid")
    @Id
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
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

        HotreplyMemberPK that = (HotreplyMemberPK) o;

        if (pid != null ? !pid.equals(that.pid) : that.pid != null) return false;
        if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pid != null ? pid.hashCode() : 0;
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        return result;
    }
}
