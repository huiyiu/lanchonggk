package com.lanchong.forum.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
@Table(name = "ldp_forum_pollvoter", schema = "lanchonggk", catalog = "")
public class Pollvoter {
    private Integer tid;
    private Integer uid;
    private String username;
    private String options;
    private Integer dateline;

    @Basic
    @Column(name = "tid")
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
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
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "options")
    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    @Basic
    @Column(name = "dateline")
    public Integer getDateline() {
        return dateline;
    }

    public void setDateline(Integer dateline) {
        this.dateline = dateline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pollvoter pollvoter = (Pollvoter) o;

        if (tid != null ? !tid.equals(pollvoter.tid) : pollvoter.tid != null) return false;
        if (uid != null ? !uid.equals(pollvoter.uid) : pollvoter.uid != null) return false;
        if (username != null ? !username.equals(pollvoter.username) : pollvoter.username != null) return false;
        if (options != null ? !options.equals(pollvoter.options) : pollvoter.options != null) return false;
        if (dateline != null ? !dateline.equals(pollvoter.dateline) : pollvoter.dateline != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tid != null ? tid.hashCode() : 0;
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (options != null ? options.hashCode() : 0);
        result = 31 * result + (dateline != null ? dateline.hashCode() : 0);
        return result;
    }
}
