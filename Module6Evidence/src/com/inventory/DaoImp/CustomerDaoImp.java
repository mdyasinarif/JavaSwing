/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.DaoImp;

import com.inventory.Dao.CustomerDao;
import com.inventory.connection.DBConnection;
import com.inventory.pojo.Customer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

/**
 *
 * @author Md Yasin Arif
 */
public class CustomerDaoImp implements CustomerDao{
Connection con = DBConnection.getConnet();
    public static void main(String[] args) {
        CustomerDaoImp obj = new CustomerDaoImp();
        obj.createTable();
    }
    @Override
    public void createTable() {
        String sql = "create table if not exists customer(c_id int(10)primary key,c_name varchar(20),address varchar(50))";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println("Table cteated");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save(Customer c) {
       String sql = "insert into customer(c_id,c_name,address)values(?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, c.getCustomerId());
            ps.setString(2, c.getCustomerName());
            ps.setString(3, c.getAddress());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Customer c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Customer getProductByProductId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Customer> getCustomers() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
