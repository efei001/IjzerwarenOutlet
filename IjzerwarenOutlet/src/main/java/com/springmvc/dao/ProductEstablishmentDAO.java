/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springmvc.dao;

import com.springmvc.model.Establishment;
import com.springmvc.model.ProductEstablishment;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Erik
 */
public class ProductEstablishmentDAO {
    
    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
    
     public void addProductEstablishment(ProductEstablishment productEstablishment) {
        getCurrentSession().save(productEstablishment);
    }
     
    public void updateProductEstablishment(ProductEstablishment productEstablishment) {
        ProductEstablishment productEstablishMentToUpdate = productEstablishment;
        productEstablishMentToUpdate.setChosenPrice(productEstablishment.getChosenPrice());
        productEstablishMentToUpdate.setEstablishment(productEstablishment.getEstablishment());
        productEstablishMentToUpdate.setProduct(productEstablishment.getProduct());
        productEstablishMentToUpdate.setStock(productEstablishment.getStock());
        
        getCurrentSession().update(productEstablishMentToUpdate);
    }
    
    public void deleteProductEstablishment(ProductEstablishment productEstablishment) {
        ProductEstablishment productEstablishmentToDelete = productEstablishment;
        if (productEstablishmentToDelete != null) {
            getCurrentSession().delete(productEstablishmentToDelete);
        }

    }
    
    public List<ProductEstablishment> getProductEstablishments() {
        return getCurrentSession().createQuery("from ProductEstablishment").list();
    }

    public void StoreAllProductEstablishments(List<ProductEstablishment> productEstablishments) {

        for (ProductEstablishment product : productEstablishments) {
            getCurrentSession().save(product);
        }
    }
}
