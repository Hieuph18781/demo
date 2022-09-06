package com.vmo.springboot.Demo.Controllers;

import com.vmo.springboot.Demo.Model.ElectricBill;
import com.vmo.springboot.Demo.Services.Interface.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
public class ElectricController {
    @Autowired
    IGenericService<ElectricBill> iElectricServices;
    @PostMapping("/elec/add")
    public ElectricBill addapart(@RequestBody ElectricBill apartment){
        return  iElectricServices.add(apartment);
    }

    @GetMapping("/elec/find")
    public List<ElectricBill> findAllCats() {
        return iElectricServices.getall();
    }

    @GetMapping("/elec/{id}")
    public ElectricBill findtById(@PathVariable int id) {
        return new ElectricBill();
    }

    @PutMapping("/elec/update")
    public ElectricBill updateProduct(@RequestBody ElectricBill apartment) {
        return iElectricServices.update(apartment);
    }

    @DeleteMapping("/elec/delete/{id}")
    public String deleteCat(@PathVariable int id) {
        return iElectricServices.delete(id);
    }
}
