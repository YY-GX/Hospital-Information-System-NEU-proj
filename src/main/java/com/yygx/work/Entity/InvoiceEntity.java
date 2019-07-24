package com.yygx.work.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "invoice", schema = "backup_b", catalog = "")
public class InvoiceEntity {
    private int invoiceNum;
    private double money;
    private String invoiceState;
    private String chargeTime;
    private int registrationTollerId;
    private int regisId;
    private int refundInvoiceNum;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "invoice_num")
    public int getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
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
    @Column(name = "invoice_state")
    public String getInvoiceState() {
        return invoiceState;
    }

    public void setInvoiceState(String invoiceState) {
        this.invoiceState = invoiceState;
    }

    @Basic
    @Column(name = "charge_time")
    public String getChargeTime() {
        return chargeTime;
    }

    public void setChargeTime(String chargeTime) {
        this.chargeTime = chargeTime;
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
    @Column(name = "regis_id")
    public int getRegisId() {
        return regisId;
    }

    public void setRegisId(int regisId) {
        this.regisId = regisId;
    }

    @Basic
    @Column(name = "refund_invoice_num")
    public int getRefundInvoiceNum() {
        return refundInvoiceNum;
    }

    public void setRefundInvoiceNum(int refundInvoiceNum) {
        this.refundInvoiceNum = refundInvoiceNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceEntity that = (InvoiceEntity) o;
        return invoiceNum == that.invoiceNum &&
                Double.compare(that.money, money) == 0 &&
                registrationTollerId == that.registrationTollerId &&
                regisId == that.regisId &&
                refundInvoiceNum == that.refundInvoiceNum &&
                Objects.equals(invoiceState, that.invoiceState) &&
                Objects.equals(chargeTime, that.chargeTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invoiceNum, money, invoiceState, chargeTime, registrationTollerId, regisId, refundInvoiceNum);
    }
}
