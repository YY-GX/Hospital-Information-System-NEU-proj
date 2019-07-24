package com.yygx.work.Repository;

import com.yygx.work.Entity.RegistrationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RegistrationRepository extends JpaRepository<RegistrationEntity, Integer> {
    public RegistrationEntity findFirstByOrderByRegisIdDesc();

    @Query(value = "SELECT count(regis_id) FROM registration WHERE time=?1 AND outdoctor_id=?2", nativeQuery = true)
    public int findDayDoctorNum(String time, int outdoctorId);

    public List<RegistrationEntity> findAllByMedicalNum(int medicalId);

    public RegistrationEntity findByRegisId(int regisId);

//    更新挂号状态为退号
    @Query(value = "UPDATE registration set regis_state = '2' where regis_id = ?1", nativeQuery = true)
    @Modifying
    public void updateRegisStateRefund(int regisId);

//    更新挂号状态为已诊
    @Query(value = "UPDATE registration set regis_state = '3' where regis_id = ?1", nativeQuery = true)
    @Modifying
    public void updateRegisStateDone(int regisId);

    @Query(value = "SELECT regis_id, medical_num, patient_id, name, sex, age, age_type FROM registration JOIN medical USING (medical_num) WHERE outdoctor_id = ?1 AND time = ?2 AND regis_state = 1", nativeQuery = true)
    @Modifying
    public List<Object> joinRegistrationMedicalTodo(int outdoctorId, String time);

    @Query(value = "SELECT regis_id, medical_num, patient_id, name, sex, age, age_type FROM registration JOIN medical USING (medical_num) WHERE outdoctor_id = ?1 AND time = ?2 AND regis_state = 3", nativeQuery = true)
    @Modifying
    public List<Object> joinRegistrationMedicalDone(int outdoctorId, String time);
}
