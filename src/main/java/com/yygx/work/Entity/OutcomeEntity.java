package com.yygx.work.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "outcome", schema = "backup_b", catalog = "")
public class OutcomeEntity {
    private int outcomeId;
    private String outcomeType;
    private String outcomeMedical;
    private int regisId;
    private int outdoctorId;
    private int diseaseNum;
    private int medicalHomeId;

    public OutcomeEntity(String outcomeType, String outcomeMedical, int regisId, int outdoctorId, int diseaseNum, int medicalHomeId) {
        this.outcomeType = outcomeType;
        this.outcomeMedical = outcomeMedical;
        this.regisId = regisId;
        this.outdoctorId = outdoctorId;
        this.diseaseNum = diseaseNum;
        this.medicalHomeId = medicalHomeId;
    }

    public OutcomeEntity() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "outcome_id")
    public int getOutcomeId() {
        return outcomeId;
    }

    public void setOutcomeId(int outcomeId) {
        this.outcomeId = outcomeId;
    }

    @Basic
    @Column(name = "outcome_type")
    public String getOutcomeType() {
        return outcomeType;
    }

    public void setOutcomeType(String outcomeType) {
        this.outcomeType = outcomeType;
    }

    @Basic
    @Column(name = "outcome_medical")
    public String getOutcomeMedical() {
        return outcomeMedical;
    }

    public void setOutcomeMedical(String outcomeMedical) {
        this.outcomeMedical = outcomeMedical;
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
    @Column(name = "outdoctor_id")
    public int getOutdoctorId() {
        return outdoctorId;
    }

    public void setOutdoctorId(int outdoctorId) {
        this.outdoctorId = outdoctorId;
    }

    @Basic
    @Column(name = "disease_num")
    public int getDiseaseNum() {
        return diseaseNum;
    }

    public void setDiseaseNum(int diseaseNum) {
        this.diseaseNum = diseaseNum;
    }

    @Basic
    @Column(name = "medical_home_id")
    public int getMedicalHomeId() {
        return medicalHomeId;
    }

    public void setMedicalHomeId(int medicalHomeId) {
        this.medicalHomeId = medicalHomeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OutcomeEntity that = (OutcomeEntity) o;
        return outcomeId == that.outcomeId &&
                regisId == that.regisId &&
                outdoctorId == that.outdoctorId &&
                diseaseNum == that.diseaseNum &&
                medicalHomeId == that.medicalHomeId &&
                Objects.equals(outcomeType, that.outcomeType) &&
                Objects.equals(outcomeMedical, that.outcomeMedical);
    }

    @Override
    public int hashCode() {
        return Objects.hash(outcomeId, outcomeType, outcomeMedical, regisId, outdoctorId, diseaseNum, medicalHomeId);
    }
}
