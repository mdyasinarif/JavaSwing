
package Tutrial.jFarme;

import javax.swing.JFrame;


public class Test extends JFrame{

    public Test() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(50, 100, 400, 500);
        setTitle("Thsi is Titel");
    }

    
    public static void main(String[] args) {
        Test frame = new Test();
        frame.setVisible(true);
    }
    
    
}
