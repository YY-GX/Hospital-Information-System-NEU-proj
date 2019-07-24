package com.yygx.work.Repository;

import com.yygx.work.Entity.ChargeDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ChargeDetailRepository extends JpaRepository<ChargeDetailEntity, Integer> {

    @Query(value = "SELECT regis_pay FROM chargeDetail WHERE regis_id=?1 AND chin_wes_pro_reg=?2", nativeQuery = true)
    public double findFee(int regisId, long chinWesProRes);

    @Query(value = "SELECT regis_id FROM chargeDetail WHERE regis_id=?1 AND chin_wes_pro_reg=2 AND fee_state = 0 AND state = 1", nativeQuery = true)
    public List<Integer> findNotPay(int regisId);
}
