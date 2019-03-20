package com.sales.pojo;

public class ProductCatagory {

    private int id;
    private String catName;

    public ProductCatagory() {
    }

    public ProductCatagory(int id, String catName) {
        this.id = id;
        this.catName = catName;
    }

    public ProductCatagory(int id) {
        this.id = id;
    }

    public ProductCatagory(String catName) {
        this.catName = catName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

}
