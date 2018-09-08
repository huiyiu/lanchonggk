package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_bbcode",  catalog = "")
public class Bbcode {
    private Integer id;
    private Byte available;
    private String tag;
    private String icon;
    private String replacement;
    private String example;
    private String explanation;
    private Byte params;
    private String prompt;
    private Byte nest;
    private Byte displayorder;
    private String perm;

    @Id
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "available")
    public Byte getAvailable() {
        return available;
    }

    public void setAvailable(Byte available) {
        this.available = available;
    }

    @Basic
    @Column(name = "tag")
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
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
    @Column(name = "replacement")
    public String getReplacement() {
        return replacement;
    }

    public void setReplacement(String replacement) {
        this.replacement = replacement;
    }

    @Basic
    @Column(name = "example")
    public String getExample() {
        return example;
    }

    public void setExample(String example) {
        this.example = example;
    }

    @Basic
    @Column(name = "explanation")
    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    @Basic
    @Column(name = "params")
    public Byte getParams() {
        return params;
    }

    public void setParams(Byte params) {
        this.params = params;
    }

    @Basic
    @Column(name = "prompt")
    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    @Basic
    @Column(name = "nest")
    public Byte getNest() {
        return nest;
    }

    public void setNest(Byte nest) {
        this.nest = nest;
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
    @Column(name = "perm")
    public String getPerm() {
        return perm;
    }

    public void setPerm(String perm) {
        this.perm = perm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bbcode bbcode = (Bbcode) o;

        if (id != null ? !id.equals(bbcode.id) : bbcode.id != null) return false;
        if (available != null ? !available.equals(bbcode.available) : bbcode.available != null) return false;
        if (tag != null ? !tag.equals(bbcode.tag) : bbcode.tag != null) return false;
        if (icon != null ? !icon.equals(bbcode.icon) : bbcode.icon != null) return false;
        if (replacement != null ? !replacement.equals(bbcode.replacement) : bbcode.replacement != null) return false;
        if (example != null ? !example.equals(bbcode.example) : bbcode.example != null) return false;
        if (explanation != null ? !explanation.equals(bbcode.explanation) : bbcode.explanation != null) return false;
        if (params != null ? !params.equals(bbcode.params) : bbcode.params != null) return false;
        if (prompt != null ? !prompt.equals(bbcode.prompt) : bbcode.prompt != null) return false;
        if (nest != null ? !nest.equals(bbcode.nest) : bbcode.nest != null) return false;
        if (displayorder != null ? !displayorder.equals(bbcode.displayorder) : bbcode.displayorder != null)
            return false;
        if (perm != null ? !perm.equals(bbcode.perm) : bbcode.perm != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (available != null ? available.hashCode() : 0);
        result = 31 * result + (tag != null ? tag.hashCode() : 0);
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        result = 31 * result + (replacement != null ? replacement.hashCode() : 0);
        result = 31 * result + (example != null ? example.hashCode() : 0);
        result = 31 * result + (explanation != null ? explanation.hashCode() : 0);
        result = 31 * result + (params != null ? params.hashCode() : 0);
        result = 31 * result + (prompt != null ? prompt.hashCode() : 0);
        result = 31 * result + (nest != null ? nest.hashCode() : 0);
        result = 31 * result + (displayorder != null ? displayorder.hashCode() : 0);
        result = 31 * result + (perm != null ? perm.hashCode() : 0);
        return result;
    }
}
