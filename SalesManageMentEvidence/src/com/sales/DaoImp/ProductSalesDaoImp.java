/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sales.DaoImp;

import com.sales.Dao.ProductSalesDao;
import com.sales.conn.DBConnection;
import com.sales.pojo.Product;
import com.sales.pojo.ProductSales;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class ProductSalesDaoImp implements ProductSalesDao{
    public static void main(String[] args) {
       ProductSalesDaoImp obj = new ProductSalesDaoImp();
       obj.createTable();
    }
Connection con = DBConnection.getConnect();
    @Override
    public void createTable() {
        String sql = "create table if not exists sales (id int(11) auto_increment primary key,product_name varchar(50),product_code varchar(30),qty int(11),unit_price double,total_price double, sales_date date, p_id int(11),FOREIGN KEY (p_id) REFERENCES product(id))";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save(ProductSales ps) {
        String sql = "insert into sales(product_name,product_code,qty,unit_price,total_price,sales_date,p_id) values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, ps.getProductName());
            pst.setString(2, ps.getProductCode());
            pst.setInt(3, ps.getQty());
            pst.setDouble(4, ps.getUnitPrice());
            pst.setDouble(5, ps.getTotalPrice());
            pst.setDate(6, ps.getSalesDate());
            pst.setInt(7, ps.getProduct().getId());
            pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(ProductSales ps) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProductSales getProductSalesById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProductSales getProductSalesByProductCode(String code) {
        ProductSales product = null;
        String sql = "select * from sales where product_code = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, code);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                product = new ProductSales(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDouble(5), rs.getDouble(6), rs.getDate(7),new  Product(rs.getInt(8)));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return product;
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ProductSales> getList() {
        List<ProductSales>list = new ArrayList<>();
        String sql = "select * from sales";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                ProductSales p =new ProductSales(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDouble(5), rs.getDouble(6), rs.getDate(7),new  Product(rs.getInt(8)));list.add(p);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
}
