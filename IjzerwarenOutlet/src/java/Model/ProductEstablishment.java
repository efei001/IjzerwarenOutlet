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
public class ProductEstablishment {
    private Establishment establishment;
    private Product product;
    private int stock;
    private float chosenPrice;

    public ProductEstablishment(Establishment establishment, Product product, int stock, float chosenPrice) {
        this.establishment = establishment;
        this.product = product;
        this.stock = stock;
        this.chosenPrice = chosenPrice;
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
