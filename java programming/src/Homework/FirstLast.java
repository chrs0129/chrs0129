package Homework;

public class FirstLast {
    public static void main(String[] args) {
        String word = "level";
        int length = word.length();
        if (word.charAt(0) == word.charAt(length - 1)) {
            System.out.println("The same");
        } else {
            System.out.println("different");
        }
    }
}
/*
write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same

 */