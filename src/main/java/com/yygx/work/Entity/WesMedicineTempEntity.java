package com.yygx.work.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "wesMedicineTemp", schema = "backup_b", catalog = "")
public class WesMedicineTempEntity {
    private int wesMedicineTempName;
    private String tempRange;
    private String createTime;
    private int outdoctorId;
    private String wesMedicineTempRealName;

    public WesMedicineTempEntity(String tempRange, String createTime, int outdoctorId, String wesMedicineTempRealName) {
        this.tempRange = tempRange;
        this.createTime = createTime;
        this.outdoctorId = outdoctorId;
        this.wesMedicineTempRealName = wesMedicineTempRealName;
    }

    public WesMedicineTempEntity() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wes_medicine_temp_name")
    public int getWesMedicineTempName() {
        return wesMedicineTempName;
    }

    public void setWesMedicineTempName(int wesMedicineTempName) {
        this.wesMedicineTempName = wesMedicineTempName;
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
    @Column(name = "wes_medicine_temp_realName")
    public String getWesMedicineTempRealName() {
        return wesMedicineTempRealName;
    }

    public void setWesMedicineTempRealName(String wesMedicineTempRealName) {
        this.wesMedicineTempRealName = wesMedicineTempRealName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WesMedicineTempEntity that = (WesMedicineTempEntity) o;
        return wesMedicineTempName == that.wesMedicineTempName &&
                outdoctorId == that.outdoctorId &&
                Objects.equals(tempRange, that.tempRange) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(wesMedicineTempRealName, that.wesMedicineTempRealName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wesMedicineTempName, tempRange, createTime, outdoctorId, wesMedicineTempRealName);
    }
}
