/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daoImpl;

import conn.ConnectionDB;
import static conn.ConnectionDB.conn;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojo.ProductCategory;

/**
 *
 * @author ccsl-pc
 */
public class ProductCatService {
    
    public static void createTable() {
        String sql = "create table IF NOT EXISTS productCat(id int(5) primary key auto_increment,catName varchar(55) unique)";
        Connection conn = ConnectionDB.connecet();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.executeUpdate();
            System.out.println("Table created!!");
        } catch (SQLException ex) {
            Logger.getLogger(RoleServices.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(RoleServices.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public int save(String catName) {
        
        String sql = "insert into productcat(catName) values(?) ";
         Connection conn = ConnectionDB.connecet();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, catName);
            ps.execute();
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(RoleServices.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(RoleServices.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return -1;
    }
    
    public ProductCategory getProductCatByProductName(String catName){
        ProductCategory pc=null;
                 
        String sql = "Select * from productcat where catName=?";
        Connection conn = ConnectionDB.connecet();
        
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, catName);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                pc = new ProductCategory(rs.getInt(1), rs.getString(2));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RoleServices.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(RoleServices.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       return pc; 
    }
    
    public ProductCategory getProductCatByCatId(int id){
        ProductCategory pc=null;
                 
        String sql = "Select * from productcat where id=?";
        Connection conn = ConnectionDB.connecet();
        
        
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                pc = new ProductCategory(rs.getInt(1), rs.getString(2));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(RoleServices.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(RoleServices.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       return pc; 
    }
    
    public List<ProductCategory> getCatList() {
        List<ProductCategory> list = new ArrayList();
        String sql = "Select * from productcat";
        Connection conn = ConnectionDB.connecet();
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new ProductCategory(rs.getInt(1), rs.getString(2)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(RoleServices.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                Logger.getLogger(RoleServices.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return list;
    }
    
}
