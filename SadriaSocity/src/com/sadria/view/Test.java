/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sadria.view;

import com.sadria.pojo.Person;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author User
 */
public class Test {
    public static void main(String[] args) {
        
        System.out.println("Date: "+getsCoverDate(new Date(), 10));
    }
    public static Date getsCoverDate(Date addmissionDay, int day) {
        Person p = new Person();
        Calendar c = Calendar.getInstance();       
        c.add(Calendar.DATE, day);
        return c.getTime();
    }
}
