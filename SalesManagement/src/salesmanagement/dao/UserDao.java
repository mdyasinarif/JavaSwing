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
public interface UserDao {
    void createTable();
    void save(User user);
    void update(User user);
    User getUserByid(int id);
    User getUserByUserName(String userName);
    
    void delete(int id);
    
    List<User> getUsers();
    
}
