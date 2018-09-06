package com.lanchong.forum.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_forum_thread", catalog = "")
public class Thread0 {
    private Integer tid;
    private Integer fid;
    private Short posttableid;
    private Short typeid;
    private Short sortid;
    private Byte readperm;
    private Short price;
    private String author;
    private Integer authorid;
    private String subject;
    private Integer dateline;
    private Integer lastpost;
    private String lastposter;
    private Integer views;
    private Integer replies;
    private Byte displayorder;
    private Byte highlight;
    private Byte digest;
    private Byte rate;
    private Byte special;
    private Byte attachment;
    private Byte moderated;
    private Integer closed;
    private Byte stickreply;
    private Short recommends;
    private Short recommendAdd;
    private Short recommendSub;
    private Integer heats;
    private Short status;
    private Byte isgroup;
    private Integer favtimes;
    private Integer sharetimes;
    private Byte stamp;
    private Byte icon;
    private Integer pushedaid;
    private Short cover;
    private Short replycredit;
    private String relatebytag;
    private Integer maxposition;
    private String bgcolor;
    private Integer comments;
    private Short hidden;

    @Id
    @Column(name = "tid")
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Basic
    @Column(name = "fid")
    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    @Basic
    @Column(name = "posttableid")
    public Short getPosttableid() {
        return posttableid;
    }

    public void setPosttableid(Short posttableid) {
        this.posttableid = posttableid;
    }

    @Basic
    @Column(name = "typeid")
    public Short getTypeid() {
        return typeid;
    }

    public void setTypeid(Short typeid) {
        this.typeid = typeid;
    }

    @Basic
    @Column(name = "sortid")
    public Short getSortid() {
        return sortid;
    }

    public void setSortid(Short sortid) {
        this.sortid = sortid;
    }

    @Basic
    @Column(name = "readperm")
    public Byte getReadperm() {
        return readperm;
    }

    public void setReadperm(Byte readperm) {
        this.readperm = readperm;
    }

    @Basic
    @Column(name = "price")
    public Short getPrice() {
        return price;
    }

