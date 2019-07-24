package com.yygx.work.Service.Impl;

import com.yygx.work.Repository.WesMedicineTempRepository;
import com.yygx.work.Service.WesMedicineTempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WesMedicineTempServiceImpl implements WesMedicineTempService {
    @Autowired
    WesMedicineTempRepository wesMedicineTempRepository;
}
