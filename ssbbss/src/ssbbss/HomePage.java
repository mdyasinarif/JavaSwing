/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssbbss;

/**
 *
 * @author Md Yasin Arif
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    public HomePage() {
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
        btnResetCA = new javax.swing.JButton();
        btnExitCA1 = new javax.swing.JButton();
        btnCA = new javax.swing.JButton();
        btnSA = new javax.swing.JButton();
        btnSHA = new javax.swing.JButton();
        btnIA = new javax.swing.JButton();
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
        btnSaveCA.setBounds(1070, 640, 100, 30);

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

        btnResetCA.setBackground(new java.awt.Color(0, 102, 0));
        btnResetCA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnResetCA.setForeground(new java.awt.Color(255, 255, 255));
        btnResetCA.setText("Reset");
        btnResetCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetCAActionPerformed(evt);
            }
        });
        jPanel1.add(btnResetCA);
        btnResetCA.setBounds(950, 640, 100, 30);

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
        btnExitCA1.setBounds(830, 640, 100, 30);

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
        // TODO add your handling code here:
    }//GEN-LAST:event_btnWFActionPerformed

    private void btnResetCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetCAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetCAActionPerformed

    private void btnExitCA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitCA1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitCA1ActionPerformed

    private void btnCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCAActionPerformed

    private void btnSAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSAActionPerformed

    private void btnSHAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSHAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSHAActionPerformed

    private void btnIAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIAActionPerformed

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCA;
    private javax.swing.JButton btnExitCA1;
    private javax.swing.JButton btnIA;
    private javax.swing.JButton btnResetCA;
    private javax.swing.JButton btnSA;
    private javax.swing.JButton btnSHA;
    private javax.swing.JButton btnSaveCA;
    private javax.swing.JButton btnWF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
