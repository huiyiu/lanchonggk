package com.lanchong.home.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_home_comment_moderate",  catalog = "")
public class CommentModerate {
    private Integer id;
    private String idtype;
    private Byte status;
    private Integer dateline;

    @Id
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
    @Column(name = "status")
    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
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
        CommentModerate that = (CommentModerate) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(idtype, that.idtype) &&
                Objects.equals(status, that.status) &&
                Objects.equals(dateline, that.dateline);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, idtype, status, dateline);
    }
}
