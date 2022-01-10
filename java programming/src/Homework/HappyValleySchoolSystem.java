package Homework;

import java.util.Scanner;

public class HappyValleySchoolSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = input.nextInt();
        String results = "";
        if (age >= 2 && age <= 18) {
            switch (age) {
                case 2:
                    results = "toddler";
                    break;
                case 3:
                case 4:
                case 5:
                    results = "early childhood";
                    break;
                case 6:
                case 7:
                    results = "young reader";
                    break;
                case 8:
                case 9:
                case 10:
                    results = "elementary";
                    break;
                case 11:
                case 12:
                    results = "middle";
                    break;
                case 13:
                    results = "impossible";
                    break;
                case 14:
                case 15:
                case 16:
                    results = "high school";
                    break;
                default:
                    results = "scholar";
            }

        } else {
            results = "ineligible";
        }
        System.out.println(results);
        input.close();
    }
}
