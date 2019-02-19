/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssbbss.DBOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import ssbbss.domain.CreateInvestment;

/**
 *
 * @author User
 */
public class CreateInvestmentCop implements CommonDAO {

    Connection con = DBConnection.getDBConection();

    public void save(CreateInvestment ci) {
        Connection con = null;
        PreparedStatement pst = null;

        try {
            con = DBConnection.getDBConection();
            pst = con.prepareStatement("insert into investmentinfo values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setInt(1, ci.getAccountNo());
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
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void update(CreateInvestment ci) {
        Connection con = null;
        PreparedStatement pst = null;

        try {
            con = DBConnection.getDBConection();
            pst = con.prepareStatement("update  investmentinfo set  FromNO = ? , CardNo = ?,ProjectName=?,ProjectLocation=?,InvestedAmount=?, StartDate=?,ProjectDuration=?,Name=?,MotherName=?,FatherHusbendName=?,PresentAddress=?,ParmanetAddress=?,NIDNo=?,MobileNo=? where AccountNo = ?");
            pst.setInt(1, ci.getAccountNo());
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
                JOptionPane.showMessageDialog(null, "Data is Updated");
            } else {
                JOptionPane.showMessageDialog(null, "Data is Not Updated");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void delete(CreateInvestment ci) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteByAccountNo(String AccountNo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CreateInvestment getByAccountNo(int AccountNo) {

        String sql = "SELECT * FROM investmentinfo where AccountNo=?";
        CreateInvestment ci = null;
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, AccountNo);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                ci = new CreateInvestment();
                ci.setAccountNo(rs.getInt(1));
                ci.setFromNO(rs.getString(2));
                ci.setCardNo(rs.getString(3));
                ci.setProjectName(rs.getString(4));
                ci.setProjectLocation(rs.getString(5));
                ci.setInvestedAmount(rs.getString(6));
                ci.setStartDate(rs.getString(7));
                ci.setProjectDuration(rs.getString(8));
                ci.setName(rs.getString(9));
                ci.setMotherName(rs.getString(10));
                ci.setFatherHusbendName(rs.getString(11));
                ci.setPresentAddress(rs.getString(12));
                ci.setParmanetAddress(rs.getString(13));
                ci.setNIDNo(rs.getString(14));
                ci.setMobileNo(rs.getString(15));

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println(ci);
        return ci;
    }

    @Override
    public List<CreateInvestment> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
