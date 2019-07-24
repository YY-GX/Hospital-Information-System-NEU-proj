package com.yygx.work.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "nonMedicineInfo", schema = "backup_b", catalog = "")
public class NonMedicineInfoEntity {
    private int programId;
    private String programName;
    private String amount;
    private double price;
    private String memNum;
    private int programType;
    private String createTime;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "program_id")
    public int getProgramId() {
        return programId;
    }

    public void setProgramId(int programId) {
        this.programId = programId;
    }

    @Basic
    @Column(name = "program_name")
    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
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
    @Column(name = "price")
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "mem_num")
    public String getMemNum() {
        return memNum;
    }

    public void setMemNum(String memNum) {
        this.memNum = memNum;
    }

    @Basic
    @Column(name = "program_type")
    public int getProgramType() {
        return programType;
    }

    public void setProgramType(int programType) {
        this.programType = programType;
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
        NonMedicineInfoEntity that = (NonMedicineInfoEntity) o;
        return programId == that.programId &&
                Double.compare(that.price, price) == 0 &&
                programType == that.programType &&
                Objects.equals(programName, that.programName) &&
                Objects.equals(amount, that.amount) &&
                Objects.equals(memNum, that.memNum) &&
                Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(programId, programName, amount, price, memNum, programType, createTime);
    }
}
