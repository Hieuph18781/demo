package com.vmo.springboot.Demo.Controllers;


import com.vmo.springboot.Demo.Model.Apartment;

import com.vmo.springboot.Demo.Services.Interface.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApartmentController {

    @Autowired
    IGenericService<Apartment> iApartmentservice;


    @PostMapping("/add")
    public Apartment addapart(@RequestBody Apartment apartment){
        return  iApartmentservice.add(apartment);
    }
    @GetMapping("/apa/find")
    public List<Apartment> findAllCats() {

        return iApartmentservice.getall();
    }

    @GetMapping("/apa/{id}")
    public Apartment findtById(@PathVariable int id) {
        return new Apartment();
    }

    @PutMapping("/apa/update")
    public Apartment updateProduct(@RequestBody Apartment apartment) {
        return iApartmentservice.update(apartment);
    }

    @DeleteMapping("/apa/delete/{id}")
    public String deleteCat(@PathVariable int id) {
        return iApartmentservice.delete(id);
    }
}
