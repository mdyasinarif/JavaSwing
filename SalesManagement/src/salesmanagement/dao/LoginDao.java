/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesmanagement.dao;

import salesmanagement.pojo.Role;
import salesmanagement.pojo.User;

/**
 *
 * @author User
 */
public interface LoginDao {
    User findByUserNameAndPasswird(String username,String password,Role role);
}
