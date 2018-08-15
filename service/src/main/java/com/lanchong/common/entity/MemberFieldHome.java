package com.lanchong.common.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_common_member_field_home", schema = "bdm186320220", catalog = "")
public class MemberFieldHome {
    private Integer uid;
    private String videophoto;
    private String spacename;
    private String spacedescription;
    private String domain;
    private Integer addsize;
    private Short addfriend;
    private Short menunum;
    private String theme;
    private String spacecss;
    private String blockposition;
    private String recentnote;
    private String spacenote;
    private String privacy;
    private String feedfriend;
    private String acceptemail;
    private String magicgift;
    private String stickblogs;

    @Id
    @Column(name = "uid")
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "videophoto")
    public String getVideophoto() {
        return videophoto;
    }

    public void setVideophoto(String videophoto) {
        this.videophoto = videophoto;
    }

    @Basic
    @Column(name = "spacename")
    public String getSpacename() {
        return spacename;
    }

    public void setSpacename(String spacename) {
        this.spacename = spacename;
    }

    @Basic
    @Column(name = "spacedescription")
    public String getSpacedescription() {
        return spacedescription;
    }

    public void setSpacedescription(String spacedescription) {
        this.spacedescription = spacedescription;
    }

    @Basic
    @Column(name = "domain")
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Basic
    @Column(name = "addsize")
    public Integer getAddsize() {
        return addsize;
    }

    public void setAddsize(Integer addsize) {
        this.addsize = addsize;
    }

    @Basic
    @Column(name = "addfriend")
    public Short getAddfriend() {
        return addfriend;
    }

    public void setAddfriend(Short addfriend) {
        this.addfriend = addfriend;
    }

    @Basic
    @Column(name = "menunum")
    public Short getMenunum() {
        return menunum;
    }

    public void setMenunum(Short menunum) {
        this.menunum = menunum;
    }

    @Basic
    @Column(name = "theme")
    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    @Basic
    @Column(name = "spacecss")
    public String getSpacecss() {
        return spacecss;
    }

    public void setSpacecss(String spacecss) {
        this.spacecss = spacecss;
    }

    @Basic
    @Column(name = "blockposition")
    public String getBlockposition() {
        return blockposition;
    }

    public void setBlockposition(String blockposition) {
        this.blockposition = blockposition;
    }

    @Basic
    @Column(name = "recentnote")
    public String getRecentnote() {
        return recentnote;
    }

    public void setRecentnote(String recentnote) {
        this.recentnote = recentnote;
    }

    @Basic
    @Column(name = "spacenote")
    public String getSpacenote() {
        return spacenote;
    }

    public void setSpacenote(String spacenote) {
        this.spacenote = spacenote;
    }

    @Basic
    @Column(name = "privacy")
    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    @Basic
    @Column(name = "feedfriend")
    public String getFeedfriend() {
        return feedfriend;
    }

    public void setFeedfriend(String feedfriend) {
        this.feedfriend = feedfriend;
    }

    @Basic
    @Column(name = "acceptemail")
    public String getAcceptemail() {
        return acceptemail;
    }

    public void setAcceptemail(String acceptemail) {
        this.acceptemail = acceptemail;
    }

    @Basic
    @Column(name = "magicgift")
    public String getMagicgift() {
        return magicgift;
    }

    public void setMagicgift(String magicgift) {
        this.magicgift = magicgift;
    }

    @Basic
    @Column(name = "stickblogs")
    public String getStickblogs() {
        return stickblogs;
    }

    public void setStickblogs(String stickblogs) {
        this.stickblogs = stickblogs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberFieldHome that = (MemberFieldHome) o;
        return Objects.equals(uid, that.uid) &&
                Objects.equals(videophoto, that.videophoto) &&
                Objects.equals(spacename, that.spacename) &&
                Objects.equals(spacedescription, that.spacedescription) &&
                Objects.equals(domain, that.domain) &&
                Objects.equals(addsize, that.addsize) &&
                Objects.equals(addfriend, that.addfriend) &&
                Objects.equals(menunum, that.menunum) &&
                Objects.equals(theme, that.theme) &&
                Objects.equals(spacecss, that.spacecss) &&
                Objects.equals(blockposition, that.blockposition) &&
                Objects.equals(recentnote, that.recentnote) &&
                Objects.equals(spacenote, that.spacenote) &&
                Objects.equals(privacy, that.privacy) &&
                Objects.equals(feedfriend, that.feedfriend) &&
                Objects.equals(acceptemail, that.acceptemail) &&
                Objects.equals(magicgift, that.magicgift) &&
                Objects.equals(stickblogs, that.stickblogs);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uid, videophoto, spacename, spacedescription, domain, addsize, addfriend, menunum, theme, spacecss, blockposition, recentnote, spacenote, privacy, feedfriend, acceptemail, magicgift, stickblogs);
    }
}
