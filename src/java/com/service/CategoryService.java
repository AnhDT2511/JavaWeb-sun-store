/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.service;

import com.dao.CategoryDAO;
import com.model.Category;
import java.util.ArrayList;

/**
 *
 * @author Shado
 */
public class CategoryService {

    public ArrayList<Category> getListCategories() {
        return new CategoryDAO().getAll();
    }

}
