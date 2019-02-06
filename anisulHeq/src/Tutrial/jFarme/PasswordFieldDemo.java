
package Tutrial.jFarme;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPasswordField;


public class PasswordFieldDemo extends JFrame{
    private Container c;
    private JPasswordField pf;
    private Font f;
    public PasswordFieldDemo() {
        initComponent();
    }
    public void  initComponent(){
    
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        f = new Font("Arial",Font.BOLD,18);
        
        
        pf = new JPasswordField();
        pf.setEchoChar('*');
        pf.setFont(f);
        pf.setBounds(50, 50, 150, 50);
        c.add(pf);
        
        
    }
    
    public static void main(String[] args) {
        
        PasswordFieldDemo frame = new PasswordFieldDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,500,400);
        frame.setTitle("Password Field Demo");
    }
    
}
