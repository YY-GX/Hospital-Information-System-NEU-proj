package com.yygx.work.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "scheduleRule", schema = "backup_b", catalog = "")
public class ScheduleRuleEntity {
    private String ruleName;
    private String week;
    private int outdoctorId;
    private int departmentNum;

    @Id
    @Column(name = "rule_name")
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    @Basic
    @Column(name = "week")
    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
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
    @Column(name = "department_num")
    public int getDepartmentNum() {
        return departmentNum;
    }

    public void setDepartmentNum(int departmentNum) {
        this.departmentNum = departmentNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScheduleRuleEntity that = (ScheduleRuleEntity) o;
        return outdoctorId == that.outdoctorId &&
                departmentNum == that.departmentNum &&
                Objects.equals(ruleName, that.ruleName) &&
                Objects.equals(week, that.week);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleName, week, outdoctorId, departmentNum);
    }
}
