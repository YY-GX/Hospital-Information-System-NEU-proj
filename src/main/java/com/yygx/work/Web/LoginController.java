package com.yygx.work.Web;

import com.yygx.work.Service.OutdoctorService;
import com.yygx.work.Service.RegistraionTollerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;

@RestController
public class LoginController {
    @Resource
    RegistraionTollerService registraionTollerService;
    @Resource
    OutdoctorService outdoctorService;

    @PostMapping("/login/validateDoctor")
    public String validateDoctor(@RequestParam HashMap<String, String> usrPwd) {
        return outdoctorService.validate(usrPwd);
    }

    @PostMapping("/login/validateRegistrationToller")
    public String validateRegistrationToller(@RequestParam HashMap<String, String> usrPwd) {
        return registraionTollerService.validate(usrPwd);
    }

    @GetMapping("/login/successDoctorUserName")
    public String getDoctorUserName(@RequestParam HashMap<String, String> userName) {
        outdoctorService.setUsrId(userName);
        return "Get username!";
    }

    @GetMapping("/login/successTollerUserName")
    public String getTollerUserName(@RequestParam HashMap<String, String> userName) {
        registraionTollerService.setUsrId(userName);
        return "Get username!";
    }
}
