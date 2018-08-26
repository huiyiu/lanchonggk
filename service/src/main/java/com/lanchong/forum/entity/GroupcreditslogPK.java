package com.lanchong.forum.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class GroupcreditslogPK implements Serializable {
    private Integer fid;
    private Integer uid;
    private Integer logdate;

    @Column(name = "fid")
    @Id
    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    @Column(name = "uid")
    @Id
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Column(name = "logdate")
    @Id
    public Integer getLogdate() {
        return logdate;
    }

    public void setLogdate(Integer logdate) {
        this.logdate = logdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GroupcreditslogPK that = (GroupcreditslogPK) o;

        if (fid != null ? !fid.equals(that.fid) : that.fid != null) return false;
        if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
        if (logdate != null ? !logdate.equals(that.logdate) : that.logdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fid != null ? fid.hashCode() : 0;
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        result = 31 * result + (logdate != null ? logdate.hashCode() : 0);
        return result;
    }
}
