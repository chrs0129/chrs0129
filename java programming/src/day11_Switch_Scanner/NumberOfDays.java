package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int monthNumber = 2;
        int year = 2001;
        String days = "";
        if (monthNumber >= 1 && monthNumber <= 12) {
            switch (monthNumber) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = "31";
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = "30";
                    break;
                case 2:
                    days = (year % 4 == 0) ? "28" : "29";

                    break;


            }
        } else {
            days = "Invalid";
        }
        System.out.println("Month number " + monthNumber + " has " + days + " days");
    }
}
