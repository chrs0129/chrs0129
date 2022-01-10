package Homework;

import java.util.Scanner;

public class charFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word");
String str = input.nextLine();
        System.out.println("enter char");
String ch = input.next();

String str1 = "";
int count = 0;
        for (int i = 0; i <=str.length()-1 ; i++) {
            str1 = "" + str.charAt(i);
            if (str1.equals(ch)){
                count ++;
            }

        }
        System.out.println(count);

        input.close();
    }

}
