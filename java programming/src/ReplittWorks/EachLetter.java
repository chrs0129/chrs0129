package ReplittWorks;

import java.util.Scanner;

public class EachLetter {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        for (int i = 0; i <word.length() ; i++) {
            char ch = word.charAt(i);
            System.out.println(ch);
        }





        inp.close();
    }
}
