package com.yygx.work.Repository;

import com.yygx.work.Entity.MedicalHomeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalHomeRepository extends JpaRepository<MedicalHomeEntity, Integer> {
    public MedicalHomeEntity findFirstByOrderByMedicalHomeIdDesc();
}
