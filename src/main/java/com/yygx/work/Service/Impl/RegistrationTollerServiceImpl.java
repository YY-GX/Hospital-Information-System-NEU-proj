package com.yygx.work.Service.Impl;

import com.yygx.work.Entity.RegistrationTollerEntity;
import com.yygx.work.Repository.RegistraionTollerRepository;
import com.yygx.work.Service.RegistraionTollerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class RegistrationTollerServiceImpl implements RegistraionTollerService {
    public static int registrationTollerId = -1;

    @Autowired
    RegistraionTollerRepository registraionTollerRepository;

//    验证前端输入的用户名和密码和数据库中的是否一致
    public String validate(HashMap<String, String> usrPwd) {
        String userName = usrPwd.get("userName");
        String password = usrPwd.get("password");
        RegistrationTollerEntity registrationTollerEntity = registraionTollerRepository.findByLoginName(userName);
//        没有该用户名,返回fail
        if (registrationTollerEntity== null) {
            return "fail";
        }
//        有用户名,验证密码是否一致,一致返回success,否则返回fail
        if (registrationTollerEntity.getPassword().equals(password)) {
            return "success";
        } else {
            return "fail";
        }
    }

//    根据前端传回的用户名找到挂号员id并set到静态属性变量中
    public void setUsrId(HashMap<String, String> username) {
        String userName = username.get("userName");
        RegistrationTollerEntity registrationTollerEntity = registraionTollerRepository.findByLoginName(userName);
        registrationTollerId = registrationTollerEntity.getRegistrationTollerId();
    }
}
