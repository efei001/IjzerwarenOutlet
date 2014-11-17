package com.springmvc.model;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Deva
 */
@Entity
public class ProductEstablishment implements Serializable {
    @Id
    @ManyToOne
    private Establishment establishment;
    @Id
    @ManyToOne
    private Product product;
    private float chosenPrice;
    private int stock;
    
    
    public ProductEstablishment() {
    }

    public ProductEstablishment(Establishment establishment, Product product, float chosenPric, int stock) {
        this.establishment = establishment;
        this.product = product;
        this.chosenPrice = chosenPrice;
        this.stock = stock;
        
    }

    public Establishment getEstablishment() {
        return establishment;
    }

    public void setEstablishment(Establishment establishment) {
        this.establishment = establishment;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getChosenPrice() {
        return chosenPrice;
    }

    public void setChosenPrice(float chosenPrice) {
        this.chosenPrice = chosenPrice;
    }
    
}
   class ProductEstablishmentPK implements Serializable {
    private Establishment establishment;
    private Product product;

    public ProductEstablishmentPK(Establishment establishment, Product product) {
        this.establishment = establishment;
        this.product = product;
    }
}
