package com.vmo.springboot.demo.Services;

import com.vmo.springboot.demo.Model.Apartment;
import com.vmo.springboot.demo.Model.Water_Bill;
import com.vmo.springboot.demo.Repositories.IWater_BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaterBillService implements IGenericService<Water_Bill> {
    @Autowired
    IWater_BillRepository iWater_billRepository;
    @Override
    public Water_Bill add(Water_Bill apartment) {
        return iWater_billRepository.save(apartment);
    }

    @Override
    public Water_Bill update(Water_Bill apartment) {
        Water_Bill existing = iWater_billRepository.findById(apartment.getId()).orElse(null);
        existing.setName(apartment.getName());
        existing.setUpdateW(apartment.getUpdateW());
        existing.setStatus(apartment.getStatus());
        existing.setCreateW(apartment.getCreateW());
        existing.setNewBillW(apartment.getNewBillW());
        existing.setOldBillW(apartment.getOldBillW());
        existing.setUnit(apartment.getUnit());

        return iWater_billRepository.save(existing);
    }

    @Override
    public String delete(int id) {
        iWater_billRepository.deleteById(id);
        return " removed !! " + id;
    }

    @Override
    public List<Water_Bill> getall() {
        return iWater_billRepository.findAll();
    }

    @Override
    public Water_Bill getone(int id) {
        return iWater_billRepository.findById(id).orElse(null);
    }

    @Override
    public Water_Bill getByIdApartment(Integer idy) {
        return null;
    }


}
