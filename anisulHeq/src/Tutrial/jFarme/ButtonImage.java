
package Tutrial.jFarme;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class ButtonImage extends JFrame{
    private Container c;
    private JButton b1 ,b2;
    private ImageIcon img1,img2;
    public ButtonImage() {
        initComponent();
    }
    
    public void  initComponent(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);
        
        img1 = new ImageIcon(getClass().getResource("update.png"));
        img2 = new ImageIcon(getClass().getResource("save.png"));
       
        b1 = new JButton(img1);
        b1.setBounds(50, 100, 50, 25);
        c.add(b1);
        
        b2 = new JButton(img2);
        b2.setBounds(110, 100, 50, 25);
        c.add(b2);
    }
    
    
    
    public static void main(String[] args) {
        ButtonImage frame = new ButtonImage();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 50, 500, 400);
        frame.setTitle("ButtonImage");
    }
    
}
