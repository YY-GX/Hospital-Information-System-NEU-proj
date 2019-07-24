package com.yygx.work.Repository;

import com.yygx.work.Entity.WesMedicineEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface WesMedicineRepository extends JpaRepository<WesMedicineEntity, Integer> {
    public WesMedicineEntity findFirstByOrderByWesMedicineIdDesc();

    @Query(value = "UPDATE wesMedicine set state = 1 where wes_medicine_id = ?1", nativeQuery = true)
    @Modifying
    public void changeState(int medicineId);
}
