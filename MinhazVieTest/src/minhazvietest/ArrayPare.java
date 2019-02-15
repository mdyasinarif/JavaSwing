/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhazvietest;

/**
 *
 * @author Md Yasin Arif
 */
public class ArrayPare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        pairArray1();
        pairArray2();

    }
    static void pairArray1() {
        int[] arr = {2, 4, 7, 6, 9, 3};
        int k = 2;
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (i < j) {
                    int rs = arr[i] + arr[j];
                    if (rs % k == 0) {
                        System.out.println(arr[i] + " + " + arr[j] + " = " + rs);
                        count++;
                    }
                }
            }
        }
        System.out.println("count :: " + count);

    }

    static void pairArray2() {
        int[] arr = {3, 7, 12, 13, 6, 4};
        int k = 3;
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (i < j) {
                    int rs = arr[i] + arr[j];
                    if (rs % k == 0) {
                        System.out.println(arr[i] + " + " + arr[j] + " = " + rs);
                        count++;
                    }
                }
            }
        }
        System.out.println("count :: " + count);
    }
}
