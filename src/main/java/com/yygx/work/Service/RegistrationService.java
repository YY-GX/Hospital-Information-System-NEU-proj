package com.yygx.work.Service;

import com.yygx.work.Entity.RegistrationEntity;

import java.util.HashMap;
import java.util.List;

public interface RegistrationService {
    public HashMap<String, String> saveRegiInfo(HashMap<String, String> regisInfo);

    public List<RegistrationEntity> sendBackByMedicalId(int medicalId);

    public HashMap<String, String> refund(int regisId);

    public HashMap<String, Object> todoDonePatientDisease();
}
