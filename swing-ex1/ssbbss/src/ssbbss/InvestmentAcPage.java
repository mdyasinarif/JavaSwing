/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssbbss;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Md Yasin Arif
 */
public class InvestmentAcPage extends javax.swing.JFrame {
private JFrame frame;
    /**
     * Creates new form LoginPage
     */
    public InvestmentAcPage() {
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
        btnSaveCA = new javax.swing.JButton();
        btnWF = new javax.swing.JButton();
        btnExitCA1 = new javax.swing.JButton();
        btnCA = new javax.swing.JButton();
        btnSA = new javax.swing.JButton();
        btnSHA = new javax.swing.JButton();
        btnIA = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnWF1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        iacCurrentTotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        investmentAccountNo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        iname = new javax.swing.JTextField();
        btnResetCA2 = new javax.swing.JButton();
        btnResetCA3 = new javax.swing.JButton();
        iacDAmount = new javax.swing.JTextField();
        iacDepositDate = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        iacDSlip = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        iacWSlip = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        iacWidrawDate = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        iacWAmount = new javax.swing.JTextField();
        btnResetCA4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        btnSaveCA.setBackground(new java.awt.Color(0, 102, 0));
        btnSaveCA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSaveCA.setForeground(new java.awt.Color(255, 255, 255));
        btnSaveCA.setText("Save");
        btnSaveCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCAActionPerformed(evt);
            }
        });
        jPanel1.add(btnSaveCA);
        btnSaveCA.setBounds(1050, 630, 100, 30);

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

        btnExitCA1.setBackground(new java.awt.Color(0, 102, 0));
        btnExitCA1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnExitCA1.setForeground(new java.awt.Color(255, 255, 255));
        btnExitCA1.setText("Exit");
        btnExitCA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitCA1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnExitCA1);
        btnExitCA1.setBounds(940, 630, 100, 30);

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
        jLabel4.setText("Investment Account");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(680, 140, 270, 40);

        btnWF1.setBackground(new java.awt.Color(0, 102, 0));
        btnWF1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnWF1.setForeground(new java.awt.Color(255, 255, 255));
        btnWF1.setText("Statement");
        btnWF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWF1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnWF1);
        btnWF1.setBounds(20, 500, 230, 40);

        jTable1.setBackground(new java.awt.Color(204, 255, 204));
        jTable1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTable1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Account No", "Name", "Saving Type", "Deposit Amount", "Installment NO", "Total Deposit", "Cover Date", "Due"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(270, 360, 910, 260);

        jLabel12.setBackground(new java.awt.Color(153, 255, 0));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 153, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Total Amount");
        jLabel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel12);
        jLabel12.setBounds(300, 630, 150, 30);

        iacCurrentTotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        iacCurrentTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        iacCurrentTotal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        iacCurrentTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iacCurrentTotalActionPerformed(evt);
            }
        });
        jPanel1.add(iacCurrentTotal);
        iacCurrentTotal.setBounds(460, 630, 220, 30);

        jLabel3.setBackground(new java.awt.Color(153, 255, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Account No");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(270, 210, 140, 40);

        investmentAccountNo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        investmentAccountNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        investmentAccountNo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        investmentAccountNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                investmentAccountNoActionPerformed(evt);
            }
        });
        jPanel1.add(investmentAccountNo);
        investmentAccountNo.setBounds(420, 210, 220, 40);

        jLabel9.setBackground(new java.awt.Color(153, 255, 0));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Name");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(660, 210, 140, 40);

        iname.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        iname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        iname.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        iname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inameActionPerformed(evt);
            }
        });
        jPanel1.add(iname);
        iname.setBounds(810, 210, 230, 40);

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

        btnResetCA3.setBackground(new java.awt.Color(0, 102, 0));
        btnResetCA3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnResetCA3.setForeground(new java.awt.Color(255, 255, 255));
        btnResetCA3.setText("Submmit");
        btnResetCA3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetCA3ActionPerformed(evt);
            }
        });
        jPanel1.add(btnResetCA3);
        btnResetCA3.setBounds(1050, 260, 120, 40);

        iacDAmount.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        iacDAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        iacDAmount.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        iacDAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iacDAmountActionPerformed(evt);
            }
        });
        jPanel1.add(iacDAmount);
        iacDAmount.setBounds(880, 260, 160, 40);

        iacDepositDate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        iacDepositDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        iacDepositDate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        iacDepositDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iacDepositDateActionPerformed(evt);
            }
        });
        jPanel1.add(iacDepositDate);
        iacDepositDate.setBounds(620, 260, 140, 40);

        jLabel7.setBackground(new java.awt.Color(153, 255, 0));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Amount");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel7);
        jLabel7.setBounds(770, 260, 100, 40);

        jLabel5.setBackground(new java.awt.Color(153, 255, 0));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Deposit Date");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel5);
        jLabel5.setBounds(470, 260, 140, 40);

        iacDSlip.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        iacDSlip.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        iacDSlip.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        iacDSlip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iacDSlipActionPerformed(evt);
            }
        });
        jPanel1.add(iacDSlip);
        iacDSlip.setBounds(360, 260, 100, 40);

        jLabel6.setBackground(new java.awt.Color(153, 255, 0));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Slip No");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel6);
        jLabel6.setBounds(270, 260, 80, 40);

        jLabel10.setBackground(new java.awt.Color(153, 255, 0));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Slip No");
        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel10);
        jLabel10.setBounds(270, 310, 80, 40);

        iacWSlip.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        iacWSlip.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        iacWSlip.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        iacWSlip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iacWSlipActionPerformed(evt);
            }
        });
        jPanel1.add(iacWSlip);
        iacWSlip.setBounds(360, 310, 100, 40);

        jLabel11.setBackground(new java.awt.Color(153, 255, 0));
        jLabel11.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Withdraw  Date");
        jLabel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel11);
        jLabel11.setBounds(470, 310, 140, 40);

        iacWidrawDate.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        iacWidrawDate.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        iacWidrawDate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        iacWidrawDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iacWidrawDateActionPerformed(evt);
            }
        });
        jPanel1.add(iacWidrawDate);
        iacWidrawDate.setBounds(620, 310, 140, 40);

        jLabel13.setBackground(new java.awt.Color(153, 255, 0));
        jLabel13.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 153, 0));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Withdraw");
        jLabel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel13);
        jLabel13.setBounds(770, 310, 100, 40);

        iacWAmount.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        iacWAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        iacWAmount.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        iacWAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iacWAmountActionPerformed(evt);
            }
        });
        jPanel1.add(iacWAmount);
        iacWAmount.setBounds(880, 310, 160, 40);

        btnResetCA4.setBackground(new java.awt.Color(0, 102, 0));
        btnResetCA4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnResetCA4.setForeground(new java.awt.Color(255, 255, 255));
        btnResetCA4.setText("Submmit");
        btnResetCA4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetCA4ActionPerformed(evt);
            }
        });
        jPanel1.add(btnResetCA4);
        btnResetCA4.setBounds(1050, 310, 120, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ssbbss/Image/background.png"))); // NOI18N
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

    private void btnSaveCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveCAActionPerformed

    private void btnWFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWFActionPerformed
       new WelfareFundAcPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnWFActionPerformed

    private void btnExitCA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitCA1ActionPerformed
       frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "SSBBSS System", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitCA1ActionPerformed

    private void btnCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCAActionPerformed
        new CreateSavingAccountPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCAActionPerformed

    private void btnSAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAActionPerformed
        new SavingAcPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSAActionPerformed

    private void btnSHAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSHAActionPerformed
       new ShareAcPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnSHAActionPerformed

    private void btnIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIAActionPerformed
        
    }//GEN-LAST:event_btnIAActionPerformed

    private void btnWF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWF1ActionPerformed
        new StatementPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnWF1ActionPerformed

    private void iacCurrentTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iacCurrentTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iacCurrentTotalActionPerformed

    private void investmentAccountNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_investmentAccountNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_investmentAccountNoActionPerformed

    private void inameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inameActionPerformed

    private void btnResetCA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetCA2ActionPerformed

    }//GEN-LAST:event_btnResetCA2ActionPerformed

    private void btnResetCA3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetCA3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetCA3ActionPerformed

    private void iacDAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iacDAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iacDAmountActionPerformed

    private void iacDepositDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iacDepositDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iacDepositDateActionPerformed

    private void iacDSlipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iacDSlipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iacDSlipActionPerformed

    private void iacWSlipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iacWSlipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iacWSlipActionPerformed

    private void iacWidrawDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iacWidrawDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iacWidrawDateActionPerformed

    private void iacWAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iacWAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_iacWAmountActionPerformed

    private void btnResetCA4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetCA4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetCA4ActionPerformed

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
            java.util.logging.Logger.getLogger(InvestmentAcPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvestmentAcPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvestmentAcPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvestmentAcPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new InvestmentAcPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCA;
    private javax.swing.JButton btnExitCA1;
    private javax.swing.JButton btnIA;
    private javax.swing.JButton btnResetCA2;
    private javax.swing.JButton btnResetCA3;
    private javax.swing.JButton btnResetCA4;
    private javax.swing.JButton btnSA;
    private javax.swing.JButton btnSHA;
    private javax.swing.JButton btnSaveCA;
    private javax.swing.JButton btnWF;
    private javax.swing.JButton btnWF1;
    private javax.swing.JTextField iacCurrentTotal;
    private javax.swing.JTextField iacDAmount;
    private javax.swing.JTextField iacDSlip;
    private javax.swing.JTextField iacDepositDate;
    private javax.swing.JTextField iacWAmount;
    private javax.swing.JTextField iacWSlip;
    private javax.swing.JTextField iacWidrawDate;
    private javax.swing.JTextField iname;
    private javax.swing.JTextField investmentAccountNo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