    public void setPrice(Short price) {
        this.price = price;
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
    @Column(name = "subject")
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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
    @Column(name = "lastpost")
    public Integer getLastpost() {
        return lastpost;
    }

    public void setLastpost(Integer lastpost) {
        this.lastpost = lastpost;
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
    @Column(name = "views")
    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
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
    @Column(name = "displayorder")
    public Byte getDisplayorder() {
        return displayorder;
    }

    public void setDisplayorder(Byte displayorder) {
        this.displayorder = displayorder;
    }

    @Basic
    @Column(name = "highlight")
    public Byte getHighlight() {
        return highlight;
    }

    public void setHighlight(Byte highlight) {
        this.highlight = highlight;
    }

    @Basic
    @Column(name = "digest")
    public Byte getDigest() {
        return digest;
    }

    public void setDigest(Byte digest) {
        this.digest = digest;
    }

    @Basic
    @Column(name = "rate")
    public Byte getRate() {
        return rate;
    }

    public void setRate(Byte rate) {
        this.rate = rate;
    }

    @Basic
    @Column(name = "special")
    public Byte getSpecial() {
        return special;
    }

    public void setSpecial(Byte special) {
        this.special = special;
    }

    @Basic
    @Column(name = "attachment")
    public Byte getAttachment() {
        return attachment;
    }

    public void setAttachment(Byte attachment) {
        this.attachment = attachment;
    }

    @Basic
    @Column(name = "moderated")
    public Byte getModerated() {
        return moderated;
    }

    public void setModerated(Byte moderated) {
        this.moderated = moderated;
    }

    @Basic
    @Column(name = "closed")
    public Integer getClosed() {
        return closed;
    }

    public void setClosed(Integer closed) {
        this.closed = closed;
    }

    @Basic
    @Column(name = "stickreply")
    public Byte getStickreply() {
        return stickreply;
    }

    public void setStickreply(Byte stickreply) {
        this.stickreply = stickreply;
    }

    @Basic
    @Column(name = "recommends")
    public Short getRecommends() {
        return recommends;
    }

    public void setRecommends(Short recommends) {
        this.recommends = recommends;
    }

    @Basic
    @Column(name = "recommend_add")
    public Short getRecommendAdd() {
        return recommendAdd;
    }

    public void setRecommendAdd(Short recommendAdd) {
        this.recommendAdd = recommendAdd;
    }

    @Basic
    @Column(name = "recommend_sub")
    public Short getRecommendSub() {
        return recommendSub;
    }

    public void setRecommendSub(Short recommendSub) {
        this.recommendSub = recommendSub;
    }

    @Basic
    @Column(name = "heats")
    public Integer getHeats() {
        return heats;
    }

    public void setHeats(Integer heats) {
        this.heats = heats;
    }

    @Basic
    @Column(name = "status")
    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    @Basic
    @Column(name = "isgroup")
    public Byte getIsgroup() {
        return isgroup;
    }

    public void setIsgroup(Byte isgroup) {
        this.isgroup = isgroup;
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
    @Column(name = "stamp")
    public Byte getStamp() {
        return stamp;
    }

    public void setStamp(Byte stamp) {
        this.stamp = stamp;
    }

    @Basic
    @Column(name = "icon")
    public Byte getIcon() {
        return icon;
    }

    public void setIcon(Byte icon) {
        this.icon = icon;
    }

    @Basic
    @Column(name = "pushedaid")
    public Integer getPushedaid() {
        return pushedaid;
    }

    public void setPushedaid(Integer pushedaid) {
        this.pushedaid = pushedaid;
    }

    @Basic
    @Column(name = "cover")
    public Short getCover() {
        return cover;
    }

    public void setCover(Short cover) {
        this.cover = cover;
    }

    @Basic
    @Column(name = "replycredit")
    public Short getReplycredit() {
        return replycredit;
    }

    public void setReplycredit(Short replycredit) {
        this.replycredit = replycredit;
    }

    @Basic
    @Column(name = "relatebytag")
    public String getRelatebytag() {
        return relatebytag;
    }

    public void setRelatebytag(String relatebytag) {
        this.relatebytag = relatebytag;
    }

    @Basic
    @Column(name = "maxposition")
    public Integer getMaxposition() {
        return maxposition;
    }

    public void setMaxposition(Integer maxposition) {
        this.maxposition = maxposition;
    }

    @Basic
    @Column(name = "bgcolor")
    public String getBgcolor() {
        return bgcolor;
    }

    public void setBgcolor(String bgcolor) {
        this.bgcolor = bgcolor;
    }

    @Basic
    @Column(name = "comments")
    public Integer getComments() {
        return comments;
    }

    public void setComments(Integer comments) {
        this.comments = comments;
    }

    @Basic
    @Column(name = "hidden")
    public Short getHidden() {
        return hidden;
    }

    public void setHidden(Short hidden) {
        this.hidden = hidden;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Thread0 thread = (Thread0) o;
        return Objects.equals(tid, thread.tid) &&
                Objects.equals(fid, thread.fid) &&
                Objects.equals(posttableid, thread.posttableid) &&
                Objects.equals(typeid, thread.typeid) &&
                Objects.equals(sortid, thread.sortid) &&
                Objects.equals(readperm, thread.readperm) &&
                Objects.equals(price, thread.price) &&
                Objects.equals(author, thread.author) &&
                Objects.equals(authorid, thread.authorid) &&
                Objects.equals(subject, thread.subject) &&
                Objects.equals(dateline, thread.dateline) &&
                Objects.equals(lastpost, thread.lastpost) &&
                Objects.equals(lastposter, thread.lastposter) &&
                Objects.equals(views, thread.views) &&
                Objects.equals(replies, thread.replies) &&
                Objects.equals(displayorder, thread.displayorder) &&
                Objects.equals(highlight, thread.highlight) &&
                Objects.equals(digest, thread.digest) &&
                Objects.equals(rate, thread.rate) &&
                Objects.equals(special, thread.special) &&
                Objects.equals(attachment, thread.attachment) &&
                Objects.equals(moderated, thread.moderated) &&
                Objects.equals(closed, thread.closed) &&
                Objects.equals(stickreply, thread.stickreply) &&
                Objects.equals(recommends, thread.recommends) &&
                Objects.equals(recommendAdd, thread.recommendAdd) &&
                Objects.equals(recommendSub, thread.recommendSub) &&
                Objects.equals(heats, thread.heats) &&
                Objects.equals(status, thread.status) &&
                Objects.equals(isgroup, thread.isgroup) &&
                Objects.equals(favtimes, thread.favtimes) &&
                Objects.equals(sharetimes, thread.sharetimes) &&
                Objects.equals(stamp, thread.stamp) &&
                Objects.equals(icon, thread.icon) &&
                Objects.equals(pushedaid, thread.pushedaid) &&
                Objects.equals(cover, thread.cover) &&
                Objects.equals(replycredit, thread.replycredit) &&
                Objects.equals(relatebytag, thread.relatebytag) &&
                Objects.equals(maxposition, thread.maxposition) &&
                Objects.equals(bgcolor, thread.bgcolor) &&
                Objects.equals(comments, thread.comments) &&
                Objects.equals(hidden, thread.hidden);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tid, fid, posttableid, typeid, sortid, readperm, price, author, authorid, subject, dateline, lastpost, lastposter, views, replies, displayorder, highlight, digest, rate, special, attachment, moderated, closed, stickreply, recommends, recommendAdd, recommendSub, heats, status, isgroup, favtimes, sharetimes, stamp, icon, pushedaid, cover, replycredit, relatebytag, maxposition, bgcolor, comments, hidden);
    }
}
