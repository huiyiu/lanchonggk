package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_collection", schema = "lanchonggk", catalog = "")
public class Collection {
    private Integer ctid;
    private Integer uid;
    private String username;
    private String name;
    private Integer dateline;
    private Integer follownum;
    private Integer threadnum;
    private Integer commentnum;
    private String desc;
    private Integer lastupdate;
    private Double rate;
    private Integer ratenum;
    private Integer lastpost;
    private String lastsubject;
    private Integer lastposttime;
    private String lastposter;
    private Integer lastvisit;
    private String keyword;

    @Id
    @Column(name = "ctid")
    public Integer getCtid() {
        return ctid;
    }

    public void setCtid(Integer ctid) {
        this.ctid = ctid;
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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "follownum")
    public Integer getFollownum() {
        return follownum;
    }

    public void setFollownum(Integer follownum) {
        this.follownum = follownum;
    }

    @Basic
    @Column(name = "threadnum")
    public Integer getThreadnum() {
        return threadnum;
    }

    public void setThreadnum(Integer threadnum) {
        this.threadnum = threadnum;
    }

    @Basic
    @Column(name = "commentnum")
    public Integer getCommentnum() {
        return commentnum;
    }

    public void setCommentnum(Integer commentnum) {
        this.commentnum = commentnum;
    }

    @Basic
    @Column(name = "desc")
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Basic
    @Column(name = "lastupdate")
    public Integer getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Integer lastupdate) {
        this.lastupdate = lastupdate;
    }

    @Basic
    @Column(name = "rate")
    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    @Basic
    @Column(name = "ratenum")
    public Integer getRatenum() {
        return ratenum;
    }

    public void setRatenum(Integer ratenum) {
        this.ratenum = ratenum;
    }

    @Basic
    @Column(name = "lastpost")
    public Integer getLastpost() {
        return lastpost;
    }

    public void setLastpost(Integer lastpost) {
        this.lastpost = lastpost;
    }

    @Basic
    @Column(name = "lastsubject")
    public String getLastsubject() {
        return lastsubject;
    }

    public void setLastsubject(String lastsubject) {
        this.lastsubject = lastsubject;
    }

    @Basic
    @Column(name = "lastposttime")
    public Integer getLastposttime() {
        return lastposttime;
    }

    public void setLastposttime(Integer lastposttime) {
        this.lastposttime = lastposttime;
    }

    @Basic
    @Column(name = "lastposter")
    public String getLastposter() {
        return lastposter;
    }

    public void setLastposter(String lastposter) {
        this.lastposter = lastposter;
    }

    @Basic
    @Column(name = "lastvisit")
    public Integer getLastvisit() {
        return lastvisit;
    }

    public void setLastvisit(Integer lastvisit) {
        this.lastvisit = lastvisit;
    }

    @Basic
    @Column(name = "keyword")
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Collection that = (Collection) o;

        if (ctid != null ? !ctid.equals(that.ctid) : that.ctid != null) return false;
        if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (dateline != null ? !dateline.equals(that.dateline) : that.dateline != null) return false;
        if (follownum != null ? !follownum.equals(that.follownum) : that.follownum != null) return false;
        if (threadnum != null ? !threadnum.equals(that.threadnum) : that.threadnum != null) return false;
        if (commentnum != null ? !commentnum.equals(that.commentnum) : that.commentnum != null) return false;
        if (desc != null ? !desc.equals(that.desc) : that.desc != null) return false;
        if (lastupdate != null ? !lastupdate.equals(that.lastupdate) : that.lastupdate != null) return false;
        if (rate != null ? !rate.equals(that.rate) : that.rate != null) return false;
        if (ratenum != null ? !ratenum.equals(that.ratenum) : that.ratenum != null) return false;
        if (lastpost != null ? !lastpost.equals(that.lastpost) : that.lastpost != null) return false;
        if (lastsubject != null ? !lastsubject.equals(that.lastsubject) : that.lastsubject != null) return false;
        if (lastposttime != null ? !lastposttime.equals(that.lastposttime) : that.lastposttime != null) return false;
        if (lastposter != null ? !lastposter.equals(that.lastposter) : that.lastposter != null) return false;
        if (lastvisit != null ? !lastvisit.equals(that.lastvisit) : that.lastvisit != null) return false;
        if (keyword != null ? !keyword.equals(that.keyword) : that.keyword != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ctid != null ? ctid.hashCode() : 0;
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (dateline != null ? dateline.hashCode() : 0);
        result = 31 * result + (follownum != null ? follownum.hashCode() : 0);
        result = 31 * result + (threadnum != null ? threadnum.hashCode() : 0);
        result = 31 * result + (commentnum != null ? commentnum.hashCode() : 0);
        result = 31 * result + (desc != null ? desc.hashCode() : 0);
        result = 31 * result + (lastupdate != null ? lastupdate.hashCode() : 0);
        result = 31 * result + (rate != null ? rate.hashCode() : 0);
        result = 31 * result + (ratenum != null ? ratenum.hashCode() : 0);
        result = 31 * result + (lastpost != null ? lastpost.hashCode() : 0);
        result = 31 * result + (lastsubject != null ? lastsubject.hashCode() : 0);
        result = 31 * result + (lastposttime != null ? lastposttime.hashCode() : 0);
        result = 31 * result + (lastposter != null ? lastposter.hashCode() : 0);
        result = 31 * result + (lastvisit != null ? lastvisit.hashCode() : 0);
        result = 31 * result + (keyword != null ? keyword.hashCode() : 0);
        return result;
    }
}
