package com.yygx.work.Service.Impl;

import com.yygx.work.Entity.RegistrationEntity;
import com.yygx.work.Repository.ChargeDetailRepository;
import com.yygx.work.Repository.DiseaseRepository;
import com.yygx.work.Repository.RegistrationRepository;
import com.yygx.work.Repository.TimeToCodeRepository;
import com.yygx.work.Service.MedicalService;
import com.yygx.work.Service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class RegistrationServiceImpl implements RegistrationService {
    public int registrationTollerId = RegistrationTollerServiceImpl.registrationTollerId;
    public static int outdoctorId = OutdoctorServiceImpl.outdoctorId;


    @Autowired
    RegistrationRepository registrationRepository;
    @Autowired
    ChargeDetailRepository chargeDetailRepository;
    @Autowired
    TimeToCodeRepository timeToCodeRepository;
    @Autowired
    DiseaseRepository diseaseRepository;

    @Resource
    MedicalService medicalService;

    @Transactional
    public HashMap<String, String> saveRegiInfo(HashMap<String, String> regisInfo) {
        String payType = regisInfo.get("payType");
        String regisLevel = regisInfo.get("regisLevel");
        String isMedicalBook = regisInfo.get("isMedicalBook");
        int outdoctorId =  Integer.parseInt(regisInfo.get("doctorId"));
        int medicalNum =  Integer.parseInt(regisInfo.get("medicalId"));
        int regisDepartment =  Integer.parseInt(regisInfo.get("departmentId"));

        Date date = new Date();//此时date为当前的时间
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY/M/d");//设置当前时间的格式，为年-月-日
        String time = dateFormat.format(date);
        time = timeToCodeRepository.toTomeCode(time) + "";

        String morOrAft =  regisInfo.get("morOrAft");

        SimpleDateFormat dateFormat_min = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        String regisAccTime =  dateFormat_min.format(date);

        String regisState =  "1";
        System.out.println(registrationTollerId);
        RegistrationEntity registrationEntity = new RegistrationEntity(payType, regisLevel, isMedicalBook, outdoctorId, medicalNum, registrationTollerId, regisDepartment, time, morOrAft, regisAccTime, regisState);
//        保存挂号信息
        registrationRepository.save(registrationEntity);
        if (!MedicalServiceImpl.isInList) {
//            需要添加病历信息
            medicalService.saveMedicalInfo(regisInfo);
        }
        System.out.println(registrationRepository.findFirstByOrderByRegisIdDesc().getRegisId());

//        利用费用明细视图计算费用
        double regisPay =  chargeDetailRepository.findFee(registrationRepository.findFirstByOrderByRegisIdDesc().getRegisId(), 4);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("regisFee", regisPay + "");
        return hashMap;
    }

    public List<RegistrationEntity> sendBackByMedicalId(int medicalId) {
        return registrationRepository.findAllByMedicalNum(medicalId);
    }

//    退号，根据挂号状态判断返回值
    @Transactional
    public HashMap<String, String> refund(int regisId) {
        RegistrationEntity registrationEntity = registrationRepository.findByRegisId(regisId);
        String regisState = registrationEntity.getRegisState();
        HashMap<String, String> hashMap = new HashMap<>();
        if (regisState.equals("2")) {
            hashMap.put("state", "fail");
            hashMap.put("stateNumber", "2");
        } else if (regisState.equals("3")) {
            hashMap.put("state", "fail");
            hashMap.put("stateNumber", "3");
        } else if (regisState.equals("1")) {
            hashMap.put("state", "success");
            hashMap.put("stateNumber", "1");
            registrationRepository.updateRegisStateRefund(regisId);
        }
        return hashMap;
    }

//    将当日的该医生的待诊患者以及已诊患者还有疾病get到
    public HashMap<String, Object> todoDonePatientDisease() {
        Date date=new Date();//此时date为当前的时间
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY/M/d");//设置当前时间的格式，为年-月-日
        String time = dateFormat.format(date);
        time = timeToCodeRepository.toTomeCode(time) + "";
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("todo", registrationRepository.joinRegistrationMedicalTodo(outdoctorId, time));
        hashMap.put("done", registrationRepository.joinRegistrationMedicalDone(outdoctorId, time));
        hashMap.put("diseaseList", diseaseRepository.findAll());
        return hashMap;
    }
}
