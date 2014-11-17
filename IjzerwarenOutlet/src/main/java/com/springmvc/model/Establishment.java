/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springmvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author jaron
 */
@Entity
public class Establishment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private int id;
    private int streetNumber;
    private String name, streetName, streetNumberSuffix, postalCode, city, phoneNumber;
    @OneToMany
    private ProductEstablishment productEstablishment;

    public Establishment(int id, int streetNumber, String name, String streetName, String streetNumberSuffix, String postalCode, String city, String phoneNumber) {
        this.id = id;
        this.streetNumber = streetNumber;
        this.name = name;
        this.streetName = streetName;
        this.streetNumberSuffix = streetNumberSuffix;
        this.postalCode = postalCode;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetNumberSuffix() {
        return streetNumberSuffix;
    }

    public void setStreetNumberSuffix(String streetNumberSuffix) {
        this.streetNumberSuffix = streetNumberSuffix;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public ProductEstablishment getProductEstablishment() {
        return productEstablishment;
    }

    public void setProductEstablishment(ProductEstablishment productEstablishment) {
        this.productEstablishment = productEstablishment;
    }
    
    
}