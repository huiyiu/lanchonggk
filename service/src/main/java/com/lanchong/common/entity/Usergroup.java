package com.lanchong.common.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_common_usergroup", schema = "lanchong", catalog = "")
public class Usergroup {
    private Short groupid;
    private Byte radminid;
    private String type;
    private String system;
    private String grouptitle;
    private Integer creditshigher;
    private Integer creditslower;
    private Byte stars;
    private String color;
    private String icon;
    private Byte allowvisit;
    private Byte allowsendpm;
    private Byte allowinvite;
    private Byte allowmailinvite;
    private Byte maxinvitenum;
    private Short inviteprice;
    private Short maxinviteday;

    @Id
    @Column(name = "groupid")
    public Short getGroupid() {
        return groupid;
    }

    public void setGroupid(Short groupid) {
        this.groupid = groupid;
    }

    @Basic
    @Column(name = "radminid")
    public Byte getRadminid() {
        return radminid;
    }

    public void setRadminid(Byte radminid) {
        this.radminid = radminid;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "system")
    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    @Basic
    @Column(name = "grouptitle")
    public String getGrouptitle() {
        return grouptitle;
    }

    public void setGrouptitle(String grouptitle) {
        this.grouptitle = grouptitle;
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
    @Column(name = "stars")
    public Byte getStars() {
        return stars;
    }

    public void setStars(Byte stars) {
        this.stars = stars;
    }

    @Basic
    @Column(name = "color")
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
    @Column(name = "allowvisit")
    public Byte getAllowvisit() {
        return allowvisit;
    }

    public void setAllowvisit(Byte allowvisit) {
        this.allowvisit = allowvisit;
    }

    @Basic
    @Column(name = "allowsendpm")
    public Byte getAllowsendpm() {
        return allowsendpm;
    }

    public void setAllowsendpm(Byte allowsendpm) {
        this.allowsendpm = allowsendpm;
    }

    @Basic
    @Column(name = "allowinvite")
    public Byte getAllowinvite() {
        return allowinvite;
    }

    public void setAllowinvite(Byte allowinvite) {
        this.allowinvite = allowinvite;
    }

    @Basic
    @Column(name = "allowmailinvite")
    public Byte getAllowmailinvite() {
        return allowmailinvite;
    }

    public void setAllowmailinvite(Byte allowmailinvite) {
        this.allowmailinvite = allowmailinvite;
    }

    @Basic
    @Column(name = "maxinvitenum")
    public Byte getMaxinvitenum() {
        return maxinvitenum;
    }

    public void setMaxinvitenum(Byte maxinvitenum) {
        this.maxinvitenum = maxinvitenum;
    }

    @Basic
    @Column(name = "inviteprice")
    public Short getInviteprice() {
        return inviteprice;
    }

    public void setInviteprice(Short inviteprice) {
        this.inviteprice = inviteprice;
    }

    @Basic
    @Column(name = "maxinviteday")
    public Short getMaxinviteday() {
        return maxinviteday;
    }

    public void setMaxinviteday(Short maxinviteday) {
        this.maxinviteday = maxinviteday;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usergroup usergroup = (Usergroup) o;
        return Objects.equals(groupid, usergroup.groupid) &&
                Objects.equals(radminid, usergroup.radminid) &&
                Objects.equals(type, usergroup.type) &&
               // Objects.equals(system, usergroup.system) &&
                Objects.equals(grouptitle, usergroup.grouptitle) &&
                Objects.equals(creditshigher, usergroup.creditshigher) &&
                Objects.equals(creditslower, usergroup.creditslower) &&
                Objects.equals(stars, usergroup.stars) &&
                Objects.equals(color, usergroup.color) &&
                Objects.equals(icon, usergroup.icon) &&
                Objects.equals(allowvisit, usergroup.allowvisit) &&
                Objects.equals(allowsendpm, usergroup.allowsendpm) &&
                Objects.equals(allowinvite, usergroup.allowinvite) &&
                Objects.equals(allowmailinvite, usergroup.allowmailinvite) &&
                Objects.equals(maxinvitenum, usergroup.maxinvitenum) &&
                Objects.equals(inviteprice, usergroup.inviteprice) &&
                Objects.equals(maxinviteday, usergroup.maxinviteday);
    }

    @Override
    public int hashCode() {

        return Objects.hash(groupid, radminid, type, grouptitle, creditshigher, creditslower, stars, color, icon, allowvisit, allowsendpm, allowinvite, allowmailinvite, maxinvitenum, inviteprice, maxinviteday);
    }
}
