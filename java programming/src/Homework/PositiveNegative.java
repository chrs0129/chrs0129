package Homework;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {

int pos = 0;
int neg = 0;
        System.out.println("Enter any number for 5 times:" );
        for (int i = 0; i <+5 ; i++) {
           Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            if(num < 0){
                neg ++;
            }else if (num > 0){
                pos ++;
            }else{ num = 0;}

        }
        System.out.println(neg);
        System.out.println(pos);




    }
}
/*
Write a program that asks user to enter number for 5 times, and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */
