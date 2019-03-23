/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sadria.pojo;

import java.sql.Date;

/**
 *
 * @author User
 */
public class Person {

    int id;
    String accountNo;
    String fromNO;
    String cardNo;
    Date admissionDate;
    String name;
    String motherName;
    String fatherHusbendName;
    String gender;
    String dateofBirth;
    String religion;
    String nIDNo;
    String mobileNo;
    String presentAddress;
    String parmanetAddress; 
    String savingType;
    int savingsAmount;
    String nomineName;
    String relations;
    int share;

    public Person() {
    }

    public Person(int id, String accountNo, String fromNO, String cardNo, Date admissionDate, String name, String motherName, String fatherHusbendName, String gender, String dateofBirth, String religion, String nIDNo, String mobileNo, String presentAddress, String parmanetAddress, String savingType, int savingsAmount, String nomineName, String relations, int share) {
        this.id = id;
        this.accountNo = accountNo;
        this.fromNO = fromNO;
        this.cardNo = cardNo;
        this.admissionDate = admissionDate;
        this.name = name;
        this.motherName = motherName;
        this.fatherHusbendName = fatherHusbendName;
        this.gender = gender;
        this.dateofBirth = dateofBirth;
        this.religion = religion;
        this.nIDNo = nIDNo;
        this.mobileNo = mobileNo;
        this.presentAddress = presentAddress;
        this.parmanetAddress = parmanetAddress;
        this.savingType = savingType;
        this.savingsAmount = savingsAmount;
        this.nomineName = nomineName;
        this.relations = relations;
        this.share = share;
    }

    public Person(String accountNo, String fromNO, String cardNo, Date admissionDate, String name, String motherName, String fatherHusbendName, String gender, String dateofBirth, String religion, String nIDNo, String mobileNo, String presentAddress, String parmanetAddress, String savingType, int savingsAmount, String nomineName, String relations, int share) {
        this.accountNo = accountNo;
        this.fromNO = fromNO;
        this.cardNo = cardNo;
        this.admissionDate = admissionDate;
        this.name = name;
        this.motherName = motherName;
        this.fatherHusbendName = fatherHusbendName;
        this.gender = gender;
        this.dateofBirth = dateofBirth;
        this.religion = religion;
        this.nIDNo = nIDNo;
        this.mobileNo = mobileNo;
        this.presentAddress = presentAddress;
        this.parmanetAddress = parmanetAddress;
        this.savingType = savingType;
        this.savingsAmount = savingsAmount;
        this.nomineName = nomineName;
        this.relations = relations;
        this.share = share;
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

    public String getFromNO() {
        return fromNO;
    }

    public void setFromNO(String fromNO) {
        this.fromNO = fromNO;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getFatherHusbendName() {
        return fatherHusbendName;
    }

    public void setFatherHusbendName(String fatherHusbendName) {
        this.fatherHusbendName = fatherHusbendName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getnIDNo() {
        return nIDNo;
    }

    public void setnIDNo(String nIDNo) {
        this.nIDNo = nIDNo;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
    }

    public String getParmanetAddress() {
        return parmanetAddress;
    }

    public void setParmanetAddress(String parmanetAddress) {
        this.parmanetAddress = parmanetAddress;
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

    public String getNomineName() {
        return nomineName;
    }

    public void setNomineName(String nomineName) {
        this.nomineName = nomineName;
    }

    public String getRelations() {
        return relations;
    }

    public void setRelations(String relations) {
        this.relations = relations;
    }

    public int getShare() {
        return share;
    }

    public void setShare(int share) {
        this.share = share;
    }

    
    
    
    
}
