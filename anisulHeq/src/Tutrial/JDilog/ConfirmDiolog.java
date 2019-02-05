
package Tutrial.JDilog;

import javax.swing.JOptionPane;


public class ConfirmDiolog {
    public static void main(String[] args) {
        
      int choise =  JOptionPane.showConfirmDialog(null, "Do you want to quit","Quit",JOptionPane.YES_NO_OPTION);
      
        if (choise == JOptionPane.YES_OPTION) {
            System.exit(0);
        }else{
            System.out.println("uouser no exit");
        
        }
    }
}
