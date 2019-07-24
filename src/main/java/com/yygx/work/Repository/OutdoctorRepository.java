package com.yygx.work.Repository;

import com.yygx.work.Entity.OutdoctorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OutdoctorRepository extends JpaRepository<OutdoctorEntity, Integer> {
    public List<OutdoctorEntity> findByRegisLevelAndDepartmentNum(int regisLevel, int departmentNum);

    public OutdoctorEntity findByLoginName(String loginName);
}
