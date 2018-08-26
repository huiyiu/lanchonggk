package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_collectioninvite", schema = "lanchonggk", catalog = "")
@IdClass(CollectioninvitePK.class)
public class Collectioninvite {
    private Integer ctid;
    private Integer uid;
    private Integer dateline;

    @Id
    @Column(name = "ctid")
    public Integer getCtid() {
        return ctid;
    }

    public void setCtid(Integer ctid) {
        this.ctid = ctid;
    }

    @Id
    @Column(name = "uid")
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "dateline")
    public Integer getDateline() {
        return dateline;
    }

    public void setDateline(Integer dateline) {
        this.dateline = dateline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Collectioninvite that = (Collectioninvite) o;

        if (ctid != null ? !ctid.equals(that.ctid) : that.ctid != null) return false;
        if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
        if (dateline != null ? !dateline.equals(that.dateline) : that.dateline != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ctid != null ? ctid.hashCode() : 0;
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        result = 31 * result + (dateline != null ? dateline.hashCode() : 0);
        return result;
    }
}
