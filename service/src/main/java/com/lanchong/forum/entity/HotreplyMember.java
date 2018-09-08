package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_hotreply_member",  catalog = "")
@IdClass(HotreplyMemberPK.class)
public class HotreplyMember {
    private Integer tid;
    private Integer pid;
    private Integer uid;
    private Byte attitude;

    @Basic
    @Column(name = "tid")
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Id
    @Column(name = "pid")
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
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
    @Column(name = "attitude")
    public Byte getAttitude() {
        return attitude;
    }

    public void setAttitude(Byte attitude) {
        this.attitude = attitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HotreplyMember that = (HotreplyMember) o;

        if (tid != null ? !tid.equals(that.tid) : that.tid != null) return false;
        if (pid != null ? !pid.equals(that.pid) : that.pid != null) return false;
        if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
        if (attitude != null ? !attitude.equals(that.attitude) : that.attitude != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tid != null ? tid.hashCode() : 0;
        result = 31 * result + (pid != null ? pid.hashCode() : 0);
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        result = 31 * result + (attitude != null ? attitude.hashCode() : 0);
        return result;
    }
}
