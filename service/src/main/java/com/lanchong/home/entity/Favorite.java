package com.lanchong.home.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_home_favorite", schema = "lanchonggk", catalog = "")
public class Favorite {
    private Integer favid;
    private Integer uid;
    private Integer id;
    private String idtype;
    private Integer spaceuid;
    private String title;
    private String description;
    private Integer dateline;

    @Id
    @Column(name = "favid")
    public Integer getFavid() {
        return favid;
    }

    public void setFavid(Integer favid) {
        this.favid = favid;
    }

    @Basic
    @Column(name = "uid")
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "idtype")
    public String getIdtype() {
        return idtype;
    }

    public void setIdtype(String idtype) {
        this.idtype = idtype;
    }

    @Basic
    @Column(name = "spaceuid")
    public Integer getSpaceuid() {
        return spaceuid;
    }

    public void setSpaceuid(Integer spaceuid) {
        this.spaceuid = spaceuid;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        Favorite favorite = (Favorite) o;
        return Objects.equals(favid, favorite.favid) &&
                Objects.equals(uid, favorite.uid) &&
                Objects.equals(id, favorite.id) &&
                Objects.equals(idtype, favorite.idtype) &&
                Objects.equals(spaceuid, favorite.spaceuid) &&
                Objects.equals(title, favorite.title) &&
                Objects.equals(description, favorite.description) &&
                Objects.equals(dateline, favorite.dateline);
    }

    @Override
    public int hashCode() {

        return Objects.hash(favid, uid, id, idtype, spaceuid, title, description, dateline);
    }
}
