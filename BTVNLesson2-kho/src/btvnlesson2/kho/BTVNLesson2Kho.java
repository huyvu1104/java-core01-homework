package btvnlesson2.kho;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BTVNLesson2Kho {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // ma tran chuyen vi
        //int[][] arr= new int[n][n];
        //  for (int i = 0; i < arr.length; i++) {
        //      for (int j = 0; j < arr.length; j++) {
        //          arr[i][j]=sc.nextInt();
        //      }
        //  }
        //  for (int i = 0; i < arr.length; i++) {
        //      for (int j = 0; j < arr.length; j++) {
        //          System.out.print(arr[j][i]+" ");
        //      }
        //      System.out.print("\n");
        //  }
        //tim kiem chuoi trung
        String a="";
        for (int i = 0; i < n; i++) {
            a=sc.next();
        }
        System.out.println(a);
        //String[] arrString = new String[n];
        //for (int i = 0; i < arrString.length; i++) {
        //    arrString[i] = sc.next();
        //}

        //for (int i = arrString.length - 1; i >= 0; i--) {
        //    for (int j = 0; j < i; j++) {
        //        if (arrString[i].equals(arrString[j])) {
        //            System.out.println("chuoi bi trung: " + arrString[i]);
        //        }

        //    }

        //}
    }
}
