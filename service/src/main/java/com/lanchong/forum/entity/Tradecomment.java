package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_tradecomment", schema = "lanchonggk", catalog = "")
public class Tradecomment {
    private Integer id;
    private String orderid;
    private Integer pid;
    private Byte type;
    private Integer raterid;
    private String rater;
    private Integer rateeid;
    private String ratee;
    private String message;
    private String explanation;
    private Byte score;
    private Integer dateline;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "orderid")
    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
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
    @Column(name = "type")
    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    @Basic
    @Column(name = "raterid")
    public Integer getRaterid() {
        return raterid;
    }

    public void setRaterid(Integer raterid) {
        this.raterid = raterid;
    }

    @Basic
    @Column(name = "rater")
    public String getRater() {
        return rater;
    }

    public void setRater(String rater) {
        this.rater = rater;
    }

    @Basic
    @Column(name = "rateeid")
    public Integer getRateeid() {
        return rateeid;
    }

    public void setRateeid(Integer rateeid) {
        this.rateeid = rateeid;
    }

    @Basic
    @Column(name = "ratee")
    public String getRatee() {
        return ratee;
    }

    public void setRatee(String ratee) {
        this.ratee = ratee;
    }

    @Basic
    @Column(name = "message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Basic
    @Column(name = "explanation")
    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
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

        Tradecomment that = (Tradecomment) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (orderid != null ? !orderid.equals(that.orderid) : that.orderid != null) return false;
        if (pid != null ? !pid.equals(that.pid) : that.pid != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (raterid != null ? !raterid.equals(that.raterid) : that.raterid != null) return false;
        if (rater != null ? !rater.equals(that.rater) : that.rater != null) return false;
        if (rateeid != null ? !rateeid.equals(that.rateeid) : that.rateeid != null) return false;
        if (ratee != null ? !ratee.equals(that.ratee) : that.ratee != null) return false;
        if (message != null ? !message.equals(that.message) : that.message != null) return false;
        if (explanation != null ? !explanation.equals(that.explanation) : that.explanation != null) return false;
        if (score != null ? !score.equals(that.score) : that.score != null) return false;
        if (dateline != null ? !dateline.equals(that.dateline) : that.dateline != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (orderid != null ? orderid.hashCode() : 0);
        result = 31 * result + (pid != null ? pid.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (raterid != null ? raterid.hashCode() : 0);
        result = 31 * result + (rater != null ? rater.hashCode() : 0);
        result = 31 * result + (rateeid != null ? rateeid.hashCode() : 0);
        result = 31 * result + (ratee != null ? ratee.hashCode() : 0);
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (explanation != null ? explanation.hashCode() : 0);
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + (dateline != null ? dateline.hashCode() : 0);
        return result;
    }
}
