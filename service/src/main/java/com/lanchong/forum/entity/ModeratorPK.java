package com.lanchong.forum.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class ModeratorPK implements Serializable {
    private Integer uid;
    private Integer fid;

    @Column(name = "uid")
    @Id
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Column(name = "fid")
    @Id
    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ModeratorPK that = (ModeratorPK) o;

        if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
        if (fid != null ? !fid.equals(that.fid) : that.fid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uid != null ? uid.hashCode() : 0;
        result = 31 * result + (fid != null ? fid.hashCode() : 0);
        return result;
    }
}
