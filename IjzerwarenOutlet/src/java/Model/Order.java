/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.Calendar;

/**
 *
 * @author Deva
 */
public class Order {
    private User user;
    private int id, amount;
    private float totalPrice, shippingCosts;
    private Calendar date;
    private ProductEstablishment productEstablishment;

    public Order(User user, int id, int amount, float totalPrice, float shippingCosts, Calendar date, ProductEstablishment productEstablishment) {
        this.user = user;
        this.id = id;
        this.amount = amount;
        this.totalPrice = totalPrice;
        this.shippingCosts = shippingCosts;
        this.date = date;
        this.productEstablishment = productEstablishment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public float getShippingCosts() {
        return shippingCosts;
    }

    public void setShippingCosts(float shippingCosts) {
        this.shippingCosts = shippingCosts;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public ProductEstablishment getProductEstablishment() {
        return productEstablishment;
    }

    public void setProductEstablishment(ProductEstablishment productEstablishment) {
        this.productEstablishment = productEstablishment;
    }
    
    
    
    
    
}
