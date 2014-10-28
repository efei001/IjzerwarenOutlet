/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author Deva
 */
public class User {
    private int id, houseNumber;
    private String firstName, lastName, email, streetName, streetNumberSuffix, postalCode, city, phoneNumber;

    public User(int id, int houseNumber, String firstName, String suffix, String lastName, String email, String streetName, String streetNumberSuffix, String postalCode, String city, String phoneNumber) {
        this.id = id;
        this.houseNumber = houseNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
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

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStreet() {
        return streetName;
    }

    public void setStreet(String street) {
        this.streetName = street;
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
    
    
}
