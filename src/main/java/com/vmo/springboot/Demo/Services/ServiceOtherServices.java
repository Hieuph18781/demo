package com.vmo.springboot.Demo.Services;

import com.vmo.springboot.Demo.Model.ServiceOther;
import com.vmo.springboot.Demo.Repositories.IServiceRepository;
import com.vmo.springboot.Demo.Services.Interface.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@org.springframework.stereotype.Service
public class ServiceOtherServices implements IGenericService<ServiceOther> {
    @Autowired
    IServiceRepository iServiceRepository;

    @Override
    public ServiceOther add(ServiceOther apartment) {
        return iServiceRepository.save(apartment);
    }

    @Override
    public ServiceOther update(ServiceOther apartment) {
        ServiceOther existing = iServiceRepository.findById(apartment.getId()).orElse(null);
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
    public List<ServiceOther> getall() {
        return iServiceRepository.findAll();
    }

    @Override
    public ServiceOther getone(int id) {
        return iServiceRepository.findById(id).orElse(null);
    }

    @Override
    public ServiceOther getByIdApartment(Integer idy) {
        return null;
    }


}
