package com.vmo.springboot.Demo.Model;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "Water_bill")
public class WaterBill {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "waterbill_id")
    private int id;

    private String name;

    private Date createW;

    private Date updateW;

    private int oldBillW;

    private int newBillW;

    private int unit;

    private int status;


    public WaterBill() {
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


    public Date getCreateW() {
        return createW;
    }


    public void setCreateW(Date createW) {
        this.createW = createW;
    }


    public Date getUpdateW() {
        return updateW;
    }


    public void setUpdateW(Date updateW) {
        this.updateW = updateW;
    }

    public int getOldBillW() {
        return oldBillW;
    }

    public void setOldBillW(int oldBillW) {
        this.oldBillW = oldBillW;
    }

    public int getNewBillW() {
        return newBillW;
    }

    public void setNewBillW(int newBillW) {
        this.newBillW = newBillW;
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
