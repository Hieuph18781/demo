package com.vmo.springboot.demo.Services;

import com.vmo.springboot.demo.Model.Leases;
import com.vmo.springboot.demo.Repositories.ILeasesRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.rmi.dgc.Lease;
import java.util.List;

@Service
public class LeasesService implements IGenericService<Leases> {
    @Autowired
    ILeasesRepository iLeasesRepository;

    @Override
    public Leases add(Leases apartment) {
        return iLeasesRepository.save(apartment);
    }

    @Override
    public Leases update(@NotNull  Leases apartment) {
        Leases existing = iLeasesRepository.findById(apartment.getId()).orElse(null);
        //existing.s
        return null;
    }

    @Override
    public String delete(int id) {
        return null;
    }

    @Override
    public List<Leases> getall() {
        return null;
    }

    @Override
    public Leases getone(int id) {
        return null;
    }
}
