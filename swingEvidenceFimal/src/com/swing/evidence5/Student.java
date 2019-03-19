/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swing.evidence5;

/**
 *
 * @author Md Yasin Arif
 */
public class Student {
    private int id;
    private String fullName;
    private String fatherName;
    private String motherName;
    private int age;
    private String gender;
    private int mobil;
    private String address;
    private String course;
    private String round;

    public Student() {
    }

    public Student(int id, String fullName, String fatherName, String motherName, int age, String gender, int mobil, String address, String course, String round) {
        this.id = id;
        this.fullName = fullName;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.age = age;
        this.gender = gender;
        this.mobil = mobil;
        this.address = address;
        this.course = course;
        this.round = round;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public int getMobil() {
        return mobil;
    }

    public String getAddress() {
        return address;
    }

    public String getCourse() {
        return course;
    }

    public String getRound() {
        return round;
    }
    
    
    
}
