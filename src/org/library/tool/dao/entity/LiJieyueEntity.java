package org.library.tool.dao.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "li_jieyue", schema = "dbo", catalog = "library")
public class LiJieyueEntity {
    private Serializable id;
    private String dwid;
    private Timestamp jieyueriqi;
    private Long jieyuecishu;
    private Timestamp xujieriqi;
    private Timestamp geihuanriqi;
    private Integer sfgh;
    private String jieyueczy;
    private String guihuanczy;
    private Integer jieyueshu;
    private Integer guihuaceshu;
    private Integer xjcs;
    private Double yfje;
    private Double sfje;
    private String fkyy;
    private Timestamp fkrq;
    private String oprater;
    private String memo;

    @Id
    @Column(name = "id", nullable = false)
    public Serializable getId() {
        return id;
    }

    public void setId(Serializable id) {
        this.id = id;
    }

    @Basic
    @Column(name = "dwid", nullable = false, length = 50)
    public String getDwid() {
        return dwid;
    }

    public void setDwid(String dwid) {
        this.dwid = dwid;
    }

    @Basic
    @Column(name = "jieyueriqi", nullable = true)
    public Timestamp getJieyueriqi() {
        return jieyueriqi;
    }

    public void setJieyueriqi(Timestamp jieyueriqi) {
        this.jieyueriqi = jieyueriqi;
    }

    @Basic
    @Column(name = "jieyuecishu", nullable = true)
    public Long getJieyuecishu() {
        return jieyuecishu;
    }

    public void setJieyuecishu(Long jieyuecishu) {
        this.jieyuecishu = jieyuecishu;
    }

    @Basic
    @Column(name = "xujieriqi", nullable = true)
    public Timestamp getXujieriqi() {
        return xujieriqi;
    }

    public void setXujieriqi(Timestamp xujieriqi) {
        this.xujieriqi = xujieriqi;
    }

    @Basic
    @Column(name = "geihuanriqi", nullable = true)
    public Timestamp getGeihuanriqi() {
        return geihuanriqi;
    }

    public void setGeihuanriqi(Timestamp geihuanriqi) {
        this.geihuanriqi = geihuanriqi;
    }

    @Basic
    @Column(name = "sfgh", nullable = true)
    public Integer getSfgh() {
        return sfgh;
    }

    public void setSfgh(Integer sfgh) {
        this.sfgh = sfgh;
    }

    @Basic
    @Column(name = "jieyueczy", nullable = true, length = 50)
    public String getJieyueczy() {
        return jieyueczy;
    }

    public void setJieyueczy(String jieyueczy) {
        this.jieyueczy = jieyueczy;
    }

    @Basic
    @Column(name = "guihuanczy", nullable = true, length = 50)
    public String getGuihuanczy() {
        return guihuanczy;
    }

    public void setGuihuanczy(String guihuanczy) {
        this.guihuanczy = guihuanczy;
    }

    @Basic
    @Column(name = "jieyueshu", nullable = true, precision = 0)
    public Integer getJieyueshu() {
        return jieyueshu;
    }

    public void setJieyueshu(Integer jieyueshu) {
        this.jieyueshu = jieyueshu;
    }

    @Basic
    @Column(name = "guihuaceshu", nullable = true, precision = 0)
    public Integer getGuihuaceshu() {
        return guihuaceshu;
    }

    public void setGuihuaceshu(Integer guihuaceshu) {
        this.guihuaceshu = guihuaceshu;
    }

    @Basic
    @Column(name = "Xjcs", nullable = true)
    public Integer getXjcs() {
        return xjcs;
    }

    public void setXjcs(Integer xjcs) {
        this.xjcs = xjcs;
    }

    @Basic
    @Column(name = "Yfje", nullable = true, precision = 0)
    public Double getYfje() {
        return yfje;
    }

    public void setYfje(Double yfje) {
        this.yfje = yfje;
    }

    @Basic
    @Column(name = "Sfje", nullable = true, precision = 0)
    public Double getSfje() {
        return sfje;
    }

    public void setSfje(Double sfje) {
        this.sfje = sfje;
    }

    @Basic
    @Column(name = "Fkyy", nullable = true, length = 20)
    public String getFkyy() {
        return fkyy;
    }

    public void setFkyy(String fkyy) {
        this.fkyy = fkyy;
    }

    @Basic
    @Column(name = "Fkrq", nullable = true)
    public Timestamp getFkrq() {
        return fkrq;
    }

    public void setFkrq(Timestamp fkrq) {
        this.fkrq = fkrq;
    }

    @Basic
    @Column(name = "Oprater", nullable = true, length = 20)
    public String getOprater() {
        return oprater;
    }

    public void setOprater(String oprater) {
        this.oprater = oprater;
    }

    @Basic
    @Column(name = "Memo", nullable = true, length = 100)
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LiJieyueEntity that = (LiJieyueEntity) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(dwid, that.dwid) &&
                Objects.equals(jieyueriqi, that.jieyueriqi) &&
                Objects.equals(jieyuecishu, that.jieyuecishu) &&
                Objects.equals(xujieriqi, that.xujieriqi) &&
                Objects.equals(geihuanriqi, that.geihuanriqi) &&
                Objects.equals(sfgh, that.sfgh) &&
                Objects.equals(jieyueczy, that.jieyueczy) &&
                Objects.equals(guihuanczy, that.guihuanczy) &&
                Objects.equals(jieyueshu, that.jieyueshu) &&
                Objects.equals(guihuaceshu, that.guihuaceshu) &&
                Objects.equals(xjcs, that.xjcs) &&
                Objects.equals(yfje, that.yfje) &&
                Objects.equals(sfje, that.sfje) &&
                Objects.equals(fkyy, that.fkyy) &&
                Objects.equals(fkrq, that.fkrq) &&
                Objects.equals(oprater, that.oprater) &&
                Objects.equals(memo, that.memo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, dwid, jieyueriqi, jieyuecishu, xujieriqi, geihuanriqi, sfgh, jieyueczy, guihuanczy, jieyueshu, guihuaceshu, xjcs, yfje, sfje, fkyy, fkrq, oprater, memo);
    }
}
