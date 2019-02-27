/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Md Yasin Arif
 */
public class TestDataStreem {

    public static void main(String[] args) {
        try {
            DataOutputStream output = new DataOutputStream(new FileOutputStream("sohan.txt"));
            output.writeUTF("Yasin");
            output.writeDouble(85.5);
            output.writeFloat(20.0f);
            output.writeLong(1264l);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            DataInputStream input = new DataInputStream(new FileInputStream("sohan.txt"));
            System.out.println(input.readUTF() + " " + input.readDouble());
            System.out.println(input.readFloat());
            System.out.println(input.readLong());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
