package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_groupuser", schema = "lanchonggk", catalog = "")
@IdClass(GroupuserPK.class)
public class Groupuser {
    private Integer fid;
    private Integer uid;
    private String username;
    private Byte level;
    private Integer threads;
    private Integer replies;
    private Integer joindateline;
    private Integer lastupdate;
    private Byte privacy;

    @Id
    @Column(name = "fid")
    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    @Id
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
    @Column(name = "level")
    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    @Basic
    @Column(name = "threads")
    public Integer getThreads() {
        return threads;
    }

    public void setThreads(Integer threads) {
        this.threads = threads;
    }

    @Basic
    @Column(name = "replies")
    public Integer getReplies() {
        return replies;
    }

    public void setReplies(Integer replies) {
        this.replies = replies;
    }

    @Basic
    @Column(name = "joindateline")
    public Integer getJoindateline() {
        return joindateline;
    }

    public void setJoindateline(Integer joindateline) {
        this.joindateline = joindateline;
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
    @Column(name = "privacy")
    public Byte getPrivacy() {
        return privacy;
    }

    public void setPrivacy(Byte privacy) {
        this.privacy = privacy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Groupuser groupuser = (Groupuser) o;

        if (fid != null ? !fid.equals(groupuser.fid) : groupuser.fid != null) return false;
        if (uid != null ? !uid.equals(groupuser.uid) : groupuser.uid != null) return false;
        if (username != null ? !username.equals(groupuser.username) : groupuser.username != null) return false;
        if (level != null ? !level.equals(groupuser.level) : groupuser.level != null) return false;
        if (threads != null ? !threads.equals(groupuser.threads) : groupuser.threads != null) return false;
        if (replies != null ? !replies.equals(groupuser.replies) : groupuser.replies != null) return false;
        if (joindateline != null ? !joindateline.equals(groupuser.joindateline) : groupuser.joindateline != null)
            return false;
        if (lastupdate != null ? !lastupdate.equals(groupuser.lastupdate) : groupuser.lastupdate != null) return false;
        if (privacy != null ? !privacy.equals(groupuser.privacy) : groupuser.privacy != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fid != null ? fid.hashCode() : 0;
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (level != null ? level.hashCode() : 0);
        result = 31 * result + (threads != null ? threads.hashCode() : 0);
        result = 31 * result + (replies != null ? replies.hashCode() : 0);
        result = 31 * result + (joindateline != null ? joindateline.hashCode() : 0);
        result = 31 * result + (lastupdate != null ? lastupdate.hashCode() : 0);
        result = 31 * result + (privacy != null ? privacy.hashCode() : 0);
        return result;
    }
}
