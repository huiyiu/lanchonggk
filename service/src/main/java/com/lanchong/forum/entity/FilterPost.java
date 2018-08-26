package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_filter_post", schema = "lanchonggk", catalog = "")
@IdClass(FilterPostPK.class)
public class FilterPost {
    private Integer tid;
    private Integer pid;
    private Integer postlength;

    @Id
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

    @Basic
    @Column(name = "postlength")
    public Integer getPostlength() {
        return postlength;
    }

    public void setPostlength(Integer postlength) {
        this.postlength = postlength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FilterPost that = (FilterPost) o;

        if (tid != null ? !tid.equals(that.tid) : that.tid != null) return false;
        if (pid != null ? !pid.equals(that.pid) : that.pid != null) return false;
        if (postlength != null ? !postlength.equals(that.postlength) : that.postlength != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tid != null ? tid.hashCode() : 0;
        result = 31 * result + (pid != null ? pid.hashCode() : 0);
        result = 31 * result + (postlength != null ? postlength.hashCode() : 0);
        return result;
    }
}
