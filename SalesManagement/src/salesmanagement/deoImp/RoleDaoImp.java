/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesmanagement.deoImp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import salesmanagement.Connection.CustomeDBConnection;
import salesmanagement.dao.RoleDao;
import salesmanagement.pojo.Role;
import salesmanagement.view.DataBaseTols;

/**
 *
 * @author User
 */
public class RoleDaoImp implements RoleDao {

    @Override
    public void createTable(String sql) {
//        String sql = "create table IF NOT EXISTS role(id int(2) auto_increment primary key, role_name varchar(20) unique)";
        PreparedStatement pstm;
        try {
            pstm = DataBaseTols.conn.prepareCall(sql);
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
            pstm = DataBaseTols.conn.prepareCall(sql);
            pstm.setString(1, role.getRoleName());
            pstm.executeUpdate();
            System.out.println("Insert  Success!");
        } catch (SQLException ex) {
            Logger.getLogger(RoleDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void update(Role role) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getRoleByid(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void getRoleByRoleName(String roleName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Role> getRoles() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
