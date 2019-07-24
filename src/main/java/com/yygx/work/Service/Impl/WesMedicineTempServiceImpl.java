package com.yygx.work.Service.Impl;

import com.yygx.work.Entity.WesMedicineTempDetailEntity;
import com.yygx.work.Entity.WesMedicineTempEntity;
import com.yygx.work.Repository.WesMedicineTempDetailRepository;
import com.yygx.work.Repository.WesMedicineTempRepository;
import com.yygx.work.Service.WesMedicineTempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class WesMedicineTempServiceImpl implements WesMedicineTempService {
    public static int outdoctorId = OutdoctorServiceImpl.outdoctorId;
    @Autowired
    WesMedicineTempRepository wesMedicineTempRepository;
    @Autowired
    WesMedicineTempDetailRepository wesMedicineTempDetailRepository;

    public HashMap<String, WesMedicineTempEntity> addTemp(HashMap<String, Object> newTemp) {
        List<HashMap<String, String>> tempDetailList = (List<HashMap<String, String>>) newTemp.get("tempDetailList");
        String range = (String)newTemp.get("range");
        String name = (String)newTemp.get("name");

        Date date = new Date();//此时date为当前的时间
        SimpleDateFormat dateFormat_min = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss");
        String regisAccTime =  dateFormat_min.format(date);
        WesMedicineTempEntity wesMedicineTempEntity = new WesMedicineTempEntity(range, regisAccTime, outdoctorId, name);
        wesMedicineTempRepository.save(wesMedicineTempEntity);
        int wesMedicineTempId = wesMedicineTempRepository.findFirstByOrderByWesMedicineTempNameDesc().getWesMedicineTempName();
        for (HashMap<String, String> h: tempDetailList
             ) {
            String useWay = h.get("useWay");
            String amount = h.get("amount");
            String frequent = h.get("frequent");
            int number = Integer.parseInt(h.get("number"));
            int medicineNum = Integer.parseInt(h.get("medicineNum"));
            int medicalTechTempName = wesMedicineTempId;
            WesMedicineTempDetailEntity wesMedicineTempDetailEntity = new WesMedicineTempDetailEntity(useWay, amount, frequent, number, medicineNum, medicalTechTempName);
            wesMedicineTempDetailRepository.save(wesMedicineTempDetailEntity);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("temp", wesMedicineTempRepository.findFirstByOrderByWesMedicineTempNameDesc());
        return hashMap;
    }
}
