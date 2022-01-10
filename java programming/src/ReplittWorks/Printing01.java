package ReplittWorks;

import java.util.Arrays;
import java.util.Scanner;

public class Printing01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }
        String str = "";
        for (int i = 0; i < 5; i++) {
            str = ""+arr[i].charAt(0) + arr[i].charAt(1) + arr[i].charAt(2);
            System.out.println(str);

        }




        input.close();
    }
}
