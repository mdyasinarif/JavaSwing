package com.imamia.dao;


import com.imamia.pojo.Role;
import java.util.List;

public interface RoleDao {

    void createTable();

    void save(Role role);

    void update(Role role);

    Role getRoleById(int id);

    Role getRoleByRoleName(String roleName);

    void delete(int id);

    List<Role> getRoles();

}
