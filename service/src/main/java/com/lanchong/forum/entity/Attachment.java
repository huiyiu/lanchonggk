package com.lanchong.forum.entity;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "ldp_forum_attachment",  catalog = "")
public class Attachment implements Serializable{
    private Integer aid;
    private Integer tid;
    private Integer pid;
    private Integer uid;
    private Byte tableid;
    @ApiModelProperty(value = "下载次数")
    private Integer downloads;

    @ApiModelProperty(value = "附件详细信息")
    private AttachmentN attachmentN;

    @Id
    @Column(name = "aid")
    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
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
    @Column(name = "tableid")
    public Byte getTableid() {
        return tableid;
    }

    public void setTableid(Byte tableid) {
        this.tableid = tableid;
    }

    @Basic
    @Column(name = "downloads")
    public Integer getDownloads() {
        return downloads;
    }

    public void setDownloads(Integer downloads) {
        this.downloads = downloads;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Attachment that = (Attachment) o;
        return Objects.equals(aid, that.aid) &&
                Objects.equals(tid, that.tid) &&
               // Objects.equals(pid, that.pid) &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(tableid, that.tableid) &&
                Objects.equals(downloads, that.downloads);
    }

    @OneToOne
    @MapsId
    @JoinColumn(name = "aid",referencedColumnName="aid",insertable = false, updatable = false)
    public AttachmentN getAttachmentN() {
        return attachmentN;
    }

    public void setAttachmentN(AttachmentN attachmentN) {
        this.attachmentN = attachmentN;
    }
}
