package Tutrial.jFarme;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtomDemo extends JFrame {

    private Container c;
    private JButton b1, b2;
    private Font f;
    private Cursor cursor;

    public ButtomDemo() {
        initComponent();
    }

    public void initComponent() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.CYAN);

        f = new Font("Arial", Font.BOLD, 14);
        
        cursor = new Cursor(Cursor.HAND_CURSOR);
        
        b1 = new JButton("Submmit");
        b1.setFont(f);
        b1.setCursor(cursor);
        b1.setForeground(Color.red);
        b1.setBackground(Color.GREEN);
        b1.setBounds(100, 50, 100, 50);
        c.add(b1);
        
        b2 = new JButton("Clear");
        b2.setFont(f);
        b2.setBounds(210, 50, 100, 50);
        c.add(b2);
    }

    public static void main(String[] args) {

        ButtomDemo frame = new ButtomDemo();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(200, 50, 500, 400);
        frame.setTitle("ButtomDemo");
    }
}
