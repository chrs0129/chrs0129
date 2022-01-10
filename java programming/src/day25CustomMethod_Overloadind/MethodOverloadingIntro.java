package day25CustomMethod_Overloadind;

import java.util.Arrays;

public class MethodOverloadingIntro {
    public static void main(String[] args) {
        int[] intArray = {5, 6, 0, -1, 3, 4};
        double[] doubleArray = {10.5, 11.5, 5.5, 4.5};
        char[] charArray = {'E', 'F', 'B', 'D', 'C', 'A'};
        Arrays.sort(intArray);
        Arrays.sort(doubleArray);
        Arrays.sort(charArray);
        System.out.println("--------------------------");
        System.out.println(sumOfNumbers(10, 20, 30, 40.5));

    }

    public static double sumOfNumbers(double num1, double num2, double num3, double num4) {
        return num1 + num2 + num3 + num4;
    }

    public static double sumOfNumbers(double num1, double num2, double num3) {
        return num1 + num2 + num3;
    }

    public static int sumOfNumbers(int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;

    }

    public static int sumOfNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;

    }

    public static int sumOfNumbers(int num1, int num2) {


        return num1 + num2;
    }

    public static double sumOfNumbers(double num1, double num2) {
        return num1 + num2;
    }
}
