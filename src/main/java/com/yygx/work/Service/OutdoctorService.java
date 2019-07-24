package com.yygx.work.Service;

import com.yygx.work.Entity.OutdoctorEntity;

import java.util.HashMap;
import java.util.List;

public interface OutdoctorService {
    public List<OutdoctorEntity> findDoctorList(HashMap<String, String> levDep);

    public String validate(HashMap<String, String> usrPwd);

    public void setUsrId(HashMap<String, String> username);
}
