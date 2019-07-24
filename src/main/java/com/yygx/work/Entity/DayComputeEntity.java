package com.yygx.work.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "dayCompute", schema = "backup_b", catalog = "")
public class DayComputeEntity {
    private int dayComputeId;
    private double money;
    private String time;
    private int registrationTollerId;
    private int invoiceNum;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "day_compute_id")
    public int getDayComputeId() {
        return dayComputeId;
    }

    public void setDayComputeId(int dayComputeId) {
        this.dayComputeId = dayComputeId;
    }

    @Basic
    @Column(name = "money")
    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
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
    @Column(name = "registrationToller_id")
    public int getRegistrationTollerId() {
        return registrationTollerId;
    }

    public void setRegistrationTollerId(int registrationTollerId) {
        this.registrationTollerId = registrationTollerId;
    }

    @Basic
    @Column(name = "invoice_num")
    public int getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DayComputeEntity that = (DayComputeEntity) o;
        return dayComputeId == that.dayComputeId &&
                Double.compare(that.money, money) == 0 &&
                registrationTollerId == that.registrationTollerId &&
                invoiceNum == that.invoiceNum &&
                Objects.equals(time, that.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dayComputeId, money, time, registrationTollerId, invoiceNum);
    }
}
