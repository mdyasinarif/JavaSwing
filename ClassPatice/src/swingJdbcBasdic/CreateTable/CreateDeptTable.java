
package swingJdbcBasdic.CreateTable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import swingJdbcBasdic.DBConnection;

public class CreateDeptTable {
   static Connection con = DBConnection.getDBConnection();
   
   static void CreateDeptTable(){
       String sql2 = "create table department(did int(11)primary key auto_increment, dname varchar(50) not null)";
       
       try {
           PreparedStatement ps = con.prepareStatement(sql2);
           ps.execute();
           System.out.println("Create Department Table");
       } catch (SQLException ex) {
           Logger.getLogger(CreateDeptTable.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
}
