package Homework;

import java.util.Scanner;

public class SumOfGivenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num = input.nextInt();
        int sum = 0;
        for (int i = 0; i<= num ; i++){
            sum +=i;

        }
        System.out.println("sum; " + sum);


        input.close();
    }
}
/*
write a program that can calculate the sum of all numbers between 1 to any given number

 */