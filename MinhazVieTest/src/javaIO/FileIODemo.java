/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Md Yasin Arif
 */
public class FileIODemo {

    public static void main(String[] args) throws IOException {
        //int i = 15;
        String str = "My name is Yasin";

        File file = new File("yasin.txt");
        try {
            FileOutputStream output = new FileOutputStream(file);
            //output.write(i);
            byte[] contebtsInBytes = str.getBytes();
            output.write(contebtsInBytes);
            
            // file read
            byte[] b = new byte[10];
            FileInputStream input = new FileInputStream(file);
            int values = 0;
            input.read(b);
            for (byte c : b) {
                System.out.print(c);
            }
            while ((values = input.read()) != -1) {                
                System.out.println((char)values);
            }
            System.out.println();
            System.out.print(input.markSupported());
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

}
