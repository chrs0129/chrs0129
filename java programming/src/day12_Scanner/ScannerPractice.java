package day12_Scanner;

//import java.util.* - wild import

import java.util.Scanner; // regular import: imports one class


public class ScannerPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7");
        int num = scan.nextInt();
        String result = "";
        if (num >= 1 && num <= 7) {
            result =(num == 1)?"monday" :(num == 2) ? "tuesday" : (num == 3) ? "wednesday"
                    : (num == 4) ? "thursday" : (num == 5) ? "friday"
                    : (num == 6) ? "friday" : "sunday";


        } else {
            System.out.println("Invalid input");
        }
        System.out.println(result);
        scan.close();
    }
}
