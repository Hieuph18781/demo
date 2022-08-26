package com.vmo.springboot.demo.Model;

import javax.persistence.*;

@Entity
@Table(name = "apartment")
public class Apartment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "apartment_id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "status")
    private int status;
    @Column(name = "arena")
    private int arena;
    @Column(name = "bedroom")
    private int bedroom;
    @Column(name = "bathroom")
    private int bathroom;
    @Column(name = "image")
    private String image;
    @Column(name = "price")
    private int price;

    public Apartment() {
    }

    public Apartment(int id, String name, int status, int arena, int bedroom, int bathroom, String image, int price) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.arena = arena;
        this.bedroom = bedroom;
        this.bathroom = bathroom;
        this.image = image;
        this.price = price;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getArena() {
        return arena;
    }

    public void setArena(int arena) {
        this.arena = arena;
    }

    public int getBedroom() {
        return bedroom;
    }

    public void setBedroom(int bedroom) {
        this.bedroom = bedroom;
    }

    public int getBathroom() {
        return bathroom;
    }

    public void setBathroom(int bathroom) {
        this.bathroom = bathroom;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
