package com.springmvc.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.validation.constraints.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Product implements Serializable {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;
    @NotNull
    @Size(min=2, max=24, message="Error")
    private String name;
    private double price;
    @Size(min=2, message="Error")
    private String location;
    @Size(min=2, message="Error")
    private String weight;
    @Size(min=2, message="Error")
    private String description;
    
    

    public Product(int id, String name, double price, String location, String weight, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.location = location;
        this.weight = weight;
        this.description = description;
    }

    public Product() {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   

}
