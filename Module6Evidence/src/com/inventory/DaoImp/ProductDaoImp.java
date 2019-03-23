/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.DaoImp;

import com.inventory.Dao.*;
import com.inventory.connection.DBConnection;
import com.inventory.pojo.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author Md Yasin Arif
 */
public class ProductDaoImp implements ProductDao{
    public static void main(String[] args) {
        ProductDaoImp obj = new ProductDaoImp();
        obj.createTable();
    }
    Connection con = DBConnection.getConnet();
    @Override
    public void createTable() {
        String sql = "create table if not exists product(P_id int(5) primary key,p_name varchar(50),stock int(10),price double)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println("Table cteated");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save(Product p) {
        String sql = "insert into product(P_id,p_name,stock,price) values(?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, p.getProductId());
            ps.setString(2, p.getProductName());
            ps.setInt(3, p.getStock());
            ps.setDouble(4, p.getPrice());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Product p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product getProductByProductId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Product> getProducts() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
