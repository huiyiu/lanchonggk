package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_forum", schema = "lanchonggk", catalog = "")
public class Forum {
    private Integer fid;
    private Integer fup;
    private Integer type;
    private String name;
    private Byte status;
    private Short displayorder;
    private Short styleid;
    private Integer threads;
    private Integer posts;
    private Integer todayposts;
    private Integer yesterdayposts;
    private Short rank;
    private Short oldrank;
    private String lastpost;
    private String domain;
    private Byte allowsmilies;
    private Byte allowhtml;
    private Byte allowbbcode;
    private Byte allowimgcode;
    private Byte allowmediacode;
    private Byte allowanonymous;
    private Short allowpostspecial;
    private Byte allowspecialonly;
    private Byte allowappend;
    private Byte alloweditrules;
    private Byte allowfeed;
    private Byte allowside;
    private Byte recyclebin;
    private Byte modnewposts;
    private Byte jammer;
    private Byte disablewatermark;
    private Byte inheritedmod;
    private Short autoclose;
    private Byte forumcolumns;
    private Byte catforumcolumns;
    private Byte threadcaches;
    private Byte alloweditpost;
    private Byte simple;
    private Byte modworks;
    private Byte allowglobalstick;
    private Short level;
    private Integer commoncredits;
    private Byte archive;
    private Short recommend;
    private Integer favtimes;
    private Integer sharetimes;
    private Byte disablethumb;
    private Byte disablecollect;

    @Id
    @Column(name = "fid")
    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    @Basic
    @Column(name = "fup")
    public Integer getFup() {
        return fup;
    }

    public void setFup(Integer fup) {
        this.fup = fup;
    }

