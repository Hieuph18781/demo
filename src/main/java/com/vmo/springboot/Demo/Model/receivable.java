package com.vmo.springboot.Demo.Model;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = ("Receivable"))
public class receivable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "receivable_id")
    private int id;
    private String name;
    private int payment;
    private Date create_at;
    private Date update_at;
    private int status;

    @ManyToOne()
    @JoinColumn(name = "electricbill_id",referencedColumnName = "electricbill_id")
    ElectricBill electricBill;

    @ManyToOne()
    @JoinColumn(name = "waterbill_id",referencedColumnName = "waterbill_id")
    WaterBill waterBill;

    @ManyToOne()
    @JoinColumn(name = "leases_id",referencedColumnName = "leases_id")
    Leases leases;

    public receivable() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }

    public Date getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Date update_at) {
        this.update_at = update_at;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public ElectricBill getElectricBill() {
        return electricBill;
    }

    public void setElectricBill(ElectricBill electricBill) {
        this.electricBill = electricBill;
    }

    public WaterBill getWaterBill() {
        return waterBill;
    }

    public void setWaterBill(WaterBill waterBill) {
        this.waterBill = waterBill;
    }

    public Leases getLeases() {
        return leases;
    }

    public void setLeases(Leases leases) {
        this.leases = leases;
    }
}
