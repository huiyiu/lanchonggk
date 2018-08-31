package com.lanchong.home.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_home_pic", schema = "lanchonggk", catalog = "")
public class Pic {
    private Integer picid;
    private Integer albumid;
    private Integer uid;
    private String username;
    private Integer dateline;
    private String postip;
    private Short port;
    private String filename;
    private String title;
    private String type;
    private Integer size;
    private String filepath;
    private Byte thumb;
    private Byte remote;
    private Integer hot;
    private Integer sharetimes;
    private Short click1;
    private Short click2;
    private Short click3;
    private Short click4;
    private Short click5;
    private Short click6;
    private Short click7;
    private Short click8;
    private Byte magicframe;
    private Byte status;

    @Id
    @Column(name = "picid")
    public Integer getPicid() {
        return picid;
    }

    public void setPicid(Integer picid) {
        this.picid = picid;
    }

    @Basic
    @Column(name = "albumid")
    public Integer getAlbumid() {
        return albumid;
    }

    public void setAlbumid(Integer albumid) {
        this.albumid = albumid;
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
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
    @Column(name = "postip")
    public String getPostip() {
        return postip;
    }

    public void setPostip(String postip) {
        this.postip = postip;
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
    @Column(name = "filename")
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "size")
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    @Basic
    @Column(name = "filepath")
    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
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
    @Column(name = "remote")
    public Byte getRemote() {
        return remote;
    }

    public void setRemote(Byte remote) {
        this.remote = remote;
    }

    @Basic
    @Column(name = "hot")
    public Integer getHot() {
        return hot;
    }

    public void setHot(Integer hot) {
        this.hot = hot;
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
    @Column(name = "click1")
    public Short getClick1() {
        return click1;
    }

    public void setClick1(Short click1) {
        this.click1 = click1;
    }

    @Basic
    @Column(name = "click2")
    public Short getClick2() {
        return click2;
    }

    public void setClick2(Short click2) {
        this.click2 = click2;
    }

    @Basic
    @Column(name = "click3")
    public Short getClick3() {
        return click3;
    }

    public void setClick3(Short click3) {
        this.click3 = click3;
    }

    @Basic
    @Column(name = "click4")
    public Short getClick4() {
        return click4;
    }

    public void setClick4(Short click4) {
        this.click4 = click4;
    }

    @Basic
    @Column(name = "click5")
    public Short getClick5() {
        return click5;
    }

    public void setClick5(Short click5) {
        this.click5 = click5;
    }

    @Basic
    @Column(name = "click6")
    public Short getClick6() {
        return click6;
    }

    public void setClick6(Short click6) {
        this.click6 = click6;
    }

    @Basic
    @Column(name = "click7")
    public Short getClick7() {
        return click7;
    }

    public void setClick7(Short click7) {
        this.click7 = click7;
    }

    @Basic
    @Column(name = "click8")
    public Short getClick8() {
        return click8;
    }

    public void setClick8(Short click8) {
        this.click8 = click8;
    }

    @Basic
    @Column(name = "magicframe")
    public Byte getMagicframe() {
        return magicframe;
    }

    public void setMagicframe(Byte magicframe) {
        this.magicframe = magicframe;
    }

    @Basic
    @Column(name = "status")
    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pic pic = (Pic) o;
        return Objects.equals(picid, pic.picid) &&
                Objects.equals(albumid, pic.albumid) &&
                Objects.equals(uid, pic.uid) &&
                Objects.equals(username, pic.username) &&
                Objects.equals(dateline, pic.dateline) &&
                Objects.equals(postip, pic.postip) &&
                Objects.equals(port, pic.port) &&
                Objects.equals(filename, pic.filename) &&
                Objects.equals(title, pic.title) &&
                Objects.equals(type, pic.type) &&
                Objects.equals(size, pic.size) &&
                Objects.equals(filepath, pic.filepath) &&
                Objects.equals(thumb, pic.thumb) &&
                Objects.equals(remote, pic.remote) &&
                Objects.equals(hot, pic.hot) &&
                Objects.equals(sharetimes, pic.sharetimes) &&
                Objects.equals(click1, pic.click1) &&
                Objects.equals(click2, pic.click2) &&
                Objects.equals(click3, pic.click3) &&
                Objects.equals(click4, pic.click4) &&
                Objects.equals(click5, pic.click5) &&
                Objects.equals(click6, pic.click6) &&
                Objects.equals(click7, pic.click7) &&
                Objects.equals(click8, pic.click8) &&
                Objects.equals(magicframe, pic.magicframe) &&
                Objects.equals(status, pic.status);
    }

    @Override
    public int hashCode() {

        return Objects.hash(picid, albumid, uid, username, dateline, postip, port, filename, title, type, size, filepath, thumb, remote, hot, sharetimes, click1, click2, click3, click4, click5, click6, click7, click8, magicframe, status);
    }
}
