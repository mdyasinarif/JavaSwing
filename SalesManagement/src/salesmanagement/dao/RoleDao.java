/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesmanagement.dao;

import java.util.List;
import salesmanagement.pojo.Role;
import salesmanagement.pojo.User;

/**
 *
 * @author User
 */
public interface RoleDao {
    void createTable();
    void save(Role role);
    void update(Role role);
    Role getRoleByid(int id);
    Role getRoleByRoleName(String roleName);
    
    void delete(int id);
    
    List<Role> getRoles();
   
}
