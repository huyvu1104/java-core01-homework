/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcode;

import java.util.Scanner;

/**
 *
 * @author Vu Huy
 */
public class TestCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi: ");
        String b = sc.next();
        String reverse=new StringBuffer(b).reverse().toString();
        int vitri= b.length()/2;
        
        if (b.equals(reverse)) {
            System.out.println("chuoi co tinh dao ngược");
            if (b.length() % 2 == 1) {
                System.out.println("ky tu khong bi trung la: " +b.charAt(vitri) );
            } else {
                System.out.println("DOESN'T EXIST");
            }
        } else {
            System.out.println("khong co tinh dao nguoc");
        }
    }
}
