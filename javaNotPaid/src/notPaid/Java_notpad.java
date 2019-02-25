/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notPaid;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

/**
 *
 * @author Md Yasin Arif
 */
public class Java_notpad extends JFrame {

    JTextArea mainarea;
    JMenuBar mbar;
    JMenu mnuFile, mnuEdit, mnuFormat, mnuHelp;
    JMenuItem itmNew, itmOpen, itmSave, itmSaveas, itmExit;
    String filename;
    JFileChooser jc;

    public Java_notpad() {
        initComponent();
        itmSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                save();
            }
        });
        itmSaveas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveAs();
            }
        });
    }

    private void initComponent() {
        jc = new JFileChooser(".");
        mainarea = new JTextArea();
        getContentPane().add(mainarea);
        getContentPane().add(new JScrollPane(mainarea), BorderLayout.CENTER);
        setTitle("Untitled Notepad");
        setSize(800, 600);
        //menu bar
        mbar = new JMenuBar();
        // add menu bar to frame
        setJMenuBar(mbar);
        //menu
        mnuFile = new JMenu("File");
        mnuEdit = new JMenu("Edit");
        mnuFormat = new JMenu("Format");
        mnuHelp = new JMenu("Help");

        //add menu item to menu bar
        mbar.add(mnuFile);
        mbar.add(mnuEdit);
        mbar.add(mnuFormat);
        mbar.add(mnuHelp);
        // menu Item with icon and short cut key
        ImageIcon newIcon = new ImageIcon(getClass().getResource("/img/New.gif"));
        ImageIcon openIcon = new ImageIcon(getClass().getResource("/img/Open.gif"));
        ImageIcon saveIcon = new ImageIcon(getClass().getResource("/img/Save.gif"));

        ImageIcon saveasIcon = new ImageIcon(getClass().getResource("/img/Save.gif"));
        itmNew = new JMenuItem("New", newIcon);
        itmOpen = new JMenuItem("Open", openIcon);
        itmSave = new JMenuItem("Save", saveIcon);
        itmSaveas = new JMenuItem("SaveAS");
        itmExit = new JMenuItem("Exit");
        // adding shortcut
        itmNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
        itmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
        itmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));

        // add menu item to menu
        mnuFile.add(itmNew);
        mnuFile.add(itmOpen);
        mnuFile.add(itmSave);
        //add icon to menu icon

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void save() {
        PrintWriter fout = null;
        //int retval = -1;
        try {
            if (filename == null) {
                saveAs();
            } else {
                fout = new PrintWriter(new FileWriter(filename));
                String s = mainarea.getText();
                StringTokenizer st = new StringTokenizer(s, System.getProperty("line.separator"));
                while (st.hasMoreElements()) {
                    fout.println(st.nextToken());
                }
                JOptionPane.showMessageDialog(rootPane, "File Saved");
                filename = jc.getSelectedFile().getName();
                setTitle(filename = jc.getSelectedFile().getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {


            fout.close();
        }
    }

    private void saveAs() {
        PrintWriter fout = null;
        int retval = -1;
        try {
            retval = jc.showSaveDialog(this);
            if (retval == JFileChooser.APPROVE_OPTION) {
                fout = new PrintWriter(new FileWriter(jc.getSelectedFile()));
            }
            String s = mainarea.getText();
            StringTokenizer st = new StringTokenizer(s, System.getProperty("line.separator"));
            while (st.hasMoreElements()) {
                fout.println(st.nextToken());
            }
            JOptionPane.showMessageDialog(rootPane, "File Saved");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Java_notpad jn = new Java_notpad();
    }
}
