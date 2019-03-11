/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.idb.evidence5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Utils {
    public static void writeToFile(String filename,List<Student>student){
        File file = new File(filename+".txt");
        try {
            if (file.exists() == false) {
                file.createNewFile();
                
            }
            PrintWriter out = new PrintWriter(new FileWriter(file, true));
            for (Student s : student) {
                out.append(s.getId()+", "+s.getName()+", "+s.getAge()+", "+s.getEmail()+", "+s.getGender()+", "+s.getCourse()+", "+s.getRound()+", "+s.getComment()+"\n");
            }
            out.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static void readToFile(String filename,DefaultTableModel model){
        String line;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filename+".txt"));
            while ((line = reader.readLine()) != null) {                
                model.addRow(line.split(", "));
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
}
