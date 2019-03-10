/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.idb.evidence4;

/**
 *
 * @author User
 */
public class Student {
    private int Id;
    private String name;
    private int age;
    private String email;
    private String gender;
    private  String course;
    private String round;
    private String comment;

    public Student() {
    }

    public Student(int Id, String name, int age, String email, String gender, String course, String round, String comment) {
        this.Id = Id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
        this.course = course;
        this.round = round;
        this.comment = comment;
    }

    public int getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public String getCourse() {
        return course;
    }

    public String getRound() {
        return round;
    }

    public String getComment() {
        return comment;
    }
    
}
