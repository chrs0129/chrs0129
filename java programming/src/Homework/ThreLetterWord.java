package Homework;

import java.util.Scanner;

public class ThreLetterWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three letter word");
        String word = input.nextLine();
        char ch = word.charAt(1);
        int l = word.length();
        if (ch == 'a' && l == 3) {
            System.out.println("Cool word");
        } else if (ch != 'a' && l == 3) {
            System.out.println("Okay word");
        } else if (l > 3) {
            System.out.println("Word is too long");
        } else {
            System.out.println("Word is too short");
        }
        input.close();
    }
}

        /*
        if (l>0 && l < 3){

            System.out.println("Word is too short");
        }if(l > 3){
            System.out.println("Word is too long");
        }

        if(ch == 'a'){
            System.out.println("Cool word");}else {
            System.out.println("Okay word");
        }
/*







        input.close();
    }
}
/*
 write a program that asks the user enter a three letter word.
 Check if the middle character of the given word is 'a'.
 In the case it is print: "Cool word", but in the case the
 middle letter is not 'a' print: "Okay word".
     - If the user does not enter a 3 letter word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"

 */
