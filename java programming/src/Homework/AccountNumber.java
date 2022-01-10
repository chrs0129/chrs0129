package Homework;

import java.util.Scanner;

/*
Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
            > If the account number begins with a “2” the account number should be 7 characters long
            > If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number”

 */
public class AccountNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter account number:");
        String act = input.next();
        if (act.charAt(0) == 50 && act.length() == 7) {
            System.out.println("account is valid");
        }else if(act.charAt(0) == 53 && act.length() == 10){
            System.out.println("account is valid");
        }else{
            System.out.println("account is not valid");
        }


        input.close();
    }
}
