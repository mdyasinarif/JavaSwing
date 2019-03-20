/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sales.DaoImp;

import com.sales.Dao.SummaryDao;
import com.sales.conn.DBConnection;
import com.sales.pojo.Product;
import com.sales.pojo.Summary;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class SummaryDaoImp implements SummaryDao{
//    public static void main(String[] args) {
//        SummeryDaoImp obj = new SummeryDaoImp();
//        obj.createTable();
//    }
Connection con = DBConnection.getConnect();
    @Override
    public void createTable() {
        String sql = "create table if not exists summery (id int(11) auto_increment primary key,product_name varchar(30) ,product_code varchar(30) unique,total_qty int(11),sold_qty int(11),available_qty int(11),p_id int(11),Foreign key(p_id)REFERENCES product (id))";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save(Summary s) {
       String sql = "insert into summery(product_name,product_code,total_qty,sold_qty,available_qty,p_id) values(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, s.getProductName());
            ps.setString(2, s.getProductCode());
            ps.setInt(3, s.getTotalQty());
            ps.setInt(4, s.getSoldQty());
            ps.setInt(5, s.getAvailableQty());
            ps.setInt(6, s.getProduct().getId());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Summary s) {
        String sql = "update summery set total_qty=?, sold_qty=?,available_qty=? where product_code=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, s.getTotalQty());
            ps.setInt(2, s.getSoldQty());
            ps.setInt(3, s.getAvailableQty());
            ps.setString(4, s.getProductCode());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Summary getRoleByProductCode(String code) {
        Summary summary = null;
        String sql = "select * from summery where product_code=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, code);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                summary = new Summary(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), new Product(rs.getInt(7)));
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return summary;
    }

    @Override
    public List<Summary> getList() {
        List<Summary> list = new ArrayList<>();
        String sql = "select * from summery";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                Summary summary =new Summary(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5),rs.getInt(6),new Product(rs.getInt(7)));
            list.add(summary);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
         return list;
    }
   
}
