package com.vmo.springboot.demo.Model;

import javax.persistence.*;

@Entity
@Table(name = ("receivable_sevice"))
public class receivable_sevice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = ("receivablesevice_id"))
    private int id;
    @ManyToOne
    @JoinColumn(name = "service_id",referencedColumnName = "service_id")
    Service service;
    @ManyToOne
    @JoinColumn(name = "receivable_id",referencedColumnName = "receivable_id")
    receivable receivable;

    public receivable_sevice() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public com.vmo.springboot.demo.Model.receivable getReceivable() {
        return receivable;
    }

    public void setReceivable(com.vmo.springboot.demo.Model.receivable receivable) {
        this.receivable = receivable;
    }
}
