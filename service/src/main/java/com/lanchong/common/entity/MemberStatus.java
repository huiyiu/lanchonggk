package com.lanchong.common.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_common_member_status", catalog = "")
public class MemberStatus {
    private Integer uid;
    private String regip;
    private String lastip;
    private Short port;
    private Integer lastvisit;
    private Integer lastactivity;
    private Integer lastpost;
    private Integer lastsendmail;
    private Byte invisible;
    private Short buyercredit;
    private Short sellercredit;
    private Integer favtimes;
    private Integer sharetimes;
    private Byte profileprogress;

    @Id
    @Column(name = "uid")
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "regip")
    public String getRegip() {
        return regip;
    }

    public void setRegip(String regip) {
        this.regip = regip;
    }

    @Basic
    @Column(name = "lastip")
    public String getLastip() {
        return lastip;
    }

    public void setLastip(String lastip) {
        this.lastip = lastip;
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
    @Column(name = "lastvisit")
    public Integer getLastvisit() {
        return lastvisit;
    }

    public void setLastvisit(Integer lastvisit) {
        this.lastvisit = lastvisit;
    }

    @Basic
    @Column(name = "lastactivity")
    public Integer getLastactivity() {
        return lastactivity;
    }

    public void setLastactivity(Integer lastactivity) {
        this.lastactivity = lastactivity;
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
    @Column(name = "lastsendmail")
    public Integer getLastsendmail() {
        return lastsendmail;
    }

    public void setLastsendmail(Integer lastsendmail) {
        this.lastsendmail = lastsendmail;
    }

    @Basic
    @Column(name = "invisible")
    public Byte getInvisible() {
        return invisible;
    }

    public void setInvisible(Byte invisible) {
        this.invisible = invisible;
    }

    @Basic
    @Column(name = "buyercredit")
    public Short getBuyercredit() {
        return buyercredit;
    }

    public void setBuyercredit(Short buyercredit) {
        this.buyercredit = buyercredit;
    }

    @Basic
    @Column(name = "sellercredit")
    public Short getSellercredit() {
        return sellercredit;
    }

    public void setSellercredit(Short sellercredit) {
        this.sellercredit = sellercredit;
    }

    @Basic
    @Column(name = "favtimes")
    public Integer getFavtimes() {
        return favtimes;
    }

    public void setFavtimes(Integer favtimes) {
        this.favtimes = favtimes;
    }

    @Basic
    @Column(name = "sharetimes")
    public Integer getSharetimes() {
        return sharetimes;
    }

    public void setSharetimes(Integer sharetimes) {
        this.sharetimes = sharetimes;
    }

    @Basic
    @Column(name = "profileprogress")
    public Byte getProfileprogress() {
        return profileprogress;
    }

    public void setProfileprogress(Byte profileprogress) {
        this.profileprogress = profileprogress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberStatus that = (MemberStatus) o;
        return Objects.equals(uid, that.uid) &&
                Objects.equals(regip, that.regip) &&
                Objects.equals(lastip, that.lastip) &&
                Objects.equals(port, that.port) &&
                Objects.equals(lastvisit, that.lastvisit) &&
                Objects.equals(lastactivity, that.lastactivity) &&
                Objects.equals(lastpost, that.lastpost) &&
                Objects.equals(lastsendmail, that.lastsendmail) &&
                Objects.equals(invisible, that.invisible) &&
                Objects.equals(buyercredit, that.buyercredit) &&
                Objects.equals(sellercredit, that.sellercredit) &&
                Objects.equals(favtimes, that.favtimes) &&
                Objects.equals(sharetimes, that.sharetimes) &&
                Objects.equals(profileprogress, that.profileprogress);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uid, regip, lastip, port, lastvisit, lastactivity, lastpost, lastsendmail, invisible, buyercredit, sellercredit, favtimes, sharetimes, profileprogress);
    }
}
