package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_polloption_image", schema = "lanchonggk", catalog = "")
public class PolloptionImage {
    private Integer aid;
    private Integer poid;
    private Integer tid;
    private Integer pid;
    private Integer uid;
    private String filename;
    private Integer filesize;
    private String attachment;
    private Byte remote;
    private Short width;
    private Byte thumb;
    private Integer dateline;

    @Id
    @Column(name = "aid")
    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    @Basic
    @Column(name = "poid")
    public Integer getPoid() {
        return poid;
    }

    public void setPoid(Integer poid) {
        this.poid = poid;
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
    @Column(name = "pid")
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
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
    @Column(name = "filename")
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Basic
    @Column(name = "filesize")
    public Integer getFilesize() {
        return filesize;
    }

    public void setFilesize(Integer filesize) {
        this.filesize = filesize;
    }

    @Basic
    @Column(name = "attachment")
    public String getAttachment() {
        return attachment;
    }

    public void setAttachment(String attachment) {
        this.attachment = attachment;
    }

    @Basic
    @Column(name = "remote")
    public Byte getRemote() {
        return remote;
    }

    public void setRemote(Byte remote) {
        this.remote = remote;
    }

    @Basic
    @Column(name = "width")
    public Short getWidth() {
        return width;
    }

    public void setWidth(Short width) {
        this.width = width;
    }

    @Basic
    @Column(name = "thumb")
    public Byte getThumb() {
        return thumb;
    }

    public void setThumb(Byte thumb) {
        this.thumb = thumb;
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

        PolloptionImage that = (PolloptionImage) o;

        if (aid != null ? !aid.equals(that.aid) : that.aid != null) return false;
        if (poid != null ? !poid.equals(that.poid) : that.poid != null) return false;
        if (tid != null ? !tid.equals(that.tid) : that.tid != null) return false;
        if (pid != null ? !pid.equals(that.pid) : that.pid != null) return false;
        if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
        if (filename != null ? !filename.equals(that.filename) : that.filename != null) return false;
        if (filesize != null ? !filesize.equals(that.filesize) : that.filesize != null) return false;
        if (attachment != null ? !attachment.equals(that.attachment) : that.attachment != null) return false;
        if (remote != null ? !remote.equals(that.remote) : that.remote != null) return false;
        if (width != null ? !width.equals(that.width) : that.width != null) return false;
        if (thumb != null ? !thumb.equals(that.thumb) : that.thumb != null) return false;
        if (dateline != null ? !dateline.equals(that.dateline) : that.dateline != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = aid != null ? aid.hashCode() : 0;
        result = 31 * result + (poid != null ? poid.hashCode() : 0);
        result = 31 * result + (tid != null ? tid.hashCode() : 0);
        result = 31 * result + (pid != null ? pid.hashCode() : 0);
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        result = 31 * result + (filename != null ? filename.hashCode() : 0);
        result = 31 * result + (filesize != null ? filesize.hashCode() : 0);
        result = 31 * result + (attachment != null ? attachment.hashCode() : 0);
        result = 31 * result + (remote != null ? remote.hashCode() : 0);
        result = 31 * result + (width != null ? width.hashCode() : 0);
        result = 31 * result + (thumb != null ? thumb.hashCode() : 0);
        result = 31 * result + (dateline != null ? dateline.hashCode() : 0);
        return result;
    }
}
