package Homework;

public class GradeLevel {
    public static void main(String[] args) {
byte gradeLevel =15;
String statement = "";
if (gradeLevel >= 1 && gradeLevel <= 18) {
    if (gradeLevel >= 1 && gradeLevel <= 5) {
        statement = "Elementary School";
    }
    if (gradeLevel >= 6 && gradeLevel <= 8) {
        statement = "Middle School";
    }
    if (gradeLevel >= 9 && gradeLevel <= 12) {
        statement = "High School";
    }
    if (gradeLevel >= 13 && gradeLevel <= 16) {
        statement = "College";
    }
    if (gradeLevel >= 17 && gradeLevel <= 18) {
        statement = "Grad School";
    }
}else {
    statement = "Invalid input";
}
        System.out.println(statement);
        System.out.println("----------------------------------------------");
         if(gradeLevel >=1 && gradeLevel <= 18){
             statement = (gradeLevel >= 17)? "Gradschool" :(gradeLevel >= 13)? "College"
            :(gradeLevel >= 9)? "High School" :(gradeLevel >=9)? "Middle School" :"Elementary School";
         }else{ statement ="invalid input";}
        System.out.println(statement);

    }
}

/*
Create a class called GradeLevel, Given a number(byte) grade level determine and print which
school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School
                    For Any Other grade: Invalid grade level given

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT

 */