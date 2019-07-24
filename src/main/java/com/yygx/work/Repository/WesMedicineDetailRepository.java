package com.yygx.work.Repository;

import com.yygx.work.Entity.WesMedicineDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WesMedicineDetailRepository extends JpaRepository<WesMedicineDetailEntity, Integer> {
    public WesMedicineDetailEntity findFirstByOrderByWesMedicineDetailIdDesc();

    @Modifying
    public void deleteAllByWesMedicineId(int wesMedicineId);

    @Query(value = "UPDATE wesMedicineDetail set fee_state = 1 where wes_medicine_id = ?1", nativeQuery = true)
    @Modifying
    public void updateFeeState(int wesMedicineId);
}
