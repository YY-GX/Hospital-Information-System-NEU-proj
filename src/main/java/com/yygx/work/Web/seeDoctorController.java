package com.yygx.work.Web;

import com.yygx.work.Service.MedicalHomeService;
import com.yygx.work.Service.MedicalService;
import com.yygx.work.Service.RegistrationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;

@RestController
public class seeDoctorController {
    @Resource
    RegistrationService registrationService;
    @Resource
    MedicalHomeService medicalHomeService;

    @GetMapping("/seeDoctor/todoDonePatientDisease")
    public HashMap<String, Object> todoDonePatientDisease() {
        return registrationService.todoDonePatientDisease();
    }

    @PostMapping("/seeDoctor/medicalHomeInfo")
    public String medicalHomeInfo(@RequestBody HashMap<String, Object> medicalHomeInfo) {
        return medicalHomeService.setMedicalHomeInfo(medicalHomeInfo);
    }

}
