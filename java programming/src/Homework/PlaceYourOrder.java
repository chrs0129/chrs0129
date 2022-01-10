package Homework;

import java.util.Scanner;

public class PlaceYourOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter product");
        String product = input.nextLine();

        System.out.println("Enter quantity");
        int num = input.nextInt();
        input.nextLine();
        double price = 1.25;
        System.out.println("Enter your name");
        String name = input.next();
        System.out.println(name + " your order: " + num + "-" + product + " has been placed." +
                "\nYour total: $ " + (price*num) );
        input.close();
    }
}
/*
Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.

 */
