package com.lanchong.home.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_home_poke", schema = "lanchonggk", catalog = "")
@IdClass(PokePK.class)
public class Poke {
    private Integer uid;
    private Integer fromuid;
    private String fromusername;
    private String note;
    private Integer dateline;
    private Short iconid;

    @Id
    @Column(name = "uid")
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Id
    @Column(name = "fromuid")
    public Integer getFromuid() {
        return fromuid;
    }

    public void setFromuid(Integer fromuid) {
        this.fromuid = fromuid;
    }

    @Basic
    @Column(name = "fromusername")
    public String getFromusername() {
        return fromusername;
    }

    public void setFromusername(String fromusername) {
        this.fromusername = fromusername;
    }

    @Basic
    @Column(name = "note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
    @Column(name = "iconid")
    public Short getIconid() {
        return iconid;
    }

    public void setIconid(Short iconid) {
        this.iconid = iconid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poke poke = (Poke) o;
        return Objects.equals(uid, poke.uid) &&
                Objects.equals(fromuid, poke.fromuid) &&
                Objects.equals(fromusername, poke.fromusername) &&
                Objects.equals(note, poke.note) &&
                Objects.equals(dateline, poke.dateline) &&
                Objects.equals(iconid, poke.iconid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uid, fromuid, fromusername, note, dateline, iconid);
    }
}
