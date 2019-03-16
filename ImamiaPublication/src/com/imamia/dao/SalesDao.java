/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imamia.dao;

import com.imamia.pojo.Sales;
import java.util.List;

/**
 *
 * @author User
 */
public interface SalesDao {
    void save(Sales role);
    void update(Sales role);
    Sales getBookCode(int id);
    Sales getBookName(String BookName);
    
    void delete(int id);
    
    List<Sales> getSales();
    
}
