package com.lanchong.forum.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_forum_threadclass",  catalog = "")
public class Threadclass {
    private Integer typeid;
    private Integer fid;
    private String name;
    private Integer displayorder;
    private String icon;
    private Byte moderators;

    @Id
    @Column(name = "typeid")
    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    @Basic
    @Column(name = "fid")
    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
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
    @Column(name = "displayorder")
    public Integer getDisplayorder() {
        return displayorder;
    }

    public void setDisplayorder(Integer displayorder) {
        this.displayorder = displayorder;
    }

    @Basic
    @Column(name = "icon")
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Basic
    @Column(name = "moderators")
    public Byte getModerators() {
        return moderators;
    }

    public void setModerators(Byte moderators) {
        this.moderators = moderators;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Threadclass that = (Threadclass) o;
        return Objects.equals(typeid, that.typeid) &&
                Objects.equals(fid, that.fid) &&
                Objects.equals(name, that.name) &&
                Objects.equals(displayorder, that.displayorder) &&
                Objects.equals(icon, that.icon) &&
                Objects.equals(moderators, that.moderators);
    }

    @Override
    public int hashCode() {

        return Objects.hash(typeid, fid, name, displayorder, icon, moderators);
    }
}
