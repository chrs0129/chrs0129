package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = input.nextInt();
        input.nextLine();
        System.out.println("Enter your Name:");
        String fullName = input.nextLine();
        System.out.println("Enter your GPA: ");
   double gpa = input.nextDouble();
        input.nextLine();
        System.out.println("Enter your school name: ");
        String school = input.nextLine();
        System.out.println("age: " + age);
        System.out.println("fullName: " + fullName);
        System.out.println("gpa: " + gpa);
        System.out.println("school: " + school);
        input.close();

    }
}
/*
1. Ask user to enter age
2. Ask user full name
 */
