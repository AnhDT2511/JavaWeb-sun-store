/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.connection.MySQLConnection;
import com.model.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author Shado
 */
public class ProductDAO implements InterfaceDAO<Product> {

    private Connection connection = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    @Override
    public ArrayList<Product> getAll() {
        ArrayList<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM product";
        try {
            connection = MySQLConnection.getMySQLConnection();
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt(1));
                product.setCategoryId(rs.getInt(2));
                product.setName(rs.getString(3));
                product.setPrice(formatMoney(rs.getString(4)));
                product.setSize(rs.getString(5));
                product.setDescription(rs.getString(6));
                product.setStatus(rs.getInt(7));
                product.setImageUrl(rs.getString(8));
                product.setCreateTime(rs.getString(9));
                list.add(product);
            }
            return list;
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            com.connection.MySQLConnection.closeResultSet(rs);
            com.connection.MySQLConnection.closePreparedStatement(ps);
            com.connection.MySQLConnection.closeConnection(connection);
        }
        return null;
    }
    
    public ArrayList<Product> getProductsById(int id) {
        ArrayList<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM product WHERE CategoryId = ?";
        try {
            connection = MySQLConnection.getMySQLConnection();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt(1));
                product.setCategoryId(rs.getInt(2));
                product.setName(rs.getString(3));
                product.setPrice(formatMoney(rs.getString(4)));
                product.setSize(rs.getString(5));
                product.setDescription(rs.getString(6));
                product.setStatus(rs.getInt(7));
                product.setImageUrl(rs.getString(8));
                product.setCreateTime(rs.getString(9));
                list.add(product);
            }
            return list;
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            com.connection.MySQLConnection.closeResultSet(rs);
            com.connection.MySQLConnection.closePreparedStatement(ps);
            com.connection.MySQLConnection.closeConnection(connection);
        }
        return null;
    }
    
    public ArrayList<Product> getProductsByName(String text) {
        ArrayList<Product> list = new ArrayList<>();
        String sql = "SELECT * FROM product WHERE Name LIKE ?";
        try {
            connection = MySQLConnection.getMySQLConnection();
            ps = connection.prepareStatement(sql);
            ps.setString(1, text);
            rs = ps.executeQuery();
            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt(1));
                product.setCategoryId(rs.getInt(2));
                product.setName(rs.getString(3));
                product.setPrice(formatMoney(rs.getString(4)));
                product.setSize(rs.getString(5));
                product.setDescription(rs.getString(6));
                product.setStatus(rs.getInt(7));
                product.setImageUrl(rs.getString(8));
                product.setCreateTime(rs.getString(9));
                list.add(product);
            }
            return list;
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            com.connection.MySQLConnection.closeResultSet(rs);
            com.connection.MySQLConnection.closePreparedStatement(ps);
            com.connection.MySQLConnection.closeConnection(connection);
        }
        return null;
    }

    @Override
    public Product getOneById(int id) {
        String sql = "SELECT * FROM product WHERE Id = ?";
        try {
            connection = MySQLConnection.getMySQLConnection();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt(1));
                product.setCategoryId(rs.getInt(2));
                product.setName(rs.getString(3));
                product.setPrice(formatMoney(rs.getString(4)));
                product.setSize(rs.getString(5));
                product.setDescription(rs.getString(6));
                product.setStatus(rs.getInt(7));
                product.setImageUrl(rs.getString(8));
                product.setCreateTime(rs.getString(9));
                return product;
            }
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            com.connection.MySQLConnection.closeResultSet(rs);
            com.connection.MySQLConnection.closePreparedStatement(ps);
            com.connection.MySQLConnection.closeConnection(connection);
        }
        return null;
    }

    @Override
    public boolean add(Product obj) {
        int check = 0;
        String sql = "INSERT INTO product(CategoryId, Name, Price, Size, Description, Status, ImageUrl)"
                + " VALUES(?, ?, ?, ?, ?, ?, ?)"; 
        try {
            connection = MySQLConnection.getMySQLConnection();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, obj.getCategoryId());
            ps.setString(2, obj.getName());
            ps.setString(3, obj.getPrice());
            ps.setString(4, obj.getSize());
            ps.setString(5, obj.getDescription());
            ps.setInt(6, obj.getStatus());
            ps.setString(7, obj.getImageUrl());
            check = ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            MySQLConnection.closePreparedStatement(ps);
            MySQLConnection.closeConnection(connection);
        }
        return check > 0;
    }

    @Override
    public boolean updateById(Product obj, int id) {
        int check = 0;
        String sql = "UPDATE product SET CategoryId = ?, Name = ?, Price = ?, Size = ?, Description = ?, Status = ?, ImageUrl = ? "
                   + "WHERE Id = ?";
        try {
            connection = MySQLConnection.getMySQLConnection();
            ps = connection.prepareStatement(sql);
            ps.setInt(1, obj.getCategoryId());
            ps.setString(2, obj.getName());
            ps.setString(3, obj.getPrice());
            ps.setString(4, obj.getSize());
            ps.setString(5, obj.getDescription());
            ps.setInt(6, obj.getStatus());
            ps.setString(7, obj.getImageUrl());
            ps.setInt(8, id);
            check = ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            MySQLConnection.closePreparedStatement(ps);
            MySQLConnection.closeConnection(connection);
        }
        return check > 0;
    }

    @Override
    public boolean delete(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private String formatMoney(String value) {
        DecimalFormat myFormatter = new DecimalFormat("###,###.###");
        return myFormatter.format(Double.valueOf(value));
    }

//    public static void main(String[] args) {
//        ProductDAO pdao = new ProductDAO();
//        String des = "Balo vải bố dày có quai và đáy làm bằng da bò tự nhiên."
//                + "Một ngăn dây kéo lớn mặt trước."
//                + "Một ngăn dây kéo hông phải, 1 túi đắp hông trái."
//                + "Một ngăn dây kéo bên trong và 2 túi nhỏ.";
//        Product p = new Product(1, "SOLDIER GREEN/KALE", "2400000", "29 x 45 x 13 cm - 21.5L", des, 0, "images/soldier-green-kale.jpg");
//        System.out.println(pdao.getProductsByName("S"));
//        
//    }

}
