package ReplittWorks;

import java.util.Scanner;

public class SplitSentense {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
      String[] str =sentence.split(" ");
        for (int i = 0; i <str.length ; i++) {
            System.out.println(str[i]);

        }




        input.close();
    }
}
