/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swing.evidence5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Md Yasin Arif
 */
public class Utils {
    public static void wrigtToFile(String filename,List<Student>student){
        File file = new File(filename+".txt");
        try {
            if (!file.exists()) {
            file.createNewFile();
        }
            PrintWriter out = new PrintWriter(new FileWriter(file, true));
            for (Student s : student) {
                out.append(s.getId()+", "+s.getFullName()+", "+s.getFatherName()+", "+s.getMotherName()+", "+s.getAge()+", "+s.getGender()+", "+s.getMobil()+", "+s.getAddress()+", "+s.getCourse()+", "+s.getRound()+"\n");
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }
    public static void readtoFile(String filename,DefaultTableModel model){
    String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename+".txt"));
            while ((line = reader.readLine()) != null) {                
                model.addRow(line.split(", "));
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    
    }
    
}
