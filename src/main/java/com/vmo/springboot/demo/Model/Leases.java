package com.vmo.springboot.demo.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = ("Leases"))
public class Leases {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "leases_id")
    private int id;
    private Date date;
    private int status;
    private int price;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tenant_id",referencedColumnName = "tenant_id")
    @JsonProperty("tenant_id")
    Tenant tenant;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "apartment_id")
    @JsonProperty("apartment_id")
    Apartment apartment;


    public Leases() {
    }

    public Leases(int id, Date date, int status, int price, Tenant tenant, Apartment apartment) {
        this.id = id;
        this.date = date;
        this.status = status;
        this.price = price;
        this.tenant = tenant;
        this.apartment = apartment;
    }
    public Leases(Date date, int status, int price, Apartment apartment, Tenant tenant) {
        this.date = date;
        this.status = status;
        this.price = price;
        this.apartment = apartment;
        this.tenant = tenant;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }


}