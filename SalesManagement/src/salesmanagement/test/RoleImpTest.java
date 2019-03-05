/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesmanagement.test;

import salesmanagement.dao.RoleDao;
import salesmanagement.deoImp.RoleDaoImp;
import salesmanagement.pojo.Role;

/**
 *
 * @author User
 */
public class RoleImpTest {
    public static void main(String[] args) {
        RoleDao roleDao = new RoleDaoImp();
       // roleDao.createTable();
        Role role=new Role();
        role.setRoleName("admin");  
        roleDao.save(role);
    }
}
