package com.lanchong.forum.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class CollectioninvitePK implements Serializable {
    private Integer ctid;
    private Integer uid;

    @Column(name = "ctid")
    @Id
    public Integer getCtid() {
        return ctid;
    }

    public void setCtid(Integer ctid) {
        this.ctid = ctid;
    }

    @Column(name = "uid")
    @Id
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CollectioninvitePK that = (CollectioninvitePK) o;

        if (ctid != null ? !ctid.equals(that.ctid) : that.ctid != null) return false;
        if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ctid != null ? ctid.hashCode() : 0;
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        return result;
    }
}
