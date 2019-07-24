package com.yygx.work.Repository;

import com.yygx.work.Entity.WesMedicineTempEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WesMedicineTempRepository extends JpaRepository<WesMedicineTempEntity, Integer> {
    public WesMedicineTempEntity findFirstByOrderByWesMedicineTempNameDesc();
}
