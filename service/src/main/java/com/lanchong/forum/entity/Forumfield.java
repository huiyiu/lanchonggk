package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_forumfield",  catalog = "")
public class Forumfield {
    private Integer fid;
    private String description;
    private String password;
    private String icon;
    private String redirect;
    private String attachextensions;
    private String creditspolicy;
    private String formulaperm;
    private String moderators;
    private String rules;
    private String threadtypes;
    private String threadsorts;
    private String viewperm;
    private String postperm;
    private String replyperm;
    private String getattachperm;
    private String postattachperm;
    private String postimageperm;
    private String spviewperm;
    private String seotitle;
    private String keywords;
    private String seodescription;
    private String supePushsetting;
    private String modrecommend;
    private String threadplugin;
    private String replybg;
    private String extra;
    private Byte jointype;
    private Byte gviewperm;
    private Short membernum;
    private Integer dateline;
    private Integer lastupdate;
    private Integer activity;
    private Integer founderuid;
    private String foundername;
    private String banner;
    private Short groupnum;
    private String commentitem;
    private String relatedgroup;
    private Byte picstyle;
    private Byte widthauto;
    private Byte noantitheft;
    private Byte noforumhidewater;
    private Byte noforumrecommend;
    private Integer livetid;
    private Integer price;

    @Id
    @Column(name = "fid")
    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
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
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
    @Column(name = "redirect")
    public String getRedirect() {
        return redirect;
    }

    public void setRedirect(String redirect) {
        this.redirect = redirect;
    }

    @Basic
    @Column(name = "attachextensions")
    public String getAttachextensions() {
        return attachextensions;
    }

    public void setAttachextensions(String attachextensions) {
        this.attachextensions = attachextensions;
    }

    @Basic
    @Column(name = "creditspolicy")
    public String getCreditspolicy() {
        return creditspolicy;
    }

    public void setCreditspolicy(String creditspolicy) {
        this.creditspolicy = creditspolicy;
    }

    @Basic
    @Column(name = "formulaperm")
    public String getFormulaperm() {
        return formulaperm;
    }

    public void setFormulaperm(String formulaperm) {
        this.formulaperm = formulaperm;
    }

    @Basic
    @Column(name = "moderators")
    public String getModerators() {
        return moderators;
    }

    public void setModerators(String moderators) {
        this.moderators = moderators;
    }

    @Basic
    @Column(name = "rules")
    public String getRules() {
        return rules;
    }

    public void setRules(String rules) {
        this.rules = rules;
    }

    @Basic
    @Column(name = "threadtypes")
    public String getThreadtypes() {
        return threadtypes;
    }

    public void setThreadtypes(String threadtypes) {
        this.threadtypes = threadtypes;
    }

    @Basic
    @Column(name = "threadsorts")
    public String getThreadsorts() {
        return threadsorts;
    }

    public void setThreadsorts(String threadsorts) {
        this.threadsorts = threadsorts;
    }

    @Basic
    @Column(name = "viewperm")
    public String getViewperm() {
        return viewperm;
    }

    public void setViewperm(String viewperm) {
        this.viewperm = viewperm;
    }

    @Basic
    @Column(name = "postperm")
    public String getPostperm() {
        return postperm;
    }

    public void setPostperm(String postperm) {
        this.postperm = postperm;
    }

    @Basic
    @Column(name = "replyperm")
    public String getReplyperm() {
        return replyperm;
    }

    public void setReplyperm(String replyperm) {
        this.replyperm = replyperm;
    }

    @Basic
    @Column(name = "getattachperm")
    public String getGetattachperm() {
        return getattachperm;
    }

    public void setGetattachperm(String getattachperm) {
        this.getattachperm = getattachperm;
    }

    @Basic
    @Column(name = "postattachperm")
    public String getPostattachperm() {
        return postattachperm;
    }

    public void setPostattachperm(String postattachperm) {
        this.postattachperm = postattachperm;
    }

    @Basic
    @Column(name = "postimageperm")
    public String getPostimageperm() {
        return postimageperm;
    }

    public void setPostimageperm(String postimageperm) {
        this.postimageperm = postimageperm;
    }

    @Basic
    @Column(name = "spviewperm")
    public String getSpviewperm() {
        return spviewperm;
    }

