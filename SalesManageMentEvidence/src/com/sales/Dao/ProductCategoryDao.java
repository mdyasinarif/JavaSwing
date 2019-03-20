package com.sales.Dao;


import com.sales.pojo.ProductCatagory;
import java.util.List;

public interface ProductCategoryDao {

    void createTable();

    void save(ProductCatagory pc);

    void update(ProductCatagory pc);

    ProductCatagory getProductCategoryById(int id);

    ProductCatagory getProductCategoryBycategoryName(String catName);

    void delete(int id);

    List<ProductCatagory> getList();

}
