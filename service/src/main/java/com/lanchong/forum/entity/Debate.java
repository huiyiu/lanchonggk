package com.lanchong.forum.entity;

import javax.persistence.*;

@Entity
@Table(name = "ldp_forum_debate",  catalog = "")
public class Debate {
    private Integer tid;
    private Integer uid;
    private Integer starttime;
    private Integer endtime;
    private Integer affirmdebaters;
    private Integer negadebaters;
    private Integer affirmvotes;
    private Integer negavotes;
    private String umpire;
    private Byte winner;
    private String bestdebater;
    private String affirmpoint;
    private String negapoint;
    private String umpirepoint;
    private String affirmvoterids;
    private String negavoterids;
    private Integer affirmreplies;
    private Integer negareplies;

    @Id
    @Column(name = "tid")
    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
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
    @Column(name = "starttime")
    public Integer getStarttime() {
        return starttime;
    }

    public void setStarttime(Integer starttime) {
        this.starttime = starttime;
    }

    @Basic
    @Column(name = "endtime")
    public Integer getEndtime() {
        return endtime;
    }

    public void setEndtime(Integer endtime) {
        this.endtime = endtime;
    }

    @Basic
    @Column(name = "affirmdebaters")
    public Integer getAffirmdebaters() {
        return affirmdebaters;
    }

    public void setAffirmdebaters(Integer affirmdebaters) {
        this.affirmdebaters = affirmdebaters;
    }

    @Basic
    @Column(name = "negadebaters")
    public Integer getNegadebaters() {
        return negadebaters;
    }

    public void setNegadebaters(Integer negadebaters) {
        this.negadebaters = negadebaters;
    }

    @Basic
    @Column(name = "affirmvotes")
    public Integer getAffirmvotes() {
        return affirmvotes;
    }

    public void setAffirmvotes(Integer affirmvotes) {
        this.affirmvotes = affirmvotes;
    }

    @Basic
    @Column(name = "negavotes")
    public Integer getNegavotes() {
        return negavotes;
    }

    public void setNegavotes(Integer negavotes) {
        this.negavotes = negavotes;
    }

    @Basic
    @Column(name = "umpire")
    public String getUmpire() {
        return umpire;
    }

    public void setUmpire(String umpire) {
        this.umpire = umpire;
    }

    @Basic
    @Column(name = "winner")
    public Byte getWinner() {
        return winner;
    }

    public void setWinner(Byte winner) {
        this.winner = winner;
    }

    @Basic
    @Column(name = "bestdebater")
    public String getBestdebater() {
        return bestdebater;
    }

    public void setBestdebater(String bestdebater) {
        this.bestdebater = bestdebater;
    }

    @Basic
    @Column(name = "affirmpoint")
    public String getAffirmpoint() {
        return affirmpoint;
    }

    public void setAffirmpoint(String affirmpoint) {
        this.affirmpoint = affirmpoint;
    }

    @Basic
    @Column(name = "negapoint")
    public String getNegapoint() {
        return negapoint;
    }

    public void setNegapoint(String negapoint) {
        this.negapoint = negapoint;
    }

    @Basic
    @Column(name = "umpirepoint")
    public String getUmpirepoint() {
        return umpirepoint;
    }

    public void setUmpirepoint(String umpirepoint) {
        this.umpirepoint = umpirepoint;
    }

    @Basic
    @Column(name = "affirmvoterids")
    public String getAffirmvoterids() {
        return affirmvoterids;
    }

    public void setAffirmvoterids(String affirmvoterids) {
        this.affirmvoterids = affirmvoterids;
    }

    @Basic
    @Column(name = "negavoterids")
    public String getNegavoterids() {
        return negavoterids;
    }

    public void setNegavoterids(String negavoterids) {
        this.negavoterids = negavoterids;
    }

    @Basic
    @Column(name = "affirmreplies")
    public Integer getAffirmreplies() {
        return affirmreplies;
    }

