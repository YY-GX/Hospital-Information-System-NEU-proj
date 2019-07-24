package com.yygx.work.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "wesMedicine", schema = "backup_b", catalog = "")
public class WesMedicineEntity {
    private int wesMedicineId;
    private int regisId;
    private String state;
    private String startTime;

    public WesMedicineEntity(int regisId, String state, String startTime) {
        this.regisId = regisId;
        this.state = state;
        this.startTime = startTime;
    }

    public WesMedicineEntity() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wes_medicine_id")
    public int getWesMedicineId() {
        return wesMedicineId;
    }

    public void setWesMedicineId(int wesMedicineId) {
        this.wesMedicineId = wesMedicineId;
    }

    @Basic
    @Column(name = "regis_id")
    public int getRegisId() {
        return regisId;
    }

    public void setRegisId(int regisId) {
        this.regisId = regisId;
    }

    @Basic
    @Column(name = "state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "start_time")
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WesMedicineEntity that = (WesMedicineEntity) o;
        return wesMedicineId == that.wesMedicineId &&
                regisId == that.regisId &&
                Objects.equals(state, that.state) &&
                Objects.equals(startTime, that.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wesMedicineId, regisId, state, startTime);
    }
}
