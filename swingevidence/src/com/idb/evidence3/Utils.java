/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.idb.evidence3;

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
    public static void writetoFile(String fileName,List<Student> students){
        File file = new File(fileName, ".txt");
        
        try {
            if(file.exists() == false){
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(new FileWriter(file, true));
            for (Student s : students) {
                out.append(s.getName()+", "+s.getEmail()+", "+s.getAge()+", "+s.getGender()+", "+s.getCource()+", "+s.getRound()+", "+s.getComment()+"\n");
            }
            out.close();;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void displayFromFile(String fileName,DefaultTableModel model){
        String line;
        BufferedReader reader;
        
        try {
            reader = new BufferedReader(new FileReader(fileName +".txt"));
            while((line = reader.readLine()) != null){
                model.addRow(line.split(", "));
            }
            reader.close();
        } catch (Exception e) {
        }
    }
}
