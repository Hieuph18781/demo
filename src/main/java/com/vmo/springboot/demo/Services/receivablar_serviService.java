package com.vmo.springboot.demo.Services;

import com.vmo.springboot.demo.Model.receivable_sevice;
import com.vmo.springboot.demo.Repositories.IReceivable_serviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class receivablar_serviService implements IGenericService<receivable_sevice>{
    @Autowired
    IReceivable_serviceRepository  iReceivable_serviceRepository;
    @Override
    public receivable_sevice add(receivable_sevice apartment) {
        return iReceivable_serviceRepository.save(apartment);
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
