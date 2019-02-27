/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaIO;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Md Yasin Arif
 */
public class PwDemo {
    static int id;
    static String name;
    static int age;
    static String ss;
    public static void main(String[] args) {
        File inputFile = new File("yasin.txt");
        Scanner input;
        try {
            input = new Scanner(inputFile);
            while (input.hasNext()) {
                id = input.nextInt();
                System.out.println(id);
                input.nextLine();
                name = input.nextLine();
                System.out.println(name);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
