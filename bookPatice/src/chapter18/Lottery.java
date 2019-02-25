
package chapter18;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;


public class Lottery extends JApplet{
    private Selection [] lukyNumnbers = new Selection[numberCount];
    final public static int PICK_LUCKY_NUMBERS = 1;
    final public static int COLOR = 2;
    
    static int [] getNumbers(){
     int []number  = new int [numberCount];
    }

    class Selection extends JButton implements  ActionListener{

        public Selection(int value) {
            super(Integer.toString(value));
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
