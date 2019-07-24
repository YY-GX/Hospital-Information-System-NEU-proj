package com.yygx.work.Service.Impl;

import com.yygx.work.Entity.OutdoctorEntity;
import com.yygx.work.Entity.RegistrationTollerEntity;
import com.yygx.work.Repository.OutdoctorRepository;
import com.yygx.work.Repository.RegisLevelRepository;
import com.yygx.work.Repository.RegistrationRepository;
import com.yygx.work.Repository.TimeToCodeRepository;
import com.yygx.work.Service.OutdoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class OutdoctorServiceImpl implements OutdoctorService {
    public static int outdoctorId = -1;

    @Autowired
    OutdoctorRepository outdoctorRepository;
    @Autowired
    RegisLevelRepository regisLevelRepository;
    @Autowired
    RegistrationRepository registrationRepository;
    @Autowired
    TimeToCodeRepository timeToCodeRepository;


    public List<OutdoctorEntity> findDoctorList(HashMap<String, String> levDep) {
        int regisLevel = Integer.parseInt(levDep.get("regisLevel"));
        int departmentId = Integer.parseInt(levDep.get("departmentId"));
        Date date=new Date();//此时date为当前的时间
        SimpleDateFormat dateFormat = new SimpleDateFormat("YYYY/M/d");//设置当前时间的格式，为年-月-日
        String time = dateFormat.format(date);
        time = timeToCodeRepository.toTomeCode(time) + "";
        List<OutdoctorEntity> ls = outdoctorRepository.findByRegisLevelAndDepartmentNum(regisLevel, departmentId);
        List<OutdoctorEntity> filteredLs = new ArrayList<>();
        for (OutdoctorEntity outdoctorEntity: ls
             ) {
//            当天该医生的门诊人数
            int num = registrationRepository.findDayDoctorNum(time, outdoctorEntity.getOutdoctorId());
//            该医生的限额人数
            int restriction = regisLevelRepository.findByRegisLevelId(outdoctorEntity.getRegisLevel()).getRestriction();
//            小于限额人数的医生会被加到列表中
            if (num < restriction) {
                filteredLs.add(outdoctorEntity);
            }
        }
        return filteredLs;
    }

    public String validate(HashMap<String, String> usrPwd) {
        String userName = usrPwd.get("userName");
        String password = usrPwd.get("password");
        OutdoctorEntity outdoctorEntity = outdoctorRepository.findByLoginName(userName);
//        没有该用户名,返回fail
        if (outdoctorEntity== null) {
            return "fail";
        }
//        有用户名,验证密码是否一致,一致返回success,否则返回fail
        if (outdoctorEntity.getPassword().equals(password)) {
            return "success";
        } else {
            return "fail";
        }
    }

    //    根据前端传回的用户名找到挂号员id并set到静态属性变量中
    public void setUsrId(HashMap<String, String> username) {
        String userName = username.get("userName");
        OutdoctorEntity outdoctorEntity = outdoctorRepository.findByLoginName(userName);
        outdoctorId = outdoctorEntity.getOutdoctorId();
    }
}
