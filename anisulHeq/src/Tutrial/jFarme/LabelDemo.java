
package Tutrial.jFarme;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelDemo extends JFrame {
    private  Container c;
    private JLabel userLable,passLabel,imageLabel;
    private Font f;
    private ImageIcon i;
    
    public LabelDemo() {
        initComponent();
    }
    
    public void initComponent(){
         c = this.getContentPane();
         c.setLayout(null);
         c.setBackground(Color.CYAN);
         
         f = new Font("Arial", Font.BOLD, 14);
         
         userLable = new JLabel();
         userLable.setText("Enter Your user name");
         userLable.setBounds(50, 20, 200, 50);
         userLable.setFont(f);
         userLable.setForeground(Color.red);
         userLable.setOpaque(true);
         userLable.setBackground(Color.YELLOW);
         userLable.setToolTipText("Enter your userName");
         c.add(userLable);
         String s = userLable.getToolTipText();
         System.out.println(s);
         //System.out.println(userLable.getText());
         
         passLabel = new JLabel("Enter Your Password");
         passLabel.setBounds(50, 60, 200, 50);
         passLabel.setFont(f);
         c.add(passLabel);
         
         i = new ImageIcon(getClass().getResource("icon.png"));
         imageLabel = new JLabel(i);
         imageLabel.setBounds(50, 100, i.getIconWidth(), i.getIconHeight());
         c.add(imageLabel);
    }
    public static void main(String[] args) {
        
        LabelDemo frame = new LabelDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200,50,500,400);
        frame.setTitle("Lable Demo");
    }
}
