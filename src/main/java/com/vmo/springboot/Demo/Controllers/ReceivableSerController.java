package com.vmo.springboot.Demo.Controllers;

import com.vmo.springboot.Demo.Model.ReceivableSevice;
import com.vmo.springboot.Demo.Services.Interface.IGenericService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class ReceivableSerController {
    @Autowired
    IGenericService<ReceivableSevice> iGenericServicell;

    private static final Logger loger =  LoggerFactory.getLogger(ReceivableSerController.class);
;
    @PostMapping("/recse/add")
    public ReceivableSevice addapart(@RequestBody ReceivableSevice leases1){

        loger.info("lololool" + leases1);
        return iGenericServicell.add(leases1);

    }

    @GetMapping("/recse/find")
    public List<ReceivableSevice> findAllCats() {
        return iGenericServicell.getall();
    }

    @GetMapping("/recse/{id}")
    public ReceivableSevice findtById(@PathVariable int id) {
        return new ReceivableSevice();
    }

    @PutMapping("/recse/update")
    public ReceivableSevice updateProduct(@RequestBody ReceivableSevice apartment) {
        return iGenericServicell.update(apartment);
    }

    @DeleteMapping("/recse/delete/{id}")
    public String deleteCat(@PathVariable int id) {
        return iGenericServicell.delete(id);
    }
}
