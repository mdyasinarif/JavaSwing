
package Tutrial.Login;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LoginFrame extends JFrame{
    private JLabel userLabel,PassLable;
    private JTextField tf;
    private JPasswordField pf;
    private JButton login,clear;
    private Container c;
    private Font f;
    
    
    public LoginFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 50, 420, 350);
        this.setTitle("Login Demo");
        
        f = new Font("Arial", Font.BOLD, 14);
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);
        
        userLabel = new JLabel("User Name");
        userLabel.setBounds(50, 50, 150, 50);
        userLabel.setFont(f);
        c.add(userLabel);
        
        tf = new JTextField();
        tf.setBounds(170, 50, 200, 50);
        tf.setFont(f);
        c.add(tf);
        
        PassLable = new JLabel("PassWord");
        PassLable.setBounds(50, 120, 150, 50);
        PassLable.setFont(f);
        c.add(PassLable);
        
        pf = new JPasswordField();
        pf.setEchoChar('*');
        pf.setBounds(170, 120, 200, 50);
        pf.setFont(f);
        c.add(pf);
        
        login = new JButton("Login");
        login.setBounds(170, 190, 90, 30);
        login.setFont(f);
        c.add(login);
        
        clear = new JButton("Clear");
        clear.setBounds(280, 190, 90, 30);
        clear.setFont(f);
        c.add(clear);
        
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               tf.setText("");
               pf.setText("");
            }
        });
        
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String userName = tf.getText();
               String password = pf.getText();
               
                if (userName.equals("yasin") && password.equals("arif")) {
                    JOptionPane.showMessageDialog(null, "Success");
                   
                    NewFrame frame = new NewFrame();
                    frame.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Invaled username or password");
                }
            }
        });
    }
    
    
    
    
    public static void main(String[] args) {
        LoginFrame frame = new LoginFrame();
        frame.setVisible(true);
    }
}
