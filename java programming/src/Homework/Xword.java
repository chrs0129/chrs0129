package Homework;

import java.util.Scanner;

public class Xword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = input.next();
        char l1 = word.charAt(0);
                if (l1 == 'x') {
                    System.out.println(word.substring(1, word.length()));
                }





        input.close();
    }
}
/*
Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */