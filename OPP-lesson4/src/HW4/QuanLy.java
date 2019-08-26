/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW4;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Vu Huy
 */
public class QuanLy {

    ArrayList<Student> dssv = new ArrayList<>();
    int temp = 0;
    Scanner sc = new Scanner(System.in);

    void addStudent(Student e) {
        dssv.add(e);
    }

    void delete(int mssv) {
        search(mssv);
        dssv.remove(temp);
    }

    void update(int mssv) {
        String sex;
        Date a = new Date();
        if (search(mssv) == 1) {
            System.out.println("update name: ");
            dssv.get(temp).setName(sc.nextLine());
            System.out.println("update DOB: ");
            dssv.get(temp).setDob(a);
            System.out.println("update gender: ");
            sex = sc.next();

            if (sex.equalsIgnoreCase("male")) {
                dssv.get(temp).setGender(Student.Gender.male);
            }

            if (sex.equalsIgnoreCase("female")) {
                dssv.get(temp).setGender(Student.Gender.female);
            }
        }
    }

    int search(int mssv) {
        int flag = 0;
        for (int i = 0; i < dssv.size(); i++) {
            if (mssv == dssv.get(i).getMssv()) {
                System.out.println("Tim thay MSSV " + mssv);
                temp = i;
                flag = 1;
            } else {
                System.out.println("MSSV khong ton tai");
                flag = 0;
            }
        }
        return flag = 0;
    }

    void showInfo() {
        for (int i = 0; i < dssv.size(); i++) {
            System.out.println("Name: " + dssv.get(i).getName());
            System.out.println("MSSV: " + dssv.get(i).getMssv());
            System.out.println("Gender: " + dssv.get(i).getGender());
            System.out.println("DOB: " + dssv.get(i).getDob());
            System.out.println("===========");
        }
    }

    void showInfo(int mssv) {
        if (search(mssv) == 1) {
            System.out.println("Name: " + dssv.get(temp).getName());
            System.out.println("MSSV: " + dssv.get(temp).getMssv());
            System.out.println("Gender: " + dssv.get(temp).getGender());
            System.out.println("DOB: " + dssv.get(temp).getDob());
        }
    }
}
