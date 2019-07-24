package com.yygx.work.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "herbMedical", schema = "backup_b", catalog = "")
public class HerbMedicalEntity {
    private int herbMedicineId;
    private int regisId;
    private String state;
    private String startTime;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "herb_medicine_id")
    public int getHerbMedicineId() {
        return herbMedicineId;
    }

    public void setHerbMedicineId(int herbMedicineId) {
        this.herbMedicineId = herbMedicineId;
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
        HerbMedicalEntity that = (HerbMedicalEntity) o;
        return herbMedicineId == that.herbMedicineId &&
                regisId == that.regisId &&
                Objects.equals(state, that.state) &&
                Objects.equals(startTime, that.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(herbMedicineId, regisId, state, startTime);
    }
}
