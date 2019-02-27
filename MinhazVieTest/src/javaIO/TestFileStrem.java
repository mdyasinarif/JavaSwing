
package javaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;


public class TestFileStrem {
    public static void main(String[] args) {
        try {
            FileOutputStream output = new FileOutputStream("arif.txt");
            for (int i = 0; i < 10; i++) {
               output.write(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            FileInputStream input = new FileInputStream("arif.txt");
            int value;
            while ((value = input.read()) != -1) {                
                System.out.println(value+" ");
            }
        } catch (Exception e) {
        }
    }
}
