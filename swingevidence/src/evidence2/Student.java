/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evidence2;

/**
 *
 * @author User
 */
public class Student {
    private String name;
    private String email;
    private int age;
    private String gender;
    private String cource;
    private String round;
    private String comment;

    public Student() {
    }

    public Student(String name, String email, int age, String gender, String cource, String round, String comment) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.cource = cource;
        this.round = round;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getCource() {
        return cource;
    }

    public String getRound() {
        return round;
    }

    public String getComment() {
        return comment;
    }
    
    
}
