/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springmvc.service;

import com.springmvc.dao.ProductEstablishmentDAO;
import com.springmvc.model.ProductEstablishment;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Erik
 */

@Service
@Transactional
public class ProductEstablishmentService {
    
    @Autowired
    private ProductEstablishmentDAO productEstablishmentDAO;

    public void addProductEstablishment(ProductEstablishment productEstablishment) {
        productEstablishmentDAO.addProductEstablishment(productEstablishment);

    }

    public void updateProductEstablishment(ProductEstablishment productEstablishment) {
        productEstablishmentDAO.updateProductEstablishment(productEstablishment);
    }

    public void deleteProductEstablishment(ProductEstablishment productEstablishment) {
        productEstablishmentDAO.deleteProductEstablishment(productEstablishment);
    }

    public List<ProductEstablishment> getProductEstablishments() {
        return productEstablishmentDAO.getProductEstablishments();
    }

    public void storeAllProductEstablishments(List<ProductEstablishment> productEstablishments) {
        productEstablishmentDAO.StoreAllProductEstablishments(productEstablishments);
    }
}