    public void setAffirmreplies(Integer affirmreplies) {
        this.affirmreplies = affirmreplies;
    }

    @Basic
    @Column(name = "negareplies")
    public Integer getNegareplies() {
        return negareplies;
    }

    public void setNegareplies(Integer negareplies) {
        this.negareplies = negareplies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Debate debate = (Debate) o;

        if (tid != null ? !tid.equals(debate.tid) : debate.tid != null) return false;
        if (uid != null ? !uid.equals(debate.uid) : debate.uid != null) return false;
        if (starttime != null ? !starttime.equals(debate.starttime) : debate.starttime != null) return false;
        if (endtime != null ? !endtime.equals(debate.endtime) : debate.endtime != null) return false;
        if (affirmdebaters != null ? !affirmdebaters.equals(debate.affirmdebaters) : debate.affirmdebaters != null)
            return false;
        if (negadebaters != null ? !negadebaters.equals(debate.negadebaters) : debate.negadebaters != null)
            return false;
        if (affirmvotes != null ? !affirmvotes.equals(debate.affirmvotes) : debate.affirmvotes != null) return false;
        if (negavotes != null ? !negavotes.equals(debate.negavotes) : debate.negavotes != null) return false;
        if (umpire != null ? !umpire.equals(debate.umpire) : debate.umpire != null) return false;
        if (winner != null ? !winner.equals(debate.winner) : debate.winner != null) return false;
        if (bestdebater != null ? !bestdebater.equals(debate.bestdebater) : debate.bestdebater != null) return false;
        if (affirmpoint != null ? !affirmpoint.equals(debate.affirmpoint) : debate.affirmpoint != null) return false;
        if (negapoint != null ? !negapoint.equals(debate.negapoint) : debate.negapoint != null) return false;
        if (umpirepoint != null ? !umpirepoint.equals(debate.umpirepoint) : debate.umpirepoint != null) return false;
        if (affirmvoterids != null ? !affirmvoterids.equals(debate.affirmvoterids) : debate.affirmvoterids != null)
            return false;
        if (negavoterids != null ? !negavoterids.equals(debate.negavoterids) : debate.negavoterids != null)
            return false;
        if (affirmreplies != null ? !affirmreplies.equals(debate.affirmreplies) : debate.affirmreplies != null)
            return false;
        if (negareplies != null ? !negareplies.equals(debate.negareplies) : debate.negareplies != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tid != null ? tid.hashCode() : 0;
        result = 31 * result + (uid != null ? uid.hashCode() : 0);
        result = 31 * result + (starttime != null ? starttime.hashCode() : 0);
        result = 31 * result + (endtime != null ? endtime.hashCode() : 0);
        result = 31 * result + (affirmdebaters != null ? affirmdebaters.hashCode() : 0);
        result = 31 * result + (negadebaters != null ? negadebaters.hashCode() : 0);
        result = 31 * result + (affirmvotes != null ? affirmvotes.hashCode() : 0);
        result = 31 * result + (negavotes != null ? negavotes.hashCode() : 0);
        result = 31 * result + (umpire != null ? umpire.hashCode() : 0);
        result = 31 * result + (winner != null ? winner.hashCode() : 0);
        result = 31 * result + (bestdebater != null ? bestdebater.hashCode() : 0);
        result = 31 * result + (affirmpoint != null ? affirmpoint.hashCode() : 0);
        result = 31 * result + (negapoint != null ? negapoint.hashCode() : 0);
        result = 31 * result + (umpirepoint != null ? umpirepoint.hashCode() : 0);
        result = 31 * result + (affirmvoterids != null ? affirmvoterids.hashCode() : 0);
        result = 31 * result + (negavoterids != null ? negavoterids.hashCode() : 0);
        result = 31 * result + (affirmreplies != null ? affirmreplies.hashCode() : 0);
        result = 31 * result + (negareplies != null ? negareplies.hashCode() : 0);
        return result;
    }
}
