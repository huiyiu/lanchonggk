package com.lanchong.forum.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
@Table(name = "ldp_forum_rsscache",  catalog = "")
public class Rsscache {
    private Integer lastupdate;
    private Integer fid;
    private Integer tid;
    private Integer dateline;
    private String forum;
    private String author;
    private String subject;
    private String description;
    private String guidetype;

    @Basic
    @Column(name = "lastupdate")
    public Integer getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Integer lastupdate) {
        this.lastupdate = lastupdate;
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
    @Column(name = "tid")
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
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
    @Column(name = "forum")
    public String getForum() {
        return forum;
    }

    public void setForum(String forum) {
        this.forum = forum;
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
    @Column(name = "subject")
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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
    @Column(name = "guidetype")
    public String getGuidetype() {
        return guidetype;
    }

    public void setGuidetype(String guidetype) {
        this.guidetype = guidetype;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rsscache rsscache = (Rsscache) o;

        if (lastupdate != null ? !lastupdate.equals(rsscache.lastupdate) : rsscache.lastupdate != null) return false;
        if (fid != null ? !fid.equals(rsscache.fid) : rsscache.fid != null) return false;
        if (tid != null ? !tid.equals(rsscache.tid) : rsscache.tid != null) return false;
        if (dateline != null ? !dateline.equals(rsscache.dateline) : rsscache.dateline != null) return false;
        if (forum != null ? !forum.equals(rsscache.forum) : rsscache.forum != null) return false;
        if (author != null ? !author.equals(rsscache.author) : rsscache.author != null) return false;
        if (subject != null ? !subject.equals(rsscache.subject) : rsscache.subject != null) return false;
        if (description != null ? !description.equals(rsscache.description) : rsscache.description != null)
            return false;
        if (guidetype != null ? !guidetype.equals(rsscache.guidetype) : rsscache.guidetype != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = lastupdate != null ? lastupdate.hashCode() : 0;
        result = 31 * result + (fid != null ? fid.hashCode() : 0);
        result = 31 * result + (tid != null ? tid.hashCode() : 0);
        result = 31 * result + (dateline != null ? dateline.hashCode() : 0);
        result = 31 * result + (forum != null ? forum.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (subject != null ? subject.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (guidetype != null ? guidetype.hashCode() : 0);
        return result;
    }
}
