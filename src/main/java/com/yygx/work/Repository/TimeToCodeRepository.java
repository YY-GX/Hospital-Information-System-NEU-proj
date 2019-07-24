package com.yygx.work.Repository;

import com.yygx.work.Entity.TimeToCodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TimeToCodeRepository extends JpaRepository<TimeToCodeEntity, String> {
    @Query(value = "select time_code from timeToCode where actual_time = ?1", nativeQuery = true)
    public int toTomeCode(String actualTime);

    @Query(value = "select actual_time from timeToCode where time_code = ?1", nativeQuery = true)
    public String toActualTime(int timeCode);
}
