/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opp.lesson5;

import java.util.Scanner;

/**
 *
 * @author Vu Huy
 */
public class SavingAccount extends Account {

    private double interestRate;
    private double interest;
    public SavingAccount(int accountNumber, int money, double interestRate) {
        this.accountNumber = accountNumber;
        this.money = money;
        this.interest = interestRate*money;
       
    }

    

    public void setInterest(double interest) {
        this.interest = interest;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    
    public double getInterest() {
        return interest;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getMoney() {
        return money;
    }
    
    
}

