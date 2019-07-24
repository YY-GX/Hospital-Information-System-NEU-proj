package com.yygx.work.Repository;

import com.yygx.work.Entity.WesMedicineDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WesMedicineDetailRepository extends JpaRepository<WesMedicineDetailEntity, Integer> {
    public WesMedicineDetailEntity findFirstByOrderByWesMedicineDetailIdDesc();


}
