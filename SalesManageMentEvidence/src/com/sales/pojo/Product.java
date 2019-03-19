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
public class Product {
    private int id;
    private String name;
    private String productCode;
    private int qty;
    private double unitPrice;
    private double totalPrice;
    private String date;
    private String ProductCatagory;

    public Product() {
    }

    public Product(int id) {
        this.id = id;
    }

    public Product(int id, String name, String productCode, int qty, double unitPrice, double totalPrice, String date, String ProductCatagory) {
        this.id = id;
        this.name = name;
        this.productCode = productCode;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.date = date;
        this.ProductCatagory = ProductCatagory;
    }

    public Product(String name, String productCode, int qty, double unitPrice, double totalPrice, String date, String ProductCatagory) {
        this.name = name;
        this.productCode = productCode;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.date = date;
        this.ProductCatagory = ProductCatagory;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getProductCode() {
        return productCode;
    }

    public int getQty() {
        return qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getDate() {
        return date;
    }

    public String getProductCatagory() {
        return ProductCatagory;
    }
    
    
}
