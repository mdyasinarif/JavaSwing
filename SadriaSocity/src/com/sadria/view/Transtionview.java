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
import java.awt.Component;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Transtionview extends javax.swing.JFrame {

    /**
     * Creates new form PersonInfoview
     */
    int total = 0;

    public Transtionview() {
        initComponents();
        setLocationRelativeTo(null);
        displayTranstionTable();
        day();
    }
    int id;
    Date date;
    String accountNo;
    String name;
    String slipNo;
    int deposit;
    int withdraw;

    public void day() {
        Calendar cal = new GregorianCalendar();
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);

        lblDate.setText("Date :" + day + " : " + (month + 1) + " : " + year);

    }

    public void clearTable() {
        DefaultTableModel model = (DefaultTableModel) tblTranscation.getModel();
        model.setRowCount(0);
    }

    public void clearSummaryTable() {
        DefaultTableModel model = (DefaultTableModel) tblSummary.getModel();
        model.setRowCount(0);
    }

    public void displayTranstionTable() {
        clearTable();
        TranstionDao tDao = new TranstionDaoImp();
        List<Transtion> list = tDao.getTranstions();

        DefaultTableModel model = (DefaultTableModel) tblTranscation.getModel();
        Object[] col = new Object[7];
        for (int i = 0; i < list.size(); i++) {
            col[0] = list.get(i).getId();
            col[1] = list.get(i).getDate();
            col[2] = list.get(i).getAccountNo();
            col[3] = list.get(i).getName();
            col[4] = list.get(i).getSlipNo();
            col[5] = list.get(i).getDeposit();
            col[6] = list.get(i).getWithdraw();
            model.addRow(col);

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHead = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblStatement = new javax.swing.JLabel();
        lblCreateAccount1 = new javax.swing.JLabel();
        lblTranstion = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtAccountNo = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        txtAmount = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSlipNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnWithdraw = new javax.swing.JButton();
        btnDeposit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnClear1 = new javax.swing.JButton();
        btnSearch1 = new javax.swing.JButton();
        Connection = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSummary = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTranscation = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHead.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sadria/img/hedline2.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));

        lblStatement.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblStatement.setForeground(new java.awt.Color(255, 255, 255));
        lblStatement.setText("Statement");

        lblCreateAccount1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCreateAccount1.setForeground(new java.awt.Color(255, 255, 255));
        lblCreateAccount1.setText("Create Account");
        lblCreateAccount1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCreateAccount1MouseClicked(evt);
            }
        });

        lblTranstion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTranstion.setForeground(new java.awt.Color(255, 255, 255));
        lblTranstion.setText("Transtion");
        lblTranstion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTranstionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStatement, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(lblTranstion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblCreateAccount1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(lblTranstion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblStatement, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(342, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(lblCreateAccount1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(453, Short.MAX_VALUE)))
        );

        jPanel4.setBackground(new java.awt.Color(0, 102, 51));

        jLabel3.setBackground(new java.awt.Color(0, 102, 51));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Account No");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtAccountNo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtAccountNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccountNo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtAccountNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccountNoActionPerformed(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(0, 102, 51));
        btnSearch.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txtAmount.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAmount.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(0, 102, 51));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Amount");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtSlipNo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtSlipNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSlipNo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtSlipNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSlipNoActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(0, 102, 51));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Slip No");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnWithdraw.setBackground(new java.awt.Color(0, 102, 51));
        btnWithdraw.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnWithdraw.setForeground(new java.awt.Color(255, 255, 255));
        btnWithdraw.setText("Withdraw");
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawActionPerformed(evt);
            }
        });

        btnDeposit.setBackground(new java.awt.Color(0, 102, 51));
        btnDeposit.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDeposit.setForeground(new java.awt.Color(255, 255, 255));
        btnDeposit.setText("Deposit");
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(0, 102, 51));
        btnClear.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnClear1.setBackground(new java.awt.Color(0, 102, 51));
        btnClear1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnClear1.setForeground(new java.awt.Color(255, 255, 255));
        btnClear1.setText("Clear Table");
        btnClear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear1ActionPerformed(evt);
            }
        });

        btnSearch1.setBackground(new java.awt.Color(0, 102, 51));
        btnSearch1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSearch1.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch1.setText("Edit");
        btnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch1ActionPerformed(evt);
            }
        });

        Connection.setBackground(new java.awt.Color(0, 102, 51));
        Connection.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Connection.setForeground(new java.awt.Color(255, 255, 255));
        Connection.setText("Collection :");

        lblTotal.setBackground(new java.awt.Color(0, 102, 51));
        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));

        lblDate.setBackground(new java.awt.Color(0, 102, 51));
        lblDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSlipNo, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Connection)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeposit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear))
                    .addComponent(btnSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(btnClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(14, 14, 14))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDeposit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnWithdraw, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClear1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtAccountNo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSlipNo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Connection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        tblSummary.setBackground(new java.awt.Color(204, 255, 204));
        tblSummary.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblSummary.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tblSummary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account No", "Name", "Account Type", "Annunity", "Date", "Total Deposit", "Total Withdraw", "Balance", "Installment NO", "Cover Date", "Due"
            }
        ));
        jScrollPane1.setViewportView(tblSummary);

        tblTranscation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Date", "Account NO", "Name", "SlipNo", "Deposit", "Withdraw"
            }
        ));
        jScrollPane2.setViewportView(tblTranscation);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1008, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addComponent(lblHead))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblHead, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCreateAccount1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateAccount1MouseClicked

        this.setVisible(false);
        new PersonInfoview().setVisible(true);
    }//GEN-LAST:event_lblCreateAccount1MouseClicked

    private void txtAccountNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccountNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccountNoActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed

        PersonDao personDao = new PersonDaoImp();
        Transtion transtion = new Transtion();
        Person person = personDao.getPersonByAccontNo(txtAccountNo.getText().trim());
        txtName.setText(person.getName());
        displaySummary(txtAccountNo);

    }//GEN-LAST:event_btnSearchActionPerformed
    public void displaySummary(JTextField acNo) {
        clearSummaryTable();
        SummaryDao summaryDao = new SummaryDaoImp();
        Summary summary = summaryDao.getSummaryByAccontNo(acNo.getText().trim());

        DefaultTableModel model = (DefaultTableModel) tblSummary.getModel();
        Object col[] = new Object[11];
        col[0] = summary.getAccountNo();
        col[1] = summary.getName();
        col[2] = summary.getSavingType();
        col[3] = summary.getAnnunity();
        col[4] = summary.getDate();
        col[5] = summary.getTotalDeposit();
        col[6] = summary.getTotalWithdraw();
        col[7] = summary.getBalance();
        col[8] = summary.getInstallmentNo();
        col[9] = summary.getCoverDate();
        col[10] = summary.getDue();
        model.addRow(col);
    }
    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountActionPerformed

    private void txtSlipNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSlipNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSlipNoActionPerformed
  
    private void btnWithdrawActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWithdrawActionPerformed
        TranstionDao tDao = new TranstionDaoImp();
        Date date = new Date();
        accountNo = txtAccountNo.getText();
        name = txtName.getText();
        slipNo = txtSlipNo.getText();
        withdraw = Integer.parseInt(txtAmount.getText());

        try {
            Transtion t = new Transtion(new java.sql.Date(date.getTime()), accountNo, name, slipNo, 0);
            t.setWithdraw(withdraw);
            tDao.withdraw(t);

            displayTranstionTable();

            displaySummary(txtAccountNo);

            SummaryDao summaryDao = new SummaryDaoImp();

            Summary summary = summaryDao.getSummaryByAccontNo(accountNo);
            if (summary.getAccountNo() != null) {
                int totalWithdraw = summary.getTotalWithdraw() + Integer.parseInt(txtAmount.getText().trim());
                int balance = summary.getBalance() - Integer.parseInt(txtAmount.getText().trim());
                int installment = (summary.getBalance() - Integer.parseInt(txtAmount.getText().trim())) / summary.getAnnunity();
                PersonDao pDao = new PersonDaoImp();
                Person person = pDao.getPersonByAccontNo(accountNo);
                Date addmissionDay = person.getAdmissionDate();
                
                
                int day = -1;
                if (summary.getSavingType().trim().equalsIgnoreCase("Weekly")) {
                    day = summary.getInstallmentNo() * 7;
                } else if (summary.getSavingType().trim().equalsIgnoreCase("Monthly")) {
                    day = summary.getInstallmentNo() * 30;
                }
                Date coverDate = getsCoverDate(addmissionDay, day);
                int due = 1;
                Summary summaryUp = new Summary();
                summaryUp.setAccountNo(accountNo);
                summaryUp.setTotalWithdraw(totalWithdraw);
                summaryUp.setBalance(balance);
                summaryUp.setCoverDate(coverDate);
                summaryUp.setInstallmentNo(installment);
                summaryUp.setDue(due);
                summaryDao.updateForWithdraw(summaryUp);
                displaySummary(txtAccountNo);
                total -= Integer.parseInt(txtAmount.getText());
                lblTotal.setText(total + "");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }//GEN-LAST:event_btnWithdrawActionPerformed
    public static Date getsCoverDate(Date addmissionDay, int day) {
        Calendar c = Calendar.getInstance();       
        c.add(Calendar.DATE, day);
        return c.getTime();
    }

    private void btnDepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDepositActionPerformed
        TranstionDao tDao = new TranstionDaoImp();
        Date date = new Date();
        accountNo = txtAccountNo.getText();
        name = txtName.getText();
        slipNo = txtSlipNo.getText();
        deposit = Integer.parseInt(txtAmount.getText());
        try {
            Transtion t = new Transtion(new java.sql.Date(date.getTime()), accountNo, name, slipNo, deposit);
            tDao.deposit(t);
            displaySummary(txtAccountNo);
            displayTranstionTable();

            SummaryDao summaryDao = new SummaryDaoImp();

            Summary summary = summaryDao.getSummaryByAccontNo(accountNo);
            if (summary.getAccountNo() != null) {
                int totalDeposit = summary.getTotalDeposit() + Integer.parseInt(txtAmount.getText().trim());
                int balance = summary.getBalance() + Integer.parseInt(txtAmount.getText().trim());
                int installment = (summary.getBalance() + Integer.parseInt(txtAmount.getText().trim())) / summary.getAnnunity();

                PersonDao pDao = new PersonDaoImp();
                Person person = pDao.getPersonByAccontNo(accountNo);
                Date addmissionDay = person.getAdmissionDate();
                
                
                int day = 1;
                if (summary.getSavingType().trim().equalsIgnoreCase("Weekly")) {
                    day = summary.getInstallmentNo() * 7;
                } else if (summary.getSavingType().trim().equalsIgnoreCase("Monthly")) {
                    day = summary.getInstallmentNo() * 30;
                }
                Date coverDate = getsCoverDate(addmissionDay, day);
                
               
                // get due 
                int due = 1;
                Date currentDay = new java.sql.Date(date.getTime());
                long diff = currentDay.getTime() - addmissionDay.getTime();
                long days = (diff / (1000 * 60 * 60 * 24));
                
                if (summary.getSavingType().trim().equalsIgnoreCase("Weekly")) {
                    due = (int) (days / 7);
                } else if (summary.getSavingType().trim().equalsIgnoreCase("Monthly")) {
                    due = (int) (days / 30);
                }

                Summary summaryUp = new Summary(summary.getAccountNo(), totalDeposit, balance, installment, coverDate, due);
                summaryDao.updateForDeposit(summaryUp);
                displaySummary(txtAccountNo);
                total += Integer.parseInt(txtAmount.getText());
                lblTotal.setText(total + "");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_btnDepositActionPerformed

    private void lblTranstionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTranstionMouseClicked
        this.setVisible(true);
        new PersonInfoview().setVisible(false);
    }//GEN-LAST:event_lblTranstionMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtAccountNo.setText("");
        txtName.setText("");
        txtSlipNo.setText("");
        txtAmount.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnClear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear1ActionPerformed
        DefaultTableModel model = (DefaultTableModel) tblTranscation.getModel();
        model.setRowCount(0);
    }//GEN-LAST:event_btnClear1ActionPerformed

    private void btnSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearch1ActionPerformed

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
            java.util.logging.Logger.getLogger(Transtionview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Transtionview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Transtionview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Transtionview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Transtionview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Connection;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClear1;
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCreateAccount1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblStatement;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblTranstion;
    private javax.swing.JTable tblSummary;
    private javax.swing.JTable tblTranscation;
    private javax.swing.JTextField txtAccountNo;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSlipNo;
    // End of variables declaration//GEN-END:variables
}
