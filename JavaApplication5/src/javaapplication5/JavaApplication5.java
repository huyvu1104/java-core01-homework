package javaapplication5;

import java.util.Scanner;

public class JavaApplication5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a: ");
        double a = sc.nextFloat();
        System.out.println("nhap b: ");
        double b = sc.nextFloat();
        System.out.println("nhap c: ");
        double c = sc.nextFloat();
        double x1 = 0;
        double x2 = 0;
        double delta = b * b - (4 * a * c);
        if (a != 0) {

            if (delta < 0) {
                System.out.println("Phuong trinh vo nghiem");
            }
            if (delta == 0) {
                x1 = -b / (2 * a);
                System.out.println("nghiem: " + x1);
            }
            if (delta > 0) {
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("nghiem x1: " + x1);
                System.out.println("nghiem x2: " + x2);
            }

        }
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("phuong trinh vo so nghiem");
                } else {
                    System.out.println("vo nghiem");
                }
            } else {
                x1 = -c / b;
                System.out.println("nghiem: " + x1);
               
            }
        }
    }
}
