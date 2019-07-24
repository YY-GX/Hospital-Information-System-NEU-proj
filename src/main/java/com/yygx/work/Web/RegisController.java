package com.yygx.work.Web;

import com.yygx.work.Entity.DepartmentEntity;
import com.yygx.work.Entity.OutdoctorEntity;
import com.yygx.work.Service.DepartmentService;
import com.yygx.work.Service.MedicalService;
import com.yygx.work.Service.OutdoctorService;
import com.yygx.work.Service.RegistrationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@RestController
public class RegisController {
    @Resource
    MedicalService medicalService;
    @Resource
    DepartmentService departmentService;
    @Resource
    OutdoctorService outdoctorService;
    @Resource
    RegistrationService registrationService;

//    发送最新的病历号给前端
    @RequestMapping("/regis/maxMedicalId")
    public HashMap<String,String> sendMaxMedicalId() {
        return medicalService.sendMaxMedicalId();
    }

//    发送所有的科室信息
    @RequestMapping("/regis/department")
    public List<DepartmentEntity> sendDeparment() {
        return departmentService.sendDepartment();
    }

//    检测前端发来的病历id是否已经有了
    @GetMapping("/regis/isInList")
    public HashMap<String, Object> isInList(@RequestParam HashMap<String, String> id) {
        int medicalId = Integer.parseInt(id.get("medicalId"));
        return medicalService.isInList(medicalId);
    }

//    将符合要求的医生列表返回
    @GetMapping("/regis/doctorList")
    public List<OutdoctorEntity> doctorList(@RequestParam HashMap<String, String> levDep) {
        return outdoctorService.findDoctorList(levDep);
    }

//    将前端填写的挂号信息存到数据库并返回挂号费
    @GetMapping("/regis/regisInfo")
    public HashMap<String, String> saveInfo(@RequestParam HashMap<String, String> regisInfo) {
        return registrationService.saveRegiInfo(regisInfo);
    }

}
