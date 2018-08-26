package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_collectionteamworker", schema = "lanchonggk", catalog = "")
@IdClass(CollectionteamworkerPK.class)
public class Collectionteamworker {
    private Integer ctid;
    private Integer uid;
    private String name;
    private String username;
    private Integer lastvisit;

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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

        Collectionteamworker that = (Collectionteamworker) o;

        if (ctid != null ? !ctid.equals(that.ctid) : that.ctid != null) return false;
        if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (lastvisit != null ? !lastvisit.equals(that.lastvisit) : that.lastvisit != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ctid != null ? ctid.hashCode() : 0;
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (lastvisit != null ? lastvisit.hashCode() : 0);
        return result;
    }
}
