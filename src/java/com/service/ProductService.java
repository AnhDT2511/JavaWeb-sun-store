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

    public ArrayList<Product> getListProducts(){
        return new ProductDAO().getAll();
    } 
        
    public ArrayList<Product> getListProducts(int categoryId){
        return new ProductDAO().getProductsById(categoryId);
    }
    
    public ArrayList<Product> getListProducts(String text){
        return new ProductDAO().getProductsByName("%"+text.toUpperCase()+"%");
    }
    
    public Product getProduct(int id) {
        return new ProductDAO().getOneById(id);
    }

}
