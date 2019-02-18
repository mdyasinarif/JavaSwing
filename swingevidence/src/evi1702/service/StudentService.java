package evi1702.service;

import evi1702.view.DBConnection.DBConnection;
import evi1702.view.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentService implements StudentDao {

    static Connection con = DBConnection.getConnection();

    @Override
    public void add(Student obj) {
        String sql = "insert into studentTable (Name,Age,Email,Gender,Cource,Round,Comment)values(?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, obj.getName());
            ps.setInt(2, obj.getAge());
            ps.setString(3, obj.getEmail());
            ps.setString(4, obj.getGender());
            ps.setString(5, obj.getCource());
            ps.setString(6, obj.getRound());
            ps.setString(7, obj.getComment());
            ps.executeUpdate();
            System.out.println("Data Inserted");
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void update(Student obj) {
        String sql = "update table studentTable Name = ? where Id = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, obj.getName());
            ps.setInt(2, obj.getId());
            ps.setString(3, obj.getEmail());
            ps.setString(4, obj.getGender());
            ps.setString(5, obj.getCource());
            ps.setString(6, obj.getRound());
            ps.setString(7, obj.getComment());
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void clear(Student obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Student obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteById(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student getById(int Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Student> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
