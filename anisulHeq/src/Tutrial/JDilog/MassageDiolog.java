
package Tutrial.JDilog;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class MassageDiolog {
    public static void main(String[] args) {
        
        //JOptionPane.showMessageDialog(null, "Wrong Password");// null / window possion & massage
        //JOptionPane.showMessageDialog(null, "Wrong Password", "Warning", JOptionPane.WARNING_MESSAGE);//PLAIN_MESSAGE(-1) / ERROR_MESSAGE(0) / INFORMATION_MESSAGE(1)/ WARNING_MESSAGE(2)/QUESTION_MESSAGE (3) 
        ImageIcon img = new ImageIcon("icon.png");
        JOptionPane.showMessageDialog(null, "Enter Correct Pasword", " This is a title ",0, img);
       
    }
}
