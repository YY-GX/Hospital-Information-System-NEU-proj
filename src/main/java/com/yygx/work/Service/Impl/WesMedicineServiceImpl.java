package com.yygx.work.Service.Impl;

import com.yygx.work.Entity.WesMedicineEntity;
import com.yygx.work.Repository.MedicineListInfoRepository;
import com.yygx.work.Repository.WesMedicineRepository;
import com.yygx.work.Repository.WesMedicineTempRepository;
import com.yygx.work.Service.WesMedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class WesMedicineServiceImpl implements WesMedicineService {
    @Autowired
    WesMedicineRepository wesMedicineRepository;
    @Autowired
    MedicineListInfoRepository medicineListInfoRepository;
    @Autowired
    WesMedicineTempRepository wesMedicineTempRepository;

    public HashMap<String, Object> initial(HashMap<String, String> regisId) {
        int id = Integer.parseInt(regisId.get("regisId"));
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("medicalInfoList", medicineListInfoRepository.findAll());
        hashMap.put("tempList", wesMedicineTempRepository.findAll());
        WesMedicineEntity wesMedicineEntity = new WesMedicineEntity(id, "0", "0");
        wesMedicineRepository.save(wesMedicineEntity);
        int wesMedicineId = wesMedicineRepository.findFirstByOrderByWesMedicineIdDesc().getWesMedicineId();
        hashMap.put("medicineId", wesMedicineId);
        return hashMap;
    }

    public HashMap<String, String> addMedicine(HashMap<String, String> regisId) {
        HashMap<String, String> hashMap = new HashMap<>();
        int id = Integer.parseInt(regisId.get("regisId"));
        WesMedicineEntity wesMedicineEntity = new WesMedicineEntity(id, "0", "0");
        wesMedicineRepository.save(wesMedicineEntity);
        int wesMedicineId = wesMedicineRepository.findFirstByOrderByWesMedicineIdDesc().getWesMedicineId();
        hashMap.put("medicineId", wesMedicineId + "");
        return hashMap;
    }
}
