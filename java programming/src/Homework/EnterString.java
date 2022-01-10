package Homework;

import java.util.Scanner;

public class EnterString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word");
        String s1 = input.nextLine();

        int l = s1.length();

        if (l == 0) {

            System.out.println("String is empty");
        } else if (l > 3) {
            System.out.println(s1.charAt(l - 1) + ", " + s1.charAt(l - 2) + ", " + s1.charAt(l - 3));
        } else if (l <= 3){
            System.out.println(s1);
        }




       // System.out.println(s1.charAt(l-1) + "" + s1.charAt(l-3));
        input.close();
    }
}
/*
Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself


 */