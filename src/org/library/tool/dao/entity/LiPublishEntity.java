package org.library.tool.dao.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "li_publish", schema = "dbo", catalog = "library")
public class LiPublishEntity {
    private String isbn;
    private String name;
    private String addr;

    @Id
    @Column(name = "isbn", nullable = false, length = 50)
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 80)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "addr", nullable = true, length = 100)
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LiPublishEntity that = (LiPublishEntity) o;
        return Objects.equals(isbn, that.isbn) &&
                Objects.equals(name, that.name) &&
                Objects.equals(addr, that.addr);
    }

    @Override
    public int hashCode() {

        return Objects.hash(isbn, name, addr);
    }
}
