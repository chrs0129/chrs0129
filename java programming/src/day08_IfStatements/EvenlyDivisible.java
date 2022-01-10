package day08_IfStatements;

public class EvenlyDivisible {
    public static void main(String[] args) {
         /*Create a class called EvenlyDivisible, and write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true

          */
int number = 65;
boolean divisibleby2 = number %2 == 0;
boolean divisibleby3 = number %3 == 0;
boolean divisableby5 =  number %5 == 0;
        System.out.println( + number + " -is divisible by 2: " + divisibleby2);
        System.out.println(number + " - is divisible by 3: " + divisibleby3);
        System.out.println(number + " - is divisible by 5: " + divisableby5);
        System.out.println("----------------------------------------------");
        int year = 200;
        boolean isLeapYear = year % 4 == 0;
        System.out.println("Year" + year + " Leap year" + isLeapYear);










    }


}
