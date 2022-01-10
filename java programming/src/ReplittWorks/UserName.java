package ReplittWorks;

import java.util.Locale;
import java.util.Scanner;

public class UserName {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter full name: ");

        String name1 = scan.nextLine();

        System.out.println("Enter full name: ");
        String name2 = scan.nextLine();
        String lname1 = name1.substring(name1.indexOf(' '), name1.length());
        String lname2 = name2.substring(name2.indexOf(' '), name2.length());
        if(lname1.equalsIgnoreCase(lname2)){
            System.out.println("User found!");
        }else{
            System.out.println("User not found!");
        }


        scan.close();
    }
}
/*
Write a program that will look up a user.

Assume that you have only 2 users: Max Payne and Alan Wake. First, ask user to enter full name. Display message: "Enter full name:". Then take input from user. If name is equals to either "Max Payne" or "Alan Wake", display message: "User found!". Otherwise, display message: "User not found!". Please make your search case insensitive!

Example:

Display message: Enter full name:
Display message: Enter full name:
input: Max Payne
input: Max Payne
Display message: User found!
 */