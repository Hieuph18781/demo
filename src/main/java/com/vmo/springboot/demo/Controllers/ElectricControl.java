package com.vmo.springboot.demo.Controllers;

import com.vmo.springboot.demo.Model.Electric_Bill;
import com.vmo.springboot.demo.Model.Service;
import com.vmo.springboot.demo.Services.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
public class ElectricControl {
    @Autowired
    IGenericService<Electric_Bill> iElectricServices;
    @PostMapping("/elec/add")
    public Electric_Bill addapart(@RequestBody Electric_Bill apartment){
        return  iElectricServices.add(apartment);
    }

    @GetMapping("/elec/find")
    public List<Electric_Bill> findAllCats() {
        return iElectricServices.getall();
    }

    @GetMapping("/elec/{id}")
    public Electric_Bill findtById(@PathVariable int id) {
        return new Electric_Bill();
    }

    @PutMapping("/elec/update")
    public Electric_Bill updateProduct(@RequestBody Electric_Bill apartment) {
        return iElectricServices.update(apartment);
    }

    @DeleteMapping("/elec/delete/{id}")
    public String deleteCat(@PathVariable int id) {
        return iElectricServices.delete(id);
    }
}
