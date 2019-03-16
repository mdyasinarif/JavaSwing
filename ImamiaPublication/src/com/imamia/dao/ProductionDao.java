/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imamia.dao;


import com.imamia.pojo.Production;
import java.util.List;

/**
 *
 * @author User
 */
public interface ProductionDao {
    void save(Production pro);
    void update(Production pro);
    Production getProductionByIsbn(String isbn);
    Production getBookName(Production BookName);
    
    void delete(int id);
    
    List<Production> getSales();
    
}
