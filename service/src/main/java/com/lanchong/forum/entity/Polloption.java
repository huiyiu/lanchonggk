package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_polloption",  catalog = "")
public class Polloption {
    private Integer polloptionid;
    private Integer tid;
    private Integer votes;
    private Byte displayorder;
    private String polloption;
    private String voterids;

    @Id
    @Column(name = "polloptionid")
    public Integer getPolloptionid() {
        return polloptionid;
    }

    public void setPolloptionid(Integer polloptionid) {
        this.polloptionid = polloptionid;
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
    @Column(name = "votes")
    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
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
    @Column(name = "polloption")
    public String getPolloption() {
        return polloption;
    }

    public void setPolloption(String polloption) {
        this.polloption = polloption;
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

        Polloption that = (Polloption) o;

        if (polloptionid != null ? !polloptionid.equals(that.polloptionid) : that.polloptionid != null) return false;
        if (tid != null ? !tid.equals(that.tid) : that.tid != null) return false;
        if (votes != null ? !votes.equals(that.votes) : that.votes != null) return false;
        if (displayorder != null ? !displayorder.equals(that.displayorder) : that.displayorder != null) return false;
        if (polloption != null ? !polloption.equals(that.polloption) : that.polloption != null) return false;
        if (voterids != null ? !voterids.equals(that.voterids) : that.voterids != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = polloptionid != null ? polloptionid.hashCode() : 0;
        result = 31 * result + (tid != null ? tid.hashCode() : 0);
        result = 31 * result + (votes != null ? votes.hashCode() : 0);
        result = 31 * result + (displayorder != null ? displayorder.hashCode() : 0);
        result = 31 * result + (polloption != null ? polloption.hashCode() : 0);
        result = 31 * result + (voterids != null ? voterids.hashCode() : 0);
        return result;
    }
}
