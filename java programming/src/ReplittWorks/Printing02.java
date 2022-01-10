package ReplittWorks;

import java.util.Scanner;

public class Printing02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i = 0; i < 8; i++) {
            arr[i] = input.nextLine();
        }
        String word = "";

        for (int i = 0; i < 7; i++) {

            if (i% 2 != 0) {
                continue;
            }
            word = arr[i] + ", " + arr[i + 1];
            System.out.println(word);

        }
        input.close();
    }
}





