package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_collectionfollow", schema = "lanchonggk", catalog = "")
@IdClass(CollectionfollowPK.class)
public class Collectionfollow {
    private Integer uid;
    private String username;
    private Integer ctid;
    private Integer dateline;
    private Integer lastvisit;

    @Id
    @Column(name = "uid")
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Id
    @Column(name = "ctid")
    public Integer getCtid() {
        return ctid;
    }

    public void setCtid(Integer ctid) {
        this.ctid = ctid;
    }

    @Basic
    @Column(name = "dateline")
    public Integer getDateline() {
        return dateline;
    }

    public void setDateline(Integer dateline) {
        this.dateline = dateline;
    }

    @Basic
    @Column(name = "lastvisit")
    public Integer getLastvisit() {
        return lastvisit;
    }

    public void setLastvisit(Integer lastvisit) {
        this.lastvisit = lastvisit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Collectionfollow that = (Collectionfollow) o;

        if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (ctid != null ? !ctid.equals(that.ctid) : that.ctid != null) return false;
        if (dateline != null ? !dateline.equals(that.dateline) : that.dateline != null) return false;
        if (lastvisit != null ? !lastvisit.equals(that.lastvisit) : that.lastvisit != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uid != null ? uid.hashCode() : 0;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (ctid != null ? ctid.hashCode() : 0);
        result = 31 * result + (dateline != null ? dateline.hashCode() : 0);
        result = 31 * result + (lastvisit != null ? lastvisit.hashCode() : 0);
        return result;
    }
}
