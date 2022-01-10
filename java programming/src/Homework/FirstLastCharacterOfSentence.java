package Homework;

import java.util.Scanner;

public class FirstLastCharacterOfSentence {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a sentence: ");
        String sentence = scan.nextLine();
        char firstChar = sentence.charAt(0);
        char lastChar = sentence.charAt(sentence.length()-1);
        System.out.println(firstChar + " "+ lastChar);








        scan.close();
    }

}
/*
1. write a program that asks user to enter a sentence.
then print the first & last characters of the sentence
 */
