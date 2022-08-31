package com.vmo.springboot.demo.Controllers;

import com.vmo.springboot.demo.Dto.LeasesDto;
import com.vmo.springboot.demo.Model.Apartment;
import com.vmo.springboot.demo.Model.Leases;
import com.vmo.springboot.demo.Model.Tenant;
import com.vmo.springboot.demo.Services.ApartmentSevice;
import com.vmo.springboot.demo.Services.ILeases;
import com.vmo.springboot.demo.Services.TenantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LeasesControl {
    @Autowired
    ILeases iLeases;
    @Autowired
    ApartmentSevice iApartmentservice;
    @Autowired
    TenantService iServicetenant;

    @PostMapping("/lea/add")
    public Leases addapart(@RequestBody Leases leases1){



        return  iLeases.add(leases1);
    }

    @GetMapping("/lea/find")
    public List<Leases> findAllCats() {
        return iLeases.getall();
    }

   @GetMapping("/lea/{id}")
   public Leases findtById(@PathVariable int id) {
        return new Leases();
    }
//
//    @PutMapping("/lea/update")
//    public Leases updateProduct(@RequestBody Leases apartment) {
//        return iLeasesServices.update(apartment);
//    }
//
//    @DeleteMapping("/lea/delete/{id}")
//    public String deleteCat(@PathVariable int id) {
//        return iLeasesServices.delete(id);
//    }
}
