package com.vmo.springboot.demo.Controllers;

import com.vmo.springboot.demo.Model.receivable;
import com.vmo.springboot.demo.Model.receivable_sevice;
import com.vmo.springboot.demo.Services.IGenericService;

import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class receivable_serControll {
    @Autowired
    IGenericService<receivable_sevice> iGenericServicell;

    private static final Logger loger =  LoggerFactory.getLogger(receivable_serControll.class);
;
    @PostMapping("/recse/add")
    public receivable_sevice addapart(@RequestBody receivable_sevice leases1){

        loger.info("lololool" + leases1);
        return iGenericServicell.add(leases1);

    }

    @GetMapping("/recse/find")
    public List<receivable_sevice> findAllCats() {
        return iGenericServicell.getall();
    }

    @GetMapping("/recse/{id}")
    public receivable_sevice findtById(@PathVariable int id) {
        return new receivable_sevice();
    }

    @PutMapping("/recse/update")
    public receivable_sevice updateProduct(@RequestBody receivable_sevice apartment) {
        return iGenericServicell.update(apartment);
    }

    @DeleteMapping("/recse/delete/{id}")
    public String deleteCat(@PathVariable int id) {
        return iGenericServicell.delete(id);
    }
}
