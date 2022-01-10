package ReplittWorks;

import java.util.Scanner;

public class PrintVowels {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String word = inp.nextLine();
        String vowel = "aeiou";
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            if (vowel.contains(word.charAt(i) + "")){
                result += word.charAt(i);}
        }

        System.out.print(result);



        inp.close();

    }
}
