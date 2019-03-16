/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imamia.pojo;

/**
 *
 * @author User
 */
public class Sales {
    private int id;
    private String date;
    private String branch;
    private String bookName;
    private String bookCode;
    private String writterName;
    private double unitPrice;
    private int quantity;
    private double totalCost;

    public Sales() {
    }

    public Sales(int id) {
        this.id = id;
    }

    public Sales(String bookCode) {
        this.bookCode = bookCode;
    }

    public Sales(int id, String date, String branch, String bookName, String bookCode, String writterName, double unitPrice, int quantity, double totalCost) {
        this.id = id;
        this.date = date;
        this.branch = branch;
        this.bookName = bookName;
        this.bookCode = bookCode;
        this.writterName = writterName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.totalCost = totalCost;
    }

    public Sales(String date, String branch, String bookName, String bookCode, String writterName, double unitPrice, int quantity, double totalCost) {
        this.date = date;
        this.branch = branch;
        this.bookName = bookName;
        this.bookCode = bookCode;
        this.writterName = writterName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.totalCost = totalCost;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getBranch() {
        return branch;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookCode() {
        return bookCode;
    }

    public String getWritterName() {
        return writterName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getTotalCost() {
        return totalCost;
    }

    
    
    
}
