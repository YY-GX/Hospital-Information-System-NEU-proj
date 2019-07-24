package com.yygx.work.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "medicalHome", schema = "backup_b", catalog = "")
public class MedicalHomeEntity {
    private int regisId;
    private String medicalNum;
    private String mainAsk;
    private String medicalHistory;
    private String treatmentCond;
    private String diseaseHistory;
    private String allergyHistory;
    private String shapeCheck;
    private String checkSuggestion;
    private String attention;
    private int outdoctorId;
    private int medicalHomeId;

    public MedicalHomeEntity(int regisId, String medicalNum, String mainAsk, String medicalHistory, String treatmentCond, String diseaseHistory, String allergyHistory, String shapeCheck, String checkSuggestion, String attention, int outdoctorId) {
        this.regisId = regisId;
        this.medicalNum = medicalNum;
        this.mainAsk = mainAsk;
        this.medicalHistory = medicalHistory;
        this.treatmentCond = treatmentCond;
        this.diseaseHistory = diseaseHistory;
        this.allergyHistory = allergyHistory;
        this.shapeCheck = shapeCheck;
        this.checkSuggestion = checkSuggestion;
        this.attention = attention;
        this.outdoctorId = outdoctorId;
    }

    public MedicalHomeEntity() {}

    @Basic
    @Column(name = "regis_id")
    public int getRegisId() {
        return regisId;
    }

    public void setRegisId(int regisId) {
        this.regisId = regisId;
    }

    @Basic
    @Column(name = "medical_num")
    public String getMedicalNum() {
        return medicalNum;
    }

    public void setMedicalNum(String medicalNum) {
        this.medicalNum = medicalNum;
    }

    @Basic
    @Column(name = "main_ask")
    public String getMainAsk() {
        return mainAsk;
    }

    public void setMainAsk(String mainAsk) {
        this.mainAsk = mainAsk;
    }

    @Basic
    @Column(name = "medical_history")
    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    @Basic
    @Column(name = "treatment_cond")
    public String getTreatmentCond() {
        return treatmentCond;
    }

    public void setTreatmentCond(String treatmentCond) {
        this.treatmentCond = treatmentCond;
    }

    @Basic
    @Column(name = "disease_history")
    public String getDiseaseHistory() {
        return diseaseHistory;
    }

    public void setDiseaseHistory(String diseaseHistory) {
        this.diseaseHistory = diseaseHistory;
    }

    @Basic
    @Column(name = "allergy_history")
    public String getAllergyHistory() {
        return allergyHistory;
    }

    public void setAllergyHistory(String allergyHistory) {
        this.allergyHistory = allergyHistory;
    }

    @Basic
    @Column(name = "shape_check")
    public String getShapeCheck() {
        return shapeCheck;
    }

    public void setShapeCheck(String shapeCheck) {
        this.shapeCheck = shapeCheck;
    }

    @Basic
    @Column(name = "check_suggestion")
    public String getCheckSuggestion() {
        return checkSuggestion;
    }

    public void setCheckSuggestion(String checkSuggestion) {
        this.checkSuggestion = checkSuggestion;
    }

    @Basic
    @Column(name = "attention")
    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention;
    }

    @Basic
    @Column(name = "outdoctor_id")
    public int getOutdoctorId() {
        return outdoctorId;
    }

    public void setOutdoctorId(int outdoctorId) {
        this.outdoctorId = outdoctorId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
        MedicalHomeEntity that = (MedicalHomeEntity) o;
        return regisId == that.regisId &&
                outdoctorId == that.outdoctorId &&
                medicalHomeId == that.medicalHomeId &&
                Objects.equals(medicalNum, that.medicalNum) &&
                Objects.equals(mainAsk, that.mainAsk) &&
                Objects.equals(medicalHistory, that.medicalHistory) &&
                Objects.equals(treatmentCond, that.treatmentCond) &&
                Objects.equals(diseaseHistory, that.diseaseHistory) &&
                Objects.equals(allergyHistory, that.allergyHistory) &&
                Objects.equals(shapeCheck, that.shapeCheck) &&
                Objects.equals(checkSuggestion, that.checkSuggestion) &&
                Objects.equals(attention, that.attention);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regisId, medicalNum, mainAsk, medicalHistory, treatmentCond, diseaseHistory, allergyHistory, shapeCheck, checkSuggestion, attention, outdoctorId, medicalHomeId);
    }
}
