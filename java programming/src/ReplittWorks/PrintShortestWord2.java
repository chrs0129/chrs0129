package ReplittWorks;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class PrintShortestWord2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] arr = str.split(", ");
        int shortestWord = arr[0].length();

        String words = "";
        for (int i = 0; i < arr.length - 1; i++) {
            if (shortestWord > arr[i].length()) {
                shortestWord = arr[i].length();
            }

        }
        for (String each : arr) {
            if (each.length() == shortestWord) {
                words += each + ", ";
            }

        }
       String[] str2 =words.split(", ");
    Arrays.sort(str2);
        System.out.println(Arrays.toString(str2));


        scan.close();
    }
}
