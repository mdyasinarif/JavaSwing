/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sales.DaoImp;

import com.sales.Dao.ProductDao;
import com.sales.conn.DBConnection;
import com.sales.pojo.Product;
import com.sales.pojo.ProductCatagory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Md Yasin Arif
 */
public class ProductDaoImp implements ProductDao {

    Connection con = DBConnection.getConnect();
//    public static void main(String[] args) {
//        ProductDaoImp dao = new ProductDaoImp();
//        dao.createTable();
//    }

    @Override
    public void createTable() {
        String sql = "create table IF NOT EXISTS product (id int(11) auto_increment primary key, product_name varchar(50), product_code varchar(30), qty int(11), unit_price double, total_price double, purchase_date date, p_cat_id int(5),FOREIGN KEY(p_cat_id) REFERENCES product_catagory(id))";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save(Product p) {

        String sql = "insert into product (product_name,product_code,qty,unit_price,total_price,purchase_date,p_cat_id) values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, p.getProductName());
            ps.setString(2, p.getProductCode());
            ps.setInt(3, p.getQty());
            ps.setDouble(4, p.getUnitPrice());
            ps.setDouble(5, p.getTotalPrice());
            ps.setDate(6, p.getDate());
            ps.setInt(7, p.getProductCatagory().getId());
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
    public Product getProductById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Product getProductByProductCode(String code) {
        Product product = null;
        String sql = "select * from product where product_code=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, code);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                product = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getDate(7), new ProductCatagory(rs.getInt(8)));
            }
        } catch (Exception e) {
        }
        return product;
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Product> getList() {
        List<Product> list = new ArrayList<>();
        String sql = "select * from product";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                Product p = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getDate(7), new ProductCatagory(rs.getInt(8)));
                list.add(p);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
