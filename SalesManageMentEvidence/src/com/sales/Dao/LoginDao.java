/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sales.Dao;

import com.sales.pojo.User;

/**
 *
 * @author User
 */
public interface LoginDao {
    User findByUserNameAndPassword(String userName,String Password);
}
