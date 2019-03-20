/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sales.DaoImp;

import com.sales.Dao.RoleDao;
import com.sales.conn.DBConnection;
import com.sales.pojo.Role;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class RoleDaoImp implements RoleDao {

    Connection con = DBConnection.getConnect();

//    public static void main(String[] args) {
//        RoleDaoImp obj = new RoleDaoImp();
//        obj.createTable();
//    }

    @Override
    public void createTable() {
        String sql = "create table if not exists role(id int(2) auto_increment primary key,role_name varchar(50)unique)";
        try {
            PreparedStatement prst = con.prepareStatement(sql);
            prst.execute();
            System.out.println("Table Cteated");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save(Role role) {
       String sql = "insert into role(role_name)values(?)";
        try {
           PreparedStatement prst = con.prepareStatement(sql);
           prst.setString(1,role.getRoleName() );
           prst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Role role) {
        String sql = "update role set role_name=? where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, role.getRoleName());
            ps.setInt(2, role.getId());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Role getRoleByRoleId(int id) {
        Role role = new Role();
        String sql = "Select * from role where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                role.setId(rs.getInt(1));
                role.setRoleName(rs.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return role;
    }

    @Override
    public Role getRoleByRoleName(String name) {
        Role role = new Role();
        String sql = "select * from role where role_name=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                role.setId(rs.getInt(1));
                role.setRoleName(rs.getString(2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return role;
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Role> getRoles() {
       List<Role> list = new ArrayList<>();
       String sql = "Select * from role";
        try {
            PreparedStatement ps = DBConnection.getConnect().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                Role role = new Role(rs.getInt(1), rs.getString(2));
                list.add(role);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
