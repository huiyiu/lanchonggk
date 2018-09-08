package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_medal",  catalog = "")
public class Medal {
    private Short medalid;
    private String name;
    private Byte available;
    private String image;
    private Byte type;
    private Byte displayorder;
    private String description;
    private Short expiration;
    private String permission;
    private Byte credit;
    private Integer price;

    @Id
    @Column(name = "medalid")
    public Short getMedalid() {
        return medalid;
    }

    public void setMedalid(Short medalid) {
        this.medalid = medalid;
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
    @Column(name = "available")
    public Byte getAvailable() {
        return available;
    }

    public void setAvailable(Byte available) {
        this.available = available;
    }

    @Basic
    @Column(name = "image")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Basic
    @Column(name = "type")
    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    @Basic
    @Column(name = "displayorder")
    public Byte getDisplayorder() {
        return displayorder;
    }

    public void setDisplayorder(Byte displayorder) {
        this.displayorder = displayorder;
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
    @Column(name = "expiration")
    public Short getExpiration() {
        return expiration;
    }

    public void setExpiration(Short expiration) {
        this.expiration = expiration;
    }

    @Basic
    @Column(name = "permission")
    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Basic
    @Column(name = "credit")
    public Byte getCredit() {
        return credit;
    }

    public void setCredit(Byte credit) {
        this.credit = credit;
    }

    @Basic
    @Column(name = "price")
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Medal medal = (Medal) o;

        if (medalid != null ? !medalid.equals(medal.medalid) : medal.medalid != null) return false;
        if (name != null ? !name.equals(medal.name) : medal.name != null) return false;
        if (available != null ? !available.equals(medal.available) : medal.available != null) return false;
        if (image != null ? !image.equals(medal.image) : medal.image != null) return false;
        if (type != null ? !type.equals(medal.type) : medal.type != null) return false;
        if (displayorder != null ? !displayorder.equals(medal.displayorder) : medal.displayorder != null) return false;
        if (description != null ? !description.equals(medal.description) : medal.description != null) return false;
        if (expiration != null ? !expiration.equals(medal.expiration) : medal.expiration != null) return false;
        if (permission != null ? !permission.equals(medal.permission) : medal.permission != null) return false;
        if (credit != null ? !credit.equals(medal.credit) : medal.credit != null) return false;
        if (price != null ? !price.equals(medal.price) : medal.price != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = medalid != null ? medalid.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (available != null ? available.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (displayorder != null ? displayorder.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (expiration != null ? expiration.hashCode() : 0);
        result = 31 * result + (permission != null ? permission.hashCode() : 0);
        result = 31 * result + (credit != null ? credit.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }
}
