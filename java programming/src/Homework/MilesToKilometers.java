package Homework;

import java.util.Scanner;

public class MilesToKilometers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles:");
        double mile = input.nextDouble();
        System.out.println("miles: " + mile + "equal t0; " + (mile * 1.609) + "kilometers");
        input.close();

    }
}
/*
Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers

 */