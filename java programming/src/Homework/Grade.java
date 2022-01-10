package Homework;

public class Grade {
    public static void main(String[] args) {
        char grade = 'C';
        String output = "";
        if (grade >= 'F' && grade <= 'A' || grade != 'E') {
            if (grade == 'B') {
                output = "great job";
            } else if (grade == 'C') {
                output = "good";
            } else if (grade == 'D') {
                output = "passed";
            } else if (grade == 'F') {
                output = "failed";
            } else {
                output = "excellent";
            }
        } else {
            output = "invalid";
        }
        System.out.println(output);
    }
}
/*
Create a class called Grade, a char variable named grade is given. write a program to print the following messages:
            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            other wise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */
