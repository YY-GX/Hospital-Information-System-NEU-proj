package com.yygx.work.Web;

import com.yygx.work.Entity.WesMedicineTempEntity;
import com.yygx.work.Service.WesMedicineDetailService;
import com.yygx.work.Service.WesMedicineService;
import com.yygx.work.Service.WesMedicineTempService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/sendMedicine/deleteMedicine")
    public String deleteMedicine(@RequestParam HashMap<String, String> medicineId) {
        return wesMedicineService.deleteMedicine(medicineId);
    }

    @GetMapping("/sendMedicine/start")
    public String start(@RequestParam HashMap<String, String> medicineId) {
        return wesMedicineService.start(medicineId);
    }

    @GetMapping("/sendMedicine/useTemp")
    public String useTemp(@RequestParam HashMap<String, String> ids) {
        return wesMedicineDetailService.useTemp(ids);
    }

    @PostMapping("/sendMedicine/addTemp")
    public HashMap<String, WesMedicineTempEntity> addTemp(@RequestBody HashMap<String, Object> temp) {
        return wesMedicineTempService.addTemp(temp);
    }

}
