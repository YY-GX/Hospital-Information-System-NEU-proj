package com.yygx.work.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "wesMedicineTempDetail", schema = "backup_b", catalog = "")
public class WesMedicineTempDetailEntity {
    private int wesMedicineTempDetailId;
    private String useWay;
    private String amount;
    private String frequent;
    private int number;
    private int medicineNum;
    private int medicalTechTempName;

    public WesMedicineTempDetailEntity(String useWay, String amount, String frequent, int number, int medicineNum, int medicalTechTempName) {
        this.useWay = useWay;
        this.amount = amount;
        this.frequent = frequent;
        this.number = number;
        this.medicineNum = medicineNum;
        this.medicalTechTempName = medicalTechTempName;
    }

    public WesMedicineTempDetailEntity() {}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "wes_medicine_temp_detail_id")
    public int getWesMedicineTempDetailId() {
        return wesMedicineTempDetailId;
    }

    public void setWesMedicineTempDetailId(int wesMedicineTempDetailId) {
        this.wesMedicineTempDetailId = wesMedicineTempDetailId;
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
    @Column(name = "medical_tech_temp_name")
    public int getMedicalTechTempName() {
        return medicalTechTempName;
    }

    public void setMedicalTechTempName(int medicalTechTempName) {
        this.medicalTechTempName = medicalTechTempName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WesMedicineTempDetailEntity that = (WesMedicineTempDetailEntity) o;
        return wesMedicineTempDetailId == that.wesMedicineTempDetailId &&
                number == that.number &&
                medicineNum == that.medicineNum &&
                medicalTechTempName == that.medicalTechTempName &&
                Objects.equals(useWay, that.useWay) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(frequent, that.frequent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wesMedicineTempDetailId, useWay, amount, frequent, number, medicineNum, medicalTechTempName);
    }
}
