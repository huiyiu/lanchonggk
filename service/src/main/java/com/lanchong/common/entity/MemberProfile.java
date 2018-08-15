package com.lanchong.common.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ldp_common_member_profile", schema = "bdm186320220", catalog = "")
public class MemberProfile {
    private Integer uid;
    private String realname;
    private Byte gender;
    private Short birthyear;
    private Byte birthmonth;
    private Byte birthday;
    private String constellation;
    private String zodiac;
    private String telephone;
    private String mobile;
    private String idcardtype;
    private String idcard;
    private String address;
    private String zipcode;
    private String nationality;
    private String birthprovince;
    private String birthcity;
    private String birthdist;
    private String birthcommunity;
    private String resideprovince;
    private String residecity;
    private String residedist;
    private String residecommunity;
    private String residesuite;
    private String graduateschool;
    private String company;
    private String education;
    private String occupation;
    private String position;
    private String revenue;
    private String affectivestatus;
    private String lookingfor;
    private String bloodtype;
    private String height;
    private String weight;
    private String alipay;
    private String icq;
    private String qq;
    private String yahoo;
    private String msn;
    private String taobao;
    private String site;
    private String bio;
    private String interest;
    private String field1;
    private String field2;
    private String field3;
    private String field4;
    private String field5;
    private String field6;
    private String field7;
    private String field8;

