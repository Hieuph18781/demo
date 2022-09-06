package com.vmo.springboot.Demo.Controllers;

import com.vmo.springboot.Demo.Model.ServiceOther;
import com.vmo.springboot.Demo.Services.Interface.IGenericService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api")
public class ServiceController {
    @Autowired
    IGenericService<ServiceOther> iServiceServices;
    @PostMapping("/ser/add")
    public ServiceOther addapart(@RequestBody ServiceOther apartment){
        return  iServiceServices.add(apartment);
    }
    @GetMapping("/ser/find")
    public List<ServiceOther> findAllCats() {
        return iServiceServices.getall();
    }

    @GetMapping("/ser/{id}")
    public ServiceOther findtById(@PathVariable int id) {
        return iServiceServices.getone(id);
    }

    @PutMapping("/ser/update")
    public ServiceOther updateProduct(@RequestBody ServiceOther apartment) {
        return iServiceServices.update(apartment);
    }

    @DeleteMapping("/ser/delete/{id}")
    public String deleteCat(@PathVariable int id) {
        return iServiceServices.delete(id);
    }
}
