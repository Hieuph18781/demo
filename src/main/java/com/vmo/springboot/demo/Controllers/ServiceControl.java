package com.vmo.springboot.demo.Controllers;

import com.vmo.springboot.demo.Model.Apartment;
import com.vmo.springboot.demo.Model.Service;
import com.vmo.springboot.demo.Services.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
public class ServiceControl {
    @Autowired
    IGenericService<Service> iServiceServices;
    @PostMapping("/ser/add")
    public Service addapart(@RequestBody Service apartment){
        return  iServiceServices.add(apartment);
    }
    @GetMapping("/ser/find")
    public List<Service> findAllCats() {
        return iServiceServices.getall();
    }

    @GetMapping("/ser/{id}")
    public Service findtById(@PathVariable int id) {
        return iServiceServices.getone(id);
    }

    @PutMapping("/ser/update")
    public Service updateProduct(@RequestBody Service apartment) {
        return iServiceServices.update(apartment);
    }

    @DeleteMapping("/ser/delete/{id}")
    public String deleteCat(@PathVariable int id) {
        return iServiceServices.delete(id);
    }
}