    @Id
    @Column(name = "uid")
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "realname")
    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    @Basic
    @Column(name = "gender")
    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "birthyear")
    public Short getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(Short birthyear) {
        this.birthyear = birthyear;
    }

    @Basic
    @Column(name = "birthmonth")
    public Byte getBirthmonth() {
        return birthmonth;
    }

    public void setBirthmonth(Byte birthmonth) {
        this.birthmonth = birthmonth;
    }

    @Basic
    @Column(name = "birthday")
    public Byte getBirthday() {
        return birthday;
    }

    public void setBirthday(Byte birthday) {
        this.birthday = birthday;
    }

    @Basic
    @Column(name = "constellation")
    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    @Basic
    @Column(name = "zodiac")
    public String getZodiac() {
        return zodiac;
    }

    public void setZodiac(String zodiac) {
        this.zodiac = zodiac;
    }

    @Basic
    @Column(name = "telephone")
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "mobile")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Basic
    @Column(name = "idcardtype")
    public String getIdcardtype() {
        return idcardtype;
    }

    public void setIdcardtype(String idcardtype) {
        this.idcardtype = idcardtype;
    }

    @Basic
    @Column(name = "idcard")
    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "zipcode")
    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    @Basic
    @Column(name = "nationality")
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Basic
    @Column(name = "birthprovince")
    public String getBirthprovince() {
        return birthprovince;
    }

    public void setBirthprovince(String birthprovince) {
        this.birthprovince = birthprovince;
    }

    @Basic
    @Column(name = "birthcity")
    public String getBirthcity() {
        return birthcity;
    }

    public void setBirthcity(String birthcity) {
        this.birthcity = birthcity;
    }

    @Basic
    @Column(name = "birthdist")
    public String getBirthdist() {
        return birthdist;
    }

    public void setBirthdist(String birthdist) {
        this.birthdist = birthdist;
    }

    @Basic
    @Column(name = "birthcommunity")
    public String getBirthcommunity() {
        return birthcommunity;
    }

    public void setBirthcommunity(String birthcommunity) {
        this.birthcommunity = birthcommunity;
    }

    @Basic
    @Column(name = "resideprovince")
    public String getResideprovince() {
        return resideprovince;
    }

    public void setResideprovince(String resideprovince) {
        this.resideprovince = resideprovince;
    }

    @Basic
    @Column(name = "residecity")
    public String getResidecity() {
        return residecity;
    }

    public void setResidecity(String residecity) {
        this.residecity = residecity;
    }

    @Basic
    @Column(name = "residedist")
    public String getResidedist() {
        return residedist;
    }

    public void setResidedist(String residedist) {
        this.residedist = residedist;
    }

    @Basic
    @Column(name = "residecommunity")
    public String getResidecommunity() {
        return residecommunity;
    }

    public void setResidecommunity(String residecommunity) {
        this.residecommunity = residecommunity;
    }

    @Basic
    @Column(name = "residesuite")
    public String getResidesuite() {
        return residesuite;
    }

    public void setResidesuite(String residesuite) {
        this.residesuite = residesuite;
    }

    @Basic
    @Column(name = "graduateschool")
    public String getGraduateschool() {
        return graduateschool;
    }

    public void setGraduateschool(String graduateschool) {
        this.graduateschool = graduateschool;
    }

    @Basic
    @Column(name = "company")
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Basic
    @Column(name = "education")
    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Basic
    @Column(name = "occupation")
    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    @Basic
    @Column(name = "position")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Basic
    @Column(name = "revenue")
    public String getRevenue() {
        return revenue;
    }

    public void setRevenue(String revenue) {
        this.revenue = revenue;
    }

    @Basic
    @Column(name = "affectivestatus")
    public String getAffectivestatus() {
        return affectivestatus;
    }

    public void setAffectivestatus(String affectivestatus) {
        this.affectivestatus = affectivestatus;
    }

    @Basic
    @Column(name = "lookingfor")
    public String getLookingfor() {
        return lookingfor;
    }

    public void setLookingfor(String lookingfor) {
        this.lookingfor = lookingfor;
    }

    @Basic
    @Column(name = "bloodtype")
    public String getBloodtype() {
        return bloodtype;
    }

    public void setBloodtype(String bloodtype) {
        this.bloodtype = bloodtype;
    }

    @Basic
    @Column(name = "height")
    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Basic
    @Column(name = "weight")
    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "alipay")
    public String getAlipay() {
        return alipay;
    }

    public void setAlipay(String alipay) {
        this.alipay = alipay;
    }

    @Basic
    @Column(name = "icq")
    public String getIcq() {
        return icq;
    }

    public void setIcq(String icq) {
        this.icq = icq;
    }

    @Basic
    @Column(name = "qq")
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @Basic
    @Column(name = "yahoo")
    public String getYahoo() {
        return yahoo;
    }

    public void setYahoo(String yahoo) {
        this.yahoo = yahoo;
    }

    @Basic
    @Column(name = "msn")
    public String getMsn() {
        return msn;
    }

    public void setMsn(String msn) {
        this.msn = msn;
    }

    @Basic
    @Column(name = "taobao")
    public String getTaobao() {
        return taobao;
    }

    public void setTaobao(String taobao) {
        this.taobao = taobao;
    }

    @Basic
    @Column(name = "site")
    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    @Basic
    @Column(name = "bio")
    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Basic
    @Column(name = "interest")
    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }

    @Basic
    @Column(name = "field1")
    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    @Basic
    @Column(name = "field2")
    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    @Basic
    @Column(name = "field3")
    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    @Basic
    @Column(name = "field4")
    public String getField4() {
        return field4;
    }

    public void setField4(String field4) {
        this.field4 = field4;
    }

    @Basic
    @Column(name = "field5")
    public String getField5() {
        return field5;
    }

    public void setField5(String field5) {
        this.field5 = field5;
    }

    @Basic
    @Column(name = "field6")
    public String getField6() {
        return field6;
    }

    public void setField6(String field6) {
        this.field6 = field6;
    }

    @Basic
    @Column(name = "field7")
    public String getField7() {
        return field7;
    }

    public void setField7(String field7) {
        this.field7 = field7;
    }

    @Basic
    @Column(name = "field8")
    public String getField8() {
        return field8;
    }

    public void setField8(String field8) {
        this.field8 = field8;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MemberProfile that = (MemberProfile) o;
        return Objects.equals(uid, that.uid) &&
                Objects.equals(realname, that.realname) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(birthyear, that.birthyear) &&
                Objects.equals(birthmonth, that.birthmonth) &&
                Objects.equals(birthday, that.birthday) &&
                Objects.equals(constellation, that.constellation) &&
                Objects.equals(zodiac, that.zodiac) &&
                Objects.equals(telephone, that.telephone) &&
                Objects.equals(mobile, that.mobile) &&
                Objects.equals(idcardtype, that.idcardtype) &&
                Objects.equals(idcard, that.idcard) &&
                Objects.equals(address, that.address) &&
                Objects.equals(zipcode, that.zipcode) &&
                Objects.equals(nationality, that.nationality) &&
                Objects.equals(birthprovince, that.birthprovince) &&
                Objects.equals(birthcity, that.birthcity) &&
                Objects.equals(birthdist, that.birthdist) &&
                Objects.equals(birthcommunity, that.birthcommunity) &&
                Objects.equals(resideprovince, that.resideprovince) &&
                Objects.equals(residecity, that.residecity) &&
                Objects.equals(residedist, that.residedist) &&
                Objects.equals(residecommunity, that.residecommunity) &&
                Objects.equals(residesuite, that.residesuite) &&
                Objects.equals(graduateschool, that.graduateschool) &&
                Objects.equals(company, that.company) &&
                Objects.equals(education, that.education) &&
                Objects.equals(occupation, that.occupation) &&
                Objects.equals(position, that.position) &&
                Objects.equals(revenue, that.revenue) &&
                Objects.equals(affectivestatus, that.affectivestatus) &&
                Objects.equals(lookingfor, that.lookingfor) &&
                Objects.equals(bloodtype, that.bloodtype) &&
                Objects.equals(height, that.height) &&
                Objects.equals(weight, that.weight) &&
                Objects.equals(alipay, that.alipay) &&
                Objects.equals(icq, that.icq) &&
                Objects.equals(qq, that.qq) &&
                Objects.equals(yahoo, that.yahoo) &&
                Objects.equals(msn, that.msn) &&
                Objects.equals(taobao, that.taobao) &&
                Objects.equals(site, that.site) &&
                Objects.equals(bio, that.bio) &&
                Objects.equals(interest, that.interest) &&
                Objects.equals(field1, that.field1) &&
                Objects.equals(field2, that.field2) &&
                Objects.equals(field3, that.field3) &&
                Objects.equals(field4, that.field4) &&
                Objects.equals(field5, that.field5) &&
                Objects.equals(field6, that.field6) &&
                Objects.equals(field7, that.field7) &&
                Objects.equals(field8, that.field8);
    }

    @Override
    public int hashCode() {

        return Objects.hash(uid, realname, gender, birthyear, birthmonth, birthday, constellation, zodiac, telephone, mobile, idcardtype, idcard, address, zipcode, nationality, birthprovince, birthcity, birthdist, birthcommunity, resideprovince, residecity, residedist, residecommunity, residesuite, graduateschool, company, education, occupation, position, revenue, affectivestatus, lookingfor, bloodtype, height, weight, alipay, icq, qq, yahoo, msn, taobao, site, bio, interest, field1, field2, field3, field4, field5, field6, field7, field8);
    }
}
