/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sadria.view;

import com.sadria.Dao.PersonDao;
import com.sadria.Dao.SummaryDao;
import com.sadria.Dao.TranstionDao;
import com.sadria.DaoImp.PersonDaoImp;
import com.sadria.DaoImp.SummaryDaoImp;
import com.sadria.DaoImp.TranstionDaoImp;
import com.sadria.pojo.Person;
import com.sadria.pojo.Summary;
import com.sadria.pojo.Transtion;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class HomePage extends javax.swing.JFrame {

    /**
     * Creates new form StatementView
     */
    public HomePage() {
        initComponents();
        setLocationRelativeTo(null);
       
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblStatement = new javax.swing.JLabel();
        lblCreateAccount1 = new javax.swing.JLabel();
        lblTranstion = new javax.swing.JLabel();
        lblInvestmentAccount = new javax.swing.JLabel();
        panalstatement = new javax.swing.JPanel();
        lblWealcome = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sadria/img/logo.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));

        lblStatement.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblStatement.setForeground(new java.awt.Color(255, 255, 255));
        lblStatement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatement.setText("Statement");
        lblStatement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStatementMouseClicked(evt);
            }
        });

        lblCreateAccount1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCreateAccount1.setForeground(new java.awt.Color(255, 255, 255));
        lblCreateAccount1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateAccount1.setText("Saving Account");
        lblCreateAccount1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCreateAccount1MouseClicked(evt);
            }
        });

        lblTranstion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTranstion.setForeground(new java.awt.Color(255, 255, 255));
        lblTranstion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTranstion.setText("Transtion");
        lblTranstion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTranstionMouseClicked(evt);
            }
        });

        lblInvestmentAccount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblInvestmentAccount.setForeground(new java.awt.Color(255, 255, 255));
        lblInvestmentAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInvestmentAccount.setText("Investment Account");
        lblInvestmentAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInvestmentAccountMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStatement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTranstion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblInvestmentAccount, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblCreateAccount1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(lblInvestmentAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblTranstion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblStatement, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(lblCreateAccount1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(533, Short.MAX_VALUE)))
        );

        panalstatement.setBackground(new java.awt.Color(0, 102, 51));

        lblWealcome.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblWealcome.setForeground(new java.awt.Color(255, 255, 255));
        lblWealcome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWealcome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sadria/img/icons8_worldwide_location_20px_3.png"))); // NOI18N
        lblWealcome.setText("WealCome");

        javax.swing.GroupLayout panalstatementLayout = new javax.swing.GroupLayout(panalstatement);
        panalstatement.setLayout(panalstatementLayout);
        panalstatementLayout.setHorizontalGroup(
            panalstatementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panalstatementLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblWealcome, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(176, 176, 176))
        );
        panalstatementLayout.setVerticalGroup(
            panalstatementLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panalstatementLayout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addComponent(lblWealcome, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(300, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panalstatement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panalstatement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblStatementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStatementMouseClicked
        this.setVisible(true);
        new InvestmentView().setVisible(false);
        new Transtionview().setVisible(false);
        new CreateSavingACView().setVisible(false);
    }//GEN-LAST:event_lblStatementMouseClicked

    private void lblCreateAccount1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateAccount1MouseClicked

        this.setVisible(false);
        new CreateSavingACView().setVisible(true);
        new InvestmentView().setVisible(false);
        new Transtionview().setVisible(false);
    }//GEN-LAST:event_lblCreateAccount1MouseClicked

    private void lblTranstionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTranstionMouseClicked
        this.setVisible(false);
        new CreateSavingACView().setVisible(false);
        new Transtionview().setVisible(true);
        new InvestmentView().setVisible(false);
    }//GEN-LAST:event_lblTranstionMouseClicked

    private void lblInvestmentAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInvestmentAccountMouseClicked
        this.setVisible(false);
        new CreateSavingACView().setVisible(true);
        new Transtionview().setVisible(false);
        new InvestmentView().setVisible(false);
    }//GEN-LAST:event_lblInvestmentAccountMouseClicked

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCreateAccount1;
    private javax.swing.JLabel lblInvestmentAccount;
    private javax.swing.JLabel lblStatement;
    private javax.swing.JLabel lblTranstion;
    private javax.swing.JLabel lblWealcome;
    private javax.swing.JPanel panalstatement;
    // End of variables declaration//GEN-END:variables
}
