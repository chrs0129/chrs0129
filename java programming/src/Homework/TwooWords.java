package Homework;

import java.util.Scanner;

public class TwooWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word:");
        String word1 = input.nextLine();
        System.out.println("Enter second word:");
        String word2 = input.nextLine();
String result1 = word1.substring(1);
String result2 = word2.substring(1);
        System.out.println(result1 + result2);
input.close();
    }
}
/*
Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */