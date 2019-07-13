/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson3;


import java.util.Scanner;

/**
 *
 * @author Vu Huy
 */
public class Lesson3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a: ");
        String a;
        a = sc.nextLine();
        System.out.println("nhap n: ");
        int n = sc.nextInt();
        String[] s = new String[n];

        
        System.out.println("nhap mang: ");
        for (int i = 0; i < s.length; i++) {
            s[i] = sc.next();
        }
        System.out.println("mang dau vao: ");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

        //for (int i = s.length-1; i >=0; i--) {
        //    for (int j = 0 ; j < i; j++) {
        //        if (s[j].compareTo(s[j+1])>0) { // compareIgnoreCase 
        //            String temp= s[j];
        //            s[j]=s[j+1];
        //            s[j+1]=temp;
        //        }                
        //    }
        //}
        int flag = 0 ;
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals(a)) {
                flag = 1;
                System.out.println("tim thay " + s[i] + " tai vi tri: " + i);
            }
                
        }
        if (flag == 0) {
            System.out.println("khong tim thay chuoi a");
        }
        //System.out.println("mang dau ra: ");
        //for (int i = 0; i < s.length; i++) {
        //    System.out.println(s[i]);
    }
}
