package com.yygx.work.Repository;

import com.yygx.work.Entity.WesMedicineTempDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface WesMedicineTempDetailRepository extends JpaRepository<WesMedicineTempDetailEntity, Integer> {
    public List<WesMedicineTempDetailEntity> findAllByMedicalTechTempName(int medicineTempId);
}
