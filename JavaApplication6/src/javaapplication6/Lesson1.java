
package javaapplication6;

import java.util.Scanner;


public class Lesson1{
    public static void main(String[] args) {
        //a1x+b1y=c1;
        //a2x+b2y=c2;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("nhap he so pt1 : ");
            float a1 = sc.nextFloat();
            float b1 = sc.nextFloat();
            float c1 = sc.nextFloat();
            System.out.print("nhap he so pt2 : ");
            float a2 = sc.nextFloat();
            float b2 = sc.nextFloat();
            float c2 = sc.nextFloat();
            float x = 0;
            float y = 0;
            if ((a2 * b1 - a1 * b2) == 0) {
                if (c1 == 0 && c2 == 0) {
                    System.out.println("pt vo so nghiem");
                } else {
                    System.out.println("pt vo nghiem");
                }
            } else {

                x = (b1 * c2 - b2 * c1) / (a2 * b1 - a1 * b2);
                y = (a2 * c1 - a1 * c2) / (a2 * b1 - a1 * b2);
                System.out.println("nghiem x: " + x);
                System.out.println("nghiem y: " + y);
            }
        }
    }
}
