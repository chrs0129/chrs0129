package day31_Constructors;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        account1.setInfo("Ahmet Ozkok", 123456789);
        System.out.println(account1);
account1.deposit(1000.0);
       account1.checkBalance();
account1.withdraw(100);
account1.checkBalance();
        System.out.println("---------------------");
        BankAccount account2 =new BankAccount();
        account2.setInfo("Aygun", 987654321);
        System.out.println(account2);
        account2.deposit(10000);
        account2.withdraw(600);
        account2.checkBalance();
    }
}
