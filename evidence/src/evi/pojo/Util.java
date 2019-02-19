package evi.pojo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Util {

    public static void writeTofile(String filename, List<Student> student) throws IOException {
        File destFile = new File(filename + ".txt");
        try {
            if (destFile.exists() == false) {
                System.out.println("We Had make a New File");
                destFile.createNewFile();
            }
            PrintWriter out = new PrintWriter(new FileWriter(destFile, true));
            for (Student s : student) {
                out.append(s.getId() + ", " + s.getName() + ", " + s.getAge() + ", " + s.getEmail() + ", " + s.getGender() + ", " + s.getCc() + ", " + s.getRound() + ", " + s.getComment() + "\n");
            }
            out.close();
        } catch (Exception e) {
            System.out.println("Could Not Log");
        }

    }

    public static void displayStudentDataFromeFile(String filename, DefaultTableModel model) {
        String line;
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(filename + ".txt"));
            while ((line = reader.readLine()) != null) {
                model.addRow(line.split(", "));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
}
