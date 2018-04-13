package org.library.tool.dao.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "li_bookcate", schema = "dbo", catalog = "library")
public class LiBookcateEntity {
    private String scode;
    private String sname;
    private String kemu;
    private LiBookcateEntity liBookcateByPcode;

    @Id
    @Column(name = "scode", nullable = false, length = 20)
    public String getScode() {
        return scode;
    }

    public void setScode(String scode) {
        this.scode = scode;
    }

    @Basic
    @Column(name = "sname", nullable = true, length = 50)
    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Basic
    @Column(name = "kemu", nullable = true, length = 50)
    public String getKemu() {
        return kemu;
    }

    public void setKemu(String kemu) {
        this.kemu = kemu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LiBookcateEntity that = (LiBookcateEntity) o;
        return Objects.equals(scode, that.scode) &&
                Objects.equals(sname, that.sname) &&
                Objects.equals(kemu, that.kemu);
    }

    @Override
    public int hashCode() {

        return Objects.hash(scode, sname, kemu);
    }

    @ManyToOne
    @JoinColumn(name = "pcode", referencedColumnName = "scode")
    public LiBookcateEntity getLiBookcateByPcode() {
        return liBookcateByPcode;
    }

    public void setLiBookcateByPcode(LiBookcateEntity liBookcateByPcode) {
        this.liBookcateByPcode = liBookcateByPcode;
    }
}
