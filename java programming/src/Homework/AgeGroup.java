package Homework;

public class AgeGroup {
    public static void main(String[] args) {
        int age = 60;
        String ageGroup = "";
        if (age >= 0 && age <= 150) {
            if (age > 55 && age <= 150) {
                ageGroup = "Senior";
            } else if (age >= 21 && age <= 55) {
                ageGroup = "Adult";
            } else {
                ageGroup = "Teenager";
            }
        } else {
            ageGroup = "invalid";
        }
        System.out.println(ageGroup);
    }
}
/*
Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )

             if age is negative or greater than 150, print invalid

 */