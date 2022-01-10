package ReplittWorks;

import java.util.Scanner;

public class LastChar {
    public static void main(String[] args) {

            //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
            String word = scan.next();
            //WRITE YOUR CODE HERE
char ch = word.charAt(word.length() -1);
        System.out.println(ch);



        scan.close();
        }
    }












