package com.yygx.work.Repository;

import com.yygx.work.Entity.ChargeDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface ChargeDetailRepository extends JpaRepository<ChargeDetailEntity, Integer> {

    @Query(value = "SELECT regis_pay FROM chargeDetail WHERE regis_id=?1 AND chin_wes_pro_reg=?2", nativeQuery = true)
    public double findFee(int regisId, long chinWesProRes);
}
