package com.lanchong.common.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_common_member_field_forum", catalog = "")
public class MemberFieldForum {
    private Integer uid;
    private Byte publishfeed;
    private Byte customshow;
    private String customstatus;
    private String medals;
    private String sightml;
    private String groupterms;
    private String authstr;
    private String groups;
    private String attentiongroup;

    @Id
    @Column(name = "uid")
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "publishfeed")
    public Byte getPublishfeed() {
        return publishfeed;
    }

    public void setPublishfeed(Byte publishfeed) {
        this.publishfeed = publishfeed;
    }

    @Basic
    @Column(name = "customshow")
    public Byte getCustomshow() {
        return customshow;
    }

    public void setCustomshow(Byte customshow) {
        this.customshow = customshow;
    }

    @Basic
    @Column(name = "customstatus")
    public String getCustomstatus() {
        return customstatus;
    }

    public void setCustomstatus(String customstatus) {
        this.customstatus = customstatus;
    }

    @Basic
    @Column(name = "medals")
    public String getMedals() {
        return medals;
    }

    public void setMedals(String medals) {
        this.medals = medals;
    }

    @Basic
    @Column(name = "sightml")
    public String getSightml() {
        return sightml;
    }

    public void setSightml(String sightml) {
        this.sightml = sightml;
    }

    @Basic
    @Column(name = "groupterms")
    public String getGroupterms() {
        return groupterms;
    }

    public void setGroupterms(String groupterms) {
        this.groupterms = groupterms;
    }

    @Basic
    @Column(name = "authstr")
    public String getAuthstr() {
        return authstr;
    }

    public void setAuthstr(String authstr) {
        this.authstr = authstr;
    }

    @Basic
    @Column(name = "groups")
    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    @Basic
    @Column(name = "attentiongroup")
    public String getAttentiongroup() {
        return attentiongroup;
    }

    public void setAttentiongroup(String attentiongroup) {
        this.attentiongroup = attentiongroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberFieldForum that = (MemberFieldForum) o;
        return Objects.equals(uid, that.uid) &&
                Objects.equals(publishfeed, that.publishfeed) &&
                Objects.equals(customshow, that.customshow) &&
                Objects.equals(customstatus, that.customstatus) &&
                Objects.equals(medals, that.medals) &&
                Objects.equals(sightml, that.sightml) &&
                Objects.equals(groupterms, that.groupterms) &&
                Objects.equals(authstr, that.authstr) &&
                Objects.equals(groups, that.groups) &&
                Objects.equals(attentiongroup, that.attentiongroup);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uid, publishfeed, customshow, customstatus, medals, sightml, groupterms, authstr, groups, attentiongroup);
    }
}
