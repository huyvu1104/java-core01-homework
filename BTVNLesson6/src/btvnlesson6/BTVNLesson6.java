
package btvnlesson6;

import java.util.Scanner;

public class BTVNLesson6 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = sc.nextInt();
        System.out.println("nhap ma tran: ");
        int[][] arr= new int[n][n];
          for (int i = 0; i < arr.length; i++) {
              for (int j = 0; j < arr.length; j++) {
                  arr[i][j]=sc.nextInt();
              }
          }
          System.out.println("ket qua: ");
          rotateMatrix(arr);
          
    }
    static void rotateMatrix(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
			for (int j = arr.length - 1; j >= 0; j--) {
                  System.out.print(arr[j][i]+" ");
              }
              System.out.print("\n");
          }
       
    }
}
