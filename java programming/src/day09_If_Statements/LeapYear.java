package day09_If_Statements;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2001;
        boolean leapYear = year % 4 == 0;
        if (leapYear) {
            System.out.println("Year " + year + " is a leap year");
        } else {
            System.out.println("Year " + year + " is NOT leap year");


        }
    }
}
