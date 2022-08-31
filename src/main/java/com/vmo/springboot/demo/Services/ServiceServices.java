package com.vmo.springboot.demo.Services;

import com.vmo.springboot.demo.Model.Apartment;
import com.vmo.springboot.demo.Model.Service;
import com.vmo.springboot.demo.Repositories.IServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@org.springframework.stereotype.Service
public class ServiceServices implements IGenericService<Service>{
    @Autowired
    IServiceRepository iServiceRepository;
    @Override
    public Service add(Service apartment) {
        return iServiceRepository.save(apartment);
    }

    @Override
    public Service update(Service apartment) {
        Service existing = iServiceRepository.findById(apartment.getId()).orElse(null);
        existing.setName(apartment.getName());
        existing.setPrice(apartment.getPrice());

        return iServiceRepository.save(existing);
    }

    @Override
    public String delete(int id) {
        iServiceRepository.deleteById(id);
        return "category removed !! " + id;
    }

    @Override
    public List<Service> getall() {
        return iServiceRepository.findAll();
    }

    @Override
    public Service getone(int id) {
        return iServiceRepository.findById(id).orElse(null);
    }

    @Override
    public Service getByIdApartment(Integer idy) {
        return null;
    }


}
