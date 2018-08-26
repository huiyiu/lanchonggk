package com.lanchong.forum.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "ldp_forum_trade", schema = "lanchonggk", catalog = "")
@IdClass(TradePK.class)
public class Trade {
    private Integer tid;
    private Integer pid;
    private Short typeid;
    private Integer sellerid;
    private String seller;
    private String account;
    private String tenpayaccount;
    private String subject;
    private BigDecimal price;
    private Short amount;
    private Byte quality;
    private String locus;
    private Byte transport;
    private Short ordinaryfee;
    private Short expressfee;
    private Short emsfee;
    private Byte itemtype;
    private Integer dateline;
    private Integer expiration;
    private String lastbuyer;
    private Integer lastupdate;
    private Short totalitems;
    private BigDecimal tradesum;
    private Byte closed;
    private Integer aid;
    private Byte displayorder;
    private BigDecimal costprice;
    private Integer credit;
    private Integer costcredit;
    private Integer credittradesum;

    @Id
    @Column(name = "tid")
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    @Id
    @Column(name = "pid")
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "typeid")
    public Short getTypeid() {
        return typeid;
    }

    public void setTypeid(Short typeid) {
        this.typeid = typeid;
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
    @Column(name = "account")
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
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
    @Column(name = "amount")
    public Short getAmount() {
        return amount;
    }

    public void setAmount(Short amount) {
        this.amount = amount;
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
    @Column(name = "locus")
    public String getLocus() {
        return locus;
    }

    public void setLocus(String locus) {
        this.locus = locus;
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
    @Column(name = "ordinaryfee")
    public Short getOrdinaryfee() {
        return ordinaryfee;
    }

    public void setOrdinaryfee(Short ordinaryfee) {
        this.ordinaryfee = ordinaryfee;
    }

    @Basic
    @Column(name = "expressfee")
    public Short getExpressfee() {
        return expressfee;
    }

    public void setExpressfee(Short expressfee) {
        this.expressfee = expressfee;
    }

    @Basic
    @Column(name = "emsfee")
    public Short getEmsfee() {
        return emsfee;
    }

    public void setEmsfee(Short emsfee) {
        this.emsfee = emsfee;
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
    @Column(name = "dateline")
    public Integer getDateline() {
        return dateline;
    }

    public void setDateline(Integer dateline) {
        this.dateline = dateline;
    }

    @Basic
    @Column(name = "expiration")
    public Integer getExpiration() {
        return expiration;
    }

    public void setExpiration(Integer expiration) {
        this.expiration = expiration;
    }

    @Basic
    @Column(name = "lastbuyer")
    public String getLastbuyer() {
        return lastbuyer;
    }

    public void setLastbuyer(String lastbuyer) {
        this.lastbuyer = lastbuyer;
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
    @Column(name = "totalitems")
    public Short getTotalitems() {
        return totalitems;
    }

    public void setTotalitems(Short totalitems) {
        this.totalitems = totalitems;
    }

    @Basic
    @Column(name = "tradesum")
    public BigDecimal getTradesum() {
        return tradesum;
    }

    public void setTradesum(BigDecimal tradesum) {
        this.tradesum = tradesum;
    }

    @Basic
    @Column(name = "closed")
    public Byte getClosed() {
        return closed;
    }

    public void setClosed(Byte closed) {
        this.closed = closed;
    }

    @Basic
    @Column(name = "aid")
    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
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
    @Column(name = "costprice")
    public BigDecimal getCostprice() {
        return costprice;
    }

    public void setCostprice(BigDecimal costprice) {
        this.costprice = costprice;
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
    @Column(name = "costcredit")
    public Integer getCostcredit() {
        return costcredit;
    }

    public void setCostcredit(Integer costcredit) {
        this.costcredit = costcredit;
    }

    @Basic
    @Column(name = "credittradesum")
    public Integer getCredittradesum() {
        return credittradesum;
    }

    public void setCredittradesum(Integer credittradesum) {
        this.credittradesum = credittradesum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trade trade = (Trade) o;

        if (tid != null ? !tid.equals(trade.tid) : trade.tid != null) return false;
        if (pid != null ? !pid.equals(trade.pid) : trade.pid != null) return false;
        if (typeid != null ? !typeid.equals(trade.typeid) : trade.typeid != null) return false;
        if (sellerid != null ? !sellerid.equals(trade.sellerid) : trade.sellerid != null) return false;
        if (seller != null ? !seller.equals(trade.seller) : trade.seller != null) return false;
        if (account != null ? !account.equals(trade.account) : trade.account != null) return false;
        if (tenpayaccount != null ? !tenpayaccount.equals(trade.tenpayaccount) : trade.tenpayaccount != null)
            return false;
        if (subject != null ? !subject.equals(trade.subject) : trade.subject != null) return false;
        if (price != null ? !price.equals(trade.price) : trade.price != null) return false;
        if (amount != null ? !amount.equals(trade.amount) : trade.amount != null) return false;
        if (quality != null ? !quality.equals(trade.quality) : trade.quality != null) return false;
        if (locus != null ? !locus.equals(trade.locus) : trade.locus != null) return false;
        if (transport != null ? !transport.equals(trade.transport) : trade.transport != null) return false;
        if (ordinaryfee != null ? !ordinaryfee.equals(trade.ordinaryfee) : trade.ordinaryfee != null) return false;
        if (expressfee != null ? !expressfee.equals(trade.expressfee) : trade.expressfee != null) return false;
        if (emsfee != null ? !emsfee.equals(trade.emsfee) : trade.emsfee != null) return false;
        if (itemtype != null ? !itemtype.equals(trade.itemtype) : trade.itemtype != null) return false;
        if (dateline != null ? !dateline.equals(trade.dateline) : trade.dateline != null) return false;
        if (expiration != null ? !expiration.equals(trade.expiration) : trade.expiration != null) return false;
        if (lastbuyer != null ? !lastbuyer.equals(trade.lastbuyer) : trade.lastbuyer != null) return false;
        if (lastupdate != null ? !lastupdate.equals(trade.lastupdate) : trade.lastupdate != null) return false;
        if (totalitems != null ? !totalitems.equals(trade.totalitems) : trade.totalitems != null) return false;
        if (tradesum != null ? !tradesum.equals(trade.tradesum) : trade.tradesum != null) return false;
        if (closed != null ? !closed.equals(trade.closed) : trade.closed != null) return false;
        if (aid != null ? !aid.equals(trade.aid) : trade.aid != null) return false;
        if (displayorder != null ? !displayorder.equals(trade.displayorder) : trade.displayorder != null) return false;
        if (costprice != null ? !costprice.equals(trade.costprice) : trade.costprice != null) return false;
        if (credit != null ? !credit.equals(trade.credit) : trade.credit != null) return false;
        if (costcredit != null ? !costcredit.equals(trade.costcredit) : trade.costcredit != null) return false;
        if (credittradesum != null ? !credittradesum.equals(trade.credittradesum) : trade.credittradesum != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tid != null ? tid.hashCode() : 0;
        result = 31 * result + (pid != null ? pid.hashCode() : 0);
        result = 31 * result + (typeid != null ? typeid.hashCode() : 0);
        result = 31 * result + (sellerid != null ? sellerid.hashCode() : 0);
        result = 31 * result + (seller != null ? seller.hashCode() : 0);
        result = 31 * result + (account != null ? account.hashCode() : 0);
        result = 31 * result + (tenpayaccount != null ? tenpayaccount.hashCode() : 0);
        result = 31 * result + (subject != null ? subject.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (quality != null ? quality.hashCode() : 0);
        result = 31 * result + (locus != null ? locus.hashCode() : 0);
        result = 31 * result + (transport != null ? transport.hashCode() : 0);
        result = 31 * result + (ordinaryfee != null ? ordinaryfee.hashCode() : 0);
        result = 31 * result + (expressfee != null ? expressfee.hashCode() : 0);
        result = 31 * result + (emsfee != null ? emsfee.hashCode() : 0);
        result = 31 * result + (itemtype != null ? itemtype.hashCode() : 0);
        result = 31 * result + (dateline != null ? dateline.hashCode() : 0);
        result = 31 * result + (expiration != null ? expiration.hashCode() : 0);
        result = 31 * result + (lastbuyer != null ? lastbuyer.hashCode() : 0);
        result = 31 * result + (lastupdate != null ? lastupdate.hashCode() : 0);
        result = 31 * result + (totalitems != null ? totalitems.hashCode() : 0);
        result = 31 * result + (tradesum != null ? tradesum.hashCode() : 0);
        result = 31 * result + (closed != null ? closed.hashCode() : 0);
        result = 31 * result + (aid != null ? aid.hashCode() : 0);
        result = 31 * result + (displayorder != null ? displayorder.hashCode() : 0);
        result = 31 * result + (costprice != null ? costprice.hashCode() : 0);
        result = 31 * result + (credit != null ? credit.hashCode() : 0);
        result = 31 * result + (costcredit != null ? costcredit.hashCode() : 0);
        result = 31 * result + (credittradesum != null ? credittradesum.hashCode() : 0);
        return result;
    }
}
