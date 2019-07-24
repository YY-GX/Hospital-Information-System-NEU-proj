package com.yygx.work.Service.Impl;

import com.yygx.work.Repository.OutcomeRepository;
import com.yygx.work.Service.OutcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OutcomeServiceImpl implements OutcomeService {
    @Autowired
    OutcomeRepository outcomeRepository;


}