    @Basic
    @Column(name = "type")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "status")
    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Basic
    @Column(name = "displayorder")
    public Short getDisplayorder() {
        return displayorder;
    }

    public void setDisplayorder(Short displayorder) {
        this.displayorder = displayorder;
    }

    @Basic
    @Column(name = "styleid")
    public Short getStyleid() {
        return styleid;
    }

    public void setStyleid(Short styleid) {
        this.styleid = styleid;
    }

    @Basic
    @Column(name = "threads")
    public Integer getThreads() {
        return threads;
    }

    public void setThreads(Integer threads) {
        this.threads = threads;
    }

    @Basic
    @Column(name = "posts")
    public Integer getPosts() {
        return posts;
    }

    public void setPosts(Integer posts) {
        this.posts = posts;
    }

    @Basic
    @Column(name = "todayposts")
    public Integer getTodayposts() {
        return todayposts;
    }

    public void setTodayposts(Integer todayposts) {
        this.todayposts = todayposts;
    }

    @Basic
    @Column(name = "yesterdayposts")
    public Integer getYesterdayposts() {
        return yesterdayposts;
    }

    public void setYesterdayposts(Integer yesterdayposts) {
        this.yesterdayposts = yesterdayposts;
    }

    @Basic
    @Column(name = "rank")
    public Short getRank() {
        return rank;
    }

    public void setRank(Short rank) {
        this.rank = rank;
    }

    @Basic
    @Column(name = "oldrank")
    public Short getOldrank() {
        return oldrank;
    }

    public void setOldrank(Short oldrank) {
        this.oldrank = oldrank;
    }

    @Basic
    @Column(name = "lastpost")
    public String getLastpost() {
        return lastpost;
    }

    public void setLastpost(String lastpost) {
        this.lastpost = lastpost;
    }

    @Basic
    @Column(name = "domain")
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Basic
    @Column(name = "allowsmilies")
    public Byte getAllowsmilies() {
        return allowsmilies;
    }

    public void setAllowsmilies(Byte allowsmilies) {
        this.allowsmilies = allowsmilies;
    }

    @Basic
    @Column(name = "allowhtml")
    public Byte getAllowhtml() {
        return allowhtml;
    }

    public void setAllowhtml(Byte allowhtml) {
        this.allowhtml = allowhtml;
    }

    @Basic
    @Column(name = "allowbbcode")
    public Byte getAllowbbcode() {
        return allowbbcode;
    }

    public void setAllowbbcode(Byte allowbbcode) {
        this.allowbbcode = allowbbcode;
    }

    @Basic
    @Column(name = "allowimgcode")
    public Byte getAllowimgcode() {
        return allowimgcode;
    }

    public void setAllowimgcode(Byte allowimgcode) {
        this.allowimgcode = allowimgcode;
    }

    @Basic
    @Column(name = "allowmediacode")
    public Byte getAllowmediacode() {
        return allowmediacode;
    }

    public void setAllowmediacode(Byte allowmediacode) {
        this.allowmediacode = allowmediacode;
    }

    @Basic
    @Column(name = "allowanonymous")
    public Byte getAllowanonymous() {
        return allowanonymous;
    }

    public void setAllowanonymous(Byte allowanonymous) {
        this.allowanonymous = allowanonymous;
    }

    @Basic
    @Column(name = "allowpostspecial")
    public Short getAllowpostspecial() {
        return allowpostspecial;
    }

    public void setAllowpostspecial(Short allowpostspecial) {
        this.allowpostspecial = allowpostspecial;
    }

    @Basic
    @Column(name = "allowspecialonly")
    public Byte getAllowspecialonly() {
        return allowspecialonly;
    }

    public void setAllowspecialonly(Byte allowspecialonly) {
        this.allowspecialonly = allowspecialonly;
    }

    @Basic
    @Column(name = "allowappend")
    public Byte getAllowappend() {
        return allowappend;
    }

    public void setAllowappend(Byte allowappend) {
        this.allowappend = allowappend;
    }

    @Basic
    @Column(name = "alloweditrules")
    public Byte getAlloweditrules() {
        return alloweditrules;
    }

    public void setAlloweditrules(Byte alloweditrules) {
        this.alloweditrules = alloweditrules;
    }

    @Basic
    @Column(name = "allowfeed")
    public Byte getAllowfeed() {
        return allowfeed;
    }

    public void setAllowfeed(Byte allowfeed) {
        this.allowfeed = allowfeed;
    }

    @Basic
    @Column(name = "allowside")
    public Byte getAllowside() {
        return allowside;
    }

    public void setAllowside(Byte allowside) {
        this.allowside = allowside;
    }

    @Basic
    @Column(name = "recyclebin")
    public Byte getRecyclebin() {
        return recyclebin;
    }

    public void setRecyclebin(Byte recyclebin) {
        this.recyclebin = recyclebin;
    }

    @Basic
    @Column(name = "modnewposts")
    public Byte getModnewposts() {
        return modnewposts;
    }

    public void setModnewposts(Byte modnewposts) {
        this.modnewposts = modnewposts;
    }

    @Basic
    @Column(name = "jammer")
    public Byte getJammer() {
        return jammer;
    }

    public void setJammer(Byte jammer) {
        this.jammer = jammer;
    }

    @Basic
    @Column(name = "disablewatermark")
    public Byte getDisablewatermark() {
        return disablewatermark;
    }

    public void setDisablewatermark(Byte disablewatermark) {
        this.disablewatermark = disablewatermark;
    }

    @Basic
    @Column(name = "inheritedmod")
    public Byte getInheritedmod() {
        return inheritedmod;
    }

    public void setInheritedmod(Byte inheritedmod) {
        this.inheritedmod = inheritedmod;
    }

    @Basic
    @Column(name = "autoclose")
    public Short getAutoclose() {
        return autoclose;
    }

    public void setAutoclose(Short autoclose) {
        this.autoclose = autoclose;
    }

    @Basic
    @Column(name = "forumcolumns")
    public Byte getForumcolumns() {
        return forumcolumns;
    }

    public void setForumcolumns(Byte forumcolumns) {
        this.forumcolumns = forumcolumns;
    }

    @Basic
    @Column(name = "catforumcolumns")
    public Byte getCatforumcolumns() {
        return catforumcolumns;
    }

    public void setCatforumcolumns(Byte catforumcolumns) {
        this.catforumcolumns = catforumcolumns;
    }

    @Basic
    @Column(name = "threadcaches")
    public Byte getThreadcaches() {
        return threadcaches;
    }

    public void setThreadcaches(Byte threadcaches) {
        this.threadcaches = threadcaches;
    }

    @Basic
    @Column(name = "alloweditpost")
    public Byte getAlloweditpost() {
        return alloweditpost;
    }

    public void setAlloweditpost(Byte alloweditpost) {
        this.alloweditpost = alloweditpost;
    }

    @Basic
    @Column(name = "simple")
    public Byte getSimple() {
        return simple;
    }

    public void setSimple(Byte simple) {
        this.simple = simple;
    }

    @Basic
    @Column(name = "modworks")
    public Byte getModworks() {
        return modworks;
    }

    public void setModworks(Byte modworks) {
        this.modworks = modworks;
    }

    @Basic
    @Column(name = "allowglobalstick")
    public Byte getAllowglobalstick() {
        return allowglobalstick;
    }

    public void setAllowglobalstick(Byte allowglobalstick) {
        this.allowglobalstick = allowglobalstick;
    }

    @Basic
    @Column(name = "level")
    public Short getLevel() {
        return level;
    }

    public void setLevel(Short level) {
        this.level = level;
    }

    @Basic
    @Column(name = "commoncredits")
    public Integer getCommoncredits() {
        return commoncredits;
    }

    public void setCommoncredits(Integer commoncredits) {
        this.commoncredits = commoncredits;
    }

    @Basic
    @Column(name = "archive")
    public Byte getArchive() {
        return archive;
    }

    public void setArchive(Byte archive) {
        this.archive = archive;
    }

    @Basic
    @Column(name = "recommend")
    public Short getRecommend() {
        return recommend;
    }

    public void setRecommend(Short recommend) {
        this.recommend = recommend;
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
    @Column(name = "disablethumb")
    public Byte getDisablethumb() {
        return disablethumb;
    }

    public void setDisablethumb(Byte disablethumb) {
        this.disablethumb = disablethumb;
    }

    @Basic
    @Column(name = "disablecollect")
    public Byte getDisablecollect() {
        return disablecollect;
    }

    public void setDisablecollect(Byte disablecollect) {
        this.disablecollect = disablecollect;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Forum forum = (Forum) o;

        if (fid != null ? !fid.equals(forum.fid) : forum.fid != null) return false;
        if (fup != null ? !fup.equals(forum.fup) : forum.fup != null) return false;
        if (type != null ? !type.equals(forum.type) : forum.type != null) return false;
        if (name != null ? !name.equals(forum.name) : forum.name != null) return false;
        if (status != null ? !status.equals(forum.status) : forum.status != null) return false;
        if (displayorder != null ? !displayorder.equals(forum.displayorder) : forum.displayorder != null) return false;
        if (styleid != null ? !styleid.equals(forum.styleid) : forum.styleid != null) return false;
        if (threads != null ? !threads.equals(forum.threads) : forum.threads != null) return false;
        if (posts != null ? !posts.equals(forum.posts) : forum.posts != null) return false;
        if (todayposts != null ? !todayposts.equals(forum.todayposts) : forum.todayposts != null) return false;
        if (yesterdayposts != null ? !yesterdayposts.equals(forum.yesterdayposts) : forum.yesterdayposts != null)
            return false;
        if (rank != null ? !rank.equals(forum.rank) : forum.rank != null) return false;
        if (oldrank != null ? !oldrank.equals(forum.oldrank) : forum.oldrank != null) return false;
        if (lastpost != null ? !lastpost.equals(forum.lastpost) : forum.lastpost != null) return false;
        if (domain != null ? !domain.equals(forum.domain) : forum.domain != null) return false;
        if (allowsmilies != null ? !allowsmilies.equals(forum.allowsmilies) : forum.allowsmilies != null) return false;
        if (allowhtml != null ? !allowhtml.equals(forum.allowhtml) : forum.allowhtml != null) return false;
        if (allowbbcode != null ? !allowbbcode.equals(forum.allowbbcode) : forum.allowbbcode != null) return false;
        if (allowimgcode != null ? !allowimgcode.equals(forum.allowimgcode) : forum.allowimgcode != null) return false;
        if (allowmediacode != null ? !allowmediacode.equals(forum.allowmediacode) : forum.allowmediacode != null)
            return false;
        if (allowanonymous != null ? !allowanonymous.equals(forum.allowanonymous) : forum.allowanonymous != null)
            return false;
        if (allowpostspecial != null ? !allowpostspecial.equals(forum.allowpostspecial) : forum.allowpostspecial != null)
            return false;
        if (allowspecialonly != null ? !allowspecialonly.equals(forum.allowspecialonly) : forum.allowspecialonly != null)
            return false;
        if (allowappend != null ? !allowappend.equals(forum.allowappend) : forum.allowappend != null) return false;
        if (alloweditrules != null ? !alloweditrules.equals(forum.alloweditrules) : forum.alloweditrules != null)
            return false;
        if (allowfeed != null ? !allowfeed.equals(forum.allowfeed) : forum.allowfeed != null) return false;
        if (allowside != null ? !allowside.equals(forum.allowside) : forum.allowside != null) return false;
        if (recyclebin != null ? !recyclebin.equals(forum.recyclebin) : forum.recyclebin != null) return false;
        if (modnewposts != null ? !modnewposts.equals(forum.modnewposts) : forum.modnewposts != null) return false;
        if (jammer != null ? !jammer.equals(forum.jammer) : forum.jammer != null) return false;
        if (disablewatermark != null ? !disablewatermark.equals(forum.disablewatermark) : forum.disablewatermark != null)
            return false;
        if (inheritedmod != null ? !inheritedmod.equals(forum.inheritedmod) : forum.inheritedmod != null) return false;
        if (autoclose != null ? !autoclose.equals(forum.autoclose) : forum.autoclose != null) return false;
        if (forumcolumns != null ? !forumcolumns.equals(forum.forumcolumns) : forum.forumcolumns != null) return false;
        if (catforumcolumns != null ? !catforumcolumns.equals(forum.catforumcolumns) : forum.catforumcolumns != null)
            return false;
        if (threadcaches != null ? !threadcaches.equals(forum.threadcaches) : forum.threadcaches != null) return false;
        if (alloweditpost != null ? !alloweditpost.equals(forum.alloweditpost) : forum.alloweditpost != null)
            return false;
        if (simple != null ? !simple.equals(forum.simple) : forum.simple != null) return false;
        if (modworks != null ? !modworks.equals(forum.modworks) : forum.modworks != null) return false;
        if (allowglobalstick != null ? !allowglobalstick.equals(forum.allowglobalstick) : forum.allowglobalstick != null)
            return false;
        if (level != null ? !level.equals(forum.level) : forum.level != null) return false;
        if (commoncredits != null ? !commoncredits.equals(forum.commoncredits) : forum.commoncredits != null)
            return false;
        if (archive != null ? !archive.equals(forum.archive) : forum.archive != null) return false;
        if (recommend != null ? !recommend.equals(forum.recommend) : forum.recommend != null) return false;
        if (favtimes != null ? !favtimes.equals(forum.favtimes) : forum.favtimes != null) return false;
        if (sharetimes != null ? !sharetimes.equals(forum.sharetimes) : forum.sharetimes != null) return false;
        if (disablethumb != null ? !disablethumb.equals(forum.disablethumb) : forum.disablethumb != null) return false;
        if (disablecollect != null ? !disablecollect.equals(forum.disablecollect) : forum.disablecollect != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fid != null ? fid.hashCode() : 0;
        result = 31 * result + (fup != null ? fup.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (displayorder != null ? displayorder.hashCode() : 0);
        result = 31 * result + (styleid != null ? styleid.hashCode() : 0);
        result = 31 * result + (threads != null ? threads.hashCode() : 0);
        result = 31 * result + (posts != null ? posts.hashCode() : 0);
        result = 31 * result + (todayposts != null ? todayposts.hashCode() : 0);
        result = 31 * result + (yesterdayposts != null ? yesterdayposts.hashCode() : 0);
        result = 31 * result + (rank != null ? rank.hashCode() : 0);
        result = 31 * result + (oldrank != null ? oldrank.hashCode() : 0);
        result = 31 * result + (lastpost != null ? lastpost.hashCode() : 0);
        result = 31 * result + (domain != null ? domain.hashCode() : 0);
        result = 31 * result + (allowsmilies != null ? allowsmilies.hashCode() : 0);
        result = 31 * result + (allowhtml != null ? allowhtml.hashCode() : 0);
        result = 31 * result + (allowbbcode != null ? allowbbcode.hashCode() : 0);
        result = 31 * result + (allowimgcode != null ? allowimgcode.hashCode() : 0);
        result = 31 * result + (allowmediacode != null ? allowmediacode.hashCode() : 0);
        result = 31 * result + (allowanonymous != null ? allowanonymous.hashCode() : 0);
        result = 31 * result + (allowpostspecial != null ? allowpostspecial.hashCode() : 0);
        result = 31 * result + (allowspecialonly != null ? allowspecialonly.hashCode() : 0);
        result = 31 * result + (allowappend != null ? allowappend.hashCode() : 0);
        result = 31 * result + (alloweditrules != null ? alloweditrules.hashCode() : 0);
        result = 31 * result + (allowfeed != null ? allowfeed.hashCode() : 0);
        result = 31 * result + (allowside != null ? allowside.hashCode() : 0);
        result = 31 * result + (recyclebin != null ? recyclebin.hashCode() : 0);
        result = 31 * result + (modnewposts != null ? modnewposts.hashCode() : 0);
        result = 31 * result + (jammer != null ? jammer.hashCode() : 0);
        result = 31 * result + (disablewatermark != null ? disablewatermark.hashCode() : 0);
        result = 31 * result + (inheritedmod != null ? inheritedmod.hashCode() : 0);
        result = 31 * result + (autoclose != null ? autoclose.hashCode() : 0);
        result = 31 * result + (forumcolumns != null ? forumcolumns.hashCode() : 0);
        result = 31 * result + (catforumcolumns != null ? catforumcolumns.hashCode() : 0);
        result = 31 * result + (threadcaches != null ? threadcaches.hashCode() : 0);
        result = 31 * result + (alloweditpost != null ? alloweditpost.hashCode() : 0);
        result = 31 * result + (simple != null ? simple.hashCode() : 0);
        result = 31 * result + (modworks != null ? modworks.hashCode() : 0);
        result = 31 * result + (allowglobalstick != null ? allowglobalstick.hashCode() : 0);
        result = 31 * result + (level != null ? level.hashCode() : 0);
        result = 31 * result + (commoncredits != null ? commoncredits.hashCode() : 0);
        result = 31 * result + (archive != null ? archive.hashCode() : 0);
        result = 31 * result + (recommend != null ? recommend.hashCode() : 0);
        result = 31 * result + (favtimes != null ? favtimes.hashCode() : 0);
        result = 31 * result + (sharetimes != null ? sharetimes.hashCode() : 0);
        result = 31 * result + (disablethumb != null ? disablethumb.hashCode() : 0);
        result = 31 * result + (disablecollect != null ? disablecollect.hashCode() : 0);
        return result;
    }
}
