/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssbbss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Md Yasin Arif
 */
public class DBConect {
    void createConection() {
    try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbssbbss", "root", "1234");
            
            
            String sq1 = "Select * from login where name = ? and password = ?";
            PreparedStatement pst = con.prepareStatement(sq1);           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }   
    }
    
