package com.yygx.work.Service;

import com.yygx.work.Entity.NumberEntity;

import java.util.List;


public interface NumberEntityService {
    public List<NumberEntity> getNumberEntityList();

    public void save(NumberEntity numberEntity);

    public NumberEntity findById(int id);

    public void deleteById(int id);

    public String updateOne(String numberCode, int id);
}
