package com.yygx.work.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "programTempDetail", schema = "backup_b", catalog = "")
public class ProgramTempDetailEntity {
    private int programTempDetailId;
    private int programId;
    private String times;
    private int medicalTechTempName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "program_temp_detail_id")
    public int getProgramTempDetailId() {
        return programTempDetailId;
    }

    public void setProgramTempDetailId(int programTempDetailId) {
        this.programTempDetailId = programTempDetailId;
    }

    @Basic
    @Column(name = "program_id")
    public int getProgramId() {
        return programId;
    }

    public void setProgramId(int programId) {
        this.programId = programId;
    }

    @Basic
    @Column(name = "times")
    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    @Basic
    @Column(name = "medical_tech_temp_name")
    public int getMedicalTechTempName() {
        return medicalTechTempName;
    }

    public void setMedicalTechTempName(int medicalTechTempName) {
        this.medicalTechTempName = medicalTechTempName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProgramTempDetailEntity that = (ProgramTempDetailEntity) o;
        return programTempDetailId == that.programTempDetailId &&
                programId == that.programId &&
                medicalTechTempName == that.medicalTechTempName &&
                Objects.equals(times, that.times);
    }

    @Override
    public int hashCode() {
        return Objects.hash(programTempDetailId, programId, times, medicalTechTempName);
    }
}
