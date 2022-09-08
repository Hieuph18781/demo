package com.vmo.springboot.Demo.Services;

import com.vmo.springboot.Demo.Model.ReceivableSevice;
import com.vmo.springboot.Demo.Repositories.IReceivableServiceRepository;


import com.vmo.springboot.Demo.Services.Interface.IGenericService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class receivablarServiServiceIpml implements IGenericService<ReceivableSevice> {
    @Autowired
    IReceivableServiceRepository iReceivable_serviceRepository;

   private static final Logger loger =  LoggerFactory.getLogger(receivablarServiServiceIpml.class);

    @Override
    public ReceivableSevice add(ReceivableSevice apartment) {
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
    public ReceivableSevice update(ReceivableSevice apartment) {
        ReceivableSevice exting = iReceivable_serviceRepository.findById(apartment.getId()).get();
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
    public List<ReceivableSevice> getall() {
        return iReceivable_serviceRepository.findAll();
    }

    @Override
    public ReceivableSevice getone(int id) {
        return iReceivable_serviceRepository.findById(id).get();
    }

    @Override
    public ReceivableSevice getByIdApartment(Integer idy) {
        return null;
    }
}
