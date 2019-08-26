/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opp.lesson5;

import java.util.ArrayList;

/**
 *
 * @author Vu Huy
 */
public class Bank {

    ArrayList<Customer> CustomerList = new ArrayList<>();
    int index = -1;

    void showAccountSA(Customer c) {
        if (checkCustomer(c) == true) {
            for (int i = 0; i < CustomerList.size(); i++) {
                for (int j = 0; j < c.SavingAccountList.size(); j++) {
                    System.out.println("So tai khoan SA: " + c.SavingAccountList.get(i).getAccountNumber());
                }
            }
        } else {
            System.out.println("Nhap sai ten!!");
        }
    }

    void showAccountCA(Customer c) {
        if (checkCustomer(c) == true) {
            for (int i = 0; i < CustomerList.size(); i++) {
                for (int j = 0; j < c.CreditAccountList.size(); j++) {
                    System.out.println("So tai khoan CA: " + c.CreditAccountList.get(i).getAccountNumber());
                }
            }
        } else {
            System.out.println("Nhap sai ten!!");
        }
    }

    void checkAllMoneyInSA(Customer c) {
        if (checkCustomer(c) == true) {
            System.out.println("Danh sach so du cac tai khoan SA");
            for (int i = 0; i < c.SavingAccountList.size(); i++) {
                System.out.println("So du: " + c.SavingAccountList.get(i).getMoney());
            }
        } else {
            System.out.println("Nhap sai ten khach hang!!");
        }
    }

    void checkAllMoneyInCA(Customer c) {
        if (checkCustomer(c) == true) {
            System.out.println("Danh sach so du cac tai khoan CA");
            for (int i = 0; i < c.CreditAccountList.size(); i++) {
                System.out.println("So du: " + c.CreditAccountList.get(i).getMoney());
            }
        } else {
            System.out.println("Nhap sai ten khach hang!!");
        }
    }

    void checkMoneyCA(int accountNumber, Customer c) {
        if (CheckCaNumber(accountNumber, c) == true && checkCustomer(c) == true) {
            c.CreditAccountList.get(index).getMoney();
        } else {
            System.out.println("Nhap sai so tai khoan hoac ten khach hang!!");
        }
    }

    void checkMoneySA(int accountNumber, Customer c) {
        if (CheckSaNumber(accountNumber, c) == true && checkCustomer(c) == true) {
            c.SavingAccountList.get(index).getMoney();
        } else {
            System.out.println("Nhap sai so tai khoan hoac ten khach hang!!");
        }
    }

    void addCustomer(Customer c) {
        CustomerList.add(c);
    }

    boolean checkCustomer(Customer c) {
        for (int i = 0; i < CustomerList.size(); i++) {
            if (c.getName().equalsIgnoreCase(CustomerList.get(i).getName())) {
                return true;
            }
        }
        return false;
    }

    boolean CheckCaNumber(int accountNumber, Customer c) {
        for (int i = 0; i < c.CreditAccountList.size(); i++) {
            if (accountNumber == c.CreditAccountList.get(i).getAccountNumber()) {
                index = i;
                return true;
            }
        }
        return false;
    }

    boolean CheckSaNumber(int accountNumber, Customer c) {
        for (int i = 0; i < c.SavingAccountList.size(); i++) {
            if (accountNumber == c.SavingAccountList.get(i).getAccountNumber()) {
                index = i;
                return true;
            }
        }
        return false;
    }
    void showListCustomer(){
        for (int i = 0; i < CustomerList.size(); i++) {
            System.out.println(CustomerList.get(i).getName());
        }
    }
}
