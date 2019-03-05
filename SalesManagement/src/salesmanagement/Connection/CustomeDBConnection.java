
package salesmanagement.Connection;

import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CustomeDBConnection {
    // first create database using mysql                                            
    // create database salesmgt 
    static Connection conn = null;
    
    public static Connection getDBConnection(){
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/salesmgt","root","1234");
            System.out.println("Connected");
            return conn;
        } catch (SQLException ex) {
            Logger.getLogger(CustomeDBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
    public static Connection getDBConnections(String host,String port,String dbname,String username,String password){
        try {
            conn = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+dbname,username,password);
            System.out.println("Connected");
            return conn;
        } catch (SQLException ex) {
            Logger.getLogger(CustomeDBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
}
