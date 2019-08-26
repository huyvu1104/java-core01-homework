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
public class Customer {

    String name;

    public String getName() {
        return name;
    }

    public Customer(String name) {
        this.name = name;
    }
    ArrayList<SavingAccount> SavingAccountList = new ArrayList<>();
    ArrayList<CreditAccount> CreditAccountList = new ArrayList<>();

    int checkNumberAccount() {
        if (CreditAccountList.size() + SavingAccountList.size() > 10) {
            return 1;
        } else {
            return 0;
        }
    }

    void addSavingAccount(SavingAccount sa) {
        if (checkNumberAccount() == 1) {
            SavingAccountList.add(sa);
        } else {
            System.out.println("So tai khoan tao da toi da!!");
        }
    }

    void addCreditAccount(CreditAccount ca) {
        if (checkNumberAccount() == 1) {
            CreditAccountList.add(ca);
        } else {
            System.out.println("So tai khoan tao da toi da!!");
        }
    }

    int isLinkAccount(SavingAccount sa, CreditAccount ca) {
        return 1;
    }

    public void rutTien(int tienluuthong, SavingAccount sa, CreditAccount ca) {
        if (isLinkAccount(sa, ca) == 1) {
            if (tienluuthong <= ca.getMoney()) {
                ca.setMoney(ca.getMoney() - tienluuthong);

            }
            if (tienluuthong > ca.getMoney()) {
                if (tienluuthong <= (ca.getMoney() + sa.getMoney())) {
                    sa.setMoney((ca.getMoney() + sa.getMoney()) - tienluuthong);
                    ca.setMoney(0);
                } else {
                    System.out.println("So du tai khoan khong du!!");
                }
            }
        } else {
            System.out.println("Khach hang khong co tai khoan lien ket!!");
        }
    }

    void guiTienCA(CreditAccount ca, int tienluuthong) {
        ca.setMoney(ca.getMoney() + tienluuthong);
    }

    void guiTienSA(SavingAccount sa, int tienluuthong) {
        sa.setMoney(sa.getMoney() + tienluuthong);
    }

    boolean checkSA(int accountNumber) {
        for (int i = 0; i < SavingAccountList.size(); i++) {
            if (accountNumber == SavingAccountList.get(i).getAccountNumber()) {
                System.out.println("So du con lai: " + SavingAccountList.get(i).getMoney());
                return true;
            }
        }
        System.out.println("Nhap sai so tai khoan");
        return false;
    }

    boolean checkCA(int accountNumber) {
        for (int i = 0; i < CreditAccountList.size(); i++) {
            if (accountNumber == CreditAccountList.get(i).getAccountNumber()) {
                System.out.println("So du con lai: " + CreditAccountList.get(i).getMoney());
                return true;
            }
        }
        System.out.println("Nhap sai so tai khoan");
        return false;
    }

}
