package com.lanchong.home.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_home_share", schema = "lanchonggk", catalog = "")
public class Share {
    private Integer sid;
    private Integer itemid;
    private String type;
    private Integer uid;
    private String username;
    private Integer fromuid;
    private Integer dateline;
    private String titleTemplate;
    private String bodyTemplate;
    private String bodyData;
    private String bodyGeneral;
    private String image;
    private String imageLink;
    private Integer hot;
    private String hotuser;
    private Byte status;

    @Id
    @Column(name = "sid")
    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    @Basic
    @Column(name = "itemid")
    public Integer getItemid() {
        return itemid;
    }

    public void setItemid(Integer itemid) {
        this.itemid = itemid;
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
    @Column(name = "fromuid")
    public Integer getFromuid() {
        return fromuid;
    }

    public void setFromuid(Integer fromuid) {
        this.fromuid = fromuid;
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
    @Column(name = "title_template")
    public String getTitleTemplate() {
        return titleTemplate;
    }

    public void setTitleTemplate(String titleTemplate) {
        this.titleTemplate = titleTemplate;
    }

    @Basic
    @Column(name = "body_template")
    public String getBodyTemplate() {
        return bodyTemplate;
    }

    public void setBodyTemplate(String bodyTemplate) {
        this.bodyTemplate = bodyTemplate;
    }

    @Basic
    @Column(name = "body_data")
    public String getBodyData() {
        return bodyData;
    }

    public void setBodyData(String bodyData) {
        this.bodyData = bodyData;
    }

    @Basic
    @Column(name = "body_general")
    public String getBodyGeneral() {
        return bodyGeneral;
    }

    public void setBodyGeneral(String bodyGeneral) {
        this.bodyGeneral = bodyGeneral;
    }

    @Basic
    @Column(name = "image")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Basic
    @Column(name = "image_link")
    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
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
    @Column(name = "hotuser")
    public String getHotuser() {
        return hotuser;
    }

    public void setHotuser(String hotuser) {
        this.hotuser = hotuser;
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
        Share share = (Share) o;
        return Objects.equals(sid, share.sid) &&
                Objects.equals(itemid, share.itemid) &&
                Objects.equals(type, share.type) &&
                Objects.equals(uid, share.uid) &&
                Objects.equals(username, share.username) &&
                Objects.equals(fromuid, share.fromuid) &&
                Objects.equals(dateline, share.dateline) &&
                Objects.equals(titleTemplate, share.titleTemplate) &&
                Objects.equals(bodyTemplate, share.bodyTemplate) &&
                Objects.equals(bodyData, share.bodyData) &&
                Objects.equals(bodyGeneral, share.bodyGeneral) &&
                Objects.equals(image, share.image) &&
                Objects.equals(imageLink, share.imageLink) &&
                Objects.equals(hot, share.hot) &&
                Objects.equals(hotuser, share.hotuser) &&
                Objects.equals(status, share.status);
    }

    @Override
    public int hashCode() {

        return Objects.hash(sid, itemid, type, uid, username, fromuid, dateline, titleTemplate, bodyTemplate, bodyData, bodyGeneral, image, imageLink, hot, hotuser, status);
    }
}
