/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swing.evidence;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class StudentView extends javax.swing.JFrame {

    /**
     * Creates new form StudentView
     */
    public StudentView() {
        initComponents();
    }
public static boolean emailVal(String email){
    int adpos = email.indexOf("@");
    int dotpos = email.indexOf(".");
        if (adpos>1 &&(dotpos-adpos)>2 && dotpos<email.length()-2) {
        return true;
    }
        return false;
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_Age = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Email = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rMale = new javax.swing.JRadioButton();
        rFeMale = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        cheHtml = new javax.swing.JCheckBox();
        cheJava = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Comment = new javax.swing.JTextArea();
        btnAdd = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();
        btnClearTable1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbelDisplay = new javax.swing.JTable();
        btnClearTable = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 87, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Id :");

        jTextField_Id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_Id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_IdActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Name :");

        jTextField_Name.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Age :");

        jTextField_Age.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_Age.setText("0");
        jTextField_Age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_AgeActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Email :");

        jTextField_Email.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_EmailActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Gender :");

        buttonGroup1.add(rMale);
        rMale.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rMale.setText("Male");

        buttonGroup1.add(rFeMale);
        rFeMale.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rFeMale.setText("FeMale");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Course :");

        cheHtml.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cheHtml.setText("HTML");

        cheJava.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cheJava.setText("Java");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Round :");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select A Round", "Round 39", "Round 40" }));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Comment :");

        jTextArea_Comment.setColumns(20);
        jTextArea_Comment.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Comment);

        btnAdd.setText("Write To File and Display into Table");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRead.setText("Read from File");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        btnClearTable1.setText("Chear From");
        btnClearTable1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearTable1ActionPerformed(evt);
            }
        });

        jButton1.setText("Exit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_Email, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(rMale)
                                                .addGap(18, 18, 18)
                                                .addComponent(rFeMale))
                                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTextField_Age, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                                                .addComponent(jTextField_Id)
                                                .addComponent(jTextField_Name)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(30, 30, 30)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(cheHtml)
                                        .addGap(18, 18, 18)
                                        .addComponent(cheJava))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAdd)
                            .addComponent(btnRead))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton1))
                            .addComponent(btnClearTable1))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_Age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(rMale)
                    .addComponent(rFeMale))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cheHtml)
                                .addComponent(cheJava)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdd)
                            .addComponent(btnClearTable1))
                        .addGap(18, 18, 18)
                        .addComponent(btnRead)
                        .addGap(0, 11, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addContainerGap())))
        );

        jLabel1.getAccessibleContext().setAccessibleName("ID :");

        tbelDisplay.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "AGE", "EMAIL", "Gender", "Course", "Round", "Comment"
            }
        ));
        jScrollPane2.setViewportView(tbelDisplay);

        btnClearTable.setText("Chear Table");
        btnClearTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnClearTable)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnClearTable)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_IdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_IdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_IdActionPerformed

    private void jTextField_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NameActionPerformed

    private void jTextField_AgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_AgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_AgeActionPerformed

    private void jTextField_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_EmailActionPerformed
    
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       String id="0",name="",age="0",email="",gender="",course="",round="",comment="";
        if (Integer.parseInt(jTextField_Id.getText())<=2) {
            JOptionPane.showMessageDialog(null, "ID Must have 2 Character");
        } 
        else if(jTextField_Name.getText().length()<=3){
            JOptionPane.showMessageDialog(null, "Name Must have 3 Character");
        }
        else if(Integer.parseInt(jTextField_Age.getText()) <= 17 ||Integer.parseInt(jTextField_Age.getText()) >=70){
            JOptionPane.showMessageDialog(null, "AGE between 17 to 70");
        }
        else if(!emailVal(jTextField_Email.getText())){
            JOptionPane.showMessageDialog(null, "Invalid Email");
        }
        else if(!rMale.isSelected() && !rFeMale.isSelected()){
            JOptionPane.showMessageDialog(null, "Select Your Gender");
        }
        else if(!cheHtml.isSelected() && !cheJava.isSelected()){
            JOptionPane.showMessageDialog(null, "Select Your Course");
        }
        else if(jComboBox1.getItemAt(jComboBox1.getSelectedIndex()) == "Select A Round"){
            JOptionPane.showMessageDialog(null, "Select A Round");
        }
        else if(jTextArea_Comment.getText().length()<=10){
            JOptionPane.showMessageDialog(null, "Comment Must have 10 Character");
        }
        else {
            id = jTextField_Id.getText();
            name = jTextField_Name.getText();
            age = jTextField_Age.getText();
            email = jTextField_Email.getText();
            gender = rMale.isSelected() ? "Male":"FeMale";
            course += cheHtml.getText();
            course += cheJava.getText();
            round = jComboBox1.getItemAt(jComboBox1.getSelectedIndex());
            comment = jTextArea_Comment.getText();
           
            DefaultTableModel model = (DefaultTableModel) tbelDisplay.getModel();
            Object[] col = new Object[8];
            col[0] = id;
            col[1] = name;
            col[2] = age;
            col[3] = email;
            col[4] = gender;
            col[5] = course;
            col[6] = round;
            col[7] = comment;
            model.addRow(col);
            
            Student student = new Student(Integer.parseInt(id), name, Integer.parseInt(age), email, gender, course, round, comment);
            
            List<Student> students = new ArrayList<>();
            students.add(student);
            
            try {
                Utils.writeToFile(JOptionPane.showInputDialog("Enter File Name"), students);
            } catch (Exception e) {
                e.printStackTrace();
            }
            
       }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbelDisplay.getModel();
        try {
            Utils.readToPrint(JOptionPane.showInputDialog("Enter File Name"), model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnReadActionPerformed

    private void btnClearTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearTableActionPerformed
         DefaultTableModel model = (DefaultTableModel) tbelDisplay.getModel();
         model.setRowCount(0);
    }//GEN-LAST:event_btnClearTableActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnClearTable1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearTable1ActionPerformed
        jTextField_Id.setText("0");
        jTextField_Name.setText("");
        jTextField_Age.setText("0");
        jTextField_Email.setText("");
        rMale.setSelected(true);
        rFeMale.setSelected(false);
        cheHtml.setSelected(false);
        cheJava.setSelected(false);
        jComboBox1.setSelectedIndex(0);
        jTextArea_Comment.setText("");
    }//GEN-LAST:event_btnClearTable1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClearTable;
    private javax.swing.JButton btnClearTable1;
    private javax.swing.JButton btnRead;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cheHtml;
    private javax.swing.JCheckBox cheJava;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea_Comment;
    private javax.swing.JTextField jTextField_Age;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_Id;
    private javax.swing.JTextField jTextField_Name;
    private javax.swing.JRadioButton rFeMale;
    private javax.swing.JRadioButton rMale;
    private javax.swing.JTable tbelDisplay;
    // End of variables declaration//GEN-END:variables
}
