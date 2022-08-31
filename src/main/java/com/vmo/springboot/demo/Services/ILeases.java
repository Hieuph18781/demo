package com.vmo.springboot.demo.Services;

import com.vmo.springboot.demo.Dto.LeasesDto;
import com.vmo.springboot.demo.Model.Apartment;
import com.vmo.springboot.demo.Model.Leases;
import com.vmo.springboot.demo.Model.Tenant;

import java.util.List;

public interface ILeases {
    public Leases add(Leases leasesdto);
    public Leases update(Leases apartment);
    public  String delete(int id);
    public List<Leases> getall();
    public Leases getone(int id);

}
