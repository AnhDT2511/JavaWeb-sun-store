/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.model.Product;
import com.dao.ProductDAO;
import java.util.ArrayList;

/**
 *
 * @author Shado
 */
public class ProductService{

    public ArrayList<Product> getListProducts(int categoryId, String text) {
        if(categoryId == 0 && text == null){
            return new ProductDAO().getAll();
        }else if(categoryId != 0 && text == null){
            return new ProductDAO().getProductsById(categoryId);
        }else{
            return new ProductDAO().getProductsByName("%"+text.toUpperCase()+"%");
        }
    }
    
    public ArrayList<Product> getListProducts(){
        System.out.println("CHECK");
        return new ProductDAO().getAll();
    }
    
    public Product getProduct(int id) {
        return new ProductDAO().getOneById(id);
    }

}
