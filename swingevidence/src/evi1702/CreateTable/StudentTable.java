/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evi1702.CreateTable;

import evi1702.view.DBConnection.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class StudentTable {
    static  Connection con = DBConnection.getConnection();
    public static void createStudentTable(){
        try {
            String sql = "create table studentTable (Id int(10) primary key auto_increment,Name varchar(50) not null,Age int(2),Email varchar(50),Gender varchar(50),Cource varchar(50),Round varchar(10),Comment varchar(150))";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println("Table is created");
        } catch (SQLException ex) {
            Logger.getLogger(StudentTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
