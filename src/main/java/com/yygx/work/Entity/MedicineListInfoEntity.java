package com.yygx.work.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "medicineListInfo", schema = "backup_b", catalog = "")
public class MedicineListInfoEntity {
    private int medicineNum;
    private String medicineName;
    private String medicineAmount;
    private String packingUnit;
    private String producer;
    private String medicineDoseType;
    private String medicineType;
    private double medicinePrice;
    private String helpMemNum;
    private String createTime;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "medicine_num")
    public int getMedicineNum() {
        return medicineNum;
    }

    public void setMedicineNum(int medicineNum) {
        this.medicineNum = medicineNum;
    }

    @Basic
    @Column(name = "medicine_name")
    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    @Basic
    @Column(name = "medicine_amount")
    public String getMedicineAmount() {
        return medicineAmount;
    }

    public void setMedicineAmount(String medicineAmount) {
        this.medicineAmount = medicineAmount;
    }

    @Basic
    @Column(name = "packing_unit")
    public String getPackingUnit() {
        return packingUnit;
    }

    public void setPackingUnit(String packingUnit) {
        this.packingUnit = packingUnit;
    }

    @Basic
    @Column(name = "producer")
    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Basic
    @Column(name = "medicine_dose_type")
    public String getMedicineDoseType() {
        return medicineDoseType;
    }

    public void setMedicineDoseType(String medicineDoseType) {
        this.medicineDoseType = medicineDoseType;
    }

    @Basic
    @Column(name = "medicine_type")
    public String getMedicineType() {
        return medicineType;
    }

    public void setMedicineType(String medicineType) {
        this.medicineType = medicineType;
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
    @Column(name = "help_mem_num")
    public String getHelpMemNum() {
        return helpMemNum;
    }

    public void setHelpMemNum(String helpMemNum) {
        this.helpMemNum = helpMemNum;
    }

    @Basic
    @Column(name = "create_time")
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedicineListInfoEntity that = (MedicineListInfoEntity) o;
        return medicineNum == that.medicineNum &&
                Double.compare(that.medicinePrice, medicinePrice) == 0 &&
                Objects.equals(medicineName, that.medicineName) &&
                Objects.equals(medicineAmount, that.medicineAmount) &&
                Objects.equals(packingUnit, that.packingUnit) &&
                Objects.equals(producer, that.producer) &&
                Objects.equals(medicineDoseType, that.medicineDoseType) &&
                Objects.equals(medicineType, that.medicineType) &&
                Objects.equals(helpMemNum, that.helpMemNum) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(medicineNum, medicineName, medicineAmount, packingUnit, producer, medicineDoseType, medicineType, medicinePrice, helpMemNum, createTime);
    }
}
