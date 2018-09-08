package com.lanchong.home.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_home_click",  catalog = "")
public class Click {
    private Short clickid;
    private String name;
    private String icon;
    private String idtype;
    private Byte available;
    private Byte displayorder;

    @Id
    @Column(name = "clickid")
    public Short getClickid() {
        return clickid;
    }

    public void setClickid(Short clickid) {
        this.clickid = clickid;
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
    @Column(name = "icon")
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
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
    @Column(name = "available")
    public Byte getAvailable() {
        return available;
    }

    public void setAvailable(Byte available) {
        this.available = available;
    }

    @Basic
    @Column(name = "displayorder")
    public Byte getDisplayorder() {
        return displayorder;
    }

    public void setDisplayorder(Byte displayorder) {
        this.displayorder = displayorder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Click click = (Click) o;
        return Objects.equals(clickid, click.clickid) &&
                Objects.equals(name, click.name) &&
                Objects.equals(icon, click.icon) &&
                Objects.equals(idtype, click.idtype) &&
                Objects.equals(available, click.available) &&
                Objects.equals(displayorder, click.displayorder);
    }

    @Override
    public int hashCode() {

        return Objects.hash(clickid, name, icon, idtype, available, displayorder);
    }
}
