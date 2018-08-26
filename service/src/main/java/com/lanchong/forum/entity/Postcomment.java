package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_postcomment", schema = "lanchonggk", catalog = "")
public class Postcomment {
    private Integer id;
    private Integer tid;
    private Integer pid;
    private String author;
    private Integer authorid;
    private Integer dateline;
    private String comment;
    private Byte score;
    private String useip;
    private Short port;
    private Integer rpid;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    @Column(name = "pid")
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
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
    @Column(name = "dateline")
    public Integer getDateline() {
        return dateline;
    }

    public void setDateline(Integer dateline) {
        this.dateline = dateline;
    }

    @Basic
    @Column(name = "comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "score")
    public Byte getScore() {
        return score;
    }

    public void setScore(Byte score) {
        this.score = score;
    }

    @Basic
    @Column(name = "useip")
    public String getUseip() {
        return useip;
    }

    public void setUseip(String useip) {
        this.useip = useip;
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
    @Column(name = "rpid")
    public Integer getRpid() {
        return rpid;
    }

    public void setRpid(Integer rpid) {
        this.rpid = rpid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Postcomment that = (Postcomment) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (tid != null ? !tid.equals(that.tid) : that.tid != null) return false;
        if (pid != null ? !pid.equals(that.pid) : that.pid != null) return false;
        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        if (authorid != null ? !authorid.equals(that.authorid) : that.authorid != null) return false;
        if (dateline != null ? !dateline.equals(that.dateline) : that.dateline != null) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (score != null ? !score.equals(that.score) : that.score != null) return false;
        if (useip != null ? !useip.equals(that.useip) : that.useip != null) return false;
        if (port != null ? !port.equals(that.port) : that.port != null) return false;
        if (rpid != null ? !rpid.equals(that.rpid) : that.rpid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (tid != null ? tid.hashCode() : 0);
        result = 31 * result + (pid != null ? pid.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (authorid != null ? authorid.hashCode() : 0);
        result = 31 * result + (dateline != null ? dateline.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + (useip != null ? useip.hashCode() : 0);
        result = 31 * result + (port != null ? port.hashCode() : 0);
        result = 31 * result + (rpid != null ? rpid.hashCode() : 0);
        return result;
    }
}
