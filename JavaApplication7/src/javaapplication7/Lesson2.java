
package javaapplication7;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) sc.nextInt();
        }
        //int k = 9;
        //boolean timthay = false;
        //int max=Integer.MIN_VALUE;
        for (int i = arr.length-1; i >=0; i--) {
            //if (max<arr[i]) {
            //    max=arr[i];                
            //}
             for (int j = 0; j < i; j++) {
                 if (arr[j]<arr[j+1]) {
                     int temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=(char) temp;
                 }
            }                                        
            //if (arr[i] == k) {
            //    timthay = true;
            //    System.out.println("vi tri " + arr[i] + " la " + (i+1));
            //}
            System.out.println(arr[i]);  
        }   
        //if (timthay) {
        //    System.out.println("tim thay");
        //} else {
        //    System.out.println("ko tim thay");
        //}
        //System.out.println("max la :"+max);
        //System.out.println("min la: "+min);
        sc.close();
    }
}
