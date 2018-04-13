package org.library.tool.dao.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Objects;

@Entity
@Table(name = "li_KuCun", schema = "dbo", catalog = "library")
public class LiKuCunEntity {
    private Serializable id;
    private Timestamp ldt;
    private String dwId;
    private String ruKuDanHao;
    private String keMu;
    private String zhengtiming;
    private String fenleiName;
    private String chubandi;
    private String chubanName;
    private Timestamp chubanriqi;
    private String tiaoma;
    private String isbn;
    private String unit;
    private BigDecimal danJia;
    private Integer shuLiang;
    private BigDecimal jine;
    private Timestamp gouZhiRiQi;
    private String gysname;
    private String beizhu;
    private String bookInputCode;
    private String author;
    private String bookType;
    private String keywords;
    private String seriesName;
    private String editionTime;
    private String bookLanguage;
    private String bookFaceInfo;
    private String boolAddons;
    private String cn;
    private String publishPeriods;
    private String upDept;
    private String contentIntro;
    private Timestamp regdate;
    private String operator;
    private String suoshuhao;
    private String szshushi;
    private String skjiawei;
    private byte[] picture;
    private Integer sfbm;
    private Integer bfbz;
    private Integer bsbz;
    private Integer dsbz;
    private LiBookcateEntity liBookcateByFenleihao;

    @Id
    @Column(name = "ID", nullable = false)
    public Serializable getId() {
        return id;
    }

    public void setId(Serializable id) {
        this.id = id;
    }

    @Basic
    @Column(name = "LDT", nullable = true)
    public Timestamp getLdt() {
        return ldt;
    }

    public void setLdt(Timestamp ldt) {
        this.ldt = ldt;
    }

    @Basic
    @Column(name = "dwID", nullable = true, length = 50)
    public String getDwId() {
        return dwId;
    }

    public void setDwId(String dwId) {
        this.dwId = dwId;
    }

    @Basic
    @Column(name = "RuKuDanHao", nullable = true, length = 50)
    public String getRuKuDanHao() {
        return ruKuDanHao;
    }

    public void setRuKuDanHao(String ruKuDanHao) {
        this.ruKuDanHao = ruKuDanHao;
    }

    @Basic
    @Column(name = "KeMu", nullable = true, length = 50)
    public String getKeMu() {
        return keMu;
    }

    public void setKeMu(String keMu) {
        this.keMu = keMu;
    }

    @Basic
    @Column(name = "zhengtiming", nullable = true, length = 500)
    public String getZhengtiming() {
        return zhengtiming;
    }

    public void setZhengtiming(String zhengtiming) {
        this.zhengtiming = zhengtiming;
    }

    @Basic
    @Column(name = "fenleiName", nullable = true, length = 50)
    public String getFenleiName() {
        return fenleiName;
    }

    public void setFenleiName(String fenleiName) {
        this.fenleiName = fenleiName;
    }

    @Basic
    @Column(name = "chubandi", nullable = true, length = 20)
    public String getChubandi() {
        return chubandi;
    }

    public void setChubandi(String chubandi) {
        this.chubandi = chubandi;
    }

    @Basic
    @Column(name = "chubanName", nullable = true, length = 30)
    public String getChubanName() {
        return chubanName;
    }

    public void setChubanName(String chubanName) {
        this.chubanName = chubanName;
    }

    @Basic
    @Column(name = "chubanriqi", nullable = true)
    public Timestamp getChubanriqi() {
        return chubanriqi;
    }

    public void setChubanriqi(Timestamp chubanriqi) {
        this.chubanriqi = chubanriqi;
    }

    @Basic
    @Column(name = "tiaoma", nullable = true, length = 50)
    public String getTiaoma() {
        return tiaoma;
    }

    public void setTiaoma(String tiaoma) {
        this.tiaoma = tiaoma;
    }

    @Basic
    @Column(name = "ISBN", nullable = true, length = 50)
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Basic
    @Column(name = "unit", nullable = true, length = 50)
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Basic
    @Column(name = "DanJia", nullable = true, precision = 2)
    public BigDecimal getDanJia() {
        return danJia;
    }

    public void setDanJia(BigDecimal danJia) {
        this.danJia = danJia;
    }

    @Basic
    @Column(name = "ShuLiang", nullable = true)
    public Integer getShuLiang() {
        return shuLiang;
    }

