package com.yygx.work.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "registration", schema = "backup_b", catalog = "")
public class RegistrationEntity {
    private int regisId;
    private String payType;
    private String regisLevel;
    private String isMedicalBook;
    private int outdoctorId;
    private int medicalNum;
    private int registrationTollerId;
    private int regisDepartment;
    private String time;
    private String morOrAft;
    private String regisAccTime;
    private String regisState;

    public RegistrationEntity(String payType, String regisLevel, String isMedicalBook, int outdoctorId, int medicalNum, int registrationTollerId, int regisDepartment, String time, String morOrAft, String regisAccTime, String regisState) {
        this.payType = payType;
        this.regisLevel = regisLevel;
        this.isMedicalBook = isMedicalBook;
        this.outdoctorId = outdoctorId;
        this.medicalNum = medicalNum;
        this.registrationTollerId = registrationTollerId;
        this.regisDepartment = regisDepartment;
        this.time = time;
        this.morOrAft = morOrAft;
        this.regisAccTime = regisAccTime;
        this.regisState = regisState;
    }

    public RegistrationEntity() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "regis_id")
    public int getRegisId() {
        return regisId;
    }

    public void setRegisId(int regisId) {
        this.regisId = regisId;
    }

    @Basic
    @Column(name = "pay_type")
    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    @Basic
    @Column(name = "regis_level")
    public String getRegisLevel() {
        return regisLevel;
    }

    public void setRegisLevel(String regisLevel) {
        this.regisLevel = regisLevel;
    }

    @Basic
    @Column(name = "is_medical_book")
    public String getIsMedicalBook() {
        return isMedicalBook;
    }

    public void setIsMedicalBook(String isMedicalBook) {
        this.isMedicalBook = isMedicalBook;
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
    @Column(name = "medical_num")
    public int getMedicalNum() {
        return medicalNum;
    }

    public void setMedicalNum(int medicalNum) {
        this.medicalNum = medicalNum;
    }

    @Basic
    @Column(name = "registrationToller_id")
    public int getRegistrationTollerId() {
        return registrationTollerId;
    }

    public void setRegistrationTollerId(int registrationTollerId) {
        this.registrationTollerId = registrationTollerId;
    }

    @Basic
    @Column(name = "regis_department")
    public int getRegisDepartment() {
        return regisDepartment;
    }

    public void setRegisDepartment(int regisDepartment) {
        this.regisDepartment = regisDepartment;
    }

    @Basic
    @Column(name = "time")
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Basic
    @Column(name = "mor_or_aft")
    public String getMorOrAft() {
        return morOrAft;
    }

    public void setMorOrAft(String morOrAft) {
        this.morOrAft = morOrAft;
    }

    @Basic
    @Column(name = "regis_acc_time")
    public String getRegisAccTime() {
        return regisAccTime;
    }

    public void setRegisAccTime(String regisAccTime) {
        this.regisAccTime = regisAccTime;
    }

    @Basic
    @Column(name = "regis_state")
    public String getRegisState() {
        return regisState;
    }

    public void setRegisState(String regisState) {
        this.regisState = regisState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegistrationEntity that = (RegistrationEntity) o;
        return regisId == that.regisId &&
                outdoctorId == that.outdoctorId &&
                medicalNum == that.medicalNum &&
                registrationTollerId == that.registrationTollerId &&
                regisDepartment == that.regisDepartment &&
                Objects.equals(payType, that.payType) &&
                Objects.equals(regisLevel, that.regisLevel) &&
                Objects.equals(isMedicalBook, that.isMedicalBook) &&
                Objects.equals(time, that.time) &&
                Objects.equals(morOrAft, that.morOrAft) &&
                Objects.equals(regisAccTime, that.regisAccTime) &&
                Objects.equals(regisState, that.regisState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regisId, payType, regisLevel, isMedicalBook, outdoctorId, medicalNum, registrationTollerId, regisDepartment, time, morOrAft, regisAccTime, regisState);
    }
}
