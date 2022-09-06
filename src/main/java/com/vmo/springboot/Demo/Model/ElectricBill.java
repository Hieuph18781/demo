package com.vmo.springboot.Demo.Model;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "Electric_bill")
public class ElectricBill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "electricbill_id")
    private int id;
    private String name;
    private Date createE;
    private Date updateE;
    private int oldBillE;
    private int newBillE;
    private int unit;
    private int status;

    public ElectricBill() {
    }

    public ElectricBill(int id, String name, Date createE, Date updateE, int oldBillE, int newBillE, int unit, int status) {
        this.id = id;
        this.name = name;
        this.createE = createE;
        this.updateE = updateE;
        this.oldBillE = oldBillE;
        this.newBillE = newBillE;
        this.unit = unit;
        this.status = status;
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

    public Date getCreateE() {
        return createE;
    }

    public void setCreateE(Date createE) {
        this.createE = createE;
    }

    public Date getUpdateE() {
        return updateE;
    }

    public void setUpdateE(Date updateE) {
        this.updateE = updateE;
    }

    public int getOldBillE() {
        return oldBillE;
    }

    public void setOldBillE(int oldBillE) {
        this.oldBillE = oldBillE;
    }

    public int getNewBillE() {
        return newBillE;
    }

    public void setNewBillE(int newBillE) {
        this.newBillE = newBillE;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
