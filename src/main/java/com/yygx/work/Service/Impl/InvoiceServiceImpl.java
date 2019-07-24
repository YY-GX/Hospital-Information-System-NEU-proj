package com.yygx.work.Service.Impl;

import com.yygx.work.Entity.InvoiceEntity;
import com.yygx.work.Repository.InvoiceRepository;
import com.yygx.work.Repository.WesMedicineDetailRepository;
import com.yygx.work.Service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

@Service
public class InvoiceServiceImpl implements InvoiceService {
    public static int registrationTollerId = RegistrationTollerServiceImpl.registrationTollerId;
    @Autowired
    InvoiceRepository invoiceRepository;
    @Autowired
    WesMedicineDetailRepository wesMedicineDetailRepository;

    @Transactional
    public String addInvoice(HashMap<String, String> fee) {
        Date date = new Date();//此时date为当前的时间
        SimpleDateFormat dateFormat_min = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
        double money = Double.parseDouble(fee.get("fee"));
        String invoiceState = "1";
        String chargeTime = dateFormat_min.format(date);
        int registrationTollerId1 = registrationTollerId;
        int regisId = Integer.parseInt(fee.get("regisId"));
        int refundInvoiceNum = 0;
        InvoiceEntity invoiceEntity = new InvoiceEntity(money, invoiceState, chargeTime, registrationTollerId1, regisId, refundInvoiceNum);
        invoiceRepository.save(invoiceEntity);
//        将挂号id对应的明细的缴费状态都改为已缴费
        wesMedicineDetailRepository.updateFeeState(Integer.parseInt(fee.get("medicineId")));
        return "success";
    }
}

