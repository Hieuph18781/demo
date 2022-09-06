package com.vmo.springboot.Demo.Controllers;

import com.vmo.springboot.Demo.Model.WaterBill;
import com.vmo.springboot.Demo.Services.Interface.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class WaterBillController {
    @Autowired
    IGenericService<WaterBill> iWaterServices;
    @PostMapping("/wat/add")
    public WaterBill addapart(@RequestBody WaterBill apartment){
        return  iWaterServices.add(apartment);
    }
    @GetMapping("/wat/find")
    public List<WaterBill> findAllCats() {
        return iWaterServices.getall();
    }

    @GetMapping("/wat/{id}")
    public WaterBill findtById(@PathVariable int id) {
        return iWaterServices.getone(id);
    }

    @PutMapping("/wat/update")
    public WaterBill updateProduct(@RequestBody WaterBill apartment) {
        return iWaterServices.update(apartment);
    }

    @DeleteMapping("/wat/delete/{id}")
    public String deleteCat(@PathVariable int id) {
        return iWaterServices.delete(id);
    }
}
