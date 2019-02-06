
package Tutrial.jFarme;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class FrameDemo extends JFrame {
    
    private ImageIcon icon;
    private Container c;
    
    public FrameDemo() {
        initComponents();
    }
    
    public void initComponents(){
        
        // backgroung color change
        c = this.getContentPane();
        c.setBackground(Color.GREEN);
        
        
        //icone set
        icon = new ImageIcon(getClass().getResource("icon.png"));
        this.setIconImage(icon.getImage());
    
    }
    
    
    public static void main(String[] args) {
        FrameDemo frame = new FrameDemo();// invasiable thaka
        frame.setVisible(true);// openaning program
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        
        frame.setBounds(200, 50, 400, 300);// location(first 2) +soze(Last 2)
        
        frame.setTitle("Frame Demo");
        
        
    }
}
