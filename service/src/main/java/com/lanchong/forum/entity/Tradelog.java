package com.lanchong.forum.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

//@Entity
@Table(name = "ldp_forum_tradelog", schema = "lanchonggk", catalog = "")
public class Tradelog {
    private Integer tid;
    private Integer pid;
    private String orderid;
    private String tradeno;
    private Byte paytype;
    private String subject;
    private BigDecimal price;
    private Byte quality;
    private Byte itemtype;
    private Short number;
    private BigDecimal tax;
    private String locus;
    private Integer sellerid;
    private String seller;
    private String selleraccount;
    private String tenpayaccount;
    private Integer buyerid;
    private String buyer;
    private String buyercontact;
    private Short buyercredits;
    private String buyermsg;
    private Byte status;
    private Integer lastupdate;
    private Byte offline;
    private String buyername;
    private String buyerzip;
    private String buyerphone;
    private String buyermobile;
    private Byte transport;
    private Short transportfee;
    private BigDecimal baseprice;
    private Byte discount;
    private Byte ratestatus;
    private String message;
    private Integer credit;
    private Integer basecredit;

    @Basic
    @Column(name = "tid")
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Basic
    @Column(name = "pid")
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "orderid")
    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    @Basic
    @Column(name = "tradeno")
    public String getTradeno() {
        return tradeno;
    }

    public void setTradeno(String tradeno) {
        this.tradeno = tradeno;
    }

    @Basic
    @Column(name = "paytype")
    public Byte getPaytype() {
        return paytype;
    }

    public void setPaytype(Byte paytype) {
        this.paytype = paytype;
    }

    @Basic
    @Column(name = "subject")
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Basic
    @Column(name = "price")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "quality")
    public Byte getQuality() {
        return quality;
    }

    public void setQuality(Byte quality) {
        this.quality = quality;
    }

    @Basic
    @Column(name = "itemtype")
    public Byte getItemtype() {
        return itemtype;
    }

    public void setItemtype(Byte itemtype) {
        this.itemtype = itemtype;
    }

    @Basic
    @Column(name = "number")
    public Short getNumber() {
        return number;
    }

    public void setNumber(Short number) {
        this.number = number;
    }

    @Basic
    @Column(name = "tax")
    public BigDecimal getTax() {
        return tax;
    }

    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    @Basic
    @Column(name = "locus")
    public String getLocus() {
        return locus;
    }

    public void setLocus(String locus) {
        this.locus = locus;
    }

    @Basic
    @Column(name = "sellerid")
    public Integer getSellerid() {
        return sellerid;
    }

    public void setSellerid(Integer sellerid) {
        this.sellerid = sellerid;
    }

    @Basic
    @Column(name = "seller")
    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    @Basic
    @Column(name = "selleraccount")
    public String getSelleraccount() {
        return selleraccount;
    }

    public void setSelleraccount(String selleraccount) {
        this.selleraccount = selleraccount;
    }

    @Basic
    @Column(name = "tenpayaccount")
    public String getTenpayaccount() {
        return tenpayaccount;
    }

    public void setTenpayaccount(String tenpayaccount) {
        this.tenpayaccount = tenpayaccount;
    }

    @Basic
    @Column(name = "buyerid")
    public Integer getBuyerid() {
        return buyerid;
    }

    public void setBuyerid(Integer buyerid) {
        this.buyerid = buyerid;
    }

    @Basic
    @Column(name = "buyer")
    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    @Basic
    @Column(name = "buyercontact")
    public String getBuyercontact() {
        return buyercontact;
    }

    public void setBuyercontact(String buyercontact) {
        this.buyercontact = buyercontact;
    }

    @Basic
    @Column(name = "buyercredits")
    public Short getBuyercredits() {
        return buyercredits;
    }

    public void setBuyercredits(Short buyercredits) {
        this.buyercredits = buyercredits;
    }

    @Basic
    @Column(name = "buyermsg")
    public String getBuyermsg() {
        return buyermsg;
    }

    public void setBuyermsg(String buyermsg) {
        this.buyermsg = buyermsg;
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
    @Column(name = "lastupdate")
    public Integer getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(Integer lastupdate) {
        this.lastupdate = lastupdate;
    }

    @Basic
    @Column(name = "offline")
    public Byte getOffline() {
        return offline;
    }

    public void setOffline(Byte offline) {
        this.offline = offline;
    }

    @Basic
    @Column(name = "buyername")
    public String getBuyername() {
        return buyername;
    }

    public void setBuyername(String buyername) {
        this.buyername = buyername;
    }

    @Basic
    @Column(name = "buyerzip")
    public String getBuyerzip() {
        return buyerzip;
    }

    public void setBuyerzip(String buyerzip) {
        this.buyerzip = buyerzip;
    }

    @Basic
    @Column(name = "buyerphone")
    public String getBuyerphone() {
        return buyerphone;
    }

    public void setBuyerphone(String buyerphone) {
        this.buyerphone = buyerphone;
    }

    @Basic
    @Column(name = "buyermobile")
    public String getBuyermobile() {
        return buyermobile;
    }

    public void setBuyermobile(String buyermobile) {
        this.buyermobile = buyermobile;
    }

    @Basic
    @Column(name = "transport")
    public Byte getTransport() {
        return transport;
    }

    public void setTransport(Byte transport) {
        this.transport = transport;
    }

    @Basic
    @Column(name = "transportfee")
    public Short getTransportfee() {
        return transportfee;
    }

    public void setTransportfee(Short transportfee) {
        this.transportfee = transportfee;
    }

    @Basic
    @Column(name = "baseprice")
    public BigDecimal getBaseprice() {
        return baseprice;
    }

    public void setBaseprice(BigDecimal baseprice) {
        this.baseprice = baseprice;
    }

    @Basic
    @Column(name = "discount")
    public Byte getDiscount() {
        return discount;
    }

    public void setDiscount(Byte discount) {
        this.discount = discount;
    }

    @Basic
    @Column(name = "ratestatus")
    public Byte getRatestatus() {
        return ratestatus;
    }

    public void setRatestatus(Byte ratestatus) {
        this.ratestatus = ratestatus;
    }

    @Basic
    @Column(name = "message")
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Basic
    @Column(name = "credit")
    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    @Basic
    @Column(name = "basecredit")
    public Integer getBasecredit() {
        return basecredit;
    }

    public void setBasecredit(Integer basecredit) {
        this.basecredit = basecredit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Tradelog tradelog = (Tradelog) o;

        if (tid != null ? !tid.equals(tradelog.tid) : tradelog.tid != null) return false;
        if (pid != null ? !pid.equals(tradelog.pid) : tradelog.pid != null) return false;
        if (orderid != null ? !orderid.equals(tradelog.orderid) : tradelog.orderid != null) return false;
        if (tradeno != null ? !tradeno.equals(tradelog.tradeno) : tradelog.tradeno != null) return false;
        if (paytype != null ? !paytype.equals(tradelog.paytype) : tradelog.paytype != null) return false;
        if (subject != null ? !subject.equals(tradelog.subject) : tradelog.subject != null) return false;
        if (price != null ? !price.equals(tradelog.price) : tradelog.price != null) return false;
        if (quality != null ? !quality.equals(tradelog.quality) : tradelog.quality != null) return false;
        if (itemtype != null ? !itemtype.equals(tradelog.itemtype) : tradelog.itemtype != null) return false;
        if (number != null ? !number.equals(tradelog.number) : tradelog.number != null) return false;
        if (tax != null ? !tax.equals(tradelog.tax) : tradelog.tax != null) return false;
        if (locus != null ? !locus.equals(tradelog.locus) : tradelog.locus != null) return false;
        if (sellerid != null ? !sellerid.equals(tradelog.sellerid) : tradelog.sellerid != null) return false;
        if (seller != null ? !seller.equals(tradelog.seller) : tradelog.seller != null) return false;
        if (selleraccount != null ? !selleraccount.equals(tradelog.selleraccount) : tradelog.selleraccount != null)
            return false;
        if (tenpayaccount != null ? !tenpayaccount.equals(tradelog.tenpayaccount) : tradelog.tenpayaccount != null)
            return false;
        if (buyerid != null ? !buyerid.equals(tradelog.buyerid) : tradelog.buyerid != null) return false;
        if (buyer != null ? !buyer.equals(tradelog.buyer) : tradelog.buyer != null) return false;
        if (buyercontact != null ? !buyercontact.equals(tradelog.buyercontact) : tradelog.buyercontact != null)
            return false;
        if (buyercredits != null ? !buyercredits.equals(tradelog.buyercredits) : tradelog.buyercredits != null)
            return false;
        if (buyermsg != null ? !buyermsg.equals(tradelog.buyermsg) : tradelog.buyermsg != null) return false;
        if (status != null ? !status.equals(tradelog.status) : tradelog.status != null) return false;
        if (lastupdate != null ? !lastupdate.equals(tradelog.lastupdate) : tradelog.lastupdate != null) return false;
        if (offline != null ? !offline.equals(tradelog.offline) : tradelog.offline != null) return false;
        if (buyername != null ? !buyername.equals(tradelog.buyername) : tradelog.buyername != null) return false;
        if (buyerzip != null ? !buyerzip.equals(tradelog.buyerzip) : tradelog.buyerzip != null) return false;
        if (buyerphone != null ? !buyerphone.equals(tradelog.buyerphone) : tradelog.buyerphone != null) return false;
        if (buyermobile != null ? !buyermobile.equals(tradelog.buyermobile) : tradelog.buyermobile != null)
            return false;
        if (transport != null ? !transport.equals(tradelog.transport) : tradelog.transport != null) return false;
        if (transportfee != null ? !transportfee.equals(tradelog.transportfee) : tradelog.transportfee != null)
            return false;
        if (baseprice != null ? !baseprice.equals(tradelog.baseprice) : tradelog.baseprice != null) return false;
        if (discount != null ? !discount.equals(tradelog.discount) : tradelog.discount != null) return false;
        if (ratestatus != null ? !ratestatus.equals(tradelog.ratestatus) : tradelog.ratestatus != null) return false;
        if (message != null ? !message.equals(tradelog.message) : tradelog.message != null) return false;
        if (credit != null ? !credit.equals(tradelog.credit) : tradelog.credit != null) return false;
        if (basecredit != null ? !basecredit.equals(tradelog.basecredit) : tradelog.basecredit != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tid != null ? tid.hashCode() : 0;
        result = 31 * result + (pid != null ? pid.hashCode() : 0);
        result = 31 * result + (orderid != null ? orderid.hashCode() : 0);
        result = 31 * result + (tradeno != null ? tradeno.hashCode() : 0);
        result = 31 * result + (paytype != null ? paytype.hashCode() : 0);
        result = 31 * result + (subject != null ? subject.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (quality != null ? quality.hashCode() : 0);
        result = 31 * result + (itemtype != null ? itemtype.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (tax != null ? tax.hashCode() : 0);
        result = 31 * result + (locus != null ? locus.hashCode() : 0);
        result = 31 * result + (sellerid != null ? sellerid.hashCode() : 0);
        result = 31 * result + (seller != null ? seller.hashCode() : 0);
        result = 31 * result + (selleraccount != null ? selleraccount.hashCode() : 0);
        result = 31 * result + (tenpayaccount != null ? tenpayaccount.hashCode() : 0);
        result = 31 * result + (buyerid != null ? buyerid.hashCode() : 0);
        result = 31 * result + (buyer != null ? buyer.hashCode() : 0);
        result = 31 * result + (buyercontact != null ? buyercontact.hashCode() : 0);
        result = 31 * result + (buyercredits != null ? buyercredits.hashCode() : 0);
        result = 31 * result + (buyermsg != null ? buyermsg.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (lastupdate != null ? lastupdate.hashCode() : 0);
        result = 31 * result + (offline != null ? offline.hashCode() : 0);
        result = 31 * result + (buyername != null ? buyername.hashCode() : 0);
        result = 31 * result + (buyerzip != null ? buyerzip.hashCode() : 0);
        result = 31 * result + (buyerphone != null ? buyerphone.hashCode() : 0);
        result = 31 * result + (buyermobile != null ? buyermobile.hashCode() : 0);
        result = 31 * result + (transport != null ? transport.hashCode() : 0);
        result = 31 * result + (transportfee != null ? transportfee.hashCode() : 0);
        result = 31 * result + (baseprice != null ? baseprice.hashCode() : 0);
        result = 31 * result + (discount != null ? discount.hashCode() : 0);
        result = 31 * result + (ratestatus != null ? ratestatus.hashCode() : 0);
        result = 31 * result + (message != null ? message.hashCode() : 0);
        result = 31 * result + (credit != null ? credit.hashCode() : 0);
        result = 31 * result + (basecredit != null ? basecredit.hashCode() : 0);
        return result;
    }
}
