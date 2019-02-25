
package minhazvietest;

import java.util.Scanner;


public class PrintFormate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any nmber : ");
        int n = sc.nextInt();
        int k = 2*n -2;// for space
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print(" ");
            }
            k = k-1;
            for (int j = 0; j <= i; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
    
}
