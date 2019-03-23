/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.Dao;

import com.inventory.pojo.Customer;
import com.inventory.pojo.Product;
import java.util.List;

/**
 *
 * @author Md Yasin Arif
 */
public interface CustomerDao  {
     void createTable();
    void save(Customer c);
    void update(Customer c);
    void delete(int id);
    Customer getProductByProductId(int id);
    List<Customer> getCustomers();
}
