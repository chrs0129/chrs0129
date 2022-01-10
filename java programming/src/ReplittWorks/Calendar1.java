package ReplittWorks;

import java.util.Scanner;

public class Calendar1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month number:");
        int num = input.nextInt();
        String month = "";
        switch (num){
            case 1 :
                month = "January";
                break;
            case 2 :
                month = "Fabruary";
                break;
            case 3 :
                month = "March";
                break;
            case 4 :
                month = "April";
                break;
            case 5 :
                month = "May";
                break;
            case 6 :
                month = "June";
                break;
            case 7 :
                month = "July";
                break;
            case 8 :
                month = "August";
                break;
            case 9 :
                month = "September";
                break;
            case 10 :
                month = "October";
                break;
            case 11 :
                month = "November";
                break;
            case 12 :
                month = "December";
                break;
            default:
                month ="Invalid month number";

        }
        System.out.println(month);



        input.close();
    }
}
/*
Write a program that will print out month names by receiving a number. Use Switch Statement. If an invalid month number is entered print "Invalid month number"

Example:

```
Display message: "Enter month number:"

input: 5

Display message: "May"
 */