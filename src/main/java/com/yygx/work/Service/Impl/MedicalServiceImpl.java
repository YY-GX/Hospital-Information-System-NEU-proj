package com.yygx.work.Service.Impl;

import com.yygx.work.Entity.MedicalEntity;
import com.yygx.work.Repository.MedicalRepository;
import com.yygx.work.Service.MedicalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class MedicalServiceImpl implements MedicalService {
//    该变量说明是否需要在病历中添加新信息,false就是要,true就是不要
    public static boolean isInList = false;

    @Autowired
    MedicalRepository medicalRepository;

//    查找最大的病历号
    public HashMap<String, String> sendMaxMedicalId() {
        List<MedicalEntity> ls = medicalRepository.findAll();
        int max_medical_id = 0;
        for (int i = 0; i < ls.size(); i++) {
            if (max_medical_id < ls.get(i).getMedicalNum()) {
                max_medical_id = ls.get(i).getMedicalNum();
            }
        }
        max_medical_id += 1;
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("medicalId", "" + max_medical_id);
        return hashMap;
    }

    public HashMap<String, Object> isInList(int medicalId) {
        MedicalEntity medicalEntity = medicalRepository.findById(medicalId);
        HashMap<String, Object> hashMap = new HashMap<>();
//        病历号不在表中
        if (medicalEntity == null) {
            hashMap.put("state", "notIn");
            hashMap.put("data", null);
        }
//        病历号在表中
        else {
            hashMap.put("state", "In");
            hashMap.put("data", medicalEntity);
            isInList = true;
        }
        return hashMap;
    }

//    如果是新的病历号,需要添加病历号
    public void saveMedicalInfo(HashMap<String, String> regisInfo) {
        String patientId = regisInfo.get("patientId");
        String name = regisInfo.get("name");
        String sex = regisInfo.get("sex");
        int age = Integer.parseInt(regisInfo.get("age"));
        String birthday = regisInfo.get("birthday");
        String address = regisInfo.get("address");
        String ageType = regisInfo.get("ageType");
        MedicalEntity medicalEntity = new MedicalEntity(patientId, name, sex, age, birthday, address, ageType);
        medicalRepository.save(medicalEntity);
    }

    public MedicalEntity sendBackByMedicalId(int medicalId){
        return medicalRepository.findById(medicalId);
    }
}
