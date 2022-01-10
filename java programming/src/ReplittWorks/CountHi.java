package ReplittWorks;

import java.util.Scanner;

public class CountHi {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String str1 = "";
        int count = 0;


        for (int i = 0; i < str.length()-1; i++) {
str1 = str.substring(i, i+2).toLowerCase();
if (str1.contains("hi")){
    str.replace("hi", "");
    count++;
}
        }
        System.out.println(count);





        scan.close();
    }

    }
