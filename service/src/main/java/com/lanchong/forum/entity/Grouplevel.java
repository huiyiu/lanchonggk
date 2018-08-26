package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_grouplevel", schema = "lanchonggk", catalog = "")
public class Grouplevel {
    private Short levelid;
    private Integer type;
    private String leveltitle;
    private Integer creditshigher;
    private Integer creditslower;
    private String icon;
    private String creditspolicy;
    private String postpolicy;
    private String specialswitch;

    @Id
    @Column(name = "levelid")
    public Short getLevelid() {
        return levelid;
    }

    public void setLevelid(Short levelid) {
        this.levelid = levelid;
    }

    @Basic
    @Column(name = "type")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Basic
    @Column(name = "leveltitle")
    public String getLeveltitle() {
        return leveltitle;
    }

    public void setLeveltitle(String leveltitle) {
        this.leveltitle = leveltitle;
    }

    @Basic
    @Column(name = "creditshigher")
    public Integer getCreditshigher() {
        return creditshigher;
    }

    public void setCreditshigher(Integer creditshigher) {
        this.creditshigher = creditshigher;
    }

    @Basic
    @Column(name = "creditslower")
    public Integer getCreditslower() {
        return creditslower;
    }

    public void setCreditslower(Integer creditslower) {
        this.creditslower = creditslower;
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
    @Column(name = "creditspolicy")
    public String getCreditspolicy() {
        return creditspolicy;
    }

    public void setCreditspolicy(String creditspolicy) {
        this.creditspolicy = creditspolicy;
    }

    @Basic
    @Column(name = "postpolicy")
    public String getPostpolicy() {
        return postpolicy;
    }

    public void setPostpolicy(String postpolicy) {
        this.postpolicy = postpolicy;
    }

    @Basic
    @Column(name = "specialswitch")
    public String getSpecialswitch() {
        return specialswitch;
    }

    public void setSpecialswitch(String specialswitch) {
        this.specialswitch = specialswitch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Grouplevel that = (Grouplevel) o;

        if (levelid != null ? !levelid.equals(that.levelid) : that.levelid != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (leveltitle != null ? !leveltitle.equals(that.leveltitle) : that.leveltitle != null) return false;
        if (creditshigher != null ? !creditshigher.equals(that.creditshigher) : that.creditshigher != null)
            return false;
        if (creditslower != null ? !creditslower.equals(that.creditslower) : that.creditslower != null) return false;
        if (icon != null ? !icon.equals(that.icon) : that.icon != null) return false;
        if (creditspolicy != null ? !creditspolicy.equals(that.creditspolicy) : that.creditspolicy != null)
            return false;
        if (postpolicy != null ? !postpolicy.equals(that.postpolicy) : that.postpolicy != null) return false;
        if (specialswitch != null ? !specialswitch.equals(that.specialswitch) : that.specialswitch != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = levelid != null ? levelid.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (leveltitle != null ? leveltitle.hashCode() : 0);
        result = 31 * result + (creditshigher != null ? creditshigher.hashCode() : 0);
        result = 31 * result + (creditslower != null ? creditslower.hashCode() : 0);
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        result = 31 * result + (creditspolicy != null ? creditspolicy.hashCode() : 0);
        result = 31 * result + (postpolicy != null ? postpolicy.hashCode() : 0);
        result = 31 * result + (specialswitch != null ? specialswitch.hashCode() : 0);
        return result;
    }
}
