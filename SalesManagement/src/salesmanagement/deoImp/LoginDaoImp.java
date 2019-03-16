/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesmanagement.deoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import salesmanagement.Connection.CustomeDBConnection;
import salesmanagement.dao.LoginDao;
import salesmanagement.pojo.Role;
import salesmanagement.pojo.User;

/**
 *
 * @author User
 */
public class LoginDaoImp implements LoginDao{
    Connection con = CustomeDBConnection.getDBConnection();
    @Override
    public User findByUserNameAndPasswird(String username, String password, Role role) {
       User user;
       String sql ="select * from user where User_name=? and password = ? and role_id = ?";
        PreparedStatement ps;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, role.getId());
            ResultSet rs = ps.executeQuery();
            while (rs.nest()) {                
                user = new User(0, sql, username, password, sql, sql, role)
            }
        } catch (Exception e) {
        }
    }
    
}
