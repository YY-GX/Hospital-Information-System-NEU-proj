package com.yygx.work.Service;

import java.util.HashMap;

public interface RegistraionTollerService {
    public String validate(HashMap<String, String> usrPwd);

    public void setUsrId(HashMap<String, String> username);
}
