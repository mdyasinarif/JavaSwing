/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssbbss.view;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Md Yasin Arif
 */
public class ShareAcPage extends javax.swing.JFrame {
private JFrame frame;
    /**
     * Creates new form LoginPage
     */
    public ShareAcPage() {
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

        btnExitCA1 = new javax.swing.JButton();
        btnSaveCA = new javax.swing.JButton();
        btnResetCA = new javax.swing.JButton();
        btnSaveCA1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnWF = new javax.swing.JButton();
        btnCA = new javax.swing.JButton();
        btnSA = new javax.swing.JButton();
        btnSHA = new javax.swing.JButton();
        btnIA = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnStatement = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextFielduserName5 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtAccountNo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtAccountNo1 = new javax.swing.JTextField();
        btnResetCA2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtSlipNo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDepositDate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        btnResetCA3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtSlipNo1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDepositDate1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtAmount1 = new javax.swing.JTextField();
        btnResetCA4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblShareAC = new javax.swing.JTable();
        btnExitCA2 = new javax.swing.JButton();
        btnSaveCA2 = new javax.swing.JButton();
        btnResetCA1 = new javax.swing.JButton();
        btnSaveCA3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        btnExitCA1.setBackground(new java.awt.Color(0, 102, 0));
        btnExitCA1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnExitCA1.setForeground(new java.awt.Color(255, 255, 255));
        btnExitCA1.setText("Exit");
        btnExitCA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitCA1ActionPerformed(evt);
            }
        });

        btnSaveCA.setBackground(new java.awt.Color(0, 102, 0));
        btnSaveCA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSaveCA.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveCA.setText("Delete");
        btnSaveCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCAActionPerformed(evt);
            }
        });

        btnResetCA.setBackground(new java.awt.Color(0, 102, 0));
        btnResetCA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnResetCA.setForeground(new java.awt.Color(255, 255, 255));
        btnResetCA.setText("Reset");
        btnResetCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetCAActionPerformed(evt);
            }
        });

        btnSaveCA1.setBackground(new java.awt.Color(0, 102, 0));
        btnSaveCA1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSaveCA1.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveCA1.setText("Save");
        btnSaveCA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCA1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        btnWF.setBackground(new java.awt.Color(0, 102, 0));
        btnWF.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnWF.setForeground(new java.awt.Color(255, 255, 255));
        btnWF.setText("Welfare Fund");
        btnWF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWFActionPerformed(evt);
            }
        });
        jPanel1.add(btnWF);
        btnWF.setBounds(20, 440, 230, 40);

        btnCA.setBackground(new java.awt.Color(0, 102, 0));
        btnCA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCA.setForeground(new java.awt.Color(255, 255, 255));
        btnCA.setText("Create Account");
        btnCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCAActionPerformed(evt);
            }
        });
        jPanel1.add(btnCA);
        btnCA.setBounds(20, 200, 230, 40);

        btnSA.setBackground(new java.awt.Color(0, 102, 0));
        btnSA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSA.setForeground(new java.awt.Color(255, 255, 255));
        btnSA.setText("Saving Account");
        btnSA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSAActionPerformed(evt);
            }
        });
        jPanel1.add(btnSA);
        btnSA.setBounds(20, 260, 230, 40);

        btnSHA.setBackground(new java.awt.Color(0, 102, 0));
        btnSHA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSHA.setForeground(new java.awt.Color(255, 255, 255));
        btnSHA.setText("Share Account");
        btnSHA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSHAActionPerformed(evt);
            }
        });
        jPanel1.add(btnSHA);
        btnSHA.setBounds(20, 320, 230, 40);

        btnIA.setBackground(new java.awt.Color(0, 102, 0));
        btnIA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnIA.setForeground(new java.awt.Color(255, 255, 255));
        btnIA.setText("Investment Account");
        btnIA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIAActionPerformed(evt);
            }
        });
        jPanel1.add(btnIA);
        btnIA.setBounds(20, 380, 230, 40);

        jLabel4.setBackground(new java.awt.Color(153, 255, 0));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Share Account");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(690, 140, 270, 40);

        btnStatement.setBackground(new java.awt.Color(0, 102, 0));
        btnStatement.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnStatement.setForeground(new java.awt.Color(255, 255, 255));
        btnStatement.setText("Statement");
        btnStatement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStatementActionPerformed(evt);
            }
        });
        jPanel1.add(btnStatement);
        btnStatement.setBounds(20, 500, 230, 40);

        jLabel8.setBackground(new java.awt.Color(153, 255, 0));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 153, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Total Amount");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(300, 630, 150, 30);

        jTextFielduserName5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextFielduserName5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFielduserName5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextFielduserName5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFielduserName5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFielduserName5);
        jTextFielduserName5.setBounds(460, 630, 220, 30);

        jLabel3.setBackground(new java.awt.Color(153, 255, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Account No");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(270, 210, 140, 40);

        txtAccountNo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtAccountNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccountNo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtAccountNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccountNoActionPerformed(evt);
            }
        });
        jPanel1.add(txtAccountNo);
        txtAccountNo.setBounds(420, 210, 220, 40);

        jLabel9.setBackground(new java.awt.Color(153, 255, 0));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Name");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(660, 210, 140, 40);

        txtAccountNo1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtAccountNo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccountNo1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtAccountNo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccountNo1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtAccountNo1);
        txtAccountNo1.setBounds(810, 210, 220, 40);

        btnResetCA2.setBackground(new java.awt.Color(0, 102, 0));
        btnResetCA2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnResetCA2.setForeground(new java.awt.Color(255, 255, 255));
        btnResetCA2.setText("Search");
        btnResetCA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetCA2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnResetCA2);
        btnResetCA2.setBounds(1050, 210, 120, 40);

        jLabel6.setBackground(new java.awt.Color(153, 255, 0));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Slip No");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(270, 260, 80, 40);

        txtSlipNo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtSlipNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSlipNo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtSlipNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSlipNoActionPerformed(evt);
            }
        });
        jPanel1.add(txtSlipNo);
        txtSlipNo.setBounds(360, 260, 100, 40);

        jLabel5.setBackground(new java.awt.Color(153, 255, 0));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Deposit Date");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(470, 260, 140, 40);

        txtDepositDate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtDepositDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDepositDate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtDepositDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepositDateActionPerformed(evt);
            }
        });
        jPanel1.add(txtDepositDate);
        txtDepositDate.setBounds(620, 260, 140, 40);

        jLabel7.setBackground(new java.awt.Color(153, 255, 0));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Amount");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(770, 260, 100, 40);

        txtAmount.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAmount.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });
        jPanel1.add(txtAmount);
        txtAmount.setBounds(880, 260, 160, 40);

        btnResetCA3.setBackground(new java.awt.Color(0, 102, 0));
        btnResetCA3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnResetCA3.setForeground(new java.awt.Color(255, 255, 255));
        btnResetCA3.setText("Deposit");
        btnResetCA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetCA3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnResetCA3);
        btnResetCA3.setBounds(1050, 260, 120, 40);

        jLabel10.setBackground(new java.awt.Color(153, 255, 0));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Slip No");
        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(270, 310, 80, 40);

        txtSlipNo1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtSlipNo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSlipNo1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtSlipNo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSlipNo1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtSlipNo1);
        txtSlipNo1.setBounds(360, 310, 100, 40);

        jLabel11.setBackground(new java.awt.Color(153, 255, 0));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Withdraw  Date");
        jLabel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel11);
        jLabel11.setBounds(470, 310, 140, 40);

        txtDepositDate1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtDepositDate1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDepositDate1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtDepositDate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepositDate1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtDepositDate1);
        txtDepositDate1.setBounds(620, 310, 140, 40);

        jLabel12.setBackground(new java.awt.Color(153, 255, 0));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Withdraw");
        jLabel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel12);
        jLabel12.setBounds(770, 310, 100, 40);

        txtAmount1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtAmount1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAmount1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtAmount1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmount1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtAmount1);
        txtAmount1.setBounds(880, 310, 160, 40);

        btnResetCA4.setBackground(new java.awt.Color(0, 102, 0));
        btnResetCA4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnResetCA4.setForeground(new java.awt.Color(255, 255, 255));
        btnResetCA4.setText("Withdraw");
        btnResetCA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetCA4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnResetCA4);
        btnResetCA4.setBounds(1050, 310, 120, 40);

        tblShareAC.setBackground(new java.awt.Color(204, 255, 204));
        tblShareAC.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblShareAC.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tblShareAC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account No", "Slip No", "Name", "Date", "Saving Type", "Deposit Amount", "No Of  Share", "withdraw", "Total Amount", "Total No of Share"
            }
        ));
        jScrollPane1.setViewportView(tblShareAC);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(270, 360, 910, 260);

        btnExitCA2.setBackground(new java.awt.Color(0, 102, 0));
        btnExitCA2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnExitCA2.setForeground(new java.awt.Color(255, 255, 255));
        btnExitCA2.setText("Exit");
        btnExitCA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitCA2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnExitCA2);
        btnExitCA2.setBounds(720, 630, 100, 30);

        btnSaveCA2.setBackground(new java.awt.Color(0, 102, 0));
        btnSaveCA2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSaveCA2.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveCA2.setText("Delete");
        btnSaveCA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCA2ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSaveCA2);
        btnSaveCA2.setBounds(830, 630, 100, 30);

        btnResetCA1.setBackground(new java.awt.Color(0, 102, 0));
        btnResetCA1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnResetCA1.setForeground(new java.awt.Color(255, 255, 255));
        btnResetCA1.setText("Reset");
        btnResetCA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetCA1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnResetCA1);
        btnResetCA1.setBounds(950, 630, 100, 30);

        btnSaveCA3.setBackground(new java.awt.Color(0, 102, 0));
        btnSaveCA3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSaveCA3.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveCA3.setText("Save");
        btnSaveCA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCA3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnSaveCA3);
        btnSaveCA3.setBounds(1070, 630, 100, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon("E:\\Git\\JavaSwing\\ssbbss\\src\\ssbbss\\Image\\background.png")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1210, 670);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1214, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 671, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnWFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWFActionPerformed
       new WelfareFundAcPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnWFActionPerformed

    private void btnCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCAActionPerformed
        new OpenSavingAccountPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCAActionPerformed

    private void btnSAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAActionPerformed
        new SavingAcPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSAActionPerformed

    private void btnSHAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSHAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSHAActionPerformed

    private void btnIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIAActionPerformed
        new InvestmentAcPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnIAActionPerformed

    private void btnStatementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStatementActionPerformed
       new StatementPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnStatementActionPerformed

    private void jTextFielduserName5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFielduserName5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFielduserName5ActionPerformed

    private void txtAccountNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccountNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccountNoActionPerformed

    private void txtAccountNo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccountNo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccountNo1ActionPerformed

    private void btnResetCA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetCA2ActionPerformed

    }//GEN-LAST:event_btnResetCA2ActionPerformed

    private void txtSlipNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSlipNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSlipNoActionPerformed

    private void txtDepositDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepositDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepositDateActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountActionPerformed

    private void btnResetCA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetCA3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetCA3ActionPerformed

    private void txtSlipNo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSlipNo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSlipNo1ActionPerformed

    private void txtDepositDate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepositDate1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepositDate1ActionPerformed

    private void txtAmount1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmount1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmount1ActionPerformed

    private void btnResetCA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetCA4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetCA4ActionPerformed

    private void btnExitCA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitCA1ActionPerformed
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "SSBBSS System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitCA1ActionPerformed

    private void btnSaveCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCAActionPerformed
        DefaultTableModel modeSH = (DefaultTableModel) tblShareAC.getModel();
        if (tblShareAC.getSelectedRow() == -1) {
            if (tblShareAC.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "NO Data To Delete", "SSBBSS System", JOptionPane.OK_OPTION);
            } else {
                JOptionPane.showMessageDialog(null, "Select a Row To Delete", "SSBBSS System", JOptionPane.OK_OPTION);
            }
        } else {
            modeSH.removeRow(tblShareAC.getSelectedRow());
        }
    }//GEN-LAST:event_btnSaveCAActionPerformed

    private void btnResetCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetCAActionPerformed
        JTextField temp = null;
        for (Component c : jPanel1.getComponents()) {
            if (c.getClass().toString().contains("JTextField")) {
                temp = (JTextField) c;
                temp.setText(null);
            }
        }
    }//GEN-LAST:event_btnResetCAActionPerformed

    private void btnSaveCA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveCA1ActionPerformed

    private void btnExitCA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitCA2ActionPerformed
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "SSBBSS System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitCA2ActionPerformed

    private void btnSaveCA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCA2ActionPerformed
        DefaultTableModel modeSH = (DefaultTableModel) tblShareAC.getModel();
        if (tblShareAC.getSelectedRow() == -1) {
            if (tblShareAC.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "NO Data To Delete", "SSBBSS System", JOptionPane.OK_OPTION);
            } else {
                JOptionPane.showMessageDialog(null, "Select a Row To Delete", "SSBBSS System", JOptionPane.OK_OPTION);
            }
        } else {
            modeSH.removeRow(tblShareAC.getSelectedRow());
        }
    }//GEN-LAST:event_btnSaveCA2ActionPerformed

    private void btnResetCA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetCA1ActionPerformed
        JTextField temp = null;
        for (Component c : jPanel1.getComponents()) {
            if (c.getClass().toString().contains("JTextField")) {
                temp = (JTextField) c;
                temp.setText(null);
            }
        }
    }//GEN-LAST:event_btnResetCA1ActionPerformed

    private void btnSaveCA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCA3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveCA3ActionPerformed

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
            java.util.logging.Logger.getLogger(ShareAcPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShareAcPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShareAcPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShareAcPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShareAcPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCA;
    private javax.swing.JButton btnExitCA1;
    private javax.swing.JButton btnExitCA2;
    private javax.swing.JButton btnIA;
    private javax.swing.JButton btnResetCA;
    private javax.swing.JButton btnResetCA1;
    private javax.swing.JButton btnResetCA2;
    private javax.swing.JButton btnResetCA3;
    private javax.swing.JButton btnResetCA4;
    private javax.swing.JButton btnSA;
    private javax.swing.JButton btnSHA;
    private javax.swing.JButton btnSaveCA;
    private javax.swing.JButton btnSaveCA1;
    private javax.swing.JButton btnSaveCA2;
    private javax.swing.JButton btnSaveCA3;
    private javax.swing.JButton btnStatement;
    private javax.swing.JButton btnWF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFielduserName5;
    private javax.swing.JTable tblShareAC;
    private javax.swing.JTextField txtAccountNo;
    private javax.swing.JTextField txtAccountNo1;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtAmount1;
    private javax.swing.JTextField txtDepositDate;
    private javax.swing.JTextField txtDepositDate1;
    private javax.swing.JTextField txtSlipNo;
    private javax.swing.JTextField txtSlipNo1;
    // End of variables declaration//GEN-END:variables
}
