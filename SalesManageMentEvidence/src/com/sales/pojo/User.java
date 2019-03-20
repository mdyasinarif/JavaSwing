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
public class User {
    private int id;
    private String name;
    private String userName;
    private String password;
    private String modileNo;
    private Role role;

    public User() {
    }

    public User(int id, String name, String userName, String password, String modileNo, Role role) {
        this.id = id;
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.modileNo = modileNo;
        this.role = role;
    }

    public User(String name, String userName, String password, String modileNo, Role role) {
        this.name = name;
        this.userName = userName;
        this.password = password;
        this.modileNo = modileNo;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getModileNo() {
        return modileNo;
    }

    public Role getRole() {
        return role;
    }

    
    
    
}
