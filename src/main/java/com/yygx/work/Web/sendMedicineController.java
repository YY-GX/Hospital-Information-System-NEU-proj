package com.yygx.work.Web;

import com.yygx.work.Service.RegistrationService;
import com.yygx.work.Service.WesMedicineService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;

@RestController
public class sendMedicineController {
    @Resource
    RegistrationService registrationService;
    @Resource
    WesMedicineService wesMedicineService;

    @GetMapping("/sendMedicine/initial")
    public HashMap<String, Object> display(@RequestParam HashMap<String, String> medicalId) {
        return registrationService.sendMedicine(medicalId);
    }

    @GetMapping("/sendMedicine/changeState")
    public String changeState(@RequestParam HashMap<String, String> medicineId) {
        return wesMedicineService.changeState(medicineId);
    }
}
