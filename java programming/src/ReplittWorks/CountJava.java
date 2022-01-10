package ReplittWorks;

import java.util.Locale;
import java.util.Scanner;

public class CountJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
String word = scan.next();
String word1 = "";
int count = 0;
        for (int i = 0; i < word.length() -3; i++) {
            word1 = word.toLowerCase().substring(i, i +4);
            if (word1.contains("java")){
                word.replace("java", "");
                count++;
            }

        }
        System.out.println(count);








        scan.close();
    }
}
