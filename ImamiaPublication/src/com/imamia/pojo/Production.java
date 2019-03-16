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
public class Production {
    private int id;
    private String date;
    private String publication;
    private String bookName;
    private String bookCode;
    private String writterName;
    private double unitPrice;
    private int poductionQuantity;
    private double totalCost;

    public Production() {
    }

    public Production(int id) {
        this.id = id;
    }

    public Production(String bookCode) {
        this.bookCode = bookCode;
    }

    public Production(String date, String publication, String bookName, String bookCode, String writterName, double unitPrice, int poductionQuantity, double totalCost) {
        this.date = date;
        this.publication = publication;
        this.bookName = bookName;
        this.bookCode = bookCode;
        this.writterName = writterName;
        this.unitPrice = unitPrice;
        this.poductionQuantity = poductionQuantity;
        this.totalCost = totalCost;
    }

    public Production(int id, String date, String publication, String bookName, String bookCode, String writterName, double unitPrice, int poductionQuantity, double totalCost) {
        this.id = id;
        this.date = date;
        this.publication = publication;
        this.bookName = bookName;
        this.bookCode = bookCode;
        this.writterName = writterName;
        this.unitPrice = unitPrice;
        this.poductionQuantity = poductionQuantity;
        this.totalCost = totalCost;
    }

    public int getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getPublication() {
        return publication;
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

    public int getPoductionQuantity() {
        return poductionQuantity;
    }

    public double getTotalCost() {
        return totalCost;
    }
    
    
}
