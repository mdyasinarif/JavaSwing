/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectOrinted.accountCreation;

/**
 *
 * @author User
 */
public class Example {
    public static void main(String[] args) {
        /*
If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
        */
     int num = 24;
        if (num % 2 != 0) {
            System.out.println("Weird");
        } else if(num % 2 == 0 && 2< num && 5 >num){
            System.out.println("Not Weird");
        }else if(num % 2 == 0 && 6< num && 20 >num){
            System.out.println(" Weird");
        }else if(num % 2 == 0 && 20 <num ){
            System.out.println("Not Weird");
        }
        
        
        
    }
    
}
