package com.vmo.springboot.demo.Services;

import com.vmo.springboot.demo.Dto.LeasesDto;
import com.vmo.springboot.demo.Model.Apartment;
import com.vmo.springboot.demo.Model.Leases;
import com.vmo.springboot.demo.Model.Tenant;
import com.vmo.springboot.demo.Repositories.IApartmentRepository;
import com.vmo.springboot.demo.Repositories.ILeasesRepository;
import com.vmo.springboot.demo.Repositories.ITenantRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeasesService implements ILeases {
    @Autowired
    ILeasesRepository iLeasesRepository;
    @Autowired
    ApartmentSevice apartmentSevice;
    @Autowired
    TenantService tenantService;


    @Override
    public Leases add(Leases leases) {
        return iLeasesRepository.save(leases);
    }

    @Override
    public Leases update(Leases apartment) {
        return null;
    }

    @Override
    public String delete(int id) {
        return null;
    }

    @Override
    public List<Leases> getall() {
        return iLeasesRepository.findAll();
    }

    @Override
    public Leases getone(int id) {
        return null;
    }

    @Override
    public List<Leases> getAllProductByCategoryId(int id) {
        return iLeasesRepository.findAllByApartment_Id(id);
    }

    @Override
    public List<Leases> getAllProductById(int id) {
        return iLeasesRepository.findAllByTenant_Id(id);
    }
}
