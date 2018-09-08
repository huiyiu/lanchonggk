package com.lanchong.home.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_home_pokearchive",  catalog = "")
public class Pokearchive {
    private Integer pid;
    private Integer pokeuid;
    private Integer uid;
    private Integer fromuid;
    private String note;
    private Integer dateline;
    private Short iconid;

    @Id
    @Column(name = "pid")
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "pokeuid")
    public Integer getPokeuid() {
        return pokeuid;
    }

    public void setPokeuid(Integer pokeuid) {
        this.pokeuid = pokeuid;
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
    @Column(name = "fromuid")
    public Integer getFromuid() {
        return fromuid;
    }

    public void setFromuid(Integer fromuid) {
        this.fromuid = fromuid;
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
        Pokearchive that = (Pokearchive) o;
        return Objects.equals(pid, that.pid) &&
                Objects.equals(pokeuid, that.pokeuid) &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(fromuid, that.fromuid) &&
                Objects.equals(note, that.note) &&
                Objects.equals(dateline, that.dateline) &&
                Objects.equals(iconid, that.iconid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(pid, pokeuid, uid, fromuid, note, dateline, iconid);
    }
}
