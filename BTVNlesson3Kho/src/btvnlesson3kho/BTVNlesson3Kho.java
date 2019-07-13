
package btvnlesson3kho;

import java.util.Scanner;


public class BTVNlesson3Kho {

    
    public static void main(String[] args) {
        //bai3
       Scanner sc = new Scanner(System.in);
        System.out.println("nhap n: ");
        int n = sc.nextInt();
        sc.nextLine();
        String ten="";
        String tenHo="";
        String tenDem="";
        String[] arr = new String[n];
        System.out.println("nhap danh sach: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (tenHo=sc.nextLine()+ten=sc.nextLine()+tenDem=sc.nextLine());
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].indexOf(" "));
        }
        //for (int i = arr.length-1; i >=0; i--) {
        //    for (int j = 0 ; j < i; j++) 
        //        if (arr[j].compareTo(arr[j+1])>0) {
        //            if () {
                        
        //            }
        //            String temp= arr[j];
        //            arr[j]=arr[j+1];
        //            arr[j+1]=temp;
        //        }                
        //    }
        //33}
    }
    
}
