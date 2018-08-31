package com.lanchong.home.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_home_notification", schema = "lanchonggk", catalog = "")
public class Notification {
    private Integer id;
    private Integer uid;
    private String type;
    private Byte news;
    private Integer authorid;
    private String author;
    private String note;
    private Integer dateline;
    private Integer fromId;
    private String fromIdtype;
    private Integer fromNum;
    private Byte category;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "new")
    public Byte getNews() {
        return news;
    }

    public void setNews(Byte news) {
        this.news = news;
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
    @Column(name = "author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "note")
    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
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
    @Column(name = "from_id")
    public Integer getFromId() {
        return fromId;
    }

    public void setFromId(Integer fromId) {
        this.fromId = fromId;
    }

    @Basic
    @Column(name = "from_idtype")
    public String getFromIdtype() {
        return fromIdtype;
    }

    public void setFromIdtype(String fromIdtype) {
        this.fromIdtype = fromIdtype;
    }

    @Basic
    @Column(name = "from_num")
    public Integer getFromNum() {
        return fromNum;
    }

    public void setFromNum(Integer fromNum) {
        this.fromNum = fromNum;
    }

    @Basic
    @Column(name = "category")
    public Byte getCategory() {
        return category;
    }

    public void setCategory(Byte category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notification that = (Notification) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(uid, that.uid) &&
                Objects.equals(type, that.type) &&
                Objects.equals(news, that.news) &&
                Objects.equals(authorid, that.authorid) &&
                Objects.equals(author, that.author) &&
                Objects.equals(note, that.note) &&
                Objects.equals(dateline, that.dateline) &&
                Objects.equals(fromId, that.fromId) &&
                Objects.equals(fromIdtype, that.fromIdtype) &&
                Objects.equals(fromNum, that.fromNum) &&
                Objects.equals(category, that.category);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, uid, type, news, authorid, author, note, dateline, fromId, fromIdtype, fromNum, category);
    }
}
