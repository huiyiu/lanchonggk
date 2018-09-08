package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_faq",  catalog = "")
public class Faq {
    private Short id;
    private Short fpid;
    private Byte displayorder;
    private String identifier;
    private String keyword;
    private String title;
    private String message;

    @Id
    @Column(name = "id")
    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    @Basic
    @Column(name = "fpid")
    public Short getFpid() {
        return fpid;
    }

    public void setFpid(Short fpid) {
        this.fpid = fpid;
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
    @Column(name = "identifier")
    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    @Basic
    @Column(name = "keyword")
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
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
    @Column(name = "message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Faq faq = (Faq) o;

        if (id != null ? !id.equals(faq.id) : faq.id != null) return false;
        if (fpid != null ? !fpid.equals(faq.fpid) : faq.fpid != null) return false;
        if (displayorder != null ? !displayorder.equals(faq.displayorder) : faq.displayorder != null) return false;
        if (identifier != null ? !identifier.equals(faq.identifier) : faq.identifier != null) return false;
        if (keyword != null ? !keyword.equals(faq.keyword) : faq.keyword != null) return false;
        if (title != null ? !title.equals(faq.title) : faq.title != null) return false;
        if (message != null ? !message.equals(faq.message) : faq.message != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (fpid != null ? fpid.hashCode() : 0);
        result = 31 * result + (displayorder != null ? displayorder.hashCode() : 0);
        result = 31 * result + (identifier != null ? identifier.hashCode() : 0);
        result = 31 * result + (keyword != null ? keyword.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (message != null ? message.hashCode() : 0);
        return result;
    }
}
