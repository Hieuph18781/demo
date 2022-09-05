package com.vmo.springboot.demo.Services;

import com.vmo.springboot.demo.Controllers.receivable_serControll;
import com.vmo.springboot.demo.Model.receivable_sevice;
import com.vmo.springboot.demo.Repositories.IReceivable_serviceRepository;


import org.apache.logging.log4j.LogManager;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class receivablar_serviService implements IGenericService<receivable_sevice>{
    @Autowired
    IReceivable_serviceRepository  iReceivable_serviceRepository;
   private static final Logger loger =  LoggerFactory.getLogger(receivablar_serviService.class);
    @Override
    public receivable_sevice add(receivable_sevice apartment) {
        try {
             iReceivable_serviceRepository.save(apartment);
            loger.info("hihi"+apartment);
        }
        catch (Exception e){
            loger.error("lỗi rồi");
        }
        return apartment;
    }

    @Override
    public receivable_sevice update(receivable_sevice apartment) {
        receivable_sevice exting = iReceivable_serviceRepository.findById(apartment.getId()).get();
        exting.setService(apartment.getService());
        exting.setReceivable(apartment.getReceivable());
        return iReceivable_serviceRepository.save(exting);
    }

    @Override
    public String delete(int id) {
         iReceivable_serviceRepository.deleteById(id);
         return "xoa ??" + id;
    }

    @Override
    public List<receivable_sevice> getall() {
        return iReceivable_serviceRepository.findAll();
    }

    @Override
    public receivable_sevice getone(int id) {
        return iReceivable_serviceRepository.findById(id).get();
    }

    @Override
    public receivable_sevice getByIdApartment(Integer idy) {
        return null;
    }
}
