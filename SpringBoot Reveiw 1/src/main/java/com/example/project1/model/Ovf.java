package com.example.project1.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name  = "Organicvegfruits")
public class Ovf {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int productid  ;
    @Column(name = "Name")
    String name;
    @Column(name = "catagory")
    String catagory;
    @Column(name = "price")
    int price;
    private int id;
    public Ovf() {
    }
    public Ovf(int productid , String name, String catagory, int price) {
        this.productid = productid ;
        this.name = name;
        this.catagory = catagory;
        this.price = price;
    }
    public int getProductid() {
        return productid;
    }
    public void setProductid(int productid) {
        this.productid = productid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCatagory() {
        return catagory;
    }
    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}
