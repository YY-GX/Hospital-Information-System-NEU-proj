package com.yygx.work.Service.Impl;

import com.yygx.work.Entity.WesMedicineDetailEntity;
import com.yygx.work.Entity.WesMedicineTempDetailEntity;
import com.yygx.work.Repository.WesMedicineDetailRepository;
import com.yygx.work.Repository.WesMedicineTempDetailRepository;
import com.yygx.work.Service.WesMedicineDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class WesMedicineDetailServiceImpl implements WesMedicineDetailService {
    @Autowired
    WesMedicineDetailRepository wesMedicineDetailRepository;
    @Autowired
    WesMedicineTempDetailRepository wesMedicineTempDetailRepository;

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

//    使用模板
    public String useTemp(HashMap<String, String> ids) {
        int medicineId = Integer.parseInt(ids.get("medicineId"));
        int tempId = Integer.parseInt(ids.get("tempId"));
        List<WesMedicineTempDetailEntity> wesMedicineTempDetailList = wesMedicineTempDetailRepository.findAllByMedicalTechTempName(tempId);
        for (WesMedicineTempDetailEntity wesMedicineTempDetailEntity: wesMedicineTempDetailList
             ) {
            String useWay = wesMedicineTempDetailEntity.getUseWay();
            String amount = wesMedicineTempDetailEntity.getAmount();
            String frequent = wesMedicineTempDetailEntity.getFrequent();
            int number = wesMedicineTempDetailEntity.getNumber();
            int medicineNum = wesMedicineTempDetailEntity.getMedicineNum();
            int wesMedicineId = medicineId;
            int feeState = 0;
            WesMedicineDetailEntity wesMedicineDetailEntity = new WesMedicineDetailEntity(useWay, amount, frequent, number, medicineNum, wesMedicineId, feeState);
            wesMedicineDetailRepository.save(wesMedicineDetailEntity);
        }

        return "success";
    }

}
