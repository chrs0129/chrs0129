package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {
    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is even number");
        } else {
            System.out.println(number + " is odd number");
        }

    }

    public static void ageOfPerson(int birthYear) {
        int age = 2021 - birthYear;
        System.out.println("Your age is " + age + " years old");

    }

    public static void printNumbers(int x, int y) {
        if (x < y) {
            for (int i = x + 1; x < y; x++) {

                System.out.println(x);
            }
        } else {
            for (int i = y + 1; x > y; y++) {

                System.out.println(y);
            }
        }


    }

    public static void main(String[] args) {
        oddOrEven(8);
        ageOfPerson(1963);
        printNumbers(2, 6);
    }
}
