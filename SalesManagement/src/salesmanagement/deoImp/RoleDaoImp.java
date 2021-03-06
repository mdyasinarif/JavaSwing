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
import salesmanagement.pojo.Role;
import salesmanagement.pojo.User;
import salesmanagement.view.DataBaseTols;

/**
 *
 * @author User
 */
public class RoleDaoImp implements RoleDao {
    Connection conn = CustomeDBConnection.getDBConnection();
    public RoleDaoImp() {
    }

    @Override
    public void createTable() {
      String sql = "create table IF NOT EXISTS role(id int(2) auto_increment primary key, role_name varchar(20) unique)";
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
    public void save(Role role) {
        String sql = "insert into role(role_name) values (?)";
        PreparedStatement pstm;
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, role.getRoleName());
            pstm.executeUpdate();
            System.out.println("Insert  Success!");
        } catch (SQLException ex) {
            Logger.getLogger(RoleDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void update(Role role) {
      String sql = "update role set role_name = ? where id = ?";
        PreparedStatement pstm;
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, role.getRoleName());
            pstm.setInt(2, role.getId());
            pstm.executeUpdate();
            System.out.println("update  Success!");
        } catch (SQLException ex) {
            Logger.getLogger(RoleDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Role getRoleByid(int id) {
        Role role = new Role();
       String sql = "select * from role where id = ?";
        PreparedStatement pstm;
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()){
                role.setId(rs.getInt(1));
                role.setRoleName(rs.getString(2));
        }
            System.out.println("update  Success!");
        } catch (SQLException ex) {
            Logger.getLogger(RoleDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return role;
    }

    @Override
    public Role getRoleByRoleName(String roleName) {
        Role role = new Role();
       String sql = "select * from role where role_name = ?";
        PreparedStatement pstm;
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, roleName);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()){
                role.setId(rs.getInt(1));
                role.setRoleName(rs.getString(2));
        }
           
        } catch (SQLException ex) {
            Logger.getLogger(RoleDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return role;
    }

    @Override
    public void delete(int id) {
       String sql = "delete from role  where id = ?";
        PreparedStatement pstm;
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, id);
            pstm.executeUpdate();
            System.out.println("Delete  Success!");
        } catch (SQLException ex) {
            Logger.getLogger(RoleDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<Role> getRoles() {       
        List<Role> list = new ArrayList<>();    
        String sql = "select * from role";
        try {
            PreparedStatement ps = CustomeDBConnection.getDBConnection().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                Role role = new Role(rs.getInt(1), rs.getString(2));
                list.add(role);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RoleDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

   
    
}
