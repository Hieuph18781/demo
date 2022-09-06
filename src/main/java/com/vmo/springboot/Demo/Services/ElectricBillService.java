package com.vmo.springboot.Demo.Services;

import com.vmo.springboot.Demo.Model.ElectricBill;
import com.vmo.springboot.Demo.Repositories.IElectricBillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElectricBillService implements IGenericService<ElectricBill>{
    @Autowired
    IElectricBillRepository iElectric_billRepository;
    @Override
    public ElectricBill add(ElectricBill apartment) {
        return iElectric_billRepository.save(apartment);
    }

    @Override
    public ElectricBill update(ElectricBill apartment) {
        ElectricBill existing = iElectric_billRepository.findById(apartment.getId()).orElse(null);
        existing.setName(apartment.getName());
        existing.setCreateE(apartment.getCreateE());
        existing.setUpdateE(apartment.getUpdateE());
        existing.setStatus(apartment.getStatus());
        existing.setNewBillE(apartment.getNewBillE());
        existing.setOldBillE(apartment.getOldBillE());
        existing.setUnit(apartment.getUnit());
        return iElectric_billRepository.save(existing);
    }

    @Override
    public String delete(int id) {
        iElectric_billRepository.deleteById(id);
        return " removed !! " + id;
    }

    @Override
    public List<ElectricBill> getall() {
        return iElectric_billRepository.findAll();
    }

    @Override
    public ElectricBill getone(int id) {
       return iElectric_billRepository.findById(id).orElse(null);
    }

    @Override
    public ElectricBill getByIdApartment(Integer idy) {
        return null;
    }


}
