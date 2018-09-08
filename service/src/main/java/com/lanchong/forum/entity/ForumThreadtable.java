package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_forum_threadtable",  catalog = "")
@IdClass(ForumThreadtablePK.class)
public class ForumThreadtable {
    private Short fid;
    private Short threadtableid;
    private Integer threads;
    private Integer posts;

    @Id
    @Column(name = "fid")
    public Short getFid() {
        return fid;
    }

    public void setFid(Short fid) {
        this.fid = fid;
    }

    @Id
    @Column(name = "threadtableid")
    public Short getThreadtableid() {
        return threadtableid;
    }

    public void setThreadtableid(Short threadtableid) {
        this.threadtableid = threadtableid;
    }

    @Basic
    @Column(name = "threads")
    public Integer getThreads() {
        return threads;
    }

    public void setThreads(Integer threads) {
        this.threads = threads;
    }

    @Basic
    @Column(name = "posts")
    public Integer getPosts() {
        return posts;
    }

    public void setPosts(Integer posts) {
        this.posts = posts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumThreadtable that = (ForumThreadtable) o;

        if (fid != null ? !fid.equals(that.fid) : that.fid != null) return false;
        if (threadtableid != null ? !threadtableid.equals(that.threadtableid) : that.threadtableid != null)
            return false;
        if (threads != null ? !threads.equals(that.threads) : that.threads != null) return false;
        if (posts != null ? !posts.equals(that.posts) : that.posts != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fid != null ? fid.hashCode() : 0;
        result = 31 * result + (threadtableid != null ? threadtableid.hashCode() : 0);
        result = 31 * result + (threads != null ? threads.hashCode() : 0);
        result = 31 * result + (posts != null ? posts.hashCode() : 0);
        return result;
    }
}
