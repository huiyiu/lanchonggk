package com.lanchong.home.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_home_feed_app", schema = "lanchonggk", catalog = "")
public class FeedApp {
    private Integer feedid;
    private Short appid;
    private String icon;
    private Integer uid;
    private String username;
    private Integer dateline;
    private Byte friend;
    private String hashTemplate;
    private String hashData;
    private String titleTemplate;
    private String titleData;
    private String bodyTemplate;
    private String bodyData;
    private String bodyGeneral;
    private String image1;
    private String image1Link;
    private String image2;
    private String image2Link;
    private String image3;
    private String image3Link;
    private String image4;
    private String image4Link;
    private String targetIds;

    @Id
    @Column(name = "feedid")
    public Integer getFeedid() {
        return feedid;
    }

    public void setFeedid(Integer feedid) {
        this.feedid = feedid;
    }

    @Basic
    @Column(name = "appid")
    public Short getAppid() {
        return appid;
    }

    public void setAppid(Short appid) {
        this.appid = appid;
    }

    @Basic
    @Column(name = "icon")
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
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
    @Column(name = "friend")
    public Byte getFriend() {
        return friend;
    }

    public void setFriend(Byte friend) {
        this.friend = friend;
    }

    @Basic
    @Column(name = "hash_template")
    public String getHashTemplate() {
        return hashTemplate;
    }

    public void setHashTemplate(String hashTemplate) {
        this.hashTemplate = hashTemplate;
    }

    @Basic
    @Column(name = "hash_data")
    public String getHashData() {
        return hashData;
    }

    public void setHashData(String hashData) {
        this.hashData = hashData;
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
    @Column(name = "title_data")
    public String getTitleData() {
        return titleData;
    }

    public void setTitleData(String titleData) {
        this.titleData = titleData;
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
    @Column(name = "image_1")
    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    @Basic
    @Column(name = "image_1_link")
    public String getImage1Link() {
        return image1Link;
    }

    public void setImage1Link(String image1Link) {
        this.image1Link = image1Link;
    }

    @Basic
    @Column(name = "image_2")
    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    @Basic
    @Column(name = "image_2_link")
    public String getImage2Link() {
        return image2Link;
    }

    public void setImage2Link(String image2Link) {
        this.image2Link = image2Link;
    }

    @Basic
    @Column(name = "image_3")
    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    @Basic
    @Column(name = "image_3_link")
    public String getImage3Link() {
        return image3Link;
    }

    public void setImage3Link(String image3Link) {
        this.image3Link = image3Link;
    }

    @Basic
    @Column(name = "image_4")
    public String getImage4() {
        return image4;
    }

    public void setImage4(String image4) {
        this.image4 = image4;
    }

    @Basic
    @Column(name = "image_4_link")
    public String getImage4Link() {
        return image4Link;
    }

    public void setImage4Link(String image4Link) {
        this.image4Link = image4Link;
    }

    @Basic
    @Column(name = "target_ids")
    public String getTargetIds() {
        return targetIds;
    }

    public void setTargetIds(String targetIds) {
        this.targetIds = targetIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FeedApp feedApp = (FeedApp) o;
        return Objects.equals(feedid, feedApp.feedid) &&
                Objects.equals(appid, feedApp.appid) &&
                Objects.equals(icon, feedApp.icon) &&
                Objects.equals(uid, feedApp.uid) &&
                Objects.equals(username, feedApp.username) &&
                Objects.equals(dateline, feedApp.dateline) &&
                Objects.equals(friend, feedApp.friend) &&
                Objects.equals(hashTemplate, feedApp.hashTemplate) &&
                Objects.equals(hashData, feedApp.hashData) &&
                Objects.equals(titleTemplate, feedApp.titleTemplate) &&
                Objects.equals(titleData, feedApp.titleData) &&
                Objects.equals(bodyTemplate, feedApp.bodyTemplate) &&
                Objects.equals(bodyData, feedApp.bodyData) &&
                Objects.equals(bodyGeneral, feedApp.bodyGeneral) &&
                Objects.equals(image1, feedApp.image1) &&
                Objects.equals(image1Link, feedApp.image1Link) &&
                Objects.equals(image2, feedApp.image2) &&
                Objects.equals(image2Link, feedApp.image2Link) &&
                Objects.equals(image3, feedApp.image3) &&
                Objects.equals(image3Link, feedApp.image3Link) &&
                Objects.equals(image4, feedApp.image4) &&
                Objects.equals(image4Link, feedApp.image4Link) &&
                Objects.equals(targetIds, feedApp.targetIds);
    }

    @Override
    public int hashCode() {

        return Objects.hash(feedid, appid, icon, uid, username, dateline, friend, hashTemplate, hashData, titleTemplate, titleData, bodyTemplate, bodyData, bodyGeneral, image1, image1Link, image2, image2Link, image3, image3Link, image4, image4Link, targetIds);
    }
}
