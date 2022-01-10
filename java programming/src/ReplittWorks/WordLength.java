package ReplittWorks;

import java.util.Scanner;

public class WordLength {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the text:");
        String ntext = scan.nextLine();
        int length = ntext.length();
        System.out.println("Length is: " + length);

scan.close();

    }

}
/*
Write a program that will output length of the text (string).

Example:

Display message: "Please enter the text:"
Display message: "Please enter the text:"
input: java
input: java
Display message: "Length is: 4"
 */