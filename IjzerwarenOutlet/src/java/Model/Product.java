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
public class Product {
    private int id, discountPercentage, artikelnummer;
    private String name, description, additionDescription, category;
    private boolean addition;
    private StihoArticle stihoArticle;

    public Product(int id, int discountPercentage, int artikelnummer, String name, String description, String additionDescription, String category, boolean addition, StihoArticle stihoArticle) {
        this.id = id;
        this.discountPercentage = discountPercentage;
        this.artikelnummer = artikelnummer;
        this.name = name;
        this.description = description;
        this.additionDescription = additionDescription;
        this.category = category;
        this.addition = addition;
        this.stihoArticle = stihoArticle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(int discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public int getArtikelnummer() {
        return artikelnummer;
    }

    public void setArtikelnummer(int artikelnummer) {
        this.artikelnummer = artikelnummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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
