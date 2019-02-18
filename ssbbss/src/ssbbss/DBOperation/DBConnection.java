package ssbbss.DBOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {

    public static Connection getDBConection() {
        Connection con = null;
        try {
           // Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbssbbss", "root", "1234");
            //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbssbbss", "root", "1234");
            System.out.println("Connected");
        } catch (Exception ex) {
            System.out.println("Not connected");
        }
        return con;
    }

    static Connection getDBConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
