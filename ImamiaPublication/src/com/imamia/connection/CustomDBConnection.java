/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imamia.connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Md Yasin Arif
 */
public class CustomDBConnection {
   public static  Connection con = null;
  public static Connection getDBConnection(){
      try {
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/icp","root","1234");
          
      } catch (Exception e) {
          e.printStackTrace();
      }
      return con;
  } 
}
