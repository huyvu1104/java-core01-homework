/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opp.lesson5;

/**
 *
 * @author Vu Huy
 */
public class CreditAccount extends Account{

    public CreditAccount( int accountNumber, int money) {
        this.accountNumber = accountNumber;
        this.money = money;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getMoney() {
        return money;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setMoney(int money) {
        this.money = money;
    }

   

    

}
