package Homework;

import java.util.Scanner;

public class Really {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter word:");
        String word = input.next();
        int ind1 = word.length();
        System.out.println(ind1);
        String result = word.substring(ind1 -2, ind1);
        System.out.println(result);
        if(result.equals("ly")){
            System.out.println("really???");
        }else {
            System.out.println("never mind");
        }



        input.close();
    }
}
/*
ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"

 */