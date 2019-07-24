package com.yygx.work.Service.Impl;

import com.yygx.work.Entity.WesMedicineDetailEntity;
import com.yygx.work.Repository.WesMedicineDetailRepository;
import com.yygx.work.Service.WesMedicineDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class WesMedicineDetailServiceImpl implements WesMedicineDetailService {
    @Autowired
    WesMedicineDetailRepository wesMedicineDetailRepository;

    public HashMap<String, String> addMeedicineDetail(HashMap<String, String> medicineDetail) {
        String useWay = medicineDetail.get("useWay");
        String amount = medicineDetail.get("amount");
        String frequent = medicineDetail.get("frequent");
        int number = Integer.parseInt(medicineDetail.get("number"));
        int medicineNum = Integer.parseInt(medicineDetail.get("medicineNum"));
        int wesMedicineId = Integer.parseInt(medicineDetail.get("medicineId"));
        int feeState = 0;
        WesMedicineDetailEntity wesMedicineDetailEntity = new WesMedicineDetailEntity(useWay, amount, frequent, number, medicineNum, wesMedicineId, feeState);
        wesMedicineDetailRepository.save(wesMedicineDetailEntity);
        int wesMedicineDetailId = wesMedicineDetailRepository.findFirstByOrderByWesMedicineDetailIdDesc().getWesMedicineDetailId();
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("medicineDetailId", wesMedicineDetailId + "");
        return hashMap;
    }

    public String deleteMedicineDetail(HashMap<String, String> medicineDetailId) {
        int id = Integer.parseInt(medicineDetailId.get("medicineDetailId"));
        wesMedicineDetailRepository.deleteById(id);
        return "success";
    }

}
