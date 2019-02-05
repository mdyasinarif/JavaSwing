
package Tutrial.jFarme;

import javax.swing.JFrame;


public class JfarmMethod extends JFrame {
    public static void main(String[] args) {
        JfarmMethod frame = new JfarmMethod();// invasiable thaka
        frame.setVisible(true);// openaning program
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
//        frame.setSize(400,300);
//        frame.setLocationRelativeTo(null);//center frame
//        frame.setLocation(200, 50);
//           frame.setResizable(false);// resize kora jaba na
        
        frame.setBounds(200, 50, 400, 300);// location(first 2) +soze(Last 2)
        
        frame.setTitle("Frame Demo");
        
        
    }
}
