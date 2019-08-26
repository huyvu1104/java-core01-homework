package opp.lesson5;

public class OPPLesson5 {

    public static void main(String[] args) {
        SavingAccount sa1 = new SavingAccount(0001, 1000000, 0.05);
        SavingAccount sa2 = new SavingAccount(0002, 500000, 0.05);
        CreditAccount ca1=new CreditAccount(0001, 600000);
        Customer c1= new Customer("Huy");
        
        c1.CreditAccountList.add(ca1);
        c1.SavingAccountList.add(sa1);
        c1.SavingAccountList.add(sa2);
        c1.guiTienCA(ca1, 100000);
        c1.isLinkAccount(sa1, ca1);
        c1.rutTien(1600000, sa1, ca1);
        c1.checkCA(0001);
        c1.checkSA(0001);
        Bank b=new Bank();
        b.CustomerList.add(c1);
        b.checkAllMoneyInCA(c1);
        b.checkAllMoneyInSA(c1);
        b.checkMoneyCA(0001, c1);
        b.checkMoneySA(0001, c1);
    }

}
