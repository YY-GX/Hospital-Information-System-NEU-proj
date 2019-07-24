package com.yygx.work.Service.Impl;

import com.yygx.work.Entity.NumberEntity;
import com.yygx.work.Repository.NumberEntityRepository;
import com.yygx.work.Service.NumberEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class NumberEntitySeriveImpl implements NumberEntityService {
    @Autowired
    NumberEntityRepository numberEntityRepository;

    public List<NumberEntity> getNumberEntityList() {
        return numberEntityRepository.findAll();
    }

    public void save(NumberEntity numberEntity) {
        numberEntityRepository.save(numberEntity);
    }

    public NumberEntity findById(int id) {
        return numberEntityRepository.findById(id);
    }

    public void deleteById(int id) {
        numberEntityRepository.deleteById(id);
    }

    @Transactional
    public String updateOne(@RequestParam("number_code") String numberCode, @RequestParam("number_id") int id) {
        numberEntityRepository.updateOne(numberCode, id);
        return "update success";
    }
}
