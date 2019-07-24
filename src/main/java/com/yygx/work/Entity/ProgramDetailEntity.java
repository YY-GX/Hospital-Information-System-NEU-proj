package com.yygx.work.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "programDetail", schema = "backup_b", catalog = "")
public class ProgramDetailEntity {
    private int programDetailId;
    private String times;
    private int listId;
    private int programId;
    private int feeState;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "program_detail_id")
    public int getProgramDetailId() {
        return programDetailId;
    }

    public void setProgramDetailId(int programDetailId) {
        this.programDetailId = programDetailId;
    }

    @Basic
    @Column(name = "times")
    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    @Basic
    @Column(name = "list_id")
    public int getListId() {
        return listId;
    }

    public void setListId(int listId) {
        this.listId = listId;
    }

    @Basic
    @Column(name = "program_id")
    public int getProgramId() {
        return programId;
    }

    public void setProgramId(int programId) {
        this.programId = programId;
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
        ProgramDetailEntity that = (ProgramDetailEntity) o;
        return programDetailId == that.programDetailId &&
                listId == that.listId &&
                programId == that.programId &&
                feeState == that.feeState &&
                Objects.equals(times, that.times);
    }

    @Override
    public int hashCode() {
        return Objects.hash(programDetailId, times, listId, programId, feeState);
    }
}
