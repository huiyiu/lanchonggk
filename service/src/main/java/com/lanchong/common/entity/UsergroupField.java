package com.lanchong.common.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_common_usergroup_field", schema = "lanchong", catalog = "")
public class UsergroupField {
    private Short groupid;
    private Byte readaccess;
    private Byte allowpost;
    private Byte allowreply;
    private Byte allowpostpoll;
    private Byte allowpostreward;
    private Byte allowposttrade;
    private Byte allowpostactivity;
    private Byte allowdirectpost;
    private Byte allowgetattach;
    private Byte allowgetimage;
    private Byte allowpostattach;
    private Byte allowpostimage;
    private Byte allowvote;
    private Byte allowsearch;
    private Byte allowcstatus;
    private Byte allowinvisible;
    private Byte allowtransfer;
    private Byte allowsetreadperm;
    private Byte allowsetattachperm;
    private Byte allowposttag;
    private Byte allowhidecode;
    private Byte allowhtml;
    private Byte allowanonymous;
    private Byte allowsigbbcode;
    private Byte allowsigimgcode;
    private Byte allowmagics;
    private Byte disableperiodctrl;
    private Byte reasonpm;
    private Short maxprice;
    private Short maxsigsize;
    private Integer maxattachsize;
    private Integer maxsizeperday;
    private Byte maxthreadsperhour;
    private Byte maxpostsperhour;
    private String attachextensions;
    private String raterange;
    private String loginreward;
    private Short mintradeprice;
    private Short maxtradeprice;
    private Short minrewardprice;
    private Short maxrewardprice;
    private Byte magicsdiscount;
    private Short maxmagicsweight;
    private Byte allowpostdebate;
    private Byte tradestick;
    private Byte exempt;
    private Short maxattachnum;
    private Byte allowposturl;
    private Byte allowrecommend;
    private Byte allowpostrushreply;
    private Short maxfriendnum;
    private Integer maxspacesize;
    private Byte allowcomment;
    private Short allowcommentarticle;
    private Short searchinterval;
    private Byte searchignore;
    private Byte allowblog;
    private Byte allowdoing;
    private Byte allowupload;
    private Byte allowshare;
    private Byte allowblogmod;
    private Byte allowdoingmod;
    private Byte allowuploadmod;
    private Byte allowsharemod;
    private Byte allowcss;
    private Byte allowpoke;
    private Byte allowfriend;
    private Byte allowclick;
    private Byte allowmagic;
    private Byte allowstat;
    private Byte allowstatdata;
    private Byte videophotoignore;
    private Byte allowviewvideophoto;
    private Byte allowmyop;
    private Byte magicdiscount;
    private Short domainlength;
    private Byte seccode;
    private Byte disablepostctrl;
    private Byte allowbuildgroup;
    private Byte allowgroupdirectpost;
    private Byte allowgroupposturl;
    private Short edittimelimit;
    private Byte allowpostarticle;
    private Byte allowdownlocalimg;
    private Byte allowdownremoteimg;
    private Byte allowpostarticlemod;
    private Byte allowspacediyhtml;
    private Byte allowspacediybbcode;
    private Byte allowspacediyimgcode;
    private Byte allowcommentpost;
    private Byte allowcommentitem;
    private Byte allowcommentreply;
    private Byte allowreplycredit;
    private Byte ignorecensor;
    private Byte allowsendallpm;
    private Short allowsendpmmaxnum;
    private Integer maximagesize;
    private Byte allowmediacode;
    private Byte allowbegincode;
    private Short allowat;
    private Byte allowsetpublishdate;
    private Byte allowfollowcollection;
    private Byte allowcommentcollection;
    private Short allowcreatecollection;
    private Byte forcesecques;
    private Byte forcelogin;
    private Byte closead;
    private Short buildgroupcredits;
    private Byte allowimgcontent;

    @Id
    @Column(name = "groupid")
    public Short getGroupid() {
        return groupid;
    }

    public void setGroupid(Short groupid) {
        this.groupid = groupid;
    }

    @Basic
    @Column(name = "readaccess")
    public Byte getReadaccess() {
        return readaccess;
    }

    public void setReadaccess(Byte readaccess) {
        this.readaccess = readaccess;
    }

    @Basic
    @Column(name = "allowpost")
    public Byte getAllowpost() {
        return allowpost;
    }

    public void setAllowpost(Byte allowpost) {
        this.allowpost = allowpost;
    }

    @Basic
    @Column(name = "allowreply")
    public Byte getAllowreply() {
        return allowreply;
    }

    public void setAllowreply(Byte allowreply) {
        this.allowreply = allowreply;
    }

    @Basic
    @Column(name = "allowpostpoll")
    public Byte getAllowpostpoll() {
        return allowpostpoll;
    }

    public void setAllowpostpoll(Byte allowpostpoll) {
        this.allowpostpoll = allowpostpoll;
    }

