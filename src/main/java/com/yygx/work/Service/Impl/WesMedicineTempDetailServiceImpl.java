package com.yygx.work.Service.Impl;

import com.yygx.work.Repository.WesMedicineTempDetailRepository;
import com.yygx.work.Service.WesMedicineTempDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WesMedicineTempDetailServiceImpl implements WesMedicineTempDetailService {
    @Autowired
    WesMedicineTempDetailRepository wesMedicineTempDetailRepository;
}
