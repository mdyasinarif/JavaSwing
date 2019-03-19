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
public class Summary {
    private int id;
    private String productName;
    private String productCode;
    private int totalQty;
    private int soldQty;
    private int availableQty;
    private Product product;

    public Summary() {
    }

    public Summary(int id, String productName, String productCode, int totalQty, int soldQty, int availableQty, Product product) {
        this.id = id;
        this.productName = productName;
        this.productCode = productCode;
        this.totalQty = totalQty;
        this.soldQty = soldQty;
        this.availableQty = availableQty;
        this.product = product;
    }

    public Summary(String productName, String productCode, int totalQty, int soldQty, int availableQty, Product product) {
        this.productName = productName;
        this.productCode = productCode;
        this.totalQty = totalQty;
        this.soldQty = soldQty;
        this.availableQty = availableQty;
        this.product = product;
    }

    public Summary(String productName, String productCode, int totalQty, int soldQty, int availableQty) {
        this.productName = productName;
        this.productCode = productCode;
        this.totalQty = totalQty;
        this.soldQty = soldQty;
        this.availableQty = availableQty;
    }

    public int getId() {
        return id;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public int getTotalQty() {
        return totalQty;
    }

    public int getSoldQty() {
        return soldQty;
    }

    public int getAvailableQty() {
        return availableQty;
    }

    public Product getProduct() {
        return product;
    }
    
}
