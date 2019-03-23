/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sadria.DaoImp;

import com.sadria.Connection.DBConnection;
import com.sadria.Dao.PersonDao;
import com.sadria.pojo.Person;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class PersonDaoImp implements PersonDao{
Connection con = DBConnection.getConnet();
    public static void main(String[] args) {
        PersonDaoImp obj = new PersonDaoImp();
        obj.createTable();
    }
    @Override
    public void createTable() {
        String sql = "create table if not Exists person(id int(4) auto_increment primary key,accountNo varchar(20),fromNO varchar(20),cardNo varchar(20),admissionDate date,name varchar(20),motherName varchar(20),fatherHusbendName varchar(20),gender varchar(20),religion varchar(20),dateofBirth varchar(20),nIDNo varchar(20),mobileNo varchar(20),presentAddress varchar(50),parmanetAddress varchar(50),savingType varchar(20),savingsAmount int(20),nomineName varchar(20),relations varchar(20),share int(20))";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.execute();
            System.out.println("Table Created");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void save(Person p) {
        String sql = "insert into person(accountNo ,fromNO ,cardNo ,admissionDate ,name ,motherName,fatherHusbendName ,gender ,religion ,dateofBirth ,nIDNo ,mobileNo ,presentAddress ,parmanetAddress ,savingType ,savingsAmount,nomineName ,relations ,share)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, p.getAccountNo());
            pst.setString(2, p.getFromNO());
            pst.setString(3, p.getCardNo());
            pst.setDate(4, p.getAdmissionDate());
            pst.setString(5, p.getName());
            pst.setString(6, p.getMotherName());
            pst.setString(7, p.getFatherHusbendName());
            pst.setString(8, p.getGender());
            pst.setString(9, p.getReligion());
            pst.setString(10, p.getDateofBirth());
            pst.setString(11, p.getnIDNo());
            pst.setString(12, p.getMobileNo());
            pst.setString(13, p.getPresentAddress());
            pst.setString(14, p.getParmanetAddress());
            pst.setString(15, p.getSavingType());
            pst.setInt(16, p.getSavingsAmount());
            pst.setString(17, p.getNomineName());
            pst.setString(18, p.getRelations());
            pst.setInt(19, p.getShare());
            pst.executeUpdate();         
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(Person p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Person getIdByAccontNo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Person> getPersons() {
        List<Person> list = new ArrayList<>();
        String sql = "select * from product";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Person p = new Person(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getInt(17), rs.getString(17), rs.getString(18),rs.getInt(19));
                list.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Person getPersonByAccontNo(String accountNo) {
        Person p=null;
        String sql="select * from person where accountNo=?";
        try {
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.setString(1, accountNo);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {                
            p = new Person(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDate(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16), rs.getInt(17), rs.getString(17), rs.getString(18),rs.getInt(19));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
    }
    
}
