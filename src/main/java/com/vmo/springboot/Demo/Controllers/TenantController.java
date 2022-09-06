package com.vmo.springboot.Demo.Controllers;

import com.vmo.springboot.Demo.Model.Tenant;
import com.vmo.springboot.Demo.Services.Interface.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TenantController {
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
