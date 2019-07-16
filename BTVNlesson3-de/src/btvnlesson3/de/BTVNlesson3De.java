package btvnlesson3.de;

import java.util.Scanner;

public class BTVNlesson3De {

    public static void main(String[] args) {
        //bai 1
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = Integer.parseInt(sc.nextLine());
        String[] arr = new String[n];
        System.out.println("nhap danh sach: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextLine();
        }
        System.out.println("nhap ten can tim: ");
        String a = sc.nextLine();
        int flag = 0;
        int count = 0;
        for (int i = 0; i < (arr.length); i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if (arr[i].charAt(j) == 'a') {
                    count++;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].toLowerCase().contains(a.toLowerCase())) {
                flag = 1;
                System.out.println("tim thay: " + arr[i]);
            }
        }
        if (flag == 0) {
            System.out.println("khong tim thay ten can tim");
        }
        if (count == 0) {
            System.out.println("khong co chu a nao trong mang");
        } else {
            System.out.println("co " + count + " chu a");
        }
        //bai 2
        System.out.println("nhap chuoi: ");
        String b = sc.next();
        String reverse = new StringBuffer(b).reverse().toString();
        int vitri = b.length() / 2;

        if (b.equals(reverse)) {
            System.out.println("chuoi co tinh dao ngược");
            if (b.length() % 2 == 1) {
                System.out.println("ky tu khong bi trung la: " + b.charAt(vitri));
            } else {
                System.out.println("DOESN'T EXIST");
            }
        } else {
            System.out.println("khong co tinh dao nguoc");
            int[] count1 = new int[256];
            for (int i = 0; i < b.length(); i++) {
                char ch = b.charAt(i);
                count1[ch]++;
            }

            for (int i = 0; i < b.length(); i++) {
                char chh = b.charAt(i);
                if (count1[chh] == 1) {
                    System.out.println("ky tu khong bi trung la: " + b.charAt(i));

                }
            }

        }
    }

}
