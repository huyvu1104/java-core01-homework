package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        Scanner sc = new Scanner(System.in);
        String abc = "";
        while (true) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (i == x && j == y) {
                        System.out.print("X");
                    } else {
                        System.out.print("-");
                    }
                }
                System.out.println("");
            }
            abc = sc.next();
            System.out.println("abc la :"+abc+":");
            if ("a".equals(abc) || "A".equals(abc)) {
                y = (y - 1 + 10) % 10;
            }
            if ("d".equals(abc) || "D".equals(abc)) {
                y = (y + 1 + 10) % 10;
            }
            if ("w".equals(abc) || "W".equals(abc)) {
                x = (x - 1 + 10) % 10;
            }
            if ("s".equals(abc) || "S".equals(abc)) {
                x = (x + 1 + 10) % 10;
            }

        }
    }
}