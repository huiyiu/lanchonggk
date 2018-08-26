package com.lanchong.forum.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class ForumThreadtablePK implements Serializable {
    private Short fid;
    private Short threadtableid;

    @Column(name = "fid")
    @Id
    public Short getFid() {
        return fid;
    }

    public void setFid(Short fid) {
        this.fid = fid;
    }

    @Column(name = "threadtableid")
    @Id
    public Short getThreadtableid() {
        return threadtableid;
    }

    public void setThreadtableid(Short threadtableid) {
        this.threadtableid = threadtableid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ForumThreadtablePK that = (ForumThreadtablePK) o;

        if (fid != null ? !fid.equals(that.fid) : that.fid != null) return false;
        if (threadtableid != null ? !threadtableid.equals(that.threadtableid) : that.threadtableid != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fid != null ? fid.hashCode() : 0;
        result = 31 * result + (threadtableid != null ? threadtableid.hashCode() : 0);
        return result;
    }
}
