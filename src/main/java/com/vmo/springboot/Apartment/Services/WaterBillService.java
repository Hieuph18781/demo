package com.vmo.springboot.Apartment.Services;

import com.vmo.springboot.Apartment.Model.WaterBill;
import com.vmo.springboot.Apartment.Repositories.IWaterBillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaterBillService implements IGenericService<WaterBill> {
    @Autowired
    IWaterBillRepository iWater_billRepository;
    @Override
    public WaterBill add(WaterBill apartment) {
        return iWater_billRepository.save(apartment);
    }

    @Override
    public WaterBill update(WaterBill apartment) {
        WaterBill existing = iWater_billRepository.findById(apartment.getId()).orElse(null);
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
    public List<WaterBill> getall() {
        return iWater_billRepository.findAll();
    }

    @Override
    public WaterBill getone(int id) {
        return iWater_billRepository.findById(id).orElse(null);
    }

    @Override
    public WaterBill getByIdApartment(Integer idy) {
        return null;
    }


}
