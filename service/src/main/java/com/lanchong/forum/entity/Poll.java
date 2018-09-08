package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_poll",  catalog = "")
public class Poll {
    private Integer tid;
    private Byte overt;
    private Byte multiple;
    private Byte visible;
    private Byte maxchoices;
    private Byte isimage;
    private Integer expiration;
    private String pollpreview;
    private Integer voters;

    @Id
    @Column(name = "tid")
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Basic
    @Column(name = "overt")
    public Byte getOvert() {
        return overt;
    }

    public void setOvert(Byte overt) {
        this.overt = overt;
    }

    @Basic
    @Column(name = "multiple")
    public Byte getMultiple() {
        return multiple;
    }

    public void setMultiple(Byte multiple) {
        this.multiple = multiple;
    }

    @Basic
    @Column(name = "visible")
    public Byte getVisible() {
        return visible;
    }

    public void setVisible(Byte visible) {
        this.visible = visible;
    }

    @Basic
    @Column(name = "maxchoices")
    public Byte getMaxchoices() {
        return maxchoices;
    }

    public void setMaxchoices(Byte maxchoices) {
        this.maxchoices = maxchoices;
    }

    @Basic
    @Column(name = "isimage")
    public Byte getIsimage() {
        return isimage;
    }

    public void setIsimage(Byte isimage) {
        this.isimage = isimage;
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
    @Column(name = "pollpreview")
    public String getPollpreview() {
        return pollpreview;
    }

    public void setPollpreview(String pollpreview) {
        this.pollpreview = pollpreview;
    }

    @Basic
    @Column(name = "voters")
    public Integer getVoters() {
        return voters;
    }

    public void setVoters(Integer voters) {
        this.voters = voters;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Poll poll = (Poll) o;

        if (tid != null ? !tid.equals(poll.tid) : poll.tid != null) return false;
        if (overt != null ? !overt.equals(poll.overt) : poll.overt != null) return false;
        if (multiple != null ? !multiple.equals(poll.multiple) : poll.multiple != null) return false;
        if (visible != null ? !visible.equals(poll.visible) : poll.visible != null) return false;
        if (maxchoices != null ? !maxchoices.equals(poll.maxchoices) : poll.maxchoices != null) return false;
        if (isimage != null ? !isimage.equals(poll.isimage) : poll.isimage != null) return false;
        if (expiration != null ? !expiration.equals(poll.expiration) : poll.expiration != null) return false;
        if (pollpreview != null ? !pollpreview.equals(poll.pollpreview) : poll.pollpreview != null) return false;
        if (voters != null ? !voters.equals(poll.voters) : poll.voters != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tid != null ? tid.hashCode() : 0;
        result = 31 * result + (overt != null ? overt.hashCode() : 0);
        result = 31 * result + (multiple != null ? multiple.hashCode() : 0);
        result = 31 * result + (visible != null ? visible.hashCode() : 0);
        result = 31 * result + (maxchoices != null ? maxchoices.hashCode() : 0);
        result = 31 * result + (isimage != null ? isimage.hashCode() : 0);
        result = 31 * result + (expiration != null ? expiration.hashCode() : 0);
        result = 31 * result + (pollpreview != null ? pollpreview.hashCode() : 0);
        result = 31 * result + (voters != null ? voters.hashCode() : 0);
        return result;
    }
}
