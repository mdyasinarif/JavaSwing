/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sales.Dao;


import com.sales.pojo.Product;
import com.sales.pojo.ProductSales;
import java.util.List;

/**
 *
 * @author User
 */
public interface ProductSalesDao {
    void createTable();
    void save(ProductSales ps);
    void update(ProductSales ps);
    ProductSales getProductSalesById(int id);
    ProductSales getProductSalesByProductCode(String code);
    void delete(int id);
    List<ProductSales>getList();
}
