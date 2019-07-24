package com.yygx.work.Repository;

import com.yygx.work.Entity.WesMedicineEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface WesMedicineRepository extends JpaRepository<WesMedicineEntity, Integer> {
    public WesMedicineEntity findFirstByOrderByWesMedicineIdDesc();

    @Query(value = "UPDATE wesMedicine set state = 1 where wes_medicine_id = ?1", nativeQuery = true)
    @Modifying
    public void changeState(int medicineId);

    public WesMedicineEntity findByRegisId(int regisId);

    @Query(value = "SELECT * FROM (SELECT medicine_price, wesMedicineDetail.number, medicine_num, wes_medicine_id, use_way, amount, frequent FROM wesMedicineDetail JOIN chargeDetail USING (medicine_num)) t1 JOIN wesMedicine USING (wes_medicine_id) WHERE wes_medicine_id = ?1", nativeQuery = true)
    @Modifying
    public List<Object> joinRegistrationMedicine(int medicineId);

    @Query(value = "UPDATE wesMedicine SET state = 2 WHERE wes_medicine_id = ?1", nativeQuery = true)
    @Modifying
    public void updateState(int medicineId);
}
