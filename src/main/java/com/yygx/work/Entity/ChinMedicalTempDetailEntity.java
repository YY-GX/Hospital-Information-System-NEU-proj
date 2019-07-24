package com.yygx.work.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "chinMedicalTempDetail", schema = "backup_b", catalog = "")
public class ChinMedicalTempDetailEntity {
    private int chinMedicalTempDetailId;
    private String useWay;
    private String amount;
    private String frequent;
    private int number;
    private int medicineNum;
    private int chinMedicalTempName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chin_medical_temp_detail_id")
    public int getChinMedicalTempDetailId() {
        return chinMedicalTempDetailId;
    }

    public void setChinMedicalTempDetailId(int chinMedicalTempDetailId) {
        this.chinMedicalTempDetailId = chinMedicalTempDetailId;
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
    @Column(name = "chin_medical_temp_name")
    public int getChinMedicalTempName() {
        return chinMedicalTempName;
    }

    public void setChinMedicalTempName(int chinMedicalTempName) {
        this.chinMedicalTempName = chinMedicalTempName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChinMedicalTempDetailEntity that = (ChinMedicalTempDetailEntity) o;
        return chinMedicalTempDetailId == that.chinMedicalTempDetailId &&
                number == that.number &&
                medicineNum == that.medicineNum &&
                chinMedicalTempName == that.chinMedicalTempName &&
                Objects.equals(useWay, that.useWay) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(frequent, that.frequent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chinMedicalTempDetailId, useWay, amount, frequent, number, medicineNum, chinMedicalTempName);
    }
}