    public void setSpviewperm(String spviewperm) {
        this.spviewperm = spviewperm;
    }

    @Basic
    @Column(name = "seotitle")
    public String getSeotitle() {
        return seotitle;
    }

    public void setSeotitle(String seotitle) {
        this.seotitle = seotitle;
    }

    @Basic
    @Column(name = "keywords")
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @Basic
    @Column(name = "seodescription")
    public String getSeodescription() {
        return seodescription;
    }

    public void setSeodescription(String seodescription) {
        this.seodescription = seodescription;
    }

    @Basic
    @Column(name = "supe_pushsetting")
    public String getSupePushsetting() {
        return supePushsetting;
    }

    public void setSupePushsetting(String supePushsetting) {
        this.supePushsetting = supePushsetting;
    }

    @Basic
    @Column(name = "modrecommend")
    public String getModrecommend() {
        return modrecommend;
    }

    public void setModrecommend(String modrecommend) {
        this.modrecommend = modrecommend;
    }

    @Basic
    @Column(name = "threadplugin")
    public String getThreadplugin() {
        return threadplugin;
    }

    public void setThreadplugin(String threadplugin) {
        this.threadplugin = threadplugin;
    }

    @Basic
    @Column(name = "replybg")
    public String getReplybg() {
        return replybg;
    }

    public void setReplybg(String replybg) {
        this.replybg = replybg;
    }

    @Basic
    @Column(name = "extra")
    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    @Basic
    @Column(name = "jointype")
    public Byte getJointype() {
        return jointype;
    }

    public void setJointype(Byte jointype) {
        this.jointype = jointype;
    }

    @Basic
    @Column(name = "gviewperm")
    public Byte getGviewperm() {
        return gviewperm;
    }

    public void setGviewperm(Byte gviewperm) {
        this.gviewperm = gviewperm;
    }

    @Basic
    @Column(name = "membernum")
    public Short getMembernum() {
        return membernum;
    }

    public void setMembernum(Short membernum) {
        this.membernum = membernum;
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
    @Column(name = "lastupdate")
    public Integer getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Integer lastupdate) {
        this.lastupdate = lastupdate;
    }

    @Basic
    @Column(name = "activity")
    public Integer getActivity() {
        return activity;
    }

    public void setActivity(Integer activity) {
        this.activity = activity;
    }

    @Basic
    @Column(name = "founderuid")
    public Integer getFounderuid() {
        return founderuid;
    }

    public void setFounderuid(Integer founderuid) {
        this.founderuid = founderuid;
    }

    @Basic
    @Column(name = "foundername")
    public String getFoundername() {
        return foundername;
    }

    public void setFoundername(String foundername) {
        this.foundername = foundername;
    }

    @Basic
    @Column(name = "banner")
    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    @Basic
    @Column(name = "groupnum")
    public Short getGroupnum() {
        return groupnum;
    }

    public void setGroupnum(Short groupnum) {
        this.groupnum = groupnum;
    }

    @Basic
    @Column(name = "commentitem")
    public String getCommentitem() {
        return commentitem;
    }

    public void setCommentitem(String commentitem) {
        this.commentitem = commentitem;
    }

    @Basic
    @Column(name = "relatedgroup")
    public String getRelatedgroup() {
        return relatedgroup;
    }

    public void setRelatedgroup(String relatedgroup) {
        this.relatedgroup = relatedgroup;
    }

    @Basic
    @Column(name = "picstyle")
    public Byte getPicstyle() {
        return picstyle;
    }

    public void setPicstyle(Byte picstyle) {
        this.picstyle = picstyle;
    }

    @Basic
    @Column(name = "widthauto")
    public Byte getWidthauto() {
        return widthauto;
    }

    public void setWidthauto(Byte widthauto) {
        this.widthauto = widthauto;
    }

    @Basic
    @Column(name = "noantitheft")
    public Byte getNoantitheft() {
        return noantitheft;
    }

    public void setNoantitheft(Byte noantitheft) {
        this.noantitheft = noantitheft;
    }

    @Basic
    @Column(name = "noforumhidewater")
    public Byte getNoforumhidewater() {
        return noforumhidewater;
    }

    public void setNoforumhidewater(Byte noforumhidewater) {
        this.noforumhidewater = noforumhidewater;
    }

