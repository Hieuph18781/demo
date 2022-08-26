package com.vmo.springboot.demo.Controllers;

import com.vmo.springboot.demo.Model.Service;
import com.vmo.springboot.demo.Model.Water_Bill;
import com.vmo.springboot.demo.Services.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WaterBillControl {
    @Autowired
    IGenericService<Water_Bill> iWaterServices;
    @PostMapping("/wat/add")
    public Water_Bill addapart(@RequestBody Water_Bill apartment){
        return  iWaterServices.add(apartment);
    }
    @GetMapping("/wat/find")
    public List<Water_Bill> findAllCats() {
        return iWaterServices.getall();
    }

    @GetMapping("/wat/{id}")
    public Water_Bill findtById(@PathVariable int id) {
        return iWaterServices.getone(id);
    }

    @PutMapping("/wat/update")
    public Water_Bill updateProduct(@RequestBody Water_Bill apartment) {
        return iWaterServices.update(apartment);
    }

    @DeleteMapping("/wat/delete/{id}")
    public String deleteCat(@PathVariable int id) {
        return iWaterServices.delete(id);
    }
}
