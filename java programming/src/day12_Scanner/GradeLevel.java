package day12_Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        byte gradeLevel = 25;
        String schoolType = "";
        if (gradeLevel >= 1 && gradeLevel <= 18) {
            switch (gradeLevel) {
                case 6:
                case 7:
                case 8:
                    schoolType = " - Middle School";
                    break;
                case 9:
                case 10:
                case 11:
                case 12:
                    schoolType = " - High School";
                    break;
                case 13:
                case 14:
                case 15:
                case 16:
                    schoolType = " - College";
                    break;
                case 17:
                case 18:
                    schoolType = " - Grad School";
                    break;
                default:
                    schoolType = " - Elementary school";
            }
        } else {
            schoolType = " - Invalid Grade";

        }
        System.out.println("Grade: " + gradeLevel + schoolType);


    }
}
