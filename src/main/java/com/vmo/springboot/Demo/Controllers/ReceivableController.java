package com.vmo.springboot.Demo.Controllers;

import com.vmo.springboot.Demo.Model.ElectricBill;
import com.vmo.springboot.Demo.Model.WaterBill;
import com.vmo.springboot.Demo.Model.receivable;
import com.vmo.springboot.Demo.Services.Interface.IGenericService;
import com.vmo.springboot.Demo.Services.Interface.ILeases;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ReceivableController {
    @Autowired
    IGenericService<receivable> receivableService;
    @Autowired
    IGenericService<ElectricBill> receivableServic;
    @Autowired
    IGenericService<WaterBill> receivableServ;
    @Autowired
    ILeases iLeases;

    @PostMapping("/rec/add")
    public receivable addapart(@RequestBody receivable leases1){
        return  receivableService.add(leases1);
    }


    @GetMapping("/rec/find")
    public List<receivable> findAllCats() {
        return receivableService.getall();
    }


    @GetMapping("/rec/{id}")
    public receivable findtById(@PathVariable int id) {
        return new receivable();
    }


    @PutMapping("/rec/update")
    public receivable updateProduct(@RequestBody receivable apartment) {
        return receivableService.update(apartment);
    }


    @DeleteMapping("/rec/delete/{id}")
    public String deleteCat(@PathVariable int id) {
        return receivableService.delete(id);
    }
}
