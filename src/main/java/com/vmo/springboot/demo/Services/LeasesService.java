package com.vmo.springboot.demo.Services;

import com.vmo.springboot.demo.Dto.LeasesDto;
import com.vmo.springboot.demo.Model.Apartment;
import com.vmo.springboot.demo.Model.Leases;
import com.vmo.springboot.demo.Model.Tenant;
import com.vmo.springboot.demo.Repositories.IApartmentRepository;
import com.vmo.springboot.demo.Repositories.ILeasesRepository;
import com.vmo.springboot.demo.Repositories.ITenantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeasesService implements ILeases {
    @Autowired
    ILeasesRepository iLeasesRepository;

    @Autowired
    ITenantRepository iTenantRepository;


    @Override
    public Leases add(Leases leasesdto) {
            return iLeasesRepository.save(leasesdto);
    }

    @Override
    public Leases update(Leases apartment) {
         Leases existing = iLeasesRepository.findById(apartment.getId()).orElse(null);
        existing.setDate(apartment.getDate());
        existing.setPrice(apartment.getPrice());
        existing.setStatus(apartment.getStatus());
        existing.setApartment(apartment.getApartment());
        existing.setTenant(apartment.getTenant());
        return iLeasesRepository.save(existing);
    }

    @Override
    public String delete(int id) {
       iLeasesRepository.deleteById(id);
       return " removed ??" + id;
    }

    @Override
    public List<Leases> getall() {
        return iLeasesRepository.findAll();
    }

    @Override
    public Leases getone(int id) {
        return iLeasesRepository.findById(id).get();
    }




}
