package com.yygx.work.Service;

import java.util.HashMap;

public interface WesMedicineService {
    public HashMap<String, Object> initial(HashMap<String, String> regisId);

    public HashMap<String, String> addMedicine(HashMap<String, String> regisId);

    public String deleteMedicine(HashMap<String, String> medicineId);

    public String start(HashMap<String, String> medicineId);
}
