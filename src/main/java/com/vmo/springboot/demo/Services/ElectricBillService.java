package com.vmo.springboot.demo.Services;

import com.vmo.springboot.demo.Model.Apartment;
import com.vmo.springboot.demo.Model.Electric_Bill;
import com.vmo.springboot.demo.Repositories.IElectric_BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ElectricBillService implements IGenericService<Electric_Bill>{
    @Autowired
    IElectric_BillRepository iElectric_billRepository;
    @Override
    public Electric_Bill add(Electric_Bill apartment) {
        return iElectric_billRepository.save(apartment);
    }

    @Override
    public Electric_Bill update(Electric_Bill apartment) {
        Electric_Bill existing = iElectric_billRepository.findById(apartment.getId()).orElse(null);
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
    public List<Electric_Bill> getall() {
        return iElectric_billRepository.findAll();
    }

    @Override
    public Electric_Bill getone(int id) {
       return iElectric_billRepository.findById(id).orElse(null);
    }

    @Override
    public Electric_Bill getByIdApartment(Integer idy) {
        return null;
    }


}