    public void setShuLiang(Integer shuLiang) {
        this.shuLiang = shuLiang;
    }

    @Basic
    @Column(name = "jine", nullable = true, precision = 2)
    public BigDecimal getJine() {
        return jine;
    }

    public void setJine(BigDecimal jine) {
        this.jine = jine;
    }

    @Basic
    @Column(name = "GouZhiRiQi", nullable = true)
    public Timestamp getGouZhiRiQi() {
        return gouZhiRiQi;
    }

    public void setGouZhiRiQi(Timestamp gouZhiRiQi) {
        this.gouZhiRiQi = gouZhiRiQi;
    }

    @Basic
    @Column(name = "gysname", nullable = true, length = 100)
    public String getGysname() {
        return gysname;
    }

    public void setGysname(String gysname) {
        this.gysname = gysname;
    }

    @Basic
    @Column(name = "beizhu", nullable = true, length = 100)
    public String getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    @Basic
    @Column(name = "BookInputCode", nullable = true, length = 50)
    public String getBookInputCode() {
        return bookInputCode;
    }

    public void setBookInputCode(String bookInputCode) {
        this.bookInputCode = bookInputCode;
    }

    @Basic
    @Column(name = "Author", nullable = true, length = 100)
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "BookType", nullable = true, length = 50)
    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    @Basic
    @Column(name = "Keywords", nullable = true, length = 300)
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @Basic
    @Column(name = "SeriesName", nullable = true, length = 300)
    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    @Basic
    @Column(name = "EditionTime", nullable = true, length = 50)
    public String getEditionTime() {
        return editionTime;
    }

    public void setEditionTime(String editionTime) {
        this.editionTime = editionTime;
    }

    @Basic
    @Column(name = "BookLanguage", nullable = true, length = 50)
    public String getBookLanguage() {
        return bookLanguage;
    }

    public void setBookLanguage(String bookLanguage) {
        this.bookLanguage = bookLanguage;
    }

    @Basic
    @Column(name = "BookFaceInfo", nullable = true, length = 50)
    public String getBookFaceInfo() {
        return bookFaceInfo;
    }

    public void setBookFaceInfo(String bookFaceInfo) {
        this.bookFaceInfo = bookFaceInfo;
    }

    @Basic
    @Column(name = "BoolAddons", nullable = true, length = 50)
    public String getBoolAddons() {
        return boolAddons;
    }

    public void setBoolAddons(String boolAddons) {
        this.boolAddons = boolAddons;
    }

    @Basic
    @Column(name = "CN", nullable = true, length = 50)
    public String getCn() {
        return cn;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    @Basic
    @Column(name = "PublishPeriods", nullable = true, length = 50)
    public String getPublishPeriods() {
        return publishPeriods;
    }

    public void setPublishPeriods(String publishPeriods) {
        this.publishPeriods = publishPeriods;
    }

    @Basic
    @Column(name = "UpDept", nullable = true, length = 100)
    public String getUpDept() {
        return upDept;
    }

    public void setUpDept(String upDept) {
        this.upDept = upDept;
    }

    @Basic
    @Column(name = "ContentIntro", nullable = true, length = 400)
    public String getContentIntro() {
        return contentIntro;
    }

    public void setContentIntro(String contentIntro) {
        this.contentIntro = contentIntro;
    }

    @Basic
    @Column(name = "Regdate", nullable = true)
    public Timestamp getRegdate() {
        return regdate;
    }

    public void setRegdate(Timestamp regdate) {
        this.regdate = regdate;
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
    @Column(name = "suoshuhao", nullable = true, length = 50)
    public String getSuoshuhao() {
        return suoshuhao;
    }

    public void setSuoshuhao(String suoshuhao) {
        this.suoshuhao = suoshuhao;
    }

    @Basic
    @Column(name = "szshushi", nullable = true, length = 50)
    public String getSzshushi() {
        return szshushi;
    }

    public void setSzshushi(String szshushi) {
        this.szshushi = szshushi;
    }

    @Basic
    @Column(name = "skjiawei", nullable = true, length = 50)
    public String getSkjiawei() {
        return skjiawei;
    }

    public void setSkjiawei(String skjiawei) {
        this.skjiawei = skjiawei;
    }

    @Basic
    @Column(name = "Picture", nullable = true)
    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    @Basic
    @Column(name = "sfbm", nullable = true)
    public Integer getSfbm() {
        return sfbm;
    }

    public void setSfbm(Integer sfbm) {
        this.sfbm = sfbm;
    }

    @Basic
    @Column(name = "bfbz", nullable = true)
    public Integer getBfbz() {
        return bfbz;
    }

    public void setBfbz(Integer bfbz) {
        this.bfbz = bfbz;
    }

    @Basic
    @Column(name = "bsbz", nullable = true)
    public Integer getBsbz() {
        return bsbz;
    }

    public void setBsbz(Integer bsbz) {
        this.bsbz = bsbz;
    }

    @Basic
    @Column(name = "dsbz", nullable = true)
    public Integer getDsbz() {
        return dsbz;
    }

    public void setDsbz(Integer dsbz) {
        this.dsbz = dsbz;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LiKuCunEntity that = (LiKuCunEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(ldt, that.ldt) &&
                Objects.equals(dwId, that.dwId) &&
                Objects.equals(ruKuDanHao, that.ruKuDanHao) &&
                Objects.equals(keMu, that.keMu) &&
                Objects.equals(zhengtiming, that.zhengtiming) &&
                Objects.equals(fenleiName, that.fenleiName) &&
                Objects.equals(chubandi, that.chubandi) &&
                Objects.equals(chubanName, that.chubanName) &&
                Objects.equals(chubanriqi, that.chubanriqi) &&
                Objects.equals(tiaoma, that.tiaoma) &&
                Objects.equals(isbn, that.isbn) &&
                Objects.equals(unit, that.unit) &&
                Objects.equals(danJia, that.danJia) &&
                Objects.equals(shuLiang, that.shuLiang) &&
                Objects.equals(jine, that.jine) &&
                Objects.equals(gouZhiRiQi, that.gouZhiRiQi) &&
                Objects.equals(gysname, that.gysname) &&
                Objects.equals(beizhu, that.beizhu) &&
                Objects.equals(bookInputCode, that.bookInputCode) &&
                Objects.equals(author, that.author) &&
                Objects.equals(bookType, that.bookType) &&
                Objects.equals(keywords, that.keywords) &&
                Objects.equals(seriesName, that.seriesName) &&
                Objects.equals(editionTime, that.editionTime) &&
                Objects.equals(bookLanguage, that.bookLanguage) &&
                Objects.equals(bookFaceInfo, that.bookFaceInfo) &&
                Objects.equals(boolAddons, that.boolAddons) &&
                Objects.equals(cn, that.cn) &&
                Objects.equals(publishPeriods, that.publishPeriods) &&
                Objects.equals(upDept, that.upDept) &&
                Objects.equals(contentIntro, that.contentIntro) &&
                Objects.equals(regdate, that.regdate) &&
                Objects.equals(operator, that.operator) &&
                Objects.equals(suoshuhao, that.suoshuhao) &&
                Objects.equals(szshushi, that.szshushi) &&
                Objects.equals(skjiawei, that.skjiawei) &&
                Arrays.equals(picture, that.picture) &&
                Objects.equals(sfbm, that.sfbm) &&
                Objects.equals(bfbz, that.bfbz) &&
                Objects.equals(bsbz, that.bsbz) &&
                Objects.equals(dsbz, that.dsbz);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(id, ldt, dwId, ruKuDanHao, keMu, zhengtiming, fenleiName, chubandi, chubanName, chubanriqi, tiaoma, isbn, unit, danJia, shuLiang, jine, gouZhiRiQi, gysname, beizhu, bookInputCode, author, bookType, keywords, seriesName, editionTime, bookLanguage, bookFaceInfo, boolAddons, cn, publishPeriods, upDept, contentIntro, regdate, operator, suoshuhao, szshushi, skjiawei, sfbm, bfbz, bsbz, dsbz);
        result = 31 * result + Arrays.hashCode(picture);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "fenleihao", referencedColumnName = "scode")
    public LiBookcateEntity getLiBookcateByFenleihao() {
        return liBookcateByFenleihao;
    }

    public void setLiBookcateByFenleihao(LiBookcateEntity liBookcateByFenleihao) {
        this.liBookcateByFenleihao = liBookcateByFenleihao;
    }
}
