package Day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysPractice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many number would you like to enter?");
        int length = scan.nextInt();

        if (length<=0){
            System.err.println("Invalid entry");
            System.exit(0);
        }
        int[] num = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Enter a number");
            num[i] = scan.nextInt();

        }
        System.out.println(Arrays.toString(num));





        scan.close();
    }
}
