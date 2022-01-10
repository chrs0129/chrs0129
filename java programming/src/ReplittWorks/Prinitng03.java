package ReplittWorks;

import java.util.Scanner;

public class Prinitng03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = input.nextLine();
        }
        String words = "";
        for (int i = 0; i < 4; i++) {
            words = arr[i] + ", " + arr[i + 1] + ", " + arr[i + 2];
            System.out.println(words);

        }


        input.close();
    }
}
