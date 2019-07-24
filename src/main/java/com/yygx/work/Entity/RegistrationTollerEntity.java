package com.yygx.work.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "registrationToller", schema = "backup_b", catalog = "")
public class RegistrationTollerEntity {
    private int registrationTollerId;
    private String loginName;
    private String password;
    private String realName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "registrationToller_id")
    public int getRegistrationTollerId() {
        return registrationTollerId;
    }

    public void setRegistrationTollerId(int registrationTollerId) {
        this.registrationTollerId = registrationTollerId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegistrationTollerEntity that = (RegistrationTollerEntity) o;
        return registrationTollerId == that.registrationTollerId &&
                Objects.equals(loginName, that.loginName) &&
                Objects.equals(password, that.password) &&
                Objects.equals(realName, that.realName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registrationTollerId, loginName, password, realName);
    }
}
