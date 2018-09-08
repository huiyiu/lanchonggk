package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_warning",  catalog = "")
public class Warning {
    private Integer wid;
    private Integer pid;
    private Integer operatorid;
    private String operator;
    private Integer authorid;
    private String author;
    private Integer dateline;
    private String reason;

    @Id
    @Column(name = "wid")
    public Integer getWid() {
        return wid;
    }

    public void setWid(Integer wid) {
        this.wid = wid;
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
    @Column(name = "operatorid")
    public Integer getOperatorid() {
        return operatorid;
    }

    public void setOperatorid(Integer operatorid) {
        this.operatorid = operatorid;
    }

    @Basic
    @Column(name = "operator")
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
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
    @Column(name = "author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
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
    @Column(name = "reason")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Warning warning = (Warning) o;

        if (wid != null ? !wid.equals(warning.wid) : warning.wid != null) return false;
        if (pid != null ? !pid.equals(warning.pid) : warning.pid != null) return false;
        if (operatorid != null ? !operatorid.equals(warning.operatorid) : warning.operatorid != null) return false;
        if (operator != null ? !operator.equals(warning.operator) : warning.operator != null) return false;
        if (authorid != null ? !authorid.equals(warning.authorid) : warning.authorid != null) return false;
        if (author != null ? !author.equals(warning.author) : warning.author != null) return false;
        if (dateline != null ? !dateline.equals(warning.dateline) : warning.dateline != null) return false;
        if (reason != null ? !reason.equals(warning.reason) : warning.reason != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = wid != null ? wid.hashCode() : 0;
        result = 31 * result + (pid != null ? pid.hashCode() : 0);
        result = 31 * result + (operatorid != null ? operatorid.hashCode() : 0);
        result = 31 * result + (operator != null ? operator.hashCode() : 0);
        result = 31 * result + (authorid != null ? authorid.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (dateline != null ? dateline.hashCode() : 0);
        result = 31 * result + (reason != null ? reason.hashCode() : 0);
        return result;
    }
}
