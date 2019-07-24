package com.yygx.work.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "outdoctor", schema = "backup_b", catalog = "")
public class OutdoctorEntity {
    private int outdoctorId;
    private String loginName;
    private String password;
    private String realName;
    private int regisLevel;
    private int departmentNum;
    private String jobTitle;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "outdoctor_id")
    public int getOutdoctorId() {
        return outdoctorId;
    }

    public void setOutdoctorId(int outdoctorId) {
        this.outdoctorId = outdoctorId;
    }

    @Basic
    @Column(name = "login_name")
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "real_name")
    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Basic
    @Column(name = "regis_level")
    public int getRegisLevel() {
        return regisLevel;
    }

    public void setRegisLevel(int regisLevel) {
        this.regisLevel = regisLevel;
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
    @Column(name = "job_title")
    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OutdoctorEntity that = (OutdoctorEntity) o;
        return outdoctorId == that.outdoctorId &&
                regisLevel == that.regisLevel &&
                departmentNum == that.departmentNum &&
                Objects.equals(loginName, that.loginName) &&
                Objects.equals(password, that.password) &&
                Objects.equals(realName, that.realName) &&
                Objects.equals(jobTitle, that.jobTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(outdoctorId, loginName, password, realName, regisLevel, departmentNum, jobTitle);
    }
}
