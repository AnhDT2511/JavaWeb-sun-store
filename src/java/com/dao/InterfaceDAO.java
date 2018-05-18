/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import java.util.ArrayList;

/**
 *
 * @author Shado
 * @param <T>
 */
public interface InterfaceDAO<T> {   
    ArrayList<T> getAll();
    T getOneById(int id);
    boolean add(T obj);
    boolean updateById(T obj, int id);
    boolean delete(int id);
}
