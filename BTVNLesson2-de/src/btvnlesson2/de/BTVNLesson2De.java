package btvnlesson2.de;

import java.util.Scanner;

public class BTVNLesson2De {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arrInt=new int[n];
        for (int i = 0; i < arrInt.length; i++) {
            arrInt[i]=sc.nextInt();
        }
        int sum=0;
        for (int i = 0; i < arrInt.length; i++) {
            if (i%2==0) {
                System.out.println("Cac so tai vi tri chan: "+arrInt[i]);
            }
            if (arrInt[i]%7==0) {
                sum=sum+arrInt[i];
            }
        }
        System.out.println("Tong cac so chia het cho 7: "+sum);
    }

}
