/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssbbss.DBOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ssbbss.pojo.CreateInvestment;

/**
 *
 * @author User
 */
public class CreateInvestmentCop {

    public void save(CreateInvestment ci) {
        PreparedStatement pst = null;
        Connection con=null;
        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbssbbss", "root", "1234");
            con = DBConnection.getDBConection();
            pst = con.prepareStatement("insert into investmentinfo values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, ci.getAccountNo());
            pst.setString(2, ci.getFromNO());
            pst.setString(3, ci.getCardNo());
            pst.setString(4, ci.getProjectName());
            pst.setString(5, ci.getProjectLocation());
            pst.setString(6, ci.getInvestedAmount());
            pst.setString(7, ci.getStartDate());
            pst.setString(8, ci.getProjectDuration());
            pst.setString(9, ci.getName());
            pst.setString(10, ci.getMotherName());
            pst.setString(11, ci.getFatherHusbendName());
            pst.setString(12, ci.getPresentAddress());
            pst.setString(13, ci.getParmanetAddress());
            pst.setString(14, ci.getNIDNo());
            pst.setString(15, ci.getMobileNo());

            int i = pst.executeUpdate();
            if (i > 0) {
                JOptionPane.showMessageDialog(null, "Data is Saved");
            } else {
                JOptionPane.showMessageDialog(null, "Data is Not Saved");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(CreateInvestmentCop.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
