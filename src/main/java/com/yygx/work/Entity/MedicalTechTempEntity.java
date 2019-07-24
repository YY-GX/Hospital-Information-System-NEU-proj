package com.yygx.work.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "medicalTechTemp", schema = "backup_b", catalog = "")
public class MedicalTechTempEntity {
    private int medicalTechTempName;
    private String tempRange;
    private String tempType;
    private String createTime;
    private int outdoctorId;
    private String medicalTechTempRealName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "medical_tech_temp_name")
    public int getMedicalTechTempName() {
        return medicalTechTempName;
    }

    public void setMedicalTechTempName(int medicalTechTempName) {
        this.medicalTechTempName = medicalTechTempName;
    }

    @Basic
    @Column(name = "temp_range")
    public String getTempRange() {
        return tempRange;
    }

    public void setTempRange(String tempRange) {
        this.tempRange = tempRange;
    }

    @Basic
    @Column(name = "temp_type")
    public String getTempType() {
        return tempType;
    }

    public void setTempType(String tempType) {
        this.tempType = tempType;
    }

    @Basic
    @Column(name = "create_time")
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
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
    @Column(name = "medical_tech_temp_realName")
    public String getMedicalTechTempRealName() {
        return medicalTechTempRealName;
    }

    public void setMedicalTechTempRealName(String medicalTechTempRealName) {
        this.medicalTechTempRealName = medicalTechTempRealName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedicalTechTempEntity that = (MedicalTechTempEntity) o;
        return medicalTechTempName == that.medicalTechTempName &&
                outdoctorId == that.outdoctorId &&
                Objects.equals(tempRange, that.tempRange) &&
                Objects.equals(tempType, that.tempType) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(medicalTechTempRealName, that.medicalTechTempRealName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(medicalTechTempName, tempRange, tempType, createTime, outdoctorId, medicalTechTempRealName);
    }
}
