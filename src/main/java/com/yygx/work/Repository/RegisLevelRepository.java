package com.yygx.work.Repository;

import com.yygx.work.Entity.RegisLevelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisLevelRepository extends JpaRepository<RegisLevelEntity, Integer> {
    public RegisLevelEntity findByRegisLevelId(int id);
}
