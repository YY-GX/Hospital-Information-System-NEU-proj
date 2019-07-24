package com.yygx.work.Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "timeToCode", schema = "backup_b", catalog = "")
public class TimeToCodeEntity {
    private String actualTime;
    private int timeCode;

    @Id
    @Column(name = "actual_time")
    public String getActualTime() {
        return actualTime;
    }

    public void setActualTime(String actualTime) {
        this.actualTime = actualTime;
    }

    @Basic
    @Column(name = "time_code")
    public int getTimeCode() {
        return timeCode;
    }

    public void setTimeCode(int timeCode) {
        this.timeCode = timeCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TimeToCodeEntity that = (TimeToCodeEntity) o;
        return timeCode == that.timeCode &&
                Objects.equals(actualTime, that.actualTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actualTime, timeCode);
    }
}
