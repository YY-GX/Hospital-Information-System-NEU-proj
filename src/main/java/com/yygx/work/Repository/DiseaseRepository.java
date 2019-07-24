package com.yygx.work.Repository;

import com.yygx.work.Entity.DiseaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiseaseRepository extends JpaRepository<DiseaseEntity, Integer> {

}
