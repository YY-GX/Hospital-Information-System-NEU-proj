package com.yygx.work.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "chinMedicalTemp", schema = "backup_b", catalog = "")
public class ChinMedicalTempEntity {
    private int chinMedicalTempName;
    private String tempRange;
    private String createTime;
    private int outdoctorId;
    private String chinMedicalTempRealName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chin_medical_temp_name")
    public int getChinMedicalTempName() {
        return chinMedicalTempName;
    }

    public void setChinMedicalTempName(int chinMedicalTempName) {
        this.chinMedicalTempName = chinMedicalTempName;
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
    @Column(name = "chin_medical_temp_realName")
    public String getChinMedicalTempRealName() {
        return chinMedicalTempRealName;
    }

    public void setChinMedicalTempRealName(String chinMedicalTempRealName) {
        this.chinMedicalTempRealName = chinMedicalTempRealName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChinMedicalTempEntity that = (ChinMedicalTempEntity) o;
        return chinMedicalTempName == that.chinMedicalTempName &&
                outdoctorId == that.outdoctorId &&
                Objects.equals(tempRange, that.tempRange) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(chinMedicalTempRealName, that.chinMedicalTempRealName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chinMedicalTempName, tempRange, createTime, outdoctorId, chinMedicalTempRealName);
    }
}
