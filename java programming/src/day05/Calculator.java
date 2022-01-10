package day05;

public class Calculator {
    public static void main(String[] args) {
        int firstNumber = 100;
        int secondNumber = 50;
        int sum = firstNumber + secondNumber;
        System.out.println(firstNumber + "+" + secondNumber + "=" + (secondNumber + secondNumber));
        System.out.println(firstNumber + "+" + secondNumber + "=" + sum);
        System.out.println(firstNumber + "*" + secondNumber + "=" + (firstNumber * secondNumber));
        System.out.println(firstNumber + "/" + secondNumber + "=" + (firstNumber / secondNumber));
    }
}
