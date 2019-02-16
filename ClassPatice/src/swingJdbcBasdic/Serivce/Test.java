/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingJdbcBasdic.Serivce;

import swingJdbcBasdic.pojo.Student;

/**
 *
 * @author User
 */
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Yasin");
        
        CommonDAO commonDAO = new  StuentSerivce();
        commonDAO.save(s1);
        
    }
    
}
