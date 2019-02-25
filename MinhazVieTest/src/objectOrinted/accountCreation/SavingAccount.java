/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectOrinted.accountCreation;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SavingAccount implements Account {

    Scanner sc = new Scanner(System.in);

    private String name;
    private int accountNo;
    private double balance;
    private double depositAmount;
    private double withdrawAmount;

    public Scanner getSc() {
        return sc;
    }

    public String getName() {
        return name;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    public SavingAccount() {
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public double getBalance() {
        return balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

    public SavingAccount(String name, int accountNo, double balance, double depositAmount, double withdrawAmount) {
        this.name = name;
        this.accountNo = accountNo;
        this.balance = balance;
        this.depositAmount = depositAmount;
        this.withdrawAmount = withdrawAmount;
    }

    @Override
    public void deposit() {
        System.out.print("Enter Deposit Amount : ");
        depositAmount = sc.nextDouble();
        balance += depositAmount;
    }

    @Override
    public void withdraw() {
        System.out.print("Enter Withdraw Amount : ");
        withdrawAmount = sc.nextDouble();
        balance -= withdrawAmount;
    }

    @Override
    public void balance() {
        System.out.println("Balance from Saving account : " + balance);
    }

    @Override
    public void showStatemet() {
        System.out.print("Enter Your Name : ");
        name = sc.next();
        System.out.print("Enter Account No : ");
        accountNo = sc.nextInt();

        System.out.println("Name : " + name);
        System.out.println("AccountNo : " + accountNo);
        System.out.println("Balance : " + balance);
    }

}
