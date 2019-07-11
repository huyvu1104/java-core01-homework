/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Vu Huy
 */
public class Student {
   
    String name;
    int age;
    double GPA;
    String date;
   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
   void showInfor() {
       System.out.println("Name: "+name);
       System.out.println("Age: "+age);
       System.out.println("GPA: "+GPA);
       System.out.println("DoB: "+date);
}
   void inPut(){
       Scanner sc= new Scanner(System.in);
       System.out.println("nhap ten: ");
       this.name=sc.nextLine();
       System.out.println("nhap tuoi: ");
       this.age=sc.nextInt();
       System.out.println("nhap ngay sinh: ");
       this.date=sc.next();
       System.out.println("nhap GPA: ");
       this.GPA=sc.nextDouble();
   }
}
