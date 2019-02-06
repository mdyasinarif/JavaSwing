
package Tutrial.Login;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class NewFrame extends JFrame{
private Container c;
private JLabel lable;

    public NewFrame() {
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setBounds(420, 50, 400, 400);
        this.setTitle("New Frame");
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);
        
        lable = new JLabel("Hello ");
        lable.setBounds(50, 50, 250, 50);
        c.add(lable);
    }
    
    
    public static void main(String[] args) {
        NewFrame fr = new NewFrame();
        fr.setVisible(true);
    }
}
