package com.yygx.work.Service;

import com.yygx.work.Entity.MedicalEntity;

import java.util.HashMap;

public interface MedicalService {
    public HashMap<String, String> sendMaxMedicalId();

    public HashMap<String, Object> isInList(int medicalId);

    public void saveMedicalInfo(HashMap<String, String> regisInfo);

    public MedicalEntity sendBackByMedicalId(int medicalId);
}
