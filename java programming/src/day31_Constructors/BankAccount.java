package day31_Constructors;

public class BankAccount {
    public String accountHolder;
    public int accountNumber;
    public double accountBalance;


    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", accountBalance= $" + accountBalance +
                '}';
    }

    public void setInfo(String accountHolder, int accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;




    }
    public void checkBalance(){
        System.out.println("Your available balance is: $"+ accountBalance);
    }
    public void deposit(double amount){
        if (amount<0){
            System.out.println("Depositing amount can not be zero or negative");
            return;
        }
        accountBalance+=amount;
    }
    public void withdraw(double amount){
        if (amount>accountBalance){
            System.out.println("Insufficient balance");
            return;
        }
        if (amount<=0){
            System.out.println("Withdrawing amount can not be negative or zero");
            return;
        }
        accountBalance -=amount;
    }
}
