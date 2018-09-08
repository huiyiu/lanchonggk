package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_creditslog",  catalog = "")
public class Creditslog {
    private Integer uid;
    private String fromto;
    private Byte sendcredits;
    private Byte receivecredits;
    private Integer send;
    private Integer receive;
    private Integer dateline;
    private String operation;

    @Basic
    @Id
    @Column(name = "uid")
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "fromto")
    public String getFromto() {
        return fromto;
    }

    public void setFromto(String fromto) {
        this.fromto = fromto;
    }

    @Basic
    @Column(name = "sendcredits")
    public Byte getSendcredits() {
        return sendcredits;
    }

    public void setSendcredits(Byte sendcredits) {
        this.sendcredits = sendcredits;
    }

    @Basic
    @Column(name = "receivecredits")
    public Byte getReceivecredits() {
        return receivecredits;
    }

    public void setReceivecredits(Byte receivecredits) {
        this.receivecredits = receivecredits;
    }

    @Basic
    @Column(name = "send")
    public Integer getSend() {
        return send;
    }

    public void setSend(Integer send) {
        this.send = send;
    }

    @Basic
    @Column(name = "receive")
    public Integer getReceive() {
        return receive;
    }

    public void setReceive(Integer receive) {
        this.receive = receive;
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
    @Column(name = "operation")
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Creditslog that = (Creditslog) o;

        if (uid != null ? !uid.equals(that.uid) : that.uid != null) return false;
        if (fromto != null ? !fromto.equals(that.fromto) : that.fromto != null) return false;
        if (sendcredits != null ? !sendcredits.equals(that.sendcredits) : that.sendcredits != null) return false;
        if (receivecredits != null ? !receivecredits.equals(that.receivecredits) : that.receivecredits != null)
            return false;
        if (send != null ? !send.equals(that.send) : that.send != null) return false;
        if (receive != null ? !receive.equals(that.receive) : that.receive != null) return false;
        if (dateline != null ? !dateline.equals(that.dateline) : that.dateline != null) return false;
        if (operation != null ? !operation.equals(that.operation) : that.operation != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uid != null ? uid.hashCode() : 0;
        result = 31 * result + (fromto != null ? fromto.hashCode() : 0);
        result = 31 * result + (sendcredits != null ? sendcredits.hashCode() : 0);
        result = 31 * result + (receivecredits != null ? receivecredits.hashCode() : 0);
        result = 31 * result + (send != null ? send.hashCode() : 0);
        result = 31 * result + (receive != null ? receive.hashCode() : 0);
        result = 31 * result + (dateline != null ? dateline.hashCode() : 0);
        result = 31 * result + (operation != null ? operation.hashCode() : 0);
        return result;
    }
}
