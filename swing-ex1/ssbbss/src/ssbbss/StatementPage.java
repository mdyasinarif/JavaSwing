/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssbbss;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Md Yasin Arif
 */
public class StatementPage extends javax.swing.JFrame {
private JFrame frame;
    /**
     * Creates new form LoginPage
     */
    public StatementPage() {
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
        btnWF = new javax.swing.JButton();
        btnResetCA = new javax.swing.JButton();
        btnExitCA1 = new javax.swing.JButton();
        btnCA = new javax.swing.JButton();
        btnSA = new javax.swing.JButton();
        btnSHA = new javax.swing.JButton();
        btnIA = new javax.swing.JButton();
        btnWF1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAccountNo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtAccountNo1 = new javax.swing.JTextField();
        btnResetCA2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSavings = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        btnWF.setBackground(new java.awt.Color(0, 102, 0));
        btnWF.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnWF.setForeground(new java.awt.Color(255, 255, 255));
        btnWF.setText("Statement");
        btnWF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWFActionPerformed(evt);
            }
        });
        jPanel1.add(btnWF);
        btnWF.setBounds(20, 500, 230, 40);

        btnResetCA.setBackground(new java.awt.Color(0, 102, 0));
        btnResetCA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnResetCA.setForeground(new java.awt.Color(255, 255, 255));
        btnResetCA.setText("Print");
        btnResetCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetCAActionPerformed(evt);
            }
        });
        jPanel1.add(btnResetCA);
        btnResetCA.setBounds(1050, 630, 130, 30);

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
        btnExitCA1.setBounds(930, 630, 100, 30);

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

        btnWF1.setBackground(new java.awt.Color(0, 102, 0));
        btnWF1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnWF1.setForeground(new java.awt.Color(255, 255, 255));
        btnWF1.setText("Welfare Fund");
        btnWF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWF1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnWF1);
        btnWF1.setBounds(20, 440, 230, 40);

        jLabel4.setBackground(new java.awt.Color(153, 255, 0));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Statement");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel4);
        jLabel4.setBounds(680, 140, 270, 40);

        jLabel3.setBackground(new java.awt.Color(153, 255, 0));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Account No");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel3);
        jLabel3.setBounds(270, 220, 140, 40);

        txtAccountNo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtAccountNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccountNo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtAccountNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccountNoActionPerformed(evt);
            }
        });
        jPanel1.add(txtAccountNo);
        txtAccountNo.setBounds(420, 220, 220, 40);

        jLabel9.setBackground(new java.awt.Color(153, 255, 0));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Name");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel9);
        jLabel9.setBounds(660, 220, 140, 40);

        txtAccountNo1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtAccountNo1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccountNo1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtAccountNo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccountNo1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtAccountNo1);
        txtAccountNo1.setBounds(810, 220, 220, 40);

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
        btnResetCA2.setBounds(1050, 220, 120, 40);

        tblSavings.setBackground(new java.awt.Color(204, 255, 204));
        tblSavings.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblSavings.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tblSavings.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Account No", "Name", "Saving Type", "Deposit Amount", "Installment NO", "Total Deposit", "Cover Date", "Due"
            }
        ));
        jScrollPane1.setViewportView(tblSavings);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(270, 270, 910, 350);

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

    private void btnWFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnWFActionPerformed

    private void btnResetCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetCAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetCAActionPerformed

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
         new InvestmentAcPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnIAActionPerformed

    private void btnWF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWF1ActionPerformed
        new WelfareFundAcPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnWF1ActionPerformed

    private void txtAccountNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccountNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccountNoActionPerformed

    private void txtAccountNo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccountNo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccountNo1ActionPerformed

    private void btnResetCA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetCA2ActionPerformed

    }//GEN-LAST:event_btnResetCA2ActionPerformed

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
            java.util.logging.Logger.getLogger(StatementPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StatementPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StatementPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StatementPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new StatementPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCA;
    private javax.swing.JButton btnExitCA1;
    private javax.swing.JButton btnIA;
    private javax.swing.JButton btnResetCA;
    private javax.swing.JButton btnResetCA2;
    private javax.swing.JButton btnSA;
    private javax.swing.JButton btnSHA;
    private javax.swing.JButton btnWF;
    private javax.swing.JButton btnWF1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSavings;
    private javax.swing.JTextField txtAccountNo;
    private javax.swing.JTextField txtAccountNo1;
    // End of variables declaration//GEN-END:variables
}
