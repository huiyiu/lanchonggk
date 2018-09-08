package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_groupcreditslog",  catalog = "")
@IdClass(GroupcreditslogPK.class)
public class Groupcreditslog {
    private Integer fid;
    private Integer uid;
    private Integer logdate;

    @Id
    @Column(name = "fid")
    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    @Id
    @Column(name = "uid")
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Id
    @Column(name = "logdate")
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

        Groupcreditslog that = (Groupcreditslog) o;

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