    @Basic
    @Column(name = "allowpostreward")
    public Byte getAllowpostreward() {
        return allowpostreward;
    }

    public void setAllowpostreward(Byte allowpostreward) {
        this.allowpostreward = allowpostreward;
    }

    @Basic
    @Column(name = "allowposttrade")
    public Byte getAllowposttrade() {
        return allowposttrade;
    }

    public void setAllowposttrade(Byte allowposttrade) {
        this.allowposttrade = allowposttrade;
    }

    @Basic
    @Column(name = "allowpostactivity")
    public Byte getAllowpostactivity() {
        return allowpostactivity;
    }

    public void setAllowpostactivity(Byte allowpostactivity) {
        this.allowpostactivity = allowpostactivity;
    }

    @Basic
    @Column(name = "allowdirectpost")
    public Byte getAllowdirectpost() {
        return allowdirectpost;
    }

    public void setAllowdirectpost(Byte allowdirectpost) {
        this.allowdirectpost = allowdirectpost;
    }

    @Basic
    @Column(name = "allowgetattach")
    public Byte getAllowgetattach() {
        return allowgetattach;
    }

    public void setAllowgetattach(Byte allowgetattach) {
        this.allowgetattach = allowgetattach;
    }

    @Basic
    @Column(name = "allowgetimage")
    public Byte getAllowgetimage() {
        return allowgetimage;
    }

    public void setAllowgetimage(Byte allowgetimage) {
        this.allowgetimage = allowgetimage;
    }

    @Basic
    @Column(name = "allowpostattach")
    public Byte getAllowpostattach() {
        return allowpostattach;
    }

    public void setAllowpostattach(Byte allowpostattach) {
        this.allowpostattach = allowpostattach;
    }

    @Basic
    @Column(name = "allowpostimage")
    public Byte getAllowpostimage() {
        return allowpostimage;
    }

    public void setAllowpostimage(Byte allowpostimage) {
        this.allowpostimage = allowpostimage;
    }

    @Basic
    @Column(name = "allowvote")
    public Byte getAllowvote() {
        return allowvote;
    }

    public void setAllowvote(Byte allowvote) {
        this.allowvote = allowvote;
    }

    @Basic
    @Column(name = "allowsearch")
    public Byte getAllowsearch() {
        return allowsearch;
    }

    public void setAllowsearch(Byte allowsearch) {
        this.allowsearch = allowsearch;
    }

    @Basic
    @Column(name = "allowcstatus")
    public Byte getAllowcstatus() {
        return allowcstatus;
    }

    public void setAllowcstatus(Byte allowcstatus) {
        this.allowcstatus = allowcstatus;
    }

    @Basic
    @Column(name = "allowinvisible")
    public Byte getAllowinvisible() {
        return allowinvisible;
    }

    public void setAllowinvisible(Byte allowinvisible) {
        this.allowinvisible = allowinvisible;
    }

    @Basic
    @Column(name = "allowtransfer")
    public Byte getAllowtransfer() {
        return allowtransfer;
    }

    public void setAllowtransfer(Byte allowtransfer) {
        this.allowtransfer = allowtransfer;
    }

    @Basic
    @Column(name = "allowsetreadperm")
    public Byte getAllowsetreadperm() {
        return allowsetreadperm;
    }

    public void setAllowsetreadperm(Byte allowsetreadperm) {
        this.allowsetreadperm = allowsetreadperm;
    }

    @Basic
    @Column(name = "allowsetattachperm")
    public Byte getAllowsetattachperm() {
        return allowsetattachperm;
    }

    public void setAllowsetattachperm(Byte allowsetattachperm) {
        this.allowsetattachperm = allowsetattachperm;
    }

    @Basic
    @Column(name = "allowposttag")
    public Byte getAllowposttag() {
        return allowposttag;
    }

    public void setAllowposttag(Byte allowposttag) {
        this.allowposttag = allowposttag;
    }

    @Basic
    @Column(name = "allowhidecode")
    public Byte getAllowhidecode() {
        return allowhidecode;
    }

