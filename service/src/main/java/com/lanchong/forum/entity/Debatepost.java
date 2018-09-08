package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_debatepost",  catalog = "")
public class Debatepost {
    private Integer pid;
    private Byte stand;
    private Integer tid;
    private Integer uid;
    private Integer dateline;
    private Integer voters;
    private String voterids;

    @Id
    @Column(name = "pid")
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "stand")
    public Byte getStand() {
        return stand;
    }

    public void setStand(Byte stand) {
        this.stand = stand;
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
    @Column(name = "uid")
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
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
    @Column(name = "voters")
    public Integer getVoters() {
        return voters;
    }

    public void setVoters(Integer voters) {
        this.voters = voters;
    }

    @Basic
    @Column(name = "voterids")
    public String getVoterids() {
        return voterids;
    }

    public void setVoterids(String voterids) {
        this.voterids = voterids;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Debatepost that = (Debatepost) o;

        if (pid != null ? !pid.equals(that.pid) : that.pid != null) return false;
        if (stand != null ? !stand.equals(that.stand) : that.stand != null) return false;
        if (tid != null ? !tid.equals(that.tid) : that.tid != null) return false;
        if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
        if (dateline != null ? !dateline.equals(that.dateline) : that.dateline != null) return false;
        if (voters != null ? !voters.equals(that.voters) : that.voters != null) return false;
        if (voterids != null ? !voterids.equals(that.voterids) : that.voterids != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pid != null ? pid.hashCode() : 0;
        result = 31 * result + (stand != null ? stand.hashCode() : 0);
        result = 31 * result + (tid != null ? tid.hashCode() : 0);
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        result = 31 * result + (dateline != null ? dateline.hashCode() : 0);
        result = 31 * result + (voters != null ? voters.hashCode() : 0);
        result = 31 * result + (voterids != null ? voterids.hashCode() : 0);
        return result;
    }
}
