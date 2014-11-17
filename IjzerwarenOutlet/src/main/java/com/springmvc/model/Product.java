package com.springmvc.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.validation.constraints.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Jaron
 */

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
    private String description, additionDescription ;
    private int discountPercentage;
    private boolean addition;
    private StihoArticle stihoArticle;

    public Product(int id, String name, double price, String description, String additionDescription, int discountPercentage, boolean addition, StihoArticle stihoArticle) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.additionDescription = additionDescription;
        this.discountPercentage = discountPercentage;
        this.addition = addition;
        this.stihoArticle = stihoArticle;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdditionDescription() {
        return additionDescription;
    }

    public void setAdditionDescription(String additionDescription) {
        this.additionDescription = additionDescription;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public boolean isAddition() {
        return addition;
    }

    public void setAddition(boolean addition) {
        this.addition = addition;
    }

    public StihoArticle getStihoArticle() {
        return stihoArticle;
    }

    public void setStihoArticle(StihoArticle stihoArticle) {
        this.stihoArticle = stihoArticle;
    }

}
