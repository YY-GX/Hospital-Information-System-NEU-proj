package com.yygx.work.Repository;

import com.yygx.work.Entity.WesMedicineDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import java.util.List;

public interface WesMedicineDetailRepository extends JpaRepository<WesMedicineDetailEntity, Integer> {
    public WesMedicineDetailEntity findFirstByOrderByWesMedicineDetailIdDesc();

    @Modifying
    public void deleteAllByWesMedicineId(int wesMedicineId);


}
