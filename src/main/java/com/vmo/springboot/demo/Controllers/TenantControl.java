package com.vmo.springboot.demo.Controllers;

import com.vmo.springboot.demo.Model.Service;
import com.vmo.springboot.demo.Model.Tenant;
import com.vmo.springboot.demo.Services.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TenantControl {
    @Autowired
    IGenericService<Tenant> iServicetenant;
    @PostMapping("/ten/add")
    public Tenant addapart(@RequestBody Tenant apartment){
        return  iServicetenant.add(apartment);
    }
    @GetMapping("/ten/find")
    public List<Tenant> findAllCats() {
        return iServicetenant.getall();
    }

    @GetMapping("/ten/{id}")
    public Tenant findtById(@PathVariable int id) {

        return iServicetenant.getone(id);

    }

    @PutMapping("/ten/update")
    public Tenant updateProduct(@RequestBody Tenant apartment) {
        return iServicetenant.update(apartment);
    }

    @DeleteMapping("/ten/delete/{id}")
    public String deleteCat(@PathVariable int id) {
        return iServicetenant.delete(id);
    }
}
