/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesmanagement.deoImp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import salesmanagement.Connection.CustomeDBConnection;
import salesmanagement.dao.RoleDao;
import salesmanagement.dao.UserDao;
import salesmanagement.pojo.Role;
import salesmanagement.pojo.User;
import salesmanagement.view.DataBaseTols;

/**
 *
 * @author User
 */
public class UserDaoImp implements UserDao {
    Connection conn = CustomeDBConnection.getDBConnection();
    public UserDaoImp() {
    }
//    public static void main(String[] args) {
//        UserDaoImp obj = new UserDaoImp();
//        obj.createTable() ;
//    }
    @Override
    public void createTable() {
        String sql = "create table IF NOT EXISTS user(id int(11) auto_increment primary key, name varchar(20), user_name varchar(30) unique,password varchar(30),email varchar(50),mobile_no varchar(14),role_id int(2), foreign key (role_id) references role(id))";
        PreparedStatement pstm;
        try {
            pstm = conn.prepareStatement(sql);
            pstm.execute();
            System.out.println("Table Created!");
        } catch (SQLException ex) {
            Logger.getLogger(RoleDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void save(User user) {
        String sql = "insert into user(name,user_name,password,email,mobile_no,role_id) values (?,?,?,?,?,?)";
        PreparedStatement pstm;
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, user.getName());
            pstm.setString(2, user.getUserName());
            pstm.setString(3, user.getPassword());
            pstm.setString(4, user.getEmail());
            pstm.setString(5, user.getModile());
            pstm.setInt(6, user.getRole().getId());
            pstm.executeUpdate();
            System.out.println("Insert  Success!");
        } catch (SQLException ex) {
            Logger.getLogger(RoleDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(User user) {
        String sql = "update user set name = ?,  user_name = ?,password = ?, email = ?,mobile_no = ?,role_id = ? where id = ?";
        PreparedStatement pstm;
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, user.getName());
            pstm.setString(2, user.getUserName());
            pstm.setString(3, user.getPassword());
            pstm.setString(4, user.getEmail());
            pstm.setString(5, user.getModile());
            pstm.setInt(6, user.getRole().getId());
            pstm.setInt(7, user.getId());
            
            
            pstm.executeUpdate();
            System.out.println("update  Success!");
        } catch (SQLException ex) {
            Logger.getLogger(RoleDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public User getUserByid(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User getUserByUserName(String userName) {
        User user = new User();
       String sql = "select * from user where name = ?";
        PreparedStatement pstm;
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, userName);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()){
                user.setId(rs.getInt(1));
                user.setName(rs.getString(2));
                user.setUserName(rs.getString(3));
                user.setPassword(rs.getString(4));
                user.setEmail(rs.getString(5));
                user.setModile(rs.getString(6));
                user.setRole(new Role(rs.getInt(7)));
        }
           
        } catch (SQLException ex) {
            Logger.getLogger(RoleDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();  
        User user;
        String sql = "select * from user";
        try {
            PreparedStatement ps = CustomeDBConnection.getDBConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {    
                Role role = new Role(rs.getInt(7));
                 user = new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),role);
                users.add(user);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RoleDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }
    }

    
   
    


