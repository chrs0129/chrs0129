package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your full name");
        String name = input.nextLine();
        System.out.println("Building Number");
        String building = input.next();
input.nextLine();
        System.out.println("Enter your street name");
        String street = input.nextLine();
        System.out.println("Enter your city");
        String city = input.nextLine();
        System.out.println("Enter your State");
        String state = input.next();
        input.nextLine();
        System.out.println("Enter your zip");
        int zip = input.nextInt();
        input.nextLine();
        System.out.println("Enter country name");
        String country = input.nextLine();
        System.out.println(name);
        System.out.println(building);
        System.out.println(city);
        System.out.println(state);
        System.out.println(zip);
        System.out.println(country);
        input.close();
    }
}
/*
Enter your name
Enter you building number
        Eneter your Street name
Enter your city
Enter your state
Enter your name
display shipping address

 */