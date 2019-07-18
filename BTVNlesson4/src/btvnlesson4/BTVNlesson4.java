package btvnlesson4;

import java.util.Scanner;

public class BTVNlesson4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a: ");
        int a = sc.nextInt();
        System.out.println("nhap b: ");
        int b = sc.nextInt();
        if (baitap2(a, b) == 1) {
            System.out.println("2 so co tính nguyên tố cùng nhau");
        } else {
            System.out.println("ko tính nguyên tố cùng nhau");
        }
        System.out.println("cac so nguyen to tu 0-1000: ");
        for (int i = 1; i < 1000; i++) {
            if (baitap1(i)) {
                System.out.print(i + ", ");
            }
        }
    }

    static boolean baitap1(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int baitap2(int a, int b) {
        while (true) {

            if (a > b) {
                int c = a % b;
                return a = c;

            }
            if (a < b) {
                int c = b % a;
                return b = c;
            }
            if (a == 0 || b == 0) {
                return a + b;
            }
        }
    }
}