    public void setAllowhidecode(Byte allowhidecode) {
        this.allowhidecode = allowhidecode;
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
    @Column(name = "allowanonymous")
    public Byte getAllowanonymous() {
        return allowanonymous;
    }

    public void setAllowanonymous(Byte allowanonymous) {
        this.allowanonymous = allowanonymous;
    }

    @Basic
    @Column(name = "allowsigbbcode")
    public Byte getAllowsigbbcode() {
        return allowsigbbcode;
    }

    public void setAllowsigbbcode(Byte allowsigbbcode) {
        this.allowsigbbcode = allowsigbbcode;
    }

    @Basic
    @Column(name = "allowsigimgcode")
    public Byte getAllowsigimgcode() {
        return allowsigimgcode;
    }

    public void setAllowsigimgcode(Byte allowsigimgcode) {
        this.allowsigimgcode = allowsigimgcode;
    }

    @Basic
    @Column(name = "allowmagics")
    public Byte getAllowmagics() {
        return allowmagics;
    }

    public void setAllowmagics(Byte allowmagics) {
        this.allowmagics = allowmagics;
    }

    @Basic
    @Column(name = "disableperiodctrl")
    public Byte getDisableperiodctrl() {
        return disableperiodctrl;
    }

    public void setDisableperiodctrl(Byte disableperiodctrl) {
        this.disableperiodctrl = disableperiodctrl;
    }

    @Basic
    @Column(name = "reasonpm")
    public Byte getReasonpm() {
        return reasonpm;
    }

    public void setReasonpm(Byte reasonpm) {
        this.reasonpm = reasonpm;
    }

    @Basic
    @Column(name = "maxprice")
    public Short getMaxprice() {
        return maxprice;
    }

    public void setMaxprice(Short maxprice) {
        this.maxprice = maxprice;
    }

    @Basic
    @Column(name = "maxsigsize")
    public Short getMaxsigsize() {
        return maxsigsize;
    }

    public void setMaxsigsize(Short maxsigsize) {
        this.maxsigsize = maxsigsize;
    }

    @Basic
    @Column(name = "maxattachsize")
    public Integer getMaxattachsize() {
        return maxattachsize;
    }

    public void setMaxattachsize(Integer maxattachsize) {
        this.maxattachsize = maxattachsize;
    }

    @Basic
    @Column(name = "maxsizeperday")
    public Integer getMaxsizeperday() {
        return maxsizeperday;
    }

    public void setMaxsizeperday(Integer maxsizeperday) {
        this.maxsizeperday = maxsizeperday;
    }

    @Basic
    @Column(name = "maxthreadsperhour")
    public Byte getMaxthreadsperhour() {
        return maxthreadsperhour;
    }

    public void setMaxthreadsperhour(Byte maxthreadsperhour) {
        this.maxthreadsperhour = maxthreadsperhour;
    }

    @Basic
    @Column(name = "maxpostsperhour")
    public Byte getMaxpostsperhour() {
        return maxpostsperhour;
    }

    public void setMaxpostsperhour(Byte maxpostsperhour) {
        this.maxpostsperhour = maxpostsperhour;
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
    @Column(name = "raterange")
    public String getRaterange() {
        return raterange;
    }

    public void setRaterange(String raterange) {
        this.raterange = raterange;
    }

    @Basic
    @Column(name = "loginreward")
    public String getLoginreward() {
        return loginreward;
    }

    public void setLoginreward(String loginreward) {
        this.loginreward = loginreward;
    }

    @Basic
    @Column(name = "mintradeprice")
    public Short getMintradeprice() {
        return mintradeprice;
    }

    public void setMintradeprice(Short mintradeprice) {
        this.mintradeprice = mintradeprice;
    }

    @Basic
    @Column(name = "maxtradeprice")
    public Short getMaxtradeprice() {
        return maxtradeprice;
    }

    public void setMaxtradeprice(Short maxtradeprice) {
        this.maxtradeprice = maxtradeprice;
    }

    @Basic
    @Column(name = "minrewardprice")
    public Short getMinrewardprice() {
        return minrewardprice;
    }

    public void setMinrewardprice(Short minrewardprice) {
        this.minrewardprice = minrewardprice;
    }

    @Basic
    @Column(name = "maxrewardprice")
    public Short getMaxrewardprice() {
        return maxrewardprice;
    }

    public void setMaxrewardprice(Short maxrewardprice) {
        this.maxrewardprice = maxrewardprice;
    }

    @Basic
    @Column(name = "magicsdiscount")
    public Byte getMagicsdiscount() {
        return magicsdiscount;
    }

    public void setMagicsdiscount(Byte magicsdiscount) {
        this.magicsdiscount = magicsdiscount;
    }

    @Basic
    @Column(name = "maxmagicsweight")
    public Short getMaxmagicsweight() {
        return maxmagicsweight;
    }

    public void setMaxmagicsweight(Short maxmagicsweight) {
        this.maxmagicsweight = maxmagicsweight;
    }

    @Basic
    @Column(name = "allowpostdebate")
    public Byte getAllowpostdebate() {
        return allowpostdebate;
    }

    public void setAllowpostdebate(Byte allowpostdebate) {
        this.allowpostdebate = allowpostdebate;
    }

    @Basic
    @Column(name = "tradestick")
    public Byte getTradestick() {
        return tradestick;
    }

    public void setTradestick(Byte tradestick) {
        this.tradestick = tradestick;
    }

    @Basic
    @Column(name = "exempt")
    public Byte getExempt() {
        return exempt;
    }

    public void setExempt(Byte exempt) {
        this.exempt = exempt;
    }

    @Basic
    @Column(name = "maxattachnum")
    public Short getMaxattachnum() {
        return maxattachnum;
    }

    public void setMaxattachnum(Short maxattachnum) {
        this.maxattachnum = maxattachnum;
    }

    @Basic
    @Column(name = "allowposturl")
    public Byte getAllowposturl() {
        return allowposturl;
    }

    public void setAllowposturl(Byte allowposturl) {
        this.allowposturl = allowposturl;
    }

    @Basic
    @Column(name = "allowrecommend")
    public Byte getAllowrecommend() {
        return allowrecommend;
    }

    public void setAllowrecommend(Byte allowrecommend) {
        this.allowrecommend = allowrecommend;
    }

    @Basic
    @Column(name = "allowpostrushreply")
    public Byte getAllowpostrushreply() {
        return allowpostrushreply;
    }

    public void setAllowpostrushreply(Byte allowpostrushreply) {
        this.allowpostrushreply = allowpostrushreply;
    }

    @Basic
    @Column(name = "maxfriendnum")
    public Short getMaxfriendnum() {
        return maxfriendnum;
    }

    public void setMaxfriendnum(Short maxfriendnum) {
        this.maxfriendnum = maxfriendnum;
    }

    @Basic
    @Column(name = "maxspacesize")
    public Integer getMaxspacesize() {
        return maxspacesize;
    }

    public void setMaxspacesize(Integer maxspacesize) {
        this.maxspacesize = maxspacesize;
    }

    @Basic
    @Column(name = "allowcomment")
    public Byte getAllowcomment() {
        return allowcomment;
    }

    public void setAllowcomment(Byte allowcomment) {
        this.allowcomment = allowcomment;
    }

    @Basic
    @Column(name = "allowcommentarticle")
    public Short getAllowcommentarticle() {
        return allowcommentarticle;
    }

    public void setAllowcommentarticle(Short allowcommentarticle) {
        this.allowcommentarticle = allowcommentarticle;
    }

    @Basic
    @Column(name = "searchinterval")
    public Short getSearchinterval() {
        return searchinterval;
    }

    public void setSearchinterval(Short searchinterval) {
        this.searchinterval = searchinterval;
    }

    @Basic
    @Column(name = "searchignore")
    public Byte getSearchignore() {
        return searchignore;
    }

    public void setSearchignore(Byte searchignore) {
        this.searchignore = searchignore;
    }

    @Basic
    @Column(name = "allowblog")
    public Byte getAllowblog() {
        return allowblog;
    }

    public void setAllowblog(Byte allowblog) {
        this.allowblog = allowblog;
    }

    @Basic
    @Column(name = "allowdoing")
    public Byte getAllowdoing() {
        return allowdoing;
    }

    public void setAllowdoing(Byte allowdoing) {
        this.allowdoing = allowdoing;
    }

    @Basic
    @Column(name = "allowupload")
    public Byte getAllowupload() {
        return allowupload;
    }

    public void setAllowupload(Byte allowupload) {
        this.allowupload = allowupload;
    }

    @Basic
    @Column(name = "allowshare")
    public Byte getAllowshare() {
        return allowshare;
    }

    public void setAllowshare(Byte allowshare) {
        this.allowshare = allowshare;
    }

    @Basic
    @Column(name = "allowblogmod")
    public Byte getAllowblogmod() {
        return allowblogmod;
    }

    public void setAllowblogmod(Byte allowblogmod) {
        this.allowblogmod = allowblogmod;
    }

    @Basic
    @Column(name = "allowdoingmod")
    public Byte getAllowdoingmod() {
        return allowdoingmod;
    }

    public void setAllowdoingmod(Byte allowdoingmod) {
        this.allowdoingmod = allowdoingmod;
    }

    @Basic
    @Column(name = "allowuploadmod")
    public Byte getAllowuploadmod() {
        return allowuploadmod;
    }

    public void setAllowuploadmod(Byte allowuploadmod) {
        this.allowuploadmod = allowuploadmod;
    }

    @Basic
    @Column(name = "allowsharemod")
    public Byte getAllowsharemod() {
        return allowsharemod;
    }

    public void setAllowsharemod(Byte allowsharemod) {
        this.allowsharemod = allowsharemod;
    }

    @Basic
    @Column(name = "allowcss")
    public Byte getAllowcss() {
        return allowcss;
    }

    public void setAllowcss(Byte allowcss) {
        this.allowcss = allowcss;
    }

    @Basic
    @Column(name = "allowpoke")
    public Byte getAllowpoke() {
        return allowpoke;
    }

    public void setAllowpoke(Byte allowpoke) {
        this.allowpoke = allowpoke;
    }

    @Basic
    @Column(name = "allowfriend")
    public Byte getAllowfriend() {
        return allowfriend;
    }

    public void setAllowfriend(Byte allowfriend) {
        this.allowfriend = allowfriend;
    }

    @Basic
    @Column(name = "allowclick")
    public Byte getAllowclick() {
        return allowclick;
    }

    public void setAllowclick(Byte allowclick) {
        this.allowclick = allowclick;
    }

    @Basic
    @Column(name = "allowmagic")
    public Byte getAllowmagic() {
        return allowmagic;
    }

    public void setAllowmagic(Byte allowmagic) {
        this.allowmagic = allowmagic;
    }

    @Basic
    @Column(name = "allowstat")
    public Byte getAllowstat() {
        return allowstat;
    }

    public void setAllowstat(Byte allowstat) {
        this.allowstat = allowstat;
    }

    @Basic
    @Column(name = "allowstatdata")
    public Byte getAllowstatdata() {
        return allowstatdata;
    }

    public void setAllowstatdata(Byte allowstatdata) {
        this.allowstatdata = allowstatdata;
    }

    @Basic
    @Column(name = "videophotoignore")
    public Byte getVideophotoignore() {
        return videophotoignore;
    }

    public void setVideophotoignore(Byte videophotoignore) {
        this.videophotoignore = videophotoignore;
    }

    @Basic
    @Column(name = "allowviewvideophoto")
    public Byte getAllowviewvideophoto() {
        return allowviewvideophoto;
    }

    public void setAllowviewvideophoto(Byte allowviewvideophoto) {
        this.allowviewvideophoto = allowviewvideophoto;
    }

    @Basic
    @Column(name = "allowmyop")
    public Byte getAllowmyop() {
        return allowmyop;
    }

    public void setAllowmyop(Byte allowmyop) {
        this.allowmyop = allowmyop;
    }

    @Basic
    @Column(name = "magicdiscount")
    public Byte getMagicdiscount() {
        return magicdiscount;
    }

    public void setMagicdiscount(Byte magicdiscount) {
        this.magicdiscount = magicdiscount;
    }

    @Basic
    @Column(name = "domainlength")
    public Short getDomainlength() {
        return domainlength;
    }

    public void setDomainlength(Short domainlength) {
        this.domainlength = domainlength;
    }

    @Basic
    @Column(name = "seccode")
    public Byte getSeccode() {
        return seccode;
    }

    public void setSeccode(Byte seccode) {
        this.seccode = seccode;
    }

    @Basic
    @Column(name = "disablepostctrl")
    public Byte getDisablepostctrl() {
        return disablepostctrl;
    }

    public void setDisablepostctrl(Byte disablepostctrl) {
        this.disablepostctrl = disablepostctrl;
    }

    @Basic
    @Column(name = "allowbuildgroup")
    public Byte getAllowbuildgroup() {
        return allowbuildgroup;
    }

    public void setAllowbuildgroup(Byte allowbuildgroup) {
        this.allowbuildgroup = allowbuildgroup;
    }

    @Basic
    @Column(name = "allowgroupdirectpost")
    public Byte getAllowgroupdirectpost() {
        return allowgroupdirectpost;
    }

    public void setAllowgroupdirectpost(Byte allowgroupdirectpost) {
        this.allowgroupdirectpost = allowgroupdirectpost;
    }

    @Basic
    @Column(name = "allowgroupposturl")
    public Byte getAllowgroupposturl() {
        return allowgroupposturl;
    }

    public void setAllowgroupposturl(Byte allowgroupposturl) {
        this.allowgroupposturl = allowgroupposturl;
    }

    @Basic
    @Column(name = "edittimelimit")
    public Short getEdittimelimit() {
        return edittimelimit;
    }

    public void setEdittimelimit(Short edittimelimit) {
        this.edittimelimit = edittimelimit;
    }

    @Basic
    @Column(name = "allowpostarticle")
    public Byte getAllowpostarticle() {
        return allowpostarticle;
    }

    public void setAllowpostarticle(Byte allowpostarticle) {
        this.allowpostarticle = allowpostarticle;
    }

    @Basic
    @Column(name = "allowdownlocalimg")
    public Byte getAllowdownlocalimg() {
        return allowdownlocalimg;
    }

    public void setAllowdownlocalimg(Byte allowdownlocalimg) {
        this.allowdownlocalimg = allowdownlocalimg;
    }

    @Basic
    @Column(name = "allowdownremoteimg")
    public Byte getAllowdownremoteimg() {
        return allowdownremoteimg;
    }

    public void setAllowdownremoteimg(Byte allowdownremoteimg) {
        this.allowdownremoteimg = allowdownremoteimg;
    }

    @Basic
    @Column(name = "allowpostarticlemod")
    public Byte getAllowpostarticlemod() {
        return allowpostarticlemod;
    }

    public void setAllowpostarticlemod(Byte allowpostarticlemod) {
        this.allowpostarticlemod = allowpostarticlemod;
    }

    @Basic
    @Column(name = "allowspacediyhtml")
    public Byte getAllowspacediyhtml() {
        return allowspacediyhtml;
    }

    public void setAllowspacediyhtml(Byte allowspacediyhtml) {
        this.allowspacediyhtml = allowspacediyhtml;
    }

    @Basic
    @Column(name = "allowspacediybbcode")
    public Byte getAllowspacediybbcode() {
        return allowspacediybbcode;
    }

    public void setAllowspacediybbcode(Byte allowspacediybbcode) {
        this.allowspacediybbcode = allowspacediybbcode;
    }

    @Basic
    @Column(name = "allowspacediyimgcode")
    public Byte getAllowspacediyimgcode() {
        return allowspacediyimgcode;
    }

    public void setAllowspacediyimgcode(Byte allowspacediyimgcode) {
        this.allowspacediyimgcode = allowspacediyimgcode;
    }

    @Basic
    @Column(name = "allowcommentpost")
    public Byte getAllowcommentpost() {
        return allowcommentpost;
    }

    public void setAllowcommentpost(Byte allowcommentpost) {
        this.allowcommentpost = allowcommentpost;
    }

    @Basic
    @Column(name = "allowcommentitem")
    public Byte getAllowcommentitem() {
        return allowcommentitem;
    }

    public void setAllowcommentitem(Byte allowcommentitem) {
        this.allowcommentitem = allowcommentitem;
    }

    @Basic
    @Column(name = "allowcommentreply")
    public Byte getAllowcommentreply() {
        return allowcommentreply;
    }

    public void setAllowcommentreply(Byte allowcommentreply) {
        this.allowcommentreply = allowcommentreply;
    }

    @Basic
    @Column(name = "allowreplycredit")
    public Byte getAllowreplycredit() {
        return allowreplycredit;
    }

    public void setAllowreplycredit(Byte allowreplycredit) {
        this.allowreplycredit = allowreplycredit;
    }

    @Basic
    @Column(name = "ignorecensor")
    public Byte getIgnorecensor() {
        return ignorecensor;
    }

    public void setIgnorecensor(Byte ignorecensor) {
        this.ignorecensor = ignorecensor;
    }

    @Basic
    @Column(name = "allowsendallpm")
    public Byte getAllowsendallpm() {
        return allowsendallpm;
    }

    public void setAllowsendallpm(Byte allowsendallpm) {
        this.allowsendallpm = allowsendallpm;
    }

    @Basic
    @Column(name = "allowsendpmmaxnum")
    public Short getAllowsendpmmaxnum() {
        return allowsendpmmaxnum;
    }

    public void setAllowsendpmmaxnum(Short allowsendpmmaxnum) {
        this.allowsendpmmaxnum = allowsendpmmaxnum;
    }

    @Basic
    @Column(name = "maximagesize")
    public Integer getMaximagesize() {
        return maximagesize;
    }

    public void setMaximagesize(Integer maximagesize) {
        this.maximagesize = maximagesize;
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
    @Column(name = "allowbegincode")
    public Byte getAllowbegincode() {
        return allowbegincode;
    }

    public void setAllowbegincode(Byte allowbegincode) {
        this.allowbegincode = allowbegincode;
    }

    @Basic
    @Column(name = "allowat")
    public Short getAllowat() {
        return allowat;
    }

    public void setAllowat(Short allowat) {
        this.allowat = allowat;
    }

    @Basic
    @Column(name = "allowsetpublishdate")
    public Byte getAllowsetpublishdate() {
        return allowsetpublishdate;
    }

    public void setAllowsetpublishdate(Byte allowsetpublishdate) {
        this.allowsetpublishdate = allowsetpublishdate;
    }

    @Basic
    @Column(name = "allowfollowcollection")
    public Byte getAllowfollowcollection() {
        return allowfollowcollection;
    }

    public void setAllowfollowcollection(Byte allowfollowcollection) {
        this.allowfollowcollection = allowfollowcollection;
    }

    @Basic
    @Column(name = "allowcommentcollection")
    public Byte getAllowcommentcollection() {
        return allowcommentcollection;
    }

    public void setAllowcommentcollection(Byte allowcommentcollection) {
        this.allowcommentcollection = allowcommentcollection;
    }

    @Basic
    @Column(name = "allowcreatecollection")
    public Short getAllowcreatecollection() {
        return allowcreatecollection;
    }

    public void setAllowcreatecollection(Short allowcreatecollection) {
        this.allowcreatecollection = allowcreatecollection;
    }

    @Basic
    @Column(name = "forcesecques")
    public Byte getForcesecques() {
        return forcesecques;
    }

    public void setForcesecques(Byte forcesecques) {
        this.forcesecques = forcesecques;
    }

    @Basic
    @Column(name = "forcelogin")
    public Byte getForcelogin() {
        return forcelogin;
    }

    public void setForcelogin(Byte forcelogin) {
        this.forcelogin = forcelogin;
    }

    @Basic
    @Column(name = "closead")
    public Byte getClosead() {
        return closead;
    }

    public void setClosead(Byte closead) {
        this.closead = closead;
    }

    @Basic
    @Column(name = "buildgroupcredits")
    public Short getBuildgroupcredits() {
        return buildgroupcredits;
    }

    public void setBuildgroupcredits(Short buildgroupcredits) {
        this.buildgroupcredits = buildgroupcredits;
    }

    @Basic
    @Column(name = "allowimgcontent")
    public Byte getAllowimgcontent() {
        return allowimgcontent;
    }

    public void setAllowimgcontent(Byte allowimgcontent) {
        this.allowimgcontent = allowimgcontent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsergroupField that = (UsergroupField) o;
        return Objects.equals(groupid, that.groupid) &&
                Objects.equals(readaccess, that.readaccess) &&
                Objects.equals(allowpost, that.allowpost) &&
                Objects.equals(allowreply, that.allowreply) &&
                Objects.equals(allowpostpoll, that.allowpostpoll) &&
                Objects.equals(allowpostreward, that.allowpostreward) &&
                Objects.equals(allowposttrade, that.allowposttrade) &&
                Objects.equals(allowpostactivity, that.allowpostactivity) &&
                Objects.equals(allowdirectpost, that.allowdirectpost) &&
                Objects.equals(allowgetattach, that.allowgetattach) &&
                Objects.equals(allowgetimage, that.allowgetimage) &&
                Objects.equals(allowpostattach, that.allowpostattach) &&
                Objects.equals(allowpostimage, that.allowpostimage) &&
                Objects.equals(allowvote, that.allowvote) &&
                Objects.equals(allowsearch, that.allowsearch) &&
                Objects.equals(allowcstatus, that.allowcstatus) &&
                Objects.equals(allowinvisible, that.allowinvisible) &&
                Objects.equals(allowtransfer, that.allowtransfer) &&
                Objects.equals(allowsetreadperm, that.allowsetreadperm) &&
                Objects.equals(allowsetattachperm, that.allowsetattachperm) &&
                Objects.equals(allowposttag, that.allowposttag) &&
                Objects.equals(allowhidecode, that.allowhidecode) &&
                Objects.equals(allowhtml, that.allowhtml) &&
                Objects.equals(allowanonymous, that.allowanonymous) &&
                Objects.equals(allowsigbbcode, that.allowsigbbcode) &&
                Objects.equals(allowsigimgcode, that.allowsigimgcode) &&
                Objects.equals(allowmagics, that.allowmagics) &&
                Objects.equals(disableperiodctrl, that.disableperiodctrl) &&
                Objects.equals(reasonpm, that.reasonpm) &&
                Objects.equals(maxprice, that.maxprice) &&
                Objects.equals(maxsigsize, that.maxsigsize) &&
                Objects.equals(maxattachsize, that.maxattachsize) &&
                Objects.equals(maxsizeperday, that.maxsizeperday) &&
                Objects.equals(maxthreadsperhour, that.maxthreadsperhour) &&
                Objects.equals(maxpostsperhour, that.maxpostsperhour) &&
                Objects.equals(attachextensions, that.attachextensions) &&
                Objects.equals(raterange, that.raterange) &&
                Objects.equals(loginreward, that.loginreward) &&
                Objects.equals(mintradeprice, that.mintradeprice) &&
                Objects.equals(maxtradeprice, that.maxtradeprice) &&
                Objects.equals(minrewardprice, that.minrewardprice) &&
                Objects.equals(maxrewardprice, that.maxrewardprice) &&
                Objects.equals(magicsdiscount, that.magicsdiscount) &&
                Objects.equals(maxmagicsweight, that.maxmagicsweight) &&
                Objects.equals(allowpostdebate, that.allowpostdebate) &&
                Objects.equals(tradestick, that.tradestick) &&
                Objects.equals(exempt, that.exempt) &&
                Objects.equals(maxattachnum, that.maxattachnum) &&
                Objects.equals(allowposturl, that.allowposturl) &&
                Objects.equals(allowrecommend, that.allowrecommend) &&
                Objects.equals(allowpostrushreply, that.allowpostrushreply) &&
                Objects.equals(maxfriendnum, that.maxfriendnum) &&
                Objects.equals(maxspacesize, that.maxspacesize) &&
                Objects.equals(allowcomment, that.allowcomment) &&
                Objects.equals(allowcommentarticle, that.allowcommentarticle) &&
                Objects.equals(searchinterval, that.searchinterval) &&
                Objects.equals(searchignore, that.searchignore) &&
                Objects.equals(allowblog, that.allowblog) &&
                Objects.equals(allowdoing, that.allowdoing) &&
                Objects.equals(allowupload, that.allowupload) &&
                Objects.equals(allowshare, that.allowshare) &&
                Objects.equals(allowblogmod, that.allowblogmod) &&
                Objects.equals(allowdoingmod, that.allowdoingmod) &&
                Objects.equals(allowuploadmod, that.allowuploadmod) &&
                Objects.equals(allowsharemod, that.allowsharemod) &&
                Objects.equals(allowcss, that.allowcss) &&
                Objects.equals(allowpoke, that.allowpoke) &&
                Objects.equals(allowfriend, that.allowfriend) &&
                Objects.equals(allowclick, that.allowclick) &&
                Objects.equals(allowmagic, that.allowmagic) &&
                Objects.equals(allowstat, that.allowstat) &&
                Objects.equals(allowstatdata, that.allowstatdata) &&
                Objects.equals(videophotoignore, that.videophotoignore) &&
                Objects.equals(allowviewvideophoto, that.allowviewvideophoto) &&
                Objects.equals(allowmyop, that.allowmyop) &&
                Objects.equals(magicdiscount, that.magicdiscount) &&
                Objects.equals(domainlength, that.domainlength) &&
                Objects.equals(seccode, that.seccode) &&
                Objects.equals(disablepostctrl, that.disablepostctrl) &&
                Objects.equals(allowbuildgroup, that.allowbuildgroup) &&
                Objects.equals(allowgroupdirectpost, that.allowgroupdirectpost) &&
                Objects.equals(allowgroupposturl, that.allowgroupposturl) &&
                Objects.equals(edittimelimit, that.edittimelimit) &&
                Objects.equals(allowpostarticle, that.allowpostarticle) &&
                Objects.equals(allowdownlocalimg, that.allowdownlocalimg) &&
                Objects.equals(allowdownremoteimg, that.allowdownremoteimg) &&
                Objects.equals(allowpostarticlemod, that.allowpostarticlemod) &&
                Objects.equals(allowspacediyhtml, that.allowspacediyhtml) &&
                Objects.equals(allowspacediybbcode, that.allowspacediybbcode) &&
                Objects.equals(allowspacediyimgcode, that.allowspacediyimgcode) &&
                Objects.equals(allowcommentpost, that.allowcommentpost) &&
                Objects.equals(allowcommentitem, that.allowcommentitem) &&
                Objects.equals(allowcommentreply, that.allowcommentreply) &&
                Objects.equals(allowreplycredit, that.allowreplycredit) &&
                Objects.equals(ignorecensor, that.ignorecensor) &&
                Objects.equals(allowsendallpm, that.allowsendallpm) &&
                Objects.equals(allowsendpmmaxnum, that.allowsendpmmaxnum) &&
                Objects.equals(maximagesize, that.maximagesize) &&
                Objects.equals(allowmediacode, that.allowmediacode) &&
                Objects.equals(allowbegincode, that.allowbegincode) &&
                Objects.equals(allowat, that.allowat) &&
                Objects.equals(allowsetpublishdate, that.allowsetpublishdate) &&
                Objects.equals(allowfollowcollection, that.allowfollowcollection) &&
                Objects.equals(allowcommentcollection, that.allowcommentcollection) &&
                Objects.equals(allowcreatecollection, that.allowcreatecollection) &&
                Objects.equals(forcesecques, that.forcesecques) &&
                Objects.equals(forcelogin, that.forcelogin) &&
                Objects.equals(closead, that.closead) &&
                Objects.equals(buildgroupcredits, that.buildgroupcredits) &&
                Objects.equals(allowimgcontent, that.allowimgcontent);
    }

    @Override
    public int hashCode() {

        return Objects.hash(groupid, readaccess, allowpost, allowreply, allowpostpoll, allowpostreward, allowposttrade, allowpostactivity, allowdirectpost, allowgetattach, allowgetimage, allowpostattach, allowpostimage, allowvote, allowsearch, allowcstatus, allowinvisible, allowtransfer, allowsetreadperm, allowsetattachperm, allowposttag, allowhidecode, allowhtml, allowanonymous, allowsigbbcode, allowsigimgcode, allowmagics, disableperiodctrl, reasonpm, maxprice, maxsigsize, maxattachsize, maxsizeperday, maxthreadsperhour, maxpostsperhour, attachextensions, raterange, loginreward, mintradeprice, maxtradeprice, minrewardprice, maxrewardprice, magicsdiscount, maxmagicsweight, allowpostdebate, tradestick, exempt, maxattachnum, allowposturl, allowrecommend, allowpostrushreply, maxfriendnum, maxspacesize, allowcomment, allowcommentarticle, searchinterval, searchignore, allowblog, allowdoing, allowupload, allowshare, allowblogmod, allowdoingmod, allowuploadmod, allowsharemod, allowcss, allowpoke, allowfriend, allowclick, allowmagic, allowstat, allowstatdata, videophotoignore, allowviewvideophoto, allowmyop, magicdiscount, domainlength, seccode, disablepostctrl, allowbuildgroup, allowgroupdirectpost, allowgroupposturl, edittimelimit, allowpostarticle, allowdownlocalimg, allowdownremoteimg, allowpostarticlemod, allowspacediyhtml, allowspacediybbcode, allowspacediyimgcode, allowcommentpost, allowcommentitem, allowcommentreply, allowreplycredit, ignorecensor, allowsendallpm, allowsendpmmaxnum, maximagesize, allowmediacode, allowbegincode, allowat, allowsetpublishdate, allowfollowcollection, allowcommentcollection, allowcreatecollection, forcesecques, forcelogin, closead, buildgroupcredits, allowimgcontent);
    }
}
