package com.yygx.work.Repository;

import com.yygx.work.Entity.WesMedicineEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WesMedicineRepository extends JpaRepository<WesMedicineEntity, Integer> {
    public WesMedicineEntity findFirstByOrderByWesMedicineIdDesc();
}
