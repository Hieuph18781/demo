package com.vmo.springboot.Demo.Model;

import javax.persistence.*;

@Entity
@Table(name = ("receivable_sevice"))
public class ReceivableSevice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = ("receivablesevice_id"))
    private int id;
    @ManyToOne
    @JoinColumn(name = "service_id",referencedColumnName = "service_id")
    ServiceOther serviceOther;
    @ManyToOne
    @JoinColumn(name = "receivable_id",referencedColumnName = "receivable_id")
    receivable receivable;

    public ReceivableSevice() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ServiceOther getService() {
        return serviceOther;
    }

    public void setService(ServiceOther serviceOther) {
        this.serviceOther = serviceOther;
    }

    public com.vmo.springboot.Demo.Model.receivable getReceivable() {
        return receivable;
    }

    public void setReceivable(com.vmo.springboot.Demo.Model.receivable receivable) {
        this.receivable = receivable;
    }
}
