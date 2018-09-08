package com.lanchong.home.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_home_album",  catalog = "")
public class Album {
    private Integer albumid;
    private String albumname;
    private Short catid;
    private Integer uid;
    private String username;
    private Integer dateline;
    private Integer updatetime;
    private Short picnum;
    private String pic;
    private Byte picflag;
    private Byte friend;
    private String password;
    private String targetIds;
    private Integer favtimes;
    private Integer sharetimes;
    private String depict;

    @Id
    @Column(name = "albumid")
    public Integer getAlbumid() {
        return albumid;
    }

    public void setAlbumid(Integer albumid) {
        this.albumid = albumid;
    }

    @Basic
    @Column(name = "albumname")
    public String getAlbumname() {
        return albumname;
    }

    public void setAlbumname(String albumname) {
        this.albumname = albumname;
    }

    @Basic
    @Column(name = "catid")
    public Short getCatid() {
        return catid;
    }

    public void setCatid(Short catid) {
        this.catid = catid;
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
    @Column(name = "updatetime")
    public Integer getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Integer updatetime) {
        this.updatetime = updatetime;
    }

    @Basic
    @Column(name = "picnum")
    public Short getPicnum() {
        return picnum;
    }

    public void setPicnum(Short picnum) {
        this.picnum = picnum;
    }

    @Basic
    @Column(name = "pic")
    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Basic
    @Column(name = "picflag")
    public Byte getPicflag() {
        return picflag;
    }

    public void setPicflag(Byte picflag) {
        this.picflag = picflag;
    }

    @Basic
    @Column(name = "friend")
    public Byte getFriend() {
        return friend;
    }

    public void setFriend(Byte friend) {
        this.friend = friend;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "target_ids")
    public String getTargetIds() {
        return targetIds;
    }

    public void setTargetIds(String targetIds) {
        this.targetIds = targetIds;
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
    @Column(name = "depict")
    public String getDepict() {
        return depict;
    }

    public void setDepict(String depict) {
        this.depict = depict;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return Objects.equals(albumid, album.albumid) &&
                Objects.equals(albumname, album.albumname) &&
                Objects.equals(catid, album.catid) &&
                Objects.equals(uid, album.uid) &&
                Objects.equals(username, album.username) &&
                Objects.equals(dateline, album.dateline) &&
                Objects.equals(updatetime, album.updatetime) &&
                Objects.equals(picnum, album.picnum) &&
                Objects.equals(pic, album.pic) &&
                Objects.equals(picflag, album.picflag) &&
                Objects.equals(friend, album.friend) &&
                Objects.equals(password, album.password) &&
                Objects.equals(targetIds, album.targetIds) &&
                Objects.equals(favtimes, album.favtimes) &&
                Objects.equals(sharetimes, album.sharetimes) &&
                Objects.equals(depict, album.depict);
    }

    @Override
    public int hashCode() {

        return Objects.hash(albumid, albumname, catid, uid, username, dateline, updatetime, picnum, pic, picflag, friend, password, targetIds, favtimes, sharetimes, depict);
    }
}
