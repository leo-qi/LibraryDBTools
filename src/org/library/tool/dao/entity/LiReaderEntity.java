package org.library.tool.dao.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "li_reader", schema = "dbo", catalog = "library")
public class LiReaderEntity {
    private Serializable id;
    private String readerCode;
    private String readerName;
    private String readerInputCode;
    private String cardId;
    private String readerCateId;
    private Boolean sex;
    private Timestamp brithDate;
    private String corpName;
    private String deptName;
    private String idCard;
    private String workCard;
    private String workPhone;
    private String homePhone;
    private String mobilePhone;
    private String eMail;
    private String address;
    private String memo;
    private Timestamp regDate;
    private String operator;
    private String dwid;
    private byte[] picture;
    private Integer printoff;
    private String cardpass;
    private String question;
    private String answer;
    private Timestamp czdate;
    private Double yaJin;
    private Integer yjbz;

    @Id
    @Column(name = "ID", nullable = false)
    public Serializable getId() {
        return id;
    }

    public void setId(Serializable id) {
        this.id = id;
    }

    @Basic
    @Column(name = "ReaderCode", nullable = false, length = 50)
    public String getReaderCode() {
        return readerCode;
    }

    public void setReaderCode(String readerCode) {
        this.readerCode = readerCode;
    }

    @Basic
    @Column(name = "ReaderName", nullable = false, length = 50)
    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    @Basic
    @Column(name = "ReaderInputCode", nullable = true, length = 50)
    public String getReaderInputCode() {
        return readerInputCode;
    }

    public void setReaderInputCode(String readerInputCode) {
        this.readerInputCode = readerInputCode;
    }

    @Basic
    @Column(name = "CardId", nullable = true, length = 50)
    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    @Basic
    @Column(name = "ReaderCateId", nullable = true, length = 50)
    public String getReaderCateId() {
        return readerCateId;
    }

    public void setReaderCateId(String readerCateId) {
        this.readerCateId = readerCateId;
    }

    @Basic
    @Column(name = "sex", nullable = true)
    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "BrithDate", nullable = true)
    public Timestamp getBrithDate() {
        return brithDate;
    }

    public void setBrithDate(Timestamp brithDate) {
        this.brithDate = brithDate;
    }

    @Basic
    @Column(name = "CorpName", nullable = true, length = 50)
    public String getCorpName() {
        return corpName;
    }

    public void setCorpName(String corpName) {
        this.corpName = corpName;
    }

    @Basic
    @Column(name = "DeptName", nullable = true, length = 50)
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Basic
    @Column(name = "IdCard", nullable = true, length = 50)
    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @Basic
    @Column(name = "WorkCard", nullable = true, length = 50)
    public String getWorkCard() {
        return workCard;
    }

    public void setWorkCard(String workCard) {
        this.workCard = workCard;
    }

    @Basic
    @Column(name = "WorkPhone", nullable = true, length = 50)
    public String getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    @Basic
    @Column(name = "HomePhone", nullable = true, length = 50)
    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    @Basic
    @Column(name = "MobilePhone", nullable = true, length = 50)
    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    @Basic
    @Column(name = "EMail", nullable = true, length = 50)
    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Basic
    @Column(name = "Address", nullable = true, length = 200)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "Memo", nullable = true, length = 200)
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Basic
    @Column(name = "RegDate", nullable = true)
    public Timestamp getRegDate() {
        return regDate;
    }

    public void setRegDate(Timestamp regDate) {
        this.regDate = regDate;
    }

    @Basic
    @Column(name = "Operator", nullable = true, length = 50)
    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Basic
    @Column(name = "dwid", nullable = true, length = 50)
    public String getDwid() {
        return dwid;
    }

    public void setDwid(String dwid) {
        this.dwid = dwid;
    }

    @Basic
    @Column(name = "picture", nullable = true)
    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    @Basic
    @Column(name = "printoff", nullable = true)
    public Integer getPrintoff() {
        return printoff;
    }

    public void setPrintoff(Integer printoff) {
        this.printoff = printoff;
    }

    @Basic
    @Column(name = "cardpass", nullable = true, length = 50)
    public String getCardpass() {
        return cardpass;
    }

    public void setCardpass(String cardpass) {
        this.cardpass = cardpass;
    }

    @Basic
    @Column(name = "question", nullable = true, length = 200)
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Basic
    @Column(name = "answer", nullable = true, length = 200)
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Basic
    @Column(name = "czdate", nullable = true)
    public Timestamp getCzdate() {
        return czdate;
    }

    public void setCzdate(Timestamp czdate) {
        this.czdate = czdate;
    }

    @Basic
    @Column(name = "YaJin", nullable = true, precision = 0)
    public Double getYaJin() {
        return yaJin;
    }

    public void setYaJin(Double yaJin) {
        this.yaJin = yaJin;
    }

    @Basic
    @Column(name = "yjbz", nullable = true)
    public Integer getYjbz() {
        return yjbz;
    }

    public void setYjbz(Integer yjbz) {
        this.yjbz = yjbz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LiReaderEntity that = (LiReaderEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(readerCode, that.readerCode) &&
                Objects.equals(readerName, that.readerName) &&
                Objects.equals(readerInputCode, that.readerInputCode) &&
                Objects.equals(cardId, that.cardId) &&
                Objects.equals(readerCateId, that.readerCateId) &&
                Objects.equals(sex, that.sex) &&
                Objects.equals(brithDate, that.brithDate) &&
                Objects.equals(corpName, that.corpName) &&
                Objects.equals(deptName, that.deptName) &&
                Objects.equals(idCard, that.idCard) &&
                Objects.equals(workCard, that.workCard) &&
                Objects.equals(workPhone, that.workPhone) &&
                Objects.equals(homePhone, that.homePhone) &&
                Objects.equals(mobilePhone, that.mobilePhone) &&
                Objects.equals(eMail, that.eMail) &&
                Objects.equals(address, that.address) &&
                Objects.equals(memo, that.memo) &&
                Objects.equals(regDate, that.regDate) &&
                Objects.equals(operator, that.operator) &&
                Objects.equals(dwid, that.dwid) &&
                Arrays.equals(picture, that.picture) &&
                Objects.equals(printoff, that.printoff) &&
                Objects.equals(cardpass, that.cardpass) &&
                Objects.equals(question, that.question) &&
                Objects.equals(answer, that.answer) &&
                Objects.equals(czdate, that.czdate) &&
                Objects.equals(yaJin, that.yaJin) &&
                Objects.equals(yjbz, that.yjbz);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(id, readerCode, readerName, readerInputCode, cardId, readerCateId, sex, brithDate, corpName, deptName, idCard, workCard, workPhone, homePhone, mobilePhone, eMail, address, memo, regDate, operator, dwid, printoff, cardpass, question, answer, czdate, yaJin, yjbz);
        result = 31 * result + Arrays.hashCode(picture);
        return result;
    }
}
