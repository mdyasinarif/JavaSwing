/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentResultEx;

import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Md Yasin Arif
 */
public class StudentResult extends javax.swing.JFrame {

    /**
     * Creates new form StudentResult
     */
    public StudentResult() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldStudentID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldFirstName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldSurName = new javax.swing.JTextField();
        jTextFieldRanking = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldAverage = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldMath = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldEnglish = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldBiology = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldComputer = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldChemisty = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldPhysics = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldBusiness = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldAddMaths = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jComboBoxCourse = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldTotalScore = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jBtnRanking = new javax.swing.JButton();
        jBtnTranscript = new javax.swing.JButton();
        jBtnExit = new javax.swing.JButton();
        jBtnDelete = new javax.swing.JButton();
        jBtnReset1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Result System");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4), "Student Result", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 36))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Student ID:");

        jTextFieldStudentID.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("First Name:");

        jTextFieldFirstName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Sur Name:");

        jTextFieldSurName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jTextFieldRanking.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Ranking:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Average:");

        jTextFieldAverage.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Math:");

        jTextFieldMath.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextFieldMath.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldMathKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("English:");

        jTextFieldEnglish.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextFieldEnglish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEnglishActionPerformed(evt);
            }
        });
        jTextFieldEnglish.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldEnglishKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Biology:");

        jTextFieldBiology.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextFieldBiology.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBiologyKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Computer:");

        jTextFieldComputer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextFieldComputer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldComputerKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("Chemisty:");

        jTextFieldChemisty.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextFieldChemisty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldChemistyKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setText("Physics:");

        jTextFieldPhysics.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextFieldPhysics.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPhysicsKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("Business:");

        jTextFieldBusiness.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextFieldBusiness.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBusinessActionPerformed(evt);
            }
        });
        jTextFieldBusiness.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBusinessKeyTyped(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Add Maths:");

        jTextFieldAddMaths.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextFieldAddMaths.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldAddMathsKeyTyped(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("Course Code :");

        jComboBoxCourse.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jComboBoxCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C98123", "C98124", "C98125", "C98126", "C98127" }));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setText("Total Score:");

        jTextFieldTotalScore.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "Grads", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Course Code", "Maths", "English", "Biology", "Computer", "Chemisty", "Physics", "Add Maths", "Business", "Total Score", "Average", "Ranking"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jBtnRanking.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jBtnRanking.setText("Ranking");
        jBtnRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnRankingActionPerformed(evt);
            }
        });

        jBtnTranscript.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jBtnTranscript.setText("Transcript");
        jBtnTranscript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTranscriptActionPerformed(evt);
            }
        });

        jBtnExit.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jBtnExit.setText("Exit");
        jBtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExitActionPerformed(evt);
            }
        });

        jBtnDelete.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jBtnDelete.setText("Reset");
        jBtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnDeleteActionPerformed(evt);
            }
        });

        jBtnReset1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jBtnReset1.setText("Delete");
        jBtnReset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnReset1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel16))
                                .addGap(52, 52, 52)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldAverage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                    .addComponent(jTextFieldTotalScore, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldRanking)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldFirstName)
                                    .addComponent(jTextFieldSurName)
                                    .addComponent(jComboBoxCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldStudentID))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldAddMaths, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldPhysics, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextFieldChemisty)
                                    .addComponent(jTextFieldBusiness)
                                    .addComponent(jTextFieldComputer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldBiology, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                    .addComponent(jTextFieldMath, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldEnglish, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBtnRanking)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnTranscript)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnReset1)
                                .addGap(92, 92, 92)
                                .addComponent(jBtnDelete)
                                .addGap(18, 18, 18)
                                .addComponent(jBtnExit))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(90, 90, 90))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel8)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel9)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel10)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel11)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel12)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel14)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel13))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextFieldStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextFieldSurName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(jLabel15))
                                    .addComponent(jComboBoxCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(jTextFieldTotalScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldAverage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldRanking, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(3, 3, 3))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextFieldMath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jTextFieldEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jTextFieldBiology, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldComputer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jTextFieldChemisty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jTextFieldPhysics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jTextFieldAddMaths, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(jTextFieldBusiness, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnRanking)
                        .addComponent(jBtnTranscript)
                        .addComponent(jBtnReset1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtnExit)
                        .addComponent(jBtnDelete)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1280, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnReset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnReset1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRow() == -1) {
            if (jTable1.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "NO Data To Delete", "Student Result System", JOptionPane.OK_OPTION);
            } else {
                JOptionPane.showMessageDialog(null, "Select a Row To Delete", "Student Result System", JOptionPane.OK_OPTION);
            }
        } else {
            model.removeRow(jTable1.getSelectedRow());
        }
    }//GEN-LAST:event_jBtnReset1ActionPerformed

    private void jBtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnDeleteActionPerformed
        JTextField temp = null;
        for (Component c : jPanel1.getComponents()) {
            if (c.getClass().toString().contains("JTextField")) {
                temp = (JTextField) c;
                temp.setText(null);
            }
        }
    }//GEN-LAST:event_jBtnDeleteActionPerformed

    private void jBtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExitActionPerformed
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Students Result System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jBtnExitActionPerformed

    private void jBtnTranscriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTranscriptActionPerformed
        jTextArea1.append("Student Result Recording System\n"
            + "=============================\n"
            + " Maths:\t" + jTextFieldMath.getText() + "\n"
            + " English:\t" + jTextFieldEnglish.getText() + "\n"
            + " Biology:\t" + jTextFieldBiology.getText() + "\n"
            + " Computer:\t" + jTextFieldComputer.getText() + "\n"
            + " Chemisty:\t" + jTextFieldChemisty.getText() + "\n"
            + " Physics:\t" + jTextFieldPhysics.getText() + "\n"
            + " AddMaths:\t" + jTextFieldAddMaths.getText() + "\n"
            + " Business:\t" + jTextFieldBusiness.getText() + "\n"
            + " -------------------------------\n"
            + " TotalScore:\t" + jTextFieldTotalScore.getText() + "\n"
            + " Average:\t" + jTextFieldAverage.getText() + "\n"
            + " Ranking:\t" + jTextFieldRanking.getText()+ "\n\n"
        );
    }//GEN-LAST:event_jBtnTranscriptActionPerformed

    private void jBtnRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnRankingActionPerformed
        double[] R = new double[14];
        R[0] = Double.parseDouble(jTextFieldMath.getText());
        R[1] = Double.parseDouble(jTextFieldEnglish.getText());
        R[2] = Double.parseDouble(jTextFieldBiology.getText());
        R[3] = Double.parseDouble(jTextFieldComputer.getText());
        R[4] = Double.parseDouble(jTextFieldChemisty.getText());
        R[5] = Double.parseDouble(jTextFieldPhysics.getText());
        R[6] = Double.parseDouble(jTextFieldAddMaths.getText());
        R[7] = Double.parseDouble(jTextFieldBusiness.getText());

        R[8] = (R[0] + R[1] + R[2] + R[3] + R[4] + R[5] + R[6] + R[7]);
        R[9] = ((R[0] + R[1] + R[2] + R[3] + R[4] + R[5] + R[6] + R[7]) / 8);

        String total = String.format("%.0f", R[8]);
        jTextFieldTotalScore.setText(total);

        String average = String.format("%.0f", R[9]);
        jTextFieldAverage.setText(average);

        if (R[8] >= 600) {
            jTextFieldRanking.setText("1st");
        } else if (R[8] >= 500) {
            jTextFieldRanking.setText("2nd");
        } else if (R[8] >= 400) {
            jTextFieldRanking.setText("3rd");
        } else if (R[8] >= 300) {
            jTextFieldRanking.setText("Fail");
        }

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{
            jTextFieldStudentID.getText(),
            jComboBoxCourse.getSelectedItem(),
            jTextFieldMath.getText(),
            jTextFieldEnglish.getText(),
            jTextFieldBiology.getText(),
            jTextFieldComputer.getText(),
            jTextFieldChemisty.getText(),
            jTextFieldPhysics.getText(),
            jTextFieldAddMaths.getText(),
            jTextFieldBusiness.getText(),
            jTextFieldTotalScore.getText(),
            jTextFieldAverage.getText(),
            jTextFieldRanking.getText()

        });

    }//GEN-LAST:event_jBtnRankingActionPerformed

    private void jTextFieldAddMathsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAddMathsKeyTyped
        char iNumber = evt.getKeyChar();
        if (!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldAddMathsKeyTyped

    private void jTextFieldBusinessKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBusinessKeyTyped
        char iNumber = evt.getKeyChar();
        if (!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldBusinessKeyTyped

    private void jTextFieldBusinessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBusinessActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBusinessActionPerformed

    private void jTextFieldPhysicsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPhysicsKeyTyped
        char iNumber = evt.getKeyChar();
        if (!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldPhysicsKeyTyped

    private void jTextFieldChemistyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldChemistyKeyTyped
        char iNumber = evt.getKeyChar();
        if (!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldChemistyKeyTyped

    private void jTextFieldComputerKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldComputerKeyTyped
        char iNumber = evt.getKeyChar();
        if (!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldComputerKeyTyped

    private void jTextFieldBiologyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBiologyKeyTyped
        char iNumber = evt.getKeyChar();
        if (!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldBiologyKeyTyped

    private void jTextFieldEnglishKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldEnglishKeyTyped
        char iNumber = evt.getKeyChar();
        if (!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldEnglishKeyTyped

    private void jTextFieldEnglishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEnglishActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEnglishActionPerformed

    private void jTextFieldMathKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMathKeyTyped
        char iNumber = evt.getKeyChar();
        if (!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) || (iNumber == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldMathKeyTyped
    private JFrame frame;
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(StudentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnDelete;
    private javax.swing.JButton jBtnExit;
    private javax.swing.JButton jBtnRanking;
    private javax.swing.JButton jBtnReset1;
    private javax.swing.JButton jBtnTranscript;
    private javax.swing.JComboBox<String> jComboBoxCourse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldAddMaths;
    private javax.swing.JTextField jTextFieldAverage;
    private javax.swing.JTextField jTextFieldBiology;
    private javax.swing.JTextField jTextFieldBusiness;
    private javax.swing.JTextField jTextFieldChemisty;
    private javax.swing.JTextField jTextFieldComputer;
    private javax.swing.JTextField jTextFieldEnglish;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldMath;
    private javax.swing.JTextField jTextFieldPhysics;
    private javax.swing.JTextField jTextFieldRanking;
    private javax.swing.JTextField jTextFieldStudentID;
    private javax.swing.JTextField jTextFieldSurName;
    private javax.swing.JTextField jTextFieldTotalScore;
    // End of variables declaration//GEN-END:variables
}
