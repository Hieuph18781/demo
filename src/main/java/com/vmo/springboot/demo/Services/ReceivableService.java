package com.vmo.springboot.demo.Services;

import com.vmo.springboot.demo.Model.Leases;
import com.vmo.springboot.demo.Model.receivable;
import com.vmo.springboot.demo.Repositories.IReceivableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReceivableService implements IGenericService<receivable>  {
    @Autowired
    IReceivableRepository iReceivableRepository;

    @Override
    public receivable add(receivable apartment) {
        return iReceivableRepository.save(apartment);
    }

    @Override
    public receivable update(receivable apartment) {
        receivable existing = iReceivableRepository.findById(apartment.getId()).orElse(null);
        existing.setName(apartment.getName());
        existing.setUpdate_at(apartment.getUpdate_at());
        existing.setCreate_at(apartment.getCreate_at());
        existing.setPayment(apartment.getPayment());
        existing.setStatus(apartment.getStatus());
        existing.setElectricBill(apartment.getElectricBill());
        existing.setWaterBill(apartment.getWaterBill());
        existing.setLeases(apartment.getLeases());
        return iReceivableRepository.save(existing);
    }

    @Override
    public String delete(int id) {
        iReceivableRepository.deleteById(id);
        return "xoas ??" + id;
    }

    @Override
    public List<receivable> getall() {
        return iReceivableRepository.findAll();
    }

    @Override
    public receivable getone(int id) {
        return iReceivableRepository.findById(id).get();
    }

    @Override
    public receivable getByIdApartment(Integer idy) {
        return null;
    }
}
