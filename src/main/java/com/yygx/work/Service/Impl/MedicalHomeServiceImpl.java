package com.yygx.work.Service.Impl;

import com.yygx.work.Entity.DiseaseEntity;
import com.yygx.work.Entity.MedicalHomeEntity;
import com.yygx.work.Entity.OutcomeEntity;
import com.yygx.work.Repository.MedicalHomeRepository;
import com.yygx.work.Repository.OutcomeRepository;
import com.yygx.work.Repository.RegistrationRepository;
import com.yygx.work.Service.MedicalHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.HashMap;
import java.util.List;

@Service
public class MedicalHomeServiceImpl implements MedicalHomeService {
    public static int outdoctorId = OutdoctorServiceImpl.outdoctorId;
    @Autowired
    MedicalHomeRepository medicalHomeRepository;
    @Autowired
    OutcomeRepository outcomeRepository;
    @Autowired
    RegistrationRepository registrationRepository;

    @Transactional
    public String setMedicalHomeInfo(HashMap<String, Object> medicalHomeInfo) {
        System.out.println(medicalHomeInfo);
        int regisId = Integer.parseInt((String)medicalHomeInfo.get("regisId"));
        String medicalNum = (String)medicalHomeInfo.get("medicalNum");
        String mainAsk = (String)medicalHomeInfo.get("mainAsk");
        String medicalHistory = (String)medicalHomeInfo.get("medicalHistory");
        String treatmentCond = (String)medicalHomeInfo.get("treatmentCond");
        String diseaseHistory = (String)medicalHomeInfo.get("diseaseHis");
        String allergyHistory = (String)medicalHomeInfo.get("allergyHis");
        String shapeCheck = (String)medicalHomeInfo.get("shapeCheck");
        String checkSuggestion = (String)medicalHomeInfo.get("checkSuggestion");
        String attention = (String)medicalHomeInfo.get("attention");
        String chinWes = (String)medicalHomeInfo.get("chinWes");

        List<HashMap<String, String>> diseaseList = (List<HashMap<String, String>>)medicalHomeInfo.get("diseaseList");

            MedicalHomeEntity medicalHomeEntity = new MedicalHomeEntity(regisId, medicalNum, mainAsk, medicalHistory, treatmentCond, diseaseHistory, allergyHistory, shapeCheck, checkSuggestion, attention, outdoctorId);
            medicalHomeRepository.save(medicalHomeEntity);
            int medicalHomeId = medicalHomeRepository.findFirstByOrderByMedicalHomeIdDesc().getMedicalHomeId();
        if (diseaseList != null) {
            for (HashMap<String, String> hashMap: diseaseList
            ) {
                String outcomeType = chinWes;
                String outcomeMedical = "1";
                int diseaseNum = Integer.parseInt(hashMap.get("diseaseNum"));
                OutcomeEntity outcomeEntity = new OutcomeEntity(outcomeType, outcomeMedical, regisId, outdoctorId, diseaseNum, medicalHomeId);
                outcomeRepository.save(outcomeEntity);
            }
            registrationRepository.updateRegisStateDone(regisId);
        }
        return "Get medicalHomeInfo!";

    }
}





