package day24_CustumMethodReturn;

import java.util.Locale;

public class WormUpTasks {
    public static void initials(String firstname, String lastname) {
        String initial = firstname.charAt(0) + "." + lastname.charAt(0) + ".";
        initial = initial.toUpperCase();
        System.out.println("initials = " + initial);

    }

    public static void domain(String email) {
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("Domain is: " + domain);

    }

    public static void nameOfTheMonth(int monthNumber) {
        String name = "";
        if (monthNumber > +1 && monthNumber <= 12) {
            name = (monthNumber == 1) ? "Jan" : (monthNumber == 2) ? "Feb" : (monthNumber == 3) ? "Mur"
                    : (monthNumber == 4) ? "Apr" : (monthNumber == 5) ? "May" : (monthNumber == 6) ? "Jun" :
                    (monthNumber == 7) ? "Jul" : (monthNumber == 9) ? "Sep" : (monthNumber == 10) ? "Oct" :
                            (monthNumber == 11) ? "Nov" : "dec";

        } else {
            name = "invalid";
        }
        System.out.println("Month name: " + name);
    }

    public static void nameOfTheDay(int daynumber)  {
String name= "";


    }
    public static void daysInMonth(int number){

    }


    public static void main(String[] args) {


        initials("cydeo", "school");
        System.out.println("-------------------------------");
        domain("cydeo@gmail.com");
        System.out.println("-------------------------------");
        nameOfTheMonth(14);
    }


}
/*
1. Create a method that can display the initials of the person

2. Create a method that can display the domain of the email

3. Create a method that can display the name of the month based on the given number to the method

4. Create a method that can print the name of the day based on the given number to the method

5. Create a method that can print how many days a month has
 */
