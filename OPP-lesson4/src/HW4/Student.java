/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HW4;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Vu Huy
 */
public class Student{
String name;
int mssv;
Date dob;
Gender gender;
enum Gender{male,female};

    public Student(String name, int mssv, Date dob, Gender gender) {
        this.name = name;
        this.mssv = mssv;
        this.dob = dob;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
 
    }

