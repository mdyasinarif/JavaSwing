/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mataData;


import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class MetaData {
    static  Connection connection = CustomeDBConnection.getDBConnection();
    static DatabaseMetaData metadata = null;
            
    static {
        try {
            metadata = connection.getMetaData();
        } catch (Exception e) {
       e.printStackTrace();
        }
    }
    public static void printGeneralMatadata() throws SQLException{
        System.out.println("Database Name: "+metadata.getDatabaseProductName());
        System.out.println("Database varsion :"+metadata.getDatabaseProductVersion());
        System.out.println("Logged ser :"+metadata.getUserName());
        System.out.println("JDBC Driver :"+metadata.getDriverName());
        System.out.println("Driver Version :"+metadata.getDriverVersion());
        System.out.println("\n");
    }
   public static  ArrayList getTableMetadata() throws SQLException{
       String table[] = {"TABLE"};;
       ResultSet rs = null;
       ArrayList tables = null;
       rs = metadata.getTables(null, null, null, table);
       tables = new ArrayList();
       while (rs.next()) {           
           tables.add(rs.getString("TABLE_NAME"));
       }
       return tables;
   }
   public static  void getColoumMetadata(ArrayList tables) throws SQLException{     ResultSet rs = null;
       for (Object actualTable : tables) {
           rs = metadata.getColumns(null, null, actualTable.toString(), null);
           System.out.println(actualTable.toString().toUpperCase());
           while (rs.next()) {
               System.out.println(rs.getString("COLUMN_NAME")+" "+rs.getString("TYPE_NAME")+" "+rs.getString("COLUMN_SIZE"));
               
           }
           System.out.println("\n");
       }
   }
    public static void main(String[] args) throws SQLException {
        MetaData.printGeneralMatadata();
        getColoumMetadata(getTableMetadata());
        
        
    }
}
