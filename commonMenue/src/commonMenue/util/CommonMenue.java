
package commonMenue.util;

import commonMenue.About;
import commonMenue.DhasBoad;
import commonMenue.Login;
import commonMenue.Team;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;


public class CommonMenue {
    public static JMenuBar getCommonMenue(JFrame f){
    JMenuBar menuBar = new JMenuBar();
    JMenu file = new JMenu("File");
    
    JMenuItem itemDhasBoad = new JMenuItem("DhasBoad");
    itemDhasBoad.setAccelerator(KeyStroke.getKeyStroke('D', InputEvent.CTRL_DOWN_MASK));
    itemDhasBoad.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            f.setVisible(false);
            new DhasBoad().setVisible(true);
            System.out.println("");
         }
    } );
    
    
    
    JMenuItem itemAbout = new JMenuItem("About");
    itemAbout.setAccelerator(KeyStroke.getKeyStroke('A',InputEvent.CTRL_DOWN_MASK));
    itemAbout.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        f.setVisible(false);
        new About().setVisible(true);
        }
    });
    JMenuItem itemTeam = new JMenuItem("Team");
    itemTeam.setAccelerator(KeyStroke.getKeyStroke('T',InputEvent.CTRL_DOWN_MASK));
    itemTeam.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            f.setVisible(false);
            new Team().setVisible(true);
        }
    });
     JMenuItem itemExit = new JMenuItem("Exit");
    itemExit.setAccelerator(KeyStroke.getKeyStroke('E', InputEvent.CTRL_MASK));
    itemExit.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            f.setVisible(false);
            new Login().setVisible(true);
            //System.exit(0);
        }
    });
    
    
   // add 2 menue item at file menue
    file.add(itemDhasBoad);
    file.add(itemAbout);
    file.add(itemTeam);
    file.add(itemExit);
    
    
    JMenu help = new JMenu("Help");
    // add menue to menueBar
    menuBar.add(file);
    menuBar.add(help);
    
    f.setJMenuBar(menuBar);
    f.setExtendedState(JFrame.MAXIMIZED_BOTH);
    return menuBar;
    }
}
