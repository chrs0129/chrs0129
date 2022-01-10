package ReplittWorks;

import java.util.Scanner;

public class FirstAndLastLetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        char ch1 = word.charAt(0);
        char ch2 = word.charAt(word.length()-1);
        String nword = "" + ch1 +ch2;
        System.out.println(nword);









        scan.close();
    }



}
