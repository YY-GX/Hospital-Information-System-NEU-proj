package com.yygx.work.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "wesMedicineDetail", schema = "backup_b", catalog = "")
public class WesMedicineDetailEntity {
    private int wesMedicineDetailId;
    private String useWay;
    private String amount;
    private String frequent;
    private int number;
    private int medicineNum;
    private int wesMedicineId;
    private int feeState;

    public WesMedicineDetailEntity(String useWay, String amount, String frequent, int number, int medicineNum, int wesMedicineId, int feeState) {
        this.useWay = useWay;
        this.amount = amount;
        this.frequent = frequent;
        this.number = number;
        this.medicineNum = medicineNum;
        this.wesMedicineId = wesMedicineId;
        this.feeState = feeState;
    }

    public WesMedicineDetailEntity() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wes_medicine_detail_id")
    public int getWesMedicineDetailId() {
        return wesMedicineDetailId;
    }

    public void setWesMedicineDetailId(int wesMedicineDetailId) {
        this.wesMedicineDetailId = wesMedicineDetailId;
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
    @Column(name = "wes_medicine_id")
    public int getWesMedicineId() {
        return wesMedicineId;
    }

    public void setWesMedicineId(int wesMedicineId) {
        this.wesMedicineId = wesMedicineId;
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
        WesMedicineDetailEntity that = (WesMedicineDetailEntity) o;
        return wesMedicineDetailId == that.wesMedicineDetailId &&
                number == that.number &&
                medicineNum == that.medicineNum &&
                wesMedicineId == that.wesMedicineId &&
                feeState == that.feeState &&
                Objects.equals(useWay, that.useWay) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(frequent, that.frequent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wesMedicineDetailId, useWay, amount, frequent, number, medicineNum, wesMedicineId, feeState);
    }
}
