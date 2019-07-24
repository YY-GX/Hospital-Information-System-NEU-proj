package com.yygx.work.Repository;

import com.yygx.work.Entity.NumberEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface NumberEntityRepository extends JpaRepository<NumberEntity, Integer> {
    NumberEntity findById(int id);

    @Query(value = "UPDATE number set number_code = ?1 where number_id = ?2", nativeQuery = true)
    @Modifying
    public void updateOne(String numberCode, int id);
}