    @Basic
    @Column(name = "noforumrecommend")
    public Byte getNoforumrecommend() {
        return noforumrecommend;
    }

    public void setNoforumrecommend(Byte noforumrecommend) {
        this.noforumrecommend = noforumrecommend;
    }

    @Basic
    @Column(name = "livetid")
    public Integer getLivetid() {
        return livetid;
    }

    public void setLivetid(Integer livetid) {
        this.livetid = livetid;
    }

    @Basic
    @Column(name = "price")
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Forumfield that = (Forumfield) o;

        if (fid != null ? !fid.equals(that.fid) : that.fid != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (icon != null ? !icon.equals(that.icon) : that.icon != null) return false;
        if (redirect != null ? !redirect.equals(that.redirect) : that.redirect != null) return false;
        if (attachextensions != null ? !attachextensions.equals(that.attachextensions) : that.attachextensions != null)
            return false;
        if (creditspolicy != null ? !creditspolicy.equals(that.creditspolicy) : that.creditspolicy != null)
            return false;
        if (formulaperm != null ? !formulaperm.equals(that.formulaperm) : that.formulaperm != null) return false;
        if (moderators != null ? !moderators.equals(that.moderators) : that.moderators != null) return false;
        if (rules != null ? !rules.equals(that.rules) : that.rules != null) return false;
        if (threadtypes != null ? !threadtypes.equals(that.threadtypes) : that.threadtypes != null) return false;
        if (threadsorts != null ? !threadsorts.equals(that.threadsorts) : that.threadsorts != null) return false;
        if (viewperm != null ? !viewperm.equals(that.viewperm) : that.viewperm != null) return false;
        if (postperm != null ? !postperm.equals(that.postperm) : that.postperm != null) return false;
        if (replyperm != null ? !replyperm.equals(that.replyperm) : that.replyperm != null) return false;
        if (getattachperm != null ? !getattachperm.equals(that.getattachperm) : that.getattachperm != null)
            return false;
        if (postattachperm != null ? !postattachperm.equals(that.postattachperm) : that.postattachperm != null)
            return false;
        if (postimageperm != null ? !postimageperm.equals(that.postimageperm) : that.postimageperm != null)
            return false;
        if (spviewperm != null ? !spviewperm.equals(that.spviewperm) : that.spviewperm != null) return false;
        if (seotitle != null ? !seotitle.equals(that.seotitle) : that.seotitle != null) return false;
        if (keywords != null ? !keywords.equals(that.keywords) : that.keywords != null) return false;
        if (seodescription != null ? !seodescription.equals(that.seodescription) : that.seodescription != null)
            return false;
        if (supePushsetting != null ? !supePushsetting.equals(that.supePushsetting) : that.supePushsetting != null)
            return false;
        if (modrecommend != null ? !modrecommend.equals(that.modrecommend) : that.modrecommend != null) return false;
        if (threadplugin != null ? !threadplugin.equals(that.threadplugin) : that.threadplugin != null) return false;
        if (replybg != null ? !replybg.equals(that.replybg) : that.replybg != null) return false;
        if (extra != null ? !extra.equals(that.extra) : that.extra != null) return false;
        if (jointype != null ? !jointype.equals(that.jointype) : that.jointype != null) return false;
        if (gviewperm != null ? !gviewperm.equals(that.gviewperm) : that.gviewperm != null) return false;
        if (membernum != null ? !membernum.equals(that.membernum) : that.membernum != null) return false;
        if (dateline != null ? !dateline.equals(that.dateline) : that.dateline != null) return false;
        if (lastupdate != null ? !lastupdate.equals(that.lastupdate) : that.lastupdate != null) return false;
        if (activity != null ? !activity.equals(that.activity) : that.activity != null) return false;
        if (founderuid != null ? !founderuid.equals(that.founderuid) : that.founderuid != null) return false;
        if (foundername != null ? !foundername.equals(that.foundername) : that.foundername != null) return false;
        if (banner != null ? !banner.equals(that.banner) : that.banner != null) return false;
        if (groupnum != null ? !groupnum.equals(that.groupnum) : that.groupnum != null) return false;
        if (commentitem != null ? !commentitem.equals(that.commentitem) : that.commentitem != null) return false;
        if (relatedgroup != null ? !relatedgroup.equals(that.relatedgroup) : that.relatedgroup != null) return false;
        if (picstyle != null ? !picstyle.equals(that.picstyle) : that.picstyle != null) return false;
        if (widthauto != null ? !widthauto.equals(that.widthauto) : that.widthauto != null) return false;
        if (noantitheft != null ? !noantitheft.equals(that.noantitheft) : that.noantitheft != null) return false;
        if (noforumhidewater != null ? !noforumhidewater.equals(that.noforumhidewater) : that.noforumhidewater != null)
            return false;
        if (noforumrecommend != null ? !noforumrecommend.equals(that.noforumrecommend) : that.noforumrecommend != null)
            return false;
        if (livetid != null ? !livetid.equals(that.livetid) : that.livetid != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fid != null ? fid.hashCode() : 0;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (icon != null ? icon.hashCode() : 0);
        result = 31 * result + (redirect != null ? redirect.hashCode() : 0);
        result = 31 * result + (attachextensions != null ? attachextensions.hashCode() : 0);
        result = 31 * result + (creditspolicy != null ? creditspolicy.hashCode() : 0);
        result = 31 * result + (formulaperm != null ? formulaperm.hashCode() : 0);
        result = 31 * result + (moderators != null ? moderators.hashCode() : 0);
        result = 31 * result + (rules != null ? rules.hashCode() : 0);
        result = 31 * result + (threadtypes != null ? threadtypes.hashCode() : 0);
        result = 31 * result + (threadsorts != null ? threadsorts.hashCode() : 0);
        result = 31 * result + (viewperm != null ? viewperm.hashCode() : 0);
        result = 31 * result + (postperm != null ? postperm.hashCode() : 0);
        result = 31 * result + (replyperm != null ? replyperm.hashCode() : 0);
        result = 31 * result + (getattachperm != null ? getattachperm.hashCode() : 0);
        result = 31 * result + (postattachperm != null ? postattachperm.hashCode() : 0);
        result = 31 * result + (postimageperm != null ? postimageperm.hashCode() : 0);
        result = 31 * result + (spviewperm != null ? spviewperm.hashCode() : 0);
        result = 31 * result + (seotitle != null ? seotitle.hashCode() : 0);
        result = 31 * result + (keywords != null ? keywords.hashCode() : 0);
        result = 31 * result + (seodescription != null ? seodescription.hashCode() : 0);
        result = 31 * result + (supePushsetting != null ? supePushsetting.hashCode() : 0);
        result = 31 * result + (modrecommend != null ? modrecommend.hashCode() : 0);
        result = 31 * result + (threadplugin != null ? threadplugin.hashCode() : 0);
        result = 31 * result + (replybg != null ? replybg.hashCode() : 0);
        result = 31 * result + (extra != null ? extra.hashCode() : 0);
        result = 31 * result + (jointype != null ? jointype.hashCode() : 0);
        result = 31 * result + (gviewperm != null ? gviewperm.hashCode() : 0);
        result = 31 * result + (membernum != null ? membernum.hashCode() : 0);
        result = 31 * result + (dateline != null ? dateline.hashCode() : 0);
        result = 31 * result + (lastupdate != null ? lastupdate.hashCode() : 0);
        result = 31 * result + (activity != null ? activity.hashCode() : 0);
        result = 31 * result + (founderuid != null ? founderuid.hashCode() : 0);
        result = 31 * result + (foundername != null ? foundername.hashCode() : 0);
        result = 31 * result + (banner != null ? banner.hashCode() : 0);
        result = 31 * result + (groupnum != null ? groupnum.hashCode() : 0);
        result = 31 * result + (commentitem != null ? commentitem.hashCode() : 0);
        result = 31 * result + (relatedgroup != null ? relatedgroup.hashCode() : 0);
        result = 31 * result + (picstyle != null ? picstyle.hashCode() : 0);
        result = 31 * result + (widthauto != null ? widthauto.hashCode() : 0);
        result = 31 * result + (noantitheft != null ? noantitheft.hashCode() : 0);
        result = 31 * result + (noforumhidewater != null ? noforumhidewater.hashCode() : 0);
        result = 31 * result + (noforumrecommend != null ? noforumrecommend.hashCode() : 0);
        result = 31 * result + (livetid != null ? livetid.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        return result;
    }
}
