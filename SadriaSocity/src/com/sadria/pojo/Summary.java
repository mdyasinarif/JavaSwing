/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sadria.pojo;

import java.util.Date;

/**
 *
 * @author User
 */
public class Summary {
    int id;
    String accountNo;
    String name;
    String savingType;
    int savingsAmount;
    Date date;
    int deposit;
    int totalDeposit;
    int withdraw;
    int balance;
    Date coverDate;
    int due;

    public Summary() {
    }

    
    public Summary(String accountNo, int totalDeposit, int balance, Date coverDate, int due) {
        this.accountNo = accountNo;
        this.totalDeposit = totalDeposit;
        this.balance = balance;
        this.coverDate = coverDate;
        this.due = due;
    }
    
    public Summary(int id, String accountNo, String name, String savingType, int savingsAmount, Date date, int deposit, int totalDeposit, int withdraw, int balance, Date coverDate, int due) {
        this.id = id;
        this.accountNo = accountNo;
        this.name = name;
        this.savingType = savingType;
        this.savingsAmount = savingsAmount;
        this.date = date;
        this.deposit = deposit;
        this.totalDeposit = totalDeposit;
        this.withdraw = withdraw;
        this.balance = balance;
        this.coverDate = coverDate;
        this.due = due;
    }

    public Summary(String accountNo, String name, String savingType, int savingsAmount, Date date, int deposit, int totalDeposit, int withdraw, int balance, Date coverDate, int due) {
        this.accountNo = accountNo;
        this.name = name;
        this.savingType = savingType;
        this.savingsAmount = savingsAmount;
        this.date = date;
        this.deposit = deposit;
        this.totalDeposit = totalDeposit;
        this.withdraw = withdraw;
        this.balance = balance;
        this.coverDate = coverDate;
        this.due = due;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSavingType() {
        return savingType;
    }

    public void setSavingType(String savingType) {
        this.savingType = savingType;
    }

    public int getSavingsAmount() {
        return savingsAmount;
    }

    public void setSavingsAmount(int savingsAmount) {
        this.savingsAmount = savingsAmount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public int getTotalDeposit() {
        return totalDeposit;
    }

    public void setTotalDeposit(int totalDeposit) {
        this.totalDeposit = totalDeposit;
    }

    public int getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Date getCoverDate() {
        return coverDate;
    }

    public void setCoverDate(Date coverDate) {
        this.coverDate = coverDate;
    }

    public int getDue() {
        return due;
    }

    public void setDue(int due) {
        this.due = due;
    }

    
    
}
