/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sales.Dao;


import com.sales.pojo.Summary;
import java.util.List;

/**
 *
 * @author User
 */
public interface SummaryDao {
    void createTable();
    void save(Summary s);
    void update(Summary s);
    Summary getRoleByProductCode(String code);
    
    
    List<Summary>getList();
}
