/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evi1702.service;

import evi1702.view.Student;
import java.util.List;

/**
 *
 * @author User
 */
public interface StudentDao {
    void add(Student obj);
    void update(Student obj);
    void clear(Student obj);
    void delete(Student obj);
    void deleteById(int Id);
    Student getById(int Id);
    List<Student> findAll();
   
}
