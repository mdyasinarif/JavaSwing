package swingJdbcBasdic.CreateTable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import swingJdbcBasdic.DBConnection;

public class CreateStudentTable {

    static Connection con = DBConnection.getDBConnection();

    public static void CreateStudentTable() {
        String sql = "create table student(id int(11) primary key auto_increment,name varchar(50) not null)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
            System.out.println("Student Table created");
        } catch (SQLException ex) {
            Logger.getLogger(CreateStudentTable.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
