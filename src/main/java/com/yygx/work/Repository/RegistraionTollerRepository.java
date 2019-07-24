package com.yygx.work.Repository;

import com.yygx.work.Entity.RegistrationTollerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistraionTollerRepository extends JpaRepository<RegistrationTollerEntity, Integer> {
    public RegistrationTollerEntity findByLoginName(String loginName);
}
