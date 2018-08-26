package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_hotreply_number", schema = "lanchonggk", catalog = "")
public class HotreplyNumber {
    private Integer pid;
    private Integer tid;
    private Short support;
    private Short against;
    private Integer total;

    @Id
    @Column(name = "pid")
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "tid")
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Basic
    @Column(name = "support")
    public Short getSupport() {
        return support;
    }

    public void setSupport(Short support) {
        this.support = support;
    }

    @Basic
    @Column(name = "against")
    public Short getAgainst() {
        return against;
    }

    public void setAgainst(Short against) {
        this.against = against;
    }

    @Basic
    @Column(name = "total")
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HotreplyNumber that = (HotreplyNumber) o;

        if (pid != null ? !pid.equals(that.pid) : that.pid != null) return false;
        if (tid != null ? !tid.equals(that.tid) : that.tid != null) return false;
        if (support != null ? !support.equals(that.support) : that.support != null) return false;
        if (against != null ? !against.equals(that.against) : that.against != null) return false;
        if (total != null ? !total.equals(that.total) : that.total != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pid != null ? pid.hashCode() : 0;
        result = 31 * result + (tid != null ? tid.hashCode() : 0);
        result = 31 * result + (support != null ? support.hashCode() : 0);
        result = 31 * result + (against != null ? against.hashCode() : 0);
        result = 31 * result + (total != null ? total.hashCode() : 0);
        return result;
    }
}
