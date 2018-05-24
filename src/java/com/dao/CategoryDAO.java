/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.connection.MySQLConnection;
import com.model.Category;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Shado
 */
public class CategoryDAO implements InterfaceDAO<Category> {

    private Connection connection = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    @Override
    public ArrayList<Category> getAll() {
        ArrayList<Category> list = new ArrayList<>();
        String sql = "SELECT * FROM category";
        try {
            connection = MySQLConnection.getMySQLConnection();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Category category = new Category();
                category.setId(rs.getInt(1));
                category.setName(rs.getString(2));
                category.setStatus(rs.getInt(3));
                category.setCreateTime(rs.getString(4));
                list.add(category);
            }
            return list;
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            MySQLConnection.closeResultSet(rs);
            MySQLConnection.closePreparedStatement(ps);
            MySQLConnection.closeConnection(connection);
        }
        return null;
    }

    @Override
    public Category getOneById(int id) {
        String sql = "SELECT * FROM category WHERE Id = ?";
        try {
            connection = MySQLConnection.getMySQLConnection();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                Category category = new Category();
                category.setId(rs.getInt(1));
                category.setName(rs.getString(2));
                category.setStatus(rs.getInt(3));
                category.setCreateTime(rs.getString(4));
                return category;
            }
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            MySQLConnection.closeResultSet(rs);
            MySQLConnection.closePreparedStatement(ps);
            MySQLConnection.closeConnection(connection);
        }
        return null;
    }

    @Override
    public boolean add(Category obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean updateById(Category obj, int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

//    public static void main(String[] args) {
//        CategoryDAO cdao = new CategoryDAO();
//        System.out.println(cdao.getOneById(8));
//    }
}
