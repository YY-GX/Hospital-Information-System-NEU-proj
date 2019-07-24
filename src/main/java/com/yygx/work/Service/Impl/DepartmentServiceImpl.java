package com.yygx.work.Service.Impl;

import com.yygx.work.Entity.DepartmentEntity;
import com.yygx.work.Repository.DepartmentRepository;
import com.yygx.work.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

//    返回所有的科室信息
    public List<DepartmentEntity> sendDepartment() {
        return departmentRepository.findAll();
    }
}
