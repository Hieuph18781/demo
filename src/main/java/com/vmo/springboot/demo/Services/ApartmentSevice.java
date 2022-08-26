package com.vmo.springboot.demo.Services;

import com.vmo.springboot.demo.Model.Apartment;
import com.vmo.springboot.demo.Repositories.IApartmentRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ApartmentSevice implements IGenericService<Apartment> {
    @Autowired
     IApartmentRepository iApartmentRepository;
    @Override
    public Apartment add(Apartment apartment) {
            return iApartmentRepository.save(apartment);

    }

    @Override
    public Apartment update(@NotNull Apartment apartment) {
        Apartment existing = iApartmentRepository.findById(apartment.getId()).orElse(null);
        existing.setName(apartment.getName());
        existing.setArena(apartment.getArena());
        existing.setStatus(apartment.getStatus());
        existing.setPrice(apartment.getPrice());
        existing.setBedroom(apartment.getBedroom());
        existing.setBathroom(apartment.getBathroom());
        existing.setImage(apartment.getImage());
        return iApartmentRepository.save(existing);
    }

    @Override
    public String delete(int id) {
        iApartmentRepository.deleteById(id);
        return " removed !! " + id;
    }

    @Override
    public List<Apartment> getall() {
        return iApartmentRepository.findAll();
    }

    @Override
    public Apartment getone(int id) {
        return iApartmentRepository.findById(id).orElse(null);
    }
}
