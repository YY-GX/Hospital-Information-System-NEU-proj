package com.yygx.work.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "chinMedicalDetail", schema = "backup_b", catalog = "")
public class ChinMedicalDetailEntity {
    private int chinMedicalDetailId;
    private String useWay;
    private String amount;
    private String frequent;
    private int number;
    private int medicineNum;
    private int herbMedicineId;
    private int feeState;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chin_medical_detail_id")
    public int getChinMedicalDetailId() {
        return chinMedicalDetailId;
    }

    public void setChinMedicalDetailId(int chinMedicalDetailId) {
        this.chinMedicalDetailId = chinMedicalDetailId;
    }

    @Basic
    @Column(name = "use_way")
    public String getUseWay() {
        return useWay;
    }

    public void setUseWay(String useWay) {
        this.useWay = useWay;
    }

    @Basic
    @Column(name = "amount")
    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "frequent")
    public String getFrequent() {
        return frequent;
    }

    public void setFrequent(String frequent) {
        this.frequent = frequent;
    }

    @Basic
    @Column(name = "number")
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Basic
    @Column(name = "medicine_num")
    public int getMedicineNum() {
        return medicineNum;
    }

    public void setMedicineNum(int medicineNum) {
        this.medicineNum = medicineNum;
    }

    @Basic
    @Column(name = "herb_medicine_id")
    public int getHerbMedicineId() {
        return herbMedicineId;
    }

    public void setHerbMedicineId(int herbMedicineId) {
        this.herbMedicineId = herbMedicineId;
    }

    @Basic
    @Column(name = "fee_state")
    public int getFeeState() {
        return feeState;
    }

    public void setFeeState(int feeState) {
        this.feeState = feeState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChinMedicalDetailEntity that = (ChinMedicalDetailEntity) o;
        return chinMedicalDetailId == that.chinMedicalDetailId &&
                number == that.number &&
                medicineNum == that.medicineNum &&
                herbMedicineId == that.herbMedicineId &&
                feeState == that.feeState &&
                Objects.equals(useWay, that.useWay) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(frequent, that.frequent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chinMedicalDetailId, useWay, amount, frequent, number, medicineNum, herbMedicineId, feeState);
    }
}
