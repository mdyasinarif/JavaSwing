
package Tutrial.jFarme;

import Tutrial.Login.NewFrame;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TexAreaDemo extends JFrame{
    private Container c;
    private JTextArea ta;
    private Font f;
    private JScrollPane scroll;

    public TexAreaDemo() {
        initComponent();
    }
    public void initComponent(){
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);
        
        f = new Font("Arial", Font.BOLD, 14);
        
        ta = new JTextArea("Write Your tex here");
        //ta.setBounds(50, 50, 300, 200);
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
        ta.setFont(f);
        ta.setForeground(Color.BLUE);
        ta.setBackground(Color.GREEN); 
        //c.add(ta);
        
        
        scroll = new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(50, 50, 300, 500);
        c.add(scroll);
    }
    
    public static void main(String[] args) {
        TexAreaDemo fr = new TexAreaDemo();
        fr.setVisible(true);
        fr.setTitle("TexAreaDemo");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setBounds(100, 50, 400, 600);
    }
}
