/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.pojo;

/**
 *
 * @author User
 */
public class Sales {
    private int salesNo;
    private int customerId;
    private int productId;
    private int qty;
    private double price;

    public Sales() {
    }

    public Sales(int salesNo, int customerId, int productId, int qty, double price) {
        this.salesNo = salesNo;
        this.customerId = customerId;
        this.productId = productId;
        this.qty = qty;
        this.price = price;
    }

    public Sales(int customerId, int productId, int qty, double price) {
        this.customerId = customerId;
        this.productId = productId;
        this.qty = qty;
        this.price = price;
    }

    public int getSalesNo() {
        return salesNo;
    }

    public void setSalesNo(int salesNo) {
        this.salesNo = salesNo;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
