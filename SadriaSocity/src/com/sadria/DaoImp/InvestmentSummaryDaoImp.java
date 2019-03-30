/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sadria.DaoImp;

import com.sadria.Connection.DBConnection;
import com.sadria.Dao.InvestmentSummaryDao;
import com.sadria.Dao.SummaryDao;
import com.sadria.pojo.InvestmentSummary;
import com.sadria.pojo.Person;
import com.sadria.pojo.Summary;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author User
 */
public class InvestmentSummaryDaoImp implements InvestmentSummaryDao {

    Connection con = DBConnection.getConnet();

    public static void main(String[] args) {
        InvestmentSummaryDaoImp obj = new InvestmentSummaryDaoImp();
        obj.createTable();
    }

    @Override
    public void createTable() {
        String sql = "create table if not Exists investmentSummary(id int(4) auto_increment primary key,date date,accountNO varchar(20),projectName varchar(50),projectLocation varchar(20),startDate date,directorName varchar(50), totalInvestment double,return double,balance double,projectDuration int(20))";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            System.out.println("Table created");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save(InvestmentSummary is) {
        String sql = "insert into investmentSummary(date,accountNo ,projectName ,projectLocation ,startDate ,directorName,totalInvestment , return ,balance,projectDuration) values(?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setDate(1, new java.sql.Date(is.getDate().getTime()));
            pst.setString(2, is.getProjectName());
            pst.setString(3, is.getProjectLocation());
            pst.setDate(4, new java.sql.Date(is.getStartDate().getTime()));
            pst.setString(5, is.getDirectortName());

           
            pst.setDouble(6, is.getTotalInvestment());
            pst.setDouble(7, is.getReturnAmount());
            pst.setDouble(8, is.getBalance());
            pst.setInt(9, is.getProjectDuration());

            pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateForDeposit(InvestmentSummary is) {
        String sql = "update investmentSummary set totalDeposit = ? ,balance = ? ,installmentNo = ? , coverDate = ? ,due = ? where accountNo = ?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, s.getTotalDeposit());          
            pst.setInt(2, s.getBalance());
             pst.setInt(3, s.getInstallmentNo());
            pst.setDate(4, new java.sql.Date(s.getCoverDate().getTime()));
           
            pst.setInt(5, s.getDue());
            pst.setString(6, s.getAccountNo());
            pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public InvestmentSummary getInvestmentSummaryByAccontNo(String accountNo) {
        InvestmentSummary is = null;
        String sql = "SELECT * FROM investmentSummary where accountNo=?";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, accountNo);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                s = new InvestmentSummary(rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getDate(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10), rs.getDate(11), rs.getInt(12));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return is;
    }

    @Override
    public List<InvestmentSummary> getInvestmentSummarys() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateForWithdraw(InvestmentSummary is) {
         String sql = "update investmentSummary set totalWithdraw =? , balance=?, installmentNo = ? , coverDate = ? , due = ? where accountNo = ?";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, is.getTotalWithdraw());          
            
            pst.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
