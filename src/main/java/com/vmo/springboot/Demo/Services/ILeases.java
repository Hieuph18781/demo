package com.vmo.springboot.Demo.Services;

import com.vmo.springboot.Demo.Model.Leases;

import java.util.List;

public interface ILeases {
    public Leases add(Leases leasesdto);
    public Leases update(Leases apartment);
    public  String delete(int id);
    public List<Leases> getall();
    public Leases getone(int id);

}
