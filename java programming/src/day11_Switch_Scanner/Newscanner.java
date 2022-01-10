package day11_Switch_Scanner;

import java.util.Scanner;

public class Newscanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println( "Enter first decimal");
        double n1 = input.nextDouble();
                System.out.println(" Enter second decimal");
                double n2 = input.nextDouble();
                        System.out.println("Enter third decimel");
                        double n3 =input.nextDouble();
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println("n1*n2/n3 = " + n1*n2/n3);

    }
}
