package com.lanchong.forum.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.lanchong.common.entity.Usergroup;
import io.swagger.annotations.ApiModelProperty;

import javax.jws.soap.SOAPBinding;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "ldp_forum_attachment_8",  catalog = "")
public class AttachmentN implements Serializable{
    private Integer aid;
    private Integer tid;
    private Integer pid;
    private Integer uid;
    private Integer dateline;
    private String filename;
    private Integer filesize;
    @ApiModelProperty(value = "附件地址")
    private String attachment;
    private Byte remote;
    @ApiModelProperty(value = "附件描述")
    private String description;
    private Byte readperm;
    private Short price;
    @ApiModelProperty(value = "是否为图片")
    private Byte isimage;
    private Short width;
    private Byte thumb;
    private Integer picid;




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
    @Column(name = "dateline")
    public Integer getDateline() {
        return dateline;
    }

    public void setDateline(Integer dateline) {
        this.dateline = dateline;
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
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
    @Column(name = "isimage")
    public Byte getIsimage() {
        return isimage;
    }

    public void setIsimage(Byte isimage) {
        this.isimage = isimage;
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
    @Column(name = "picid")
    public Integer getPicid() {
        return picid;
    }

    public void setPicid(Integer picid) {
        this.picid = picid;
    }

}
