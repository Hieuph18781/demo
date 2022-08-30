package com.vmo.springboot.demo.Services;

import com.vmo.springboot.demo.Model.Apartment;
import com.vmo.springboot.demo.Model.Tenant;
import com.vmo.springboot.demo.Repositories.ITenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TenantService implements IGenericService<Tenant> {
    @Autowired
    ITenantRepository iTenantRepository;

    @Override
    public Tenant add(Tenant apartment) {
        return iTenantRepository.save(apartment);
    }

    @Override
    public Tenant update(Tenant apartment) {
        Tenant existing = iTenantRepository.findById(apartment.getId()).orElse(null);
        existing.setName(apartment.getName());
        existing.setAge(apartment.getAge());
        existing.setStatus(apartment.getStatus());
        existing.setDob(apartment.getDob());
        existing.setEmail(apartment.getEmail());
        existing.setGender(apartment.getGender());
        existing.setId_cart(apartment.getId_cart());
        existing.setPhone(apartment.getPhone());
        return iTenantRepository.save(existing);
    }

    @Override
    public String delete(int id) {
        iTenantRepository.deleteById(id);
        return " removed !! " + id;
    }

    @Override
    public List<Tenant> getall() {
        return iTenantRepository.findAll();
    }

    @Override
    public Tenant getone(int id) {
        return iTenantRepository.findById(id).get();
    }
}