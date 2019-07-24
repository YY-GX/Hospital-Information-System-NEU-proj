package com.yygx.work.Service;

import java.util.HashMap;

public interface WesMedicineDetailService {
    public HashMap<String, String> addMeedicineDetail(HashMap<String, String> medicineDetail);

    public String deleteMedicineDetail(HashMap<String, String> medicineDetailId);

    public String useTemp(HashMap<String, String> ids);
}
