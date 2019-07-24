package com.yygx.work.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "chargeDetail", schema = "backup_b", catalog = "")
public class ChargeDetailEntity {
    private int regisId;
    private double medicinePrice;
    private long number;
    private long medicineNum;
    private double programPrice;
    private long programId;
    private Double regisPay;
    private String state;
    private long feeState;
    private long chinWesProReg;

    @Id
    @Basic
    @Column(name = "regis_id")
    public int getRegisId() {
        return regisId;
    }

    public void setRegisId(int regisId) {
        this.regisId = regisId;
    }

    @Basic
    @Column(name = "medicine_price")
    public double getMedicinePrice() {
        return medicinePrice;
    }

    public void setMedicinePrice(double medicinePrice) {
        this.medicinePrice = medicinePrice;
    }

    @Basic
    @Column(name = "number")
    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    @Basic
    @Column(name = "medicine_num")
    public long getMedicineNum() {
        return medicineNum;
    }

    public void setMedicineNum(long medicineNum) {
        this.medicineNum = medicineNum;
    }

    @Basic
    @Column(name = "program_price")
    public double getProgramPrice() {
        return programPrice;
    }

    public void setProgramPrice(double programPrice) {
        this.programPrice = programPrice;
    }

    @Basic
    @Column(name = "program_id")
    public long getProgramId() {
        return programId;
    }

    public void setProgramId(long programId) {
        this.programId = programId;
    }

    @Basic
    @Column(name = "regis_pay")
    public Double getRegisPay() {
        return regisPay;
    }

    public void setRegisPay(Double regisPay) {
        this.regisPay = regisPay;
    }

    @Basic
    @Column(name = "state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "fee_state")
    public long getFeeState() {
        return feeState;
    }

    public void setFeeState(long feeState) {
        this.feeState = feeState;
    }

    @Basic
    @Column(name = "chin_wes_pro_reg")
    public long getChinWesProReg() {
        return chinWesProReg;
    }

    public void setChinWesProReg(long chinWesProReg) {
        this.chinWesProReg = chinWesProReg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChargeDetailEntity that = (ChargeDetailEntity) o;
        return regisId == that.regisId &&
                Double.compare(that.medicinePrice, medicinePrice) == 0 &&
                number == that.number &&
                medicineNum == that.medicineNum &&
                Double.compare(that.programPrice, programPrice) == 0 &&
                programId == that.programId &&
                feeState == that.feeState &&
                chinWesProReg == that.chinWesProReg &&
                Objects.equals(regisPay, that.regisPay) &&
                Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regisId, medicinePrice, number, medicineNum, programPrice, programId, regisPay, state, feeState, chinWesProReg);
    }
}
