/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evi1702.view;

/**
 *
 * @author User
 */
public class Student {
    private  int Id;
    private String Name;
    private int Age;
    private String Email;
    private String Gender;
    private String Cource;
    private String Round;
    private String Comment;

    public Student() {
    }

    public Student(String Name, int Age, String Email, String Gender, String Cource, String Round, String Comment) {
        this.Name = Name;
        this.Age = Age;
        this.Email = Email;
        this.Gender = Gender;
        this.Cource = Cource;
        this.Round = Round;
        this.Comment = Comment;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getCource() {
        return Cource;
    }

    public void setCource(String Cource) {
        this.Cource = Cource;
    }

    public String getRound() {
        return Round;
    }

    public void setRound(String Round) {
        this.Round = Round;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    @Override
    public String toString() {
        return "Student{" + "Id=" + Id + ", Name=" + Name + ", Age=" + Age + ", Email=" + Email + ", Gender=" + Gender + ", Cource=" + Cource + ", Round=" + Round + ", Comment=" + Comment + '}';
    }
    
    
}
