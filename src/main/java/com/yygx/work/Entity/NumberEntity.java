package com.yygx.work.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "number", schema = "backup_b", catalog = "")
public class NumberEntity {
    private int numberId;
    private String numberCode;
    private String numberName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "number_id")
    public int getNumberId() {
        return numberId;
    }

    public void setNumberId(int numberId) {
        this.numberId = numberId;
    }

    @Basic
    @Column(name = "number_code")
    public String getNumberCode() {
        return numberCode;
    }

    public void setNumberCode(String numberCode) {
        this.numberCode = numberCode;
    }

    @Basic
    @Column(name = "number_name")
    public String getNumberName() {
        return numberName;
    }

    public void setNumberName(String numberName) {
        this.numberName = numberName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumberEntity that = (NumberEntity) o;
        return numberId == that.numberId &&
                Objects.equals(numberCode, that.numberCode) &&
                Objects.equals(numberName, that.numberName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberId, numberCode, numberName);
    }
}
