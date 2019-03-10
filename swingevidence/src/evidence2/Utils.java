/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidence2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Utils {

  public static void writeTofile(String filename,List<Student> student){
      File file = new File(filename+".txt");
      try {
          if (file.exists() == false) {
              file.createNewFile();
          }
          PrintWriter out = new PrintWriter(new FileWriter(file,true));
          for (Student s : student) {
              out.append(s.getName()+", "+s.getEmail()+", "+s.getAge()+", "+s.getGender()+", "+s.getCource()+", "+s.getRound()+", "+s.getComment()+"\n");
          }
          out.close();
      } catch (Exception e) {
          e.printStackTrace();
      }
  
  }

    public static void displayFromFile(String filename, DefaultTableModel model) throws IOException {
        String line;
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader(filename + ".txt"));
            while ((line = reader.readLine()) != null) {
                model.addRow(line.split(", "));
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            JOptionPane.showMessageDialog(null, "Success");
        }
    }

}
