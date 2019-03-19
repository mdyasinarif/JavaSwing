/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sales.Dao;


import java.util.List;

/**
 *
 * @author User
 */
public interface ProductCatagoryDao {
    void createTable();
    void save(ProductCatagoryDao pc);
    void update(ProductCatagoryDao pc);
    ProductCatagoryDao getProductCatagoryById(int id);
    ProductCatagoryDao getProductCatagoryByCatagoryName(String name);
    void delete(int id);
    List<ProductCatagoryDao>getList();
}
