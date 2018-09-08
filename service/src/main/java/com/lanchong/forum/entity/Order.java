package com.lanchong.forum.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
@Table(name = "ldp_forum_order",  catalog = "")
public class Order {
    private String orderid;
    private String status;
    private String buyer;
    private String admin;
    private Integer uid;
    private Integer amount;
    private Double price;
    private Integer submitdate;
    private Integer confirmdate;
    private String email;
    private String ip;

    @Basic
    @Column(name = "orderid")
    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
    @Column(name = "admin")
    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
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
    @Column(name = "amount")
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "price")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "submitdate")
    public Integer getSubmitdate() {
        return submitdate;
    }

    public void setSubmitdate(Integer submitdate) {
        this.submitdate = submitdate;
    }

    @Basic
    @Column(name = "confirmdate")
    public Integer getConfirmdate() {
        return confirmdate;
    }

    public void setConfirmdate(Integer confirmdate) {
        this.confirmdate = confirmdate;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "ip")
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (orderid != null ? !orderid.equals(order.orderid) : order.orderid != null) return false;
        if (status != null ? !status.equals(order.status) : order.status != null) return false;
        if (buyer != null ? !buyer.equals(order.buyer) : order.buyer != null) return false;
        if (admin != null ? !admin.equals(order.admin) : order.admin != null) return false;
        if (uid != null ? !uid.equals(order.uid) : order.uid != null) return false;
        if (amount != null ? !amount.equals(order.amount) : order.amount != null) return false;
        if (price != null ? !price.equals(order.price) : order.price != null) return false;
        if (submitdate != null ? !submitdate.equals(order.submitdate) : order.submitdate != null) return false;
        if (confirmdate != null ? !confirmdate.equals(order.confirmdate) : order.confirmdate != null) return false;
        if (email != null ? !email.equals(order.email) : order.email != null) return false;
        if (ip != null ? !ip.equals(order.ip) : order.ip != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderid != null ? orderid.hashCode() : 0;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (buyer != null ? buyer.hashCode() : 0);
        result = 31 * result + (admin != null ? admin.hashCode() : 0);
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (submitdate != null ? submitdate.hashCode() : 0);
        result = 31 * result + (confirmdate != null ? confirmdate.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (ip != null ? ip.hashCode() : 0);
        return result;
    }
}
