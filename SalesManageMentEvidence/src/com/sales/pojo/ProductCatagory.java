/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sales.pojo;

/**
 *
 * @author User
 */
public class ProductCatagory {
    private int id;
    private String catName;

    public ProductCatagory() {
    }

    public ProductCatagory(int id, String catName) {
        this.id = id;
        this.catName = catName;
    }

    public ProductCatagory(String catName) {
        this.catName = catName;
    }

    public int getId() {
        return id;
    }

    public String getCatName() {
        return catName;
    }
    
    
}
