package com.vmo.springboot.demo.Controllers;

import com.vmo.springboot.demo.Model.Electric_Bill;
import com.vmo.springboot.demo.Model.Leases;
import com.vmo.springboot.demo.Model.Water_Bill;
import com.vmo.springboot.demo.Model.receivable;
import com.vmo.springboot.demo.Services.IGenericService;
import com.vmo.springboot.demo.Services.ILeases;
import com.vmo.springboot.demo.Services.ReceivableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ReceivableControl {
    @Autowired
    IGenericService<receivable> receivableService;
    @Autowired
    IGenericService<Electric_Bill> receivableServic;
    @Autowired
    IGenericService<Water_Bill> receivableServ;
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
