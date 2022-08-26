package com.vmo.springboot.demo.Model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

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
    Tenant tenant;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "apartment_id",referencedColumnName = "apartment_id")
    Apartment apartment;



    public Leases() {
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
