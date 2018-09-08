package com.lanchong.forum.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Date;

//@Entity
@Table(name = "ldp_forum_modwork",  catalog = "")
public class Modwork {
    private Integer uid;
    private String modaction;
    private Date dateline;
    private Short count;
    private Short posts;

    @Basic
    @Column(name = "uid")
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "modaction")
    public String getModaction() {
        return modaction;
    }

    public void setModaction(String modaction) {
        this.modaction = modaction;
    }

    @Basic
    @Column(name = "dateline")
    public Date getDateline() {
        return dateline;
    }

    public void setDateline(Date dateline) {
        this.dateline = dateline;
    }

    @Basic
    @Column(name = "count")
    public Short getCount() {
        return count;
    }

    public void setCount(Short count) {
        this.count = count;
    }

    @Basic
    @Column(name = "posts")
    public Short getPosts() {
        return posts;
    }

    public void setPosts(Short posts) {
        this.posts = posts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Modwork modwork = (Modwork) o;

        if (uid != null ? !uid.equals(modwork.uid) : modwork.uid != null) return false;
        if (modaction != null ? !modaction.equals(modwork.modaction) : modwork.modaction != null) return false;
        if (dateline != null ? !dateline.equals(modwork.dateline) : modwork.dateline != null) return false;
        if (count != null ? !count.equals(modwork.count) : modwork.count != null) return false;
        if (posts != null ? !posts.equals(modwork.posts) : modwork.posts != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uid != null ? uid.hashCode() : 0;
        result = 31 * result + (modaction != null ? modaction.hashCode() : 0);
        result = 31 * result + (dateline != null ? dateline.hashCode() : 0);
        result = 31 * result + (count != null ? count.hashCode() : 0);
        result = 31 * result + (posts != null ? posts.hashCode() : 0);
        return result;
    }
}
