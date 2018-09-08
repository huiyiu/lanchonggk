package com.lanchong.home.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_home_blogfield",  catalog = "")
public class Blogfield {
    private Integer blogid;
    private Integer uid;
    private String pic;
    private String tag;
    private String message;
    private String postip;
    private Short port;
    private String related;
    private Integer relatedtime;
    private String targetIds;
    private String hotuser;
    private Byte magiccolor;
    private Byte magicpaper;
    private Integer pushedaid;

    @Id
    @Column(name = "blogid")
    public Integer getBlogid() {
        return blogid;
    }

    public void setBlogid(Integer blogid) {
        this.blogid = blogid;
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
    @Column(name = "pic")
    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Basic
    @Column(name = "tag")
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Basic
    @Column(name = "message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Basic
    @Column(name = "postip")
    public String getPostip() {
        return postip;
    }

    public void setPostip(String postip) {
        this.postip = postip;
    }

    @Basic
    @Column(name = "port")
    public Short getPort() {
        return port;
    }

    public void setPort(Short port) {
        this.port = port;
    }

    @Basic
    @Column(name = "related")
    public String getRelated() {
        return related;
    }

    public void setRelated(String related) {
        this.related = related;
    }

    @Basic
    @Column(name = "relatedtime")
    public Integer getRelatedtime() {
        return relatedtime;
    }

    public void setRelatedtime(Integer relatedtime) {
        this.relatedtime = relatedtime;
    }

    @Basic
    @Column(name = "target_ids")
    public String getTargetIds() {
        return targetIds;
    }

    public void setTargetIds(String targetIds) {
        this.targetIds = targetIds;
    }

    @Basic
    @Column(name = "hotuser")
    public String getHotuser() {
        return hotuser;
    }

    public void setHotuser(String hotuser) {
        this.hotuser = hotuser;
    }

    @Basic
    @Column(name = "magiccolor")
    public Byte getMagiccolor() {
        return magiccolor;
    }

    public void setMagiccolor(Byte magiccolor) {
        this.magiccolor = magiccolor;
    }

    @Basic
    @Column(name = "magicpaper")
    public Byte getMagicpaper() {
        return magicpaper;
    }

    public void setMagicpaper(Byte magicpaper) {
        this.magicpaper = magicpaper;
    }

    @Basic
    @Column(name = "pushedaid")
    public Integer getPushedaid() {
        return pushedaid;
    }

    public void setPushedaid(Integer pushedaid) {
        this.pushedaid = pushedaid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Blogfield blogfield = (Blogfield) o;
        return Objects.equals(blogid, blogfield.blogid) &&
                Objects.equals(uid, blogfield.uid) &&
                Objects.equals(pic, blogfield.pic) &&
                Objects.equals(tag, blogfield.tag) &&
                Objects.equals(message, blogfield.message) &&
                Objects.equals(postip, blogfield.postip) &&
                Objects.equals(port, blogfield.port) &&
                Objects.equals(related, blogfield.related) &&
                Objects.equals(relatedtime, blogfield.relatedtime) &&
                Objects.equals(targetIds, blogfield.targetIds) &&
                Objects.equals(hotuser, blogfield.hotuser) &&
                Objects.equals(magiccolor, blogfield.magiccolor) &&
                Objects.equals(magicpaper, blogfield.magicpaper) &&
                Objects.equals(pushedaid, blogfield.pushedaid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(blogid, uid, pic, tag, message, postip, port, related, relatedtime, targetIds, hotuser, magiccolor, magicpaper, pushedaid);
    }
}
