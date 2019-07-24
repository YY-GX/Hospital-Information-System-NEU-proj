package com.yygx.work.Repository;

import com.yygx.work.Entity.MedicalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalRepository extends JpaRepository<MedicalEntity, Integer> {
    public MedicalEntity findById(int id);
}
