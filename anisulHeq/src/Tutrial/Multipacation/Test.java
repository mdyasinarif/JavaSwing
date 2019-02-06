package Tutrial.Multipacation;

import Tutrial.jFarme.TexAreaDemo;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test extends JFrame {

    private Container c;
    private JLabel imgLabel, texLabel;
    private JTextArea ta;
    private JTextField tf;
    private JButton bt;
    private ImageIcon icon,img;
    private Font f;
    private Cursor cr;

    public Test() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.GRAY);
        
        icon = new ImageIcon(getClass().getResource("icon.jpg"));
        this.setIconImage(icon.getImage());
        
        
        img = new ImageIcon(getClass().getResource("images.jpg"));
        imgLabel = new JLabel(img);
        imgLabel.setBounds(20, 10, img.getIconWidth(), img.getIconHeight());
        c.add(imgLabel);

        f = new Font("Arial", Font.ITALIC + Font.BOLD, 18);

        texLabel = new JLabel("Enter any Number");
        texLabel.setBounds(20, 220, 250, 50);
        texLabel.setForeground(Color.WHITE);
        texLabel.setFont(f);
        c.add(texLabel);

        tf = new JTextField();
        tf.setBounds(220, 220, 50, 40);
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setFont(f);
        c.add(tf);

        cr = new Cursor(Cursor.HAND_CURSOR);

        bt = new JButton("Clear");
        bt.setBounds(220, 280, 90, 20);
        bt.setCursor(cr);
        c.add(bt);

        ta = new JTextArea();
        ta.setBounds(20, 350, 350, 600);
        ta.setFont(f);
        c.add(ta);

        tf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = tf.getText();
                if (value.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter Number");
                } else {
                    ta.setText("");
                    int num = Integer.parseInt(tf.getText());

                    for (int i = 1; i <= 10; i++) {
                        int result = num * i;

                        String r = String.valueOf(result);
                        String n = String.valueOf(num);
                        String incr = String.valueOf(i);

                        ta.append(n + " X " + incr + " = " + r + "\n");
                    }
                }

            }
        });
        bt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ta.setText("");
                tf.setText("");
            }
        });
    }

    public static void main(String[] args) {
        Test fr = new Test();
        fr.setVisible(true);
        fr.setTitle("Multipacation Games");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(100, 50, 400, 800);
    }
}
