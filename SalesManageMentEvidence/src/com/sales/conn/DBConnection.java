/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sales.conn;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author User
 */
public class DBConnection {
    static Connection con = null;
    public static Connection getConnect(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/salesMgt2", "root", "1234");
            System.out.println("Connected");
            return con;
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    return null;
    }
}
