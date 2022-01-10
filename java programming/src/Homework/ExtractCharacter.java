package Homework;

import java.util.Scanner;

public class ExtractCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word:");
        String str = input.next();
        String digit = "";
        String letter = "";
        String special = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                digit += str.charAt(i);
            }else if((str.charAt(i)>='a' && str.charAt(i)<='z') || str.charAt(i)>='A' && str.charAt(i)<='Z'){
                letter +=str.charAt(i);
            }else{
                special+=str.charAt(i);
            }
        }
input.close();

        System.out.println("letters: " + letter);
        System.out.println("digits: " + digit);
        System.out.println("secial characters: " + special);
    }
}
