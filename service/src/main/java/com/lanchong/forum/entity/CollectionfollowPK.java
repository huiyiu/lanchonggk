package com.lanchong.forum.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class CollectionfollowPK implements Serializable {
    private Integer uid;
    private Integer ctid;

    @Column(name = "uid")
    @Id
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Column(name = "ctid")
    @Id
    public Integer getCtid() {
        return ctid;
    }

    public void setCtid(Integer ctid) {
        this.ctid = ctid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CollectionfollowPK that = (CollectionfollowPK) o;

        if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
        if (ctid != null ? !ctid.equals(that.ctid) : that.ctid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uid != null ? uid.hashCode() : 0;
        result = 31 * result + (ctid != null ? ctid.hashCode() : 0);
        return result;
    }
}
