package ReplittWorks.methods;

import java.util.Scanner;

public class WordCount {
    public static int wordCount(String words) {
        // your code
String[] str = words.split(" ");
return str.length;


    }


    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    in.close();
    }
}
