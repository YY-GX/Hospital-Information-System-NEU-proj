package com.yygx.work.Web;

import com.yygx.work.Service.InvoiceService;
import com.yygx.work.Service.RegistrationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;

@RestController
public class ChargeController {
    @Resource
    RegistrationService registrationService;
    @Resource
    InvoiceService invoiceService;

    @GetMapping("/charge/display")
    public HashMap<String, Object> display(@RequestParam HashMap<String, String> medicalId) {
        return registrationService.display(medicalId);
    }

    @GetMapping("/charge/addInvoice")
    public String addInvoice(@RequestParam HashMap<String, String> fee) {
        return invoiceService.addInvoice(fee);
    }
}
