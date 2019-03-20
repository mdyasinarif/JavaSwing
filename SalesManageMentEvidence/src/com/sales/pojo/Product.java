/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sales.pojo;

import java.sql.Date;

/**
 *
 * @author User
 */
public class Product {
    private int id;
    private String productName;
    private String productCode;
    private int qty;
    private double unitPrice;
    private double totalPrice;
    private Date date;
    private ProductCatagory ProductCatagory;

    public Product() {
    }

    public Product(int id) {
        this.id = id;
    }

    public Product(int id, String productName, String productCode, int qty, double unitPrice, double totalPrice, Date date, ProductCatagory ProductCatagory) {
        this.id = id;
        this.productName = productName;
        this.productCode = productCode;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.date = date;
        this.ProductCatagory = ProductCatagory;
    }

    public Product(String productName, String productCode, int qty, double unitPrice, double totalPrice, Date date, ProductCatagory ProductCatagory) {
        this.productName = productName;
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

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ProductCatagory getProductCatagory() {
        return ProductCatagory;
    }

    public void setProductCatagory(ProductCatagory ProductCatagory) {
        this.ProductCatagory = ProductCatagory;
    }

   

    
    
}
