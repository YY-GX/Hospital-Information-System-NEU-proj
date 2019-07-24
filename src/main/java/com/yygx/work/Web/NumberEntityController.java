package com.yygx.work.Web;

import com.yygx.work.Entity.NumberEntity;
import com.yygx.work.Service.NumberEntityService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@RestController("/number")
public class NumberEntityController {
    @Resource
    NumberEntityService numberEntityService;

    @GetMapping("/try")
    public void saveDataToNumber(NumberEntity numberEntity) {
//        System.out.println(numberEntity.getNumberId());
        System.out.println(numberEntity.getNumberCode());
        System.out.println(numberEntity.getNumberName());
        numberEntityService.save(numberEntity);
    }


    @RequestMapping("/number/send")
    public List<NumberEntity> send() {
        return numberEntityService.getNumberEntityList();
    }

    @GetMapping("/update")
    public String update(@RequestParam  HashMap<String, Object> updateParam) {
        System.out.println(updateParam);
        String number_code = (String)updateParam.get("numberCode");
        System.out.println(number_code);

        int number_id = Integer.parseInt((String)updateParam.get("numberId"));
        System.out.println(number_id);
        return numberEntityService.updateOne(number_code, number_id);
    }

    @GetMapping("/delete")
    public void delete(@RequestParam HashMap<String, String> id) {
        int deleteId = Integer.parseInt(id.get("id"));
        numberEntityService.deleteById(deleteId);
    }
}
