package ReplittWorks;

import java.util.Scanner;

public class DoubleHalfWord {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();
        String halfwrd = word.substring(0, word.length()/2);
        System.out.println(halfwrd.repeat(2));





        scan.close();

    }
}
