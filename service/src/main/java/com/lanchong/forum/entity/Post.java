package com.lanchong.forum.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiResponse;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_post", schema = "lanchonggk", catalog = "")
@IdClass(PostPK.class)
@ApiModel
public class Post {
    private Integer pid;
    private Integer fid;
    private Integer tid;
    private Byte first;
    @ApiModelProperty(value = "作者")
    private String author;
    @ApiModelProperty(value = "作者编号")
    private Integer authorid;
    @ApiModelProperty(value = "主题")
    private String subject;
    @ApiModelProperty(value = "发布时间")
    private Integer dateline;
    @ApiModelProperty(value = "内容")
    private String message;
    private String useip;
    private Short port;
    private Byte invisible;
    private Byte anonymous;
    private Byte usesig;
    private Byte htmlon;
    private Byte bbcodeoff;
    private Byte smileyoff;
    private Byte parseurloff;
    private Byte attachment;
    private Short rate;
    //
    @ApiModelProperty(value = "评分次数")
    private Integer ratetimes;
    private Integer status;
    private String tags;
    @ApiModelProperty(value = "是否存在点评")
    private Byte comment;
    private Integer replycredit;
    private Integer position;
    private String readuser;

    @Basic
    @Column(name = "pid")
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "fid")
    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    @Id
    @Column(name = "tid")
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Basic
    @Column(name = "first")
    public Byte getFirst() {
        return first;
    }

    public void setFirst(Byte first) {
        this.first = first;
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
    @Column(name = "message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Basic
    @Column(name = "useip")
    public String getUseip() {
        return useip;
    }

    public void setUseip(String useip) {
        this.useip = useip;
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
    @Column(name = "invisible")
    public Byte getInvisible() {
        return invisible;
    }

    public void setInvisible(Byte invisible) {
        this.invisible = invisible;
    }

    @Basic
    @Column(name = "anonymous")
    public Byte getAnonymous() {
        return anonymous;
    }

    public void setAnonymous(Byte anonymous) {
        this.anonymous = anonymous;
    }

    @Basic
    @Column(name = "usesig")
    public Byte getUsesig() {
        return usesig;
    }

    public void setUsesig(Byte usesig) {
        this.usesig = usesig;
    }

    @Basic
    @Column(name = "htmlon")
    public Byte getHtmlon() {
        return htmlon;
    }

    public void setHtmlon(Byte htmlon) {
        this.htmlon = htmlon;
    }

    @Basic
    @Column(name = "bbcodeoff")
    public Byte getBbcodeoff() {
        return bbcodeoff;
    }

    public void setBbcodeoff(Byte bbcodeoff) {
        this.bbcodeoff = bbcodeoff;
    }

    @Basic
    @Column(name = "smileyoff")
    public Byte getSmileyoff() {
        return smileyoff;
    }

    public void setSmileyoff(Byte smileyoff) {
        this.smileyoff = smileyoff;
    }

    @Basic
    @Column(name = "parseurloff")
    public Byte getParseurloff() {
        return parseurloff;
    }

    public void setParseurloff(Byte parseurloff) {
        this.parseurloff = parseurloff;
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
    @Column(name = "rate")
    public Short getRate() {
        return rate;
    }

    public void setRate(Short rate) {
        this.rate = rate;
    }

    @Basic
    @Column(name = "ratetimes")
    public Integer getRatetimes() {
        return ratetimes;
    }

    public void setRatetimes(Integer ratetimes) {
        this.ratetimes = ratetimes;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "tags")
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    @Basic
    @Column(name = "comment")
    public Byte getComment() {
        return comment;
    }

    public void setComment(Byte comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "replycredit")
    public Integer getReplycredit() {
        return replycredit;
    }

    public void setReplycredit(Integer replycredit) {
        this.replycredit = replycredit;
    }

    @Id
    @Column(name = "position")
    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Basic
    @Column(name = "readuser")
    public String getReaduser() {
        return readuser;
    }

    public void setReaduser(String readuser) {
        this.readuser = readuser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Post post = (Post) o;

        if (pid != null ? !pid.equals(post.pid) : post.pid != null) return false;
        if (fid != null ? !fid.equals(post.fid) : post.fid != null) return false;
        if (tid != null ? !tid.equals(post.tid) : post.tid != null) return false;
        if (first != null ? !first.equals(post.first) : post.first != null) return false;
        if (author != null ? !author.equals(post.author) : post.author != null) return false;
        if (authorid != null ? !authorid.equals(post.authorid) : post.authorid != null) return false;
        if (subject != null ? !subject.equals(post.subject) : post.subject != null) return false;
        if (dateline != null ? !dateline.equals(post.dateline) : post.dateline != null) return false;
        if (message != null ? !message.equals(post.message) : post.message != null) return false;
        if (useip != null ? !useip.equals(post.useip) : post.useip != null) return false;
        if (port != null ? !port.equals(post.port) : post.port != null) return false;
        if (invisible != null ? !invisible.equals(post.invisible) : post.invisible != null) return false;
        if (anonymous != null ? !anonymous.equals(post.anonymous) : post.anonymous != null) return false;
        if (usesig != null ? !usesig.equals(post.usesig) : post.usesig != null) return false;
        if (htmlon != null ? !htmlon.equals(post.htmlon) : post.htmlon != null) return false;
        if (bbcodeoff != null ? !bbcodeoff.equals(post.bbcodeoff) : post.bbcodeoff != null) return false;
        if (smileyoff != null ? !smileyoff.equals(post.smileyoff) : post.smileyoff != null) return false;
        if (parseurloff != null ? !parseurloff.equals(post.parseurloff) : post.parseurloff != null) return false;
        if (attachment != null ? !attachment.equals(post.attachment) : post.attachment != null) return false;
        if (rate != null ? !rate.equals(post.rate) : post.rate != null) return false;
        if (ratetimes != null ? !ratetimes.equals(post.ratetimes) : post.ratetimes != null) return false;
        if (status != null ? !status.equals(post.status) : post.status != null) return false;
        if (tags != null ? !tags.equals(post.tags) : post.tags != null) return false;
        if (comment != null ? !comment.equals(post.comment) : post.comment != null) return false;
        if (replycredit != null ? !replycredit.equals(post.replycredit) : post.replycredit != null) return false;
        if (position != null ? !position.equals(post.position) : post.position != null) return false;
        if (readuser != null ? !readuser.equals(post.readuser) : post.readuser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pid != null ? pid.hashCode() : 0;
        result = 31 * result + (fid != null ? fid.hashCode() : 0);
        result = 31 * result + (tid != null ? tid.hashCode() : 0);
        result = 31 * result + (first != null ? first.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (authorid != null ? authorid.hashCode() : 0);
        result = 31 * result + (subject != null ? subject.hashCode() : 0);
        result = 31 * result + (dateline != null ? dateline.hashCode() : 0);
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (useip != null ? useip.hashCode() : 0);
        result = 31 * result + (port != null ? port.hashCode() : 0);
        result = 31 * result + (invisible != null ? invisible.hashCode() : 0);
        result = 31 * result + (anonymous != null ? anonymous.hashCode() : 0);
        result = 31 * result + (usesig != null ? usesig.hashCode() : 0);
        result = 31 * result + (htmlon != null ? htmlon.hashCode() : 0);
        result = 31 * result + (bbcodeoff != null ? bbcodeoff.hashCode() : 0);
        result = 31 * result + (smileyoff != null ? smileyoff.hashCode() : 0);
        result = 31 * result + (parseurloff != null ? parseurloff.hashCode() : 0);
        result = 31 * result + (attachment != null ? attachment.hashCode() : 0);
        result = 31 * result + (rate != null ? rate.hashCode() : 0);
        result = 31 * result + (ratetimes != null ? ratetimes.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (tags != null ? tags.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (replycredit != null ? replycredit.hashCode() : 0);
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + (readuser != null ? readuser.hashCode() : 0);
        return result;
    }
}
