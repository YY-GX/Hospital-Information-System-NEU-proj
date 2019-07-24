package com.yygx.work.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "scheduleInfo", schema = "backup_b", catalog = "")
public class ScheduleInfoEntity {
    private int scheduleInfoId;
    private int departmentNum;
    private int outdoctorId;
    private String ruleName;
    private String scheduleTime;
    private String morOrAft;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "schedule_info_id")
    public int getScheduleInfoId() {
        return scheduleInfoId;
    }

    public void setScheduleInfoId(int scheduleInfoId) {
        this.scheduleInfoId = scheduleInfoId;
    }

    @Basic
    @Column(name = "department_num")
    public int getDepartmentNum() {
        return departmentNum;
    }

    public void setDepartmentNum(int departmentNum) {
        this.departmentNum = departmentNum;
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
    @Column(name = "rule_name")
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    @Basic
    @Column(name = "schedule_time")
    public String getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    @Basic
    @Column(name = "mor_or_aft")
    public String getMorOrAft() {
        return morOrAft;
    }

    public void setMorOrAft(String morOrAft) {
        this.morOrAft = morOrAft;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScheduleInfoEntity that = (ScheduleInfoEntity) o;
        return scheduleInfoId == that.scheduleInfoId &&
                departmentNum == that.departmentNum &&
                outdoctorId == that.outdoctorId &&
                Objects.equals(ruleName, that.ruleName) &&
                Objects.equals(scheduleTime, that.scheduleTime) &&
                Objects.equals(morOrAft, that.morOrAft);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scheduleInfoId, departmentNum, outdoctorId, ruleName, scheduleTime, morOrAft);
    }
}
