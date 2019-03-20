/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sales.DaoImp;

import com.mysql.cj.protocol.Resultset;
import com.sales.Dao.LoginDao;
import com.sales.conn.DBConnection;
import com.sales.pojo.Role;
import com.sales.pojo.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author Md Yasin Arif
 */
public class LoginDaoImp implements LoginDao{
    Connection con = DBConnection.getConnect();
    @Override
    public User findByUserNameAndPassword(String userName, String password) {
        User user = null;
        String sql = "select * from user where userName=? and password=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, userName);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                user = new User(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), new Role(rs.getInt(6)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
    
}
