package Tutrial.jFarme;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ActionDemo1 extends JFrame {

    private Container c;
    private JTextField tf1, tf2;

    public ActionDemo1() {
        initComponent();
    }

    public void initComponent() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.ORANGE);

        tf1 = new JTextField();
        tf1.setBounds(50, 50, 150, 50);
        c.add(tf1);

        tf2 = new JTextField();
        tf2.setBounds(50, 110, 150, 50);
        c.add(tf2);

        Hendeler heldeler = new Hendeler();
        tf1.addActionListener(heldeler);
        tf2.addActionListener(heldeler);
    }

    class Hendeler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == tf1) {
                String s = tf1.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter some tex");
                } else {
                    JOptionPane.showMessageDialog(null, "tf1 " + s);
                }
            } else {
                String s = tf1.getText();
                if (s.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please Enter some tex");
                } else {
                    JOptionPane.showMessageDialog(null, "tf2 " + s);
                }

            }

        }
    };

    public static void main(String[] args) {
        ActionDemo1 frame = new ActionDemo1();// invasiable thaka
        frame.setVisible(true);// openaning program
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setBounds(200, 50, 400, 300);// location(first 2) +soze(Last 2)

        frame.setTitle("ActionDemo1 Demo");
    }
}
