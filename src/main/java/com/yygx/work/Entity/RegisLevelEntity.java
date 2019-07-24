package com.yygx.work.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "regisLevel", schema = "backup_b", catalog = "")
public class RegisLevelEntity {
    private int regisLevelId;
    private String levelCode;
    private String levelName;
    private double fee;
    private int restriction;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "regis_level_id")
    public int getRegisLevelId() {
        return regisLevelId;
    }

    public void setRegisLevelId(int regisLevelId) {
        this.regisLevelId = regisLevelId;
    }

    @Basic
    @Column(name = "level_code")
    public String getLevelCode() {
        return levelCode;
    }

    public void setLevelCode(String levelCode) {
        this.levelCode = levelCode;
    }

    @Basic
    @Column(name = "level_name")
    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    @Basic
    @Column(name = "fee")
    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Basic
    @Column(name = "restriction")
    public int getRestriction() {
        return restriction;
    }

    public void setRestriction(int restriction) {
        this.restriction = restriction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegisLevelEntity that = (RegisLevelEntity) o;
        return regisLevelId == that.regisLevelId &&
                Double.compare(that.fee, fee) == 0 &&
                restriction == that.restriction &&
                Objects.equals(levelCode, that.levelCode) &&
                Objects.equals(levelName, that.levelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regisLevelId, levelCode, levelName, fee, restriction);
    }
}
