package com.yygx.work.Web;

import com.yygx.work.Service.WesMedicineDetailService;
import com.yygx.work.Service.WesMedicineService;
import com.yygx.work.Service.WesMedicineTempDetailService;
import com.yygx.work.Service.WesMedicineTempService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;

@RestController
public class setMedicineController {
    @Resource
    WesMedicineService wesMedicineService;
    @Resource
    WesMedicineDetailService wesMedicineDetailService;
    @Resource
    WesMedicineTempService wesMedicineTempService;
    @Resource
    WesMedicineTempDetailService wesMedicineTempDetailService;

    @GetMapping("/setMedicine/initial")
    public HashMap<String, Object> initial(@RequestParam HashMap<String, String> regisId) {
        return wesMedicineService.initial(regisId);
    }

    @GetMapping("/sendMedicine/addMedicineDetail")
    public HashMap<String, String> addMedicineDetail(@RequestParam HashMap<String, String> medicineDetail) {
        return wesMedicineDetailService.addMeedicineDetail(medicineDetail);
    }

    @GetMapping("/sendMedicine/deleteMedicineDetail")
    public String deleteMedicineDetail(@RequestParam HashMap<String, String> medicineDetail) {
        return wesMedicineDetailService.deleteMedicineDetail(medicineDetail);
    }

    @GetMapping("/sendMedicine/addMedicine")
    public HashMap<String, String> addMedicine(@RequestParam HashMap<String, String> regisId) {
        return wesMedicineService.addMedicine(regisId);
    }
}
