package com.yygx.work.Service;

import com.yygx.work.Entity.WesMedicineTempEntity;

import java.util.HashMap;

public interface WesMedicineTempService {
    public HashMap<String, WesMedicineTempEntity> addTemp(HashMap<String, Object> newTemp);
}
