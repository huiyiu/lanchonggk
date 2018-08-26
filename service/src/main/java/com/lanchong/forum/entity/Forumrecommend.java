package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_forumrecommend", schema = "lanchonggk", catalog = "")
public class Forumrecommend {
    private Integer fid;
    private Integer tid;
    private Short typeid;
    private Byte displayorder;
    private String subject;
    private String author;
    private Integer authorid;
    private Integer moderatorid;
    private Integer expiration;
    private Byte position;
    private Byte highlight;
    private Integer aid;
    private String filename;

    @Basic
    @Column(name = "fid")
    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    @Id
    @Column(name = "tid")
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Basic
    @Column(name = "typeid")
    public Short getTypeid() {
        return typeid;
    }

    public void setTypeid(Short typeid) {
        this.typeid = typeid;
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
    @Column(name = "subject")
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Basic
    @Column(name = "author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "authorid")
    public Integer getAuthorid() {
        return authorid;
    }

    public void setAuthorid(Integer authorid) {
        this.authorid = authorid;
    }

    @Basic
    @Column(name = "moderatorid")
    public Integer getModeratorid() {
        return moderatorid;
    }

    public void setModeratorid(Integer moderatorid) {
        this.moderatorid = moderatorid;
    }

    @Basic
    @Column(name = "expiration")
    public Integer getExpiration() {
        return expiration;
    }

    public void setExpiration(Integer expiration) {
        this.expiration = expiration;
    }

    @Basic
    @Column(name = "position")
    public Byte getPosition() {
        return position;
    }

    public void setPosition(Byte position) {
        this.position = position;
    }

    @Basic
    @Column(name = "highlight")
    public Byte getHighlight() {
        return highlight;
    }

    public void setHighlight(Byte highlight) {
        this.highlight = highlight;
    }

    @Basic
    @Column(name = "aid")
    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    @Basic
    @Column(name = "filename")
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Forumrecommend that = (Forumrecommend) o;

        if (fid != null ? !fid.equals(that.fid) : that.fid != null) return false;
        if (tid != null ? !tid.equals(that.tid) : that.tid != null) return false;
        if (typeid != null ? !typeid.equals(that.typeid) : that.typeid != null) return false;
        if (displayorder != null ? !displayorder.equals(that.displayorder) : that.displayorder != null) return false;
        if (subject != null ? !subject.equals(that.subject) : that.subject != null) return false;
        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        if (authorid != null ? !authorid.equals(that.authorid) : that.authorid != null) return false;
        if (moderatorid != null ? !moderatorid.equals(that.moderatorid) : that.moderatorid != null) return false;
        if (expiration != null ? !expiration.equals(that.expiration) : that.expiration != null) return false;
        if (position != null ? !position.equals(that.position) : that.position != null) return false;
        if (highlight != null ? !highlight.equals(that.highlight) : that.highlight != null) return false;
        if (aid != null ? !aid.equals(that.aid) : that.aid != null) return false;
        if (filename != null ? !filename.equals(that.filename) : that.filename != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fid != null ? fid.hashCode() : 0;
        result = 31 * result + (tid != null ? tid.hashCode() : 0);
        result = 31 * result + (typeid != null ? typeid.hashCode() : 0);
        result = 31 * result + (displayorder != null ? displayorder.hashCode() : 0);
        result = 31 * result + (subject != null ? subject.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (authorid != null ? authorid.hashCode() : 0);
        result = 31 * result + (moderatorid != null ? moderatorid.hashCode() : 0);
        result = 31 * result + (expiration != null ? expiration.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (highlight != null ? highlight.hashCode() : 0);
        result = 31 * result + (aid != null ? aid.hashCode() : 0);
        result = 31 * result + (filename != null ? filename.hashCode() : 0);
        return result;
    }
}
