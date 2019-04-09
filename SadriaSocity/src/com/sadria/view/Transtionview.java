/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sadria.view;

import com.sadria.Dao.InvestmentSummaryDao;
import com.sadria.Dao.PersonDao;
import com.sadria.Dao.SummaryDao;
import com.sadria.Dao.TranstionDao;
import com.sadria.DaoImp.InvestmentSummaryDaoImp;
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
     * Creates new form CreateSavingACView
     */
    int total = 0;

    public Transtionview() {
        initComponents();
        setLocationRelativeTo(null);
        displayTranstionTable();
        day();
        deposit();
        investment();
        balance();
    }
    int id;
    Date date;
    String accountNo;
    String name;
    String slipNo;
    int deposit;
    int withdraw;
    
    public void deposit(){
    SummaryDao summaryDao = new SummaryDaoImp();
    int totalDeposit=  summaryDao.getDeposit();
    lblDeposit.setText(String.valueOf(totalDeposit));
    
    }
    public void investment(){
        InvestmentSummaryDao isDao = new InvestmentSummaryDaoImp();
     double totalInvestment =  isDao.getInvestment();
    lblInvestment.setText(String.valueOf(totalInvestment));
    }
    public  void balance(){
     int deposit = Integer.parseInt(lblDeposit.getText());   
     double investmetn = Double.parseDouble(lblInvestment.getText());
    double balance = deposit-investmetn;
    lblBalance.setText(String.valueOf(balance));
    }
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
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblDeposit = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblInvestment = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lblBalance = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAccountNo = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        txtSlipNo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnDeposit = new javax.swing.JButton();
        lblDate = new javax.swing.JLabel();
        btnWithdraw = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSummary = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTranscation = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblStatement = new javax.swing.JLabel();
        lblCreateAccount1 = new javax.swing.JLabel();
        lblTranstion = new javax.swing.JLabel();
        lblInvestmentAccount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHead.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sadria/img/logo.png"))); // NOI18N
        getContentPane().add(lblHead, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, -1, 166));

        jPanel4.setBackground(new java.awt.Color(0, 102, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(0, 102, 51));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sadria/img/icons8_deposit_18px.png"))); // NOI18N
        jLabel8.setText("Deposit");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 140, 40));

        lblDeposit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDeposit.setForeground(new java.awt.Color(255, 255, 255));
        lblDeposit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDeposit.setText("0");
        jPanel4.add(lblDeposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 11, 70, 40));

        jLabel9.setBackground(new java.awt.Color(0, 102, 51));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sadria/img/icons8_key_exchange_18px_2.png"))); // NOI18N
        jLabel9.setText("Investment");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 140, 40));

        lblInvestment.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblInvestment.setForeground(new java.awt.Color(255, 255, 255));
        lblInvestment.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInvestment.setText("0");
        jPanel4.add(lblInvestment, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 90, 40));

        jLabel10.setBackground(new java.awt.Color(0, 102, 51));
        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sadria/img/icons8_add_to_collection_18px.png"))); // NOI18N
        jLabel10.setText("Collection");
        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(719, 10, 130, 40));

        lblBalance.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblBalance.setForeground(new java.awt.Color(255, 255, 255));
        lblBalance.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBalance.setText("0");
        jPanel4.add(lblBalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 83, 40));

        lblTotal.setBackground(new java.awt.Color(0, 102, 51));
        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotal.setText("0");
        jPanel4.add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 91, 40));

        jLabel3.setBackground(new java.awt.Color(0, 102, 51));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Account No");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 140, 40));

        txtAccountNo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtAccountNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAccountNo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtAccountNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccountNoActionPerformed(evt);
            }
        });
        jPanel4.add(txtAccountNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 70, 157, 40));

        txtName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel4.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 70, 240, 40));

        btnSearch.setBackground(new java.awt.Color(0, 102, 51));
        btnSearch.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sadria/img/icons8_search_18px_4.png"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel4.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 70, -1, 40));

        btnEdit.setBackground(new java.awt.Color(0, 102, 51));
        btnEdit.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sadria/img/icons8_edit_18px.png"))); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel4.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 70, -1, 40));

        btnClear.setBackground(new java.awt.Color(0, 102, 51));
        btnClear.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sadria/img/icons8_clear_formatting_18px.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel4.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(833, 70, -1, 40));

        txtSlipNo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtSlipNo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSlipNo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtSlipNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSlipNoActionPerformed(evt);
            }
        });
        jPanel4.add(txtSlipNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 139, 94, 40));

        jLabel6.setBackground(new java.awt.Color(0, 102, 51));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Slip No");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 139, 80, 40));

        txtAmount.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAmount.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });
        jPanel4.add(txtAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 129, 40));

        jLabel7.setBackground(new java.awt.Color(0, 102, 51));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Amount");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 139, 100, 40));

        btnDeposit.setBackground(new java.awt.Color(0, 102, 51));
        btnDeposit.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDeposit.setForeground(new java.awt.Color(255, 255, 255));
        btnDeposit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sadria/img/icons8_deposit_18px.png"))); // NOI18N
        btnDeposit.setText("Deposit");
        btnDeposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDepositActionPerformed(evt);
            }
        });
        jPanel4.add(btnDeposit, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, 40));

        lblDate.setBackground(new java.awt.Color(0, 102, 51));
        lblDate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        jPanel4.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 200, 40));

        btnWithdraw.setBackground(new java.awt.Color(0, 102, 51));
        btnWithdraw.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        btnWithdraw.setForeground(new java.awt.Color(255, 255, 255));
        btnWithdraw.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sadria/img/icons8_withdrawal_18px.png"))); // NOI18N
        btnWithdraw.setText("Withdraw");
        btnWithdraw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWithdrawActionPerformed(evt);
            }
        });
        jPanel4.add(btnWithdraw, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, -1, 40));

        jLabel12.setBackground(new java.awt.Color(0, 102, 51));
        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sadria/img/icons8_cash_in_hand_18px.png"))); // NOI18N
        jLabel12.setText("Balance");
        jLabel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 10, 99, 40));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 166, 960, 190));

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

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1212, 149, -1, 539));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 950, 78));

        tblTranscation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Date", "Account NO", "Name", "SlipNo", "Deposit", "Withdraw"
            }
        ));
        jScrollPane2.setViewportView(tblTranscation);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 508, 950, 180));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 688, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 102, 51));

        lblStatement.setBackground(new java.awt.Color(102, 204, 0));
        lblStatement.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblStatement.setForeground(new java.awt.Color(255, 255, 255));
        lblStatement.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatement.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sadria/img/icons8_purchase_order_18px.png"))); // NOI18N
        lblStatement.setText("Statement");
        lblStatement.setOpaque(true);
        lblStatement.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStatementMouseClicked(evt);
            }
        });

        lblCreateAccount1.setBackground(new java.awt.Color(102, 204, 0));
        lblCreateAccount1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCreateAccount1.setForeground(new java.awt.Color(255, 255, 255));
        lblCreateAccount1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateAccount1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sadria/img/icons8_bank_building_18px.png"))); // NOI18N
        lblCreateAccount1.setText("Saving Account");
        lblCreateAccount1.setOpaque(true);
        lblCreateAccount1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCreateAccount1MouseClicked(evt);
            }
        });

        lblTranstion.setBackground(new java.awt.Color(102, 204, 0));
        lblTranstion.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblTranstion.setForeground(new java.awt.Color(255, 255, 255));
        lblTranstion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTranstion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sadria/img/icons8_play_property_18px_1.png"))); // NOI18N
        lblTranstion.setText("Transtion");
        lblTranstion.setOpaque(true);
        lblTranstion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTranstionMouseClicked(evt);
            }
        });

        lblInvestmentAccount.setBackground(new java.awt.Color(102, 204, 0));
        lblInvestmentAccount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblInvestmentAccount.setForeground(new java.awt.Color(255, 255, 255));
        lblInvestmentAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInvestmentAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/sadria/img/icons8_key_exchange_18px_2.png"))); // NOI18N
        lblInvestmentAccount.setText("Investment Account");
        lblInvestmentAccount.setOpaque(true);
        lblInvestmentAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInvestmentAccountMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblInvestmentAccount, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
            .addComponent(lblTranstion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblStatement, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(lblCreateAccount1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(lblInvestmentAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblTranstion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblStatement, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(290, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(lblCreateAccount1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(452, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtAccountNo.setText("");
        txtName.setText("");
        txtSlipNo.setText("");
        txtAmount.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditActionPerformed

    private void lblStatementMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStatementMouseClicked
        this.setVisible(false);
        new StatementView().setVisible(true);
        new Transtionview().setVisible(false);
        new CreateSavingACView().setVisible(false);
    }//GEN-LAST:event_lblStatementMouseClicked

    private void lblCreateAccount1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCreateAccount1MouseClicked

        this.setVisible(false);
        new CreateSavingACView().setVisible(true);
        new InvestmentView().setVisible(false);
        new StatementView().setVisible(false);
    }//GEN-LAST:event_lblCreateAccount1MouseClicked

    private void lblTranstionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTranstionMouseClicked
        this.setVisible(true);
        new CreateSavingACView().setVisible(false);
        new InvestmentView().setVisible(false);
        new StatementView().setVisible(false);
    }//GEN-LAST:event_lblTranstionMouseClicked

    private void lblInvestmentAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInvestmentAccountMouseClicked
        this.setVisible(false);
        new CreateSavingACView().setVisible(false);
        new InvestmentView().setVisible(true);
        new StatementView().setVisible(false);
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
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDeposit;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnWithdraw;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBalance;
    private javax.swing.JLabel lblCreateAccount1;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDeposit;
    private javax.swing.JLabel lblHead;
    private javax.swing.JLabel lblInvestment;
    private javax.swing.JLabel lblInvestmentAccount;
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
