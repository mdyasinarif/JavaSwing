
package Tutrial.JDilog;

import javax.swing.JOptionPane;


public class InputDilog {
    public static void main(String[] args) {
       String name1 = JOptionPane.showInputDialog("Enter First Your Name");
       //String name2 = JOptionPane.showInputDialog("Enter Your Name", "yasin");// yasin place holder 
       String name3 = JOptionPane.showInputDialog(null, "Enter Last Your Name", "This is titel",JOptionPane.QUESTION_MESSAGE);// yasin place holder 
       String full = name1+" "+name3;
       JOptionPane.showMessageDialog(null,"HI Mr."+ full+" Wealcome to Swing");//user ka masage diba
       
       
       
    }
}
