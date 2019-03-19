/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssbbss.pojo;

/**
 *
 * @author User
 */
public class SavingAC {
    int id;
    int accountNo;
    String name;
    String slipNo;
    String depdate;
    double depAmount;
    String chequeNo;
    String witDate;
    double withAmount;

    public SavingAC() {
    }

    public SavingAC(int id, int accountNo, String name, String slipNo, String depdate, double depAmount, String chequeNo, String witDate, double withAmount) {
        this.id = id;
        this.accountNo = accountNo;
        this.name = name;
        this.slipNo = slipNo;
        this.depdate = depdate;
        this.depAmount = depAmount;
        this.chequeNo = chequeNo;
        this.witDate = witDate;
        this.withAmount = withAmount;
    }

    public SavingAC(int accountNo, String name, String slipNo, String depdate, double depAmount, String chequeNo, String witDate, double withAmount) {
        this.accountNo = accountNo;
        this.name = name;
        this.slipNo = slipNo;
        this.depdate = depdate;
        this.depAmount = depAmount;
        this.chequeNo = chequeNo;
        this.witDate = witDate;
        this.withAmount = withAmount;
    }

    public SavingAC(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSlipNo() {
        return slipNo;
    }

    public void setSlipNo(String slipNo) {
        this.slipNo = slipNo;
    }

    public String getDepdate() {
        return depdate;
    }

    public void setDepdate(String depdate) {
        this.depdate = depdate;
    }

    public double getDepAmount() {
        return depAmount;
    }

    public void setDepAmount(double depAmount) {
        this.depAmount = depAmount;
    }

    public String getChequeNo() {
        return chequeNo;
    }

    public void setChequeNo(String chequeNo) {
        this.chequeNo = chequeNo;
    }

    public String getWitDate() {
        return witDate;
    }

    public void setWitDate(String witDate) {
        this.witDate = witDate;
    }

    public double getWithAmount() {
        return withAmount;
    }

    public void setWithAmount(double withAmount) {
        this.withAmount = withAmount;
    }
    
}
