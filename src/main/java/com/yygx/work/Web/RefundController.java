package com.yygx.work.Web;

import com.yygx.work.Service.MedicalService;
import com.yygx.work.Service.RegistrationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;

@RestController
public class RefundController {
    @Resource
    RegistrationService registrationService;
    @Resource
    MedicalService medicalService;

    @GetMapping("/refund/searchByMedicalId")
    public HashMap<String, Object> sendByMedicalId(@RequestParam HashMap<String, String> id) {
        int medicalId = Integer.parseInt(id.get("medicalId"));
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("list", registrationService.sendBackByMedicalId(medicalId));
        hashMap.put("medicalInfo", medicalService.sendBackByMedicalId(medicalId));
        return hashMap;
    }

    @GetMapping("/refund/decideState")
    public HashMap<String, String> decideState(@RequestParam HashMap<String, String> id) {
        int regisId = Integer.parseInt(id.get("regisId"));
        return registrationService.refund(regisId);
    }
}
