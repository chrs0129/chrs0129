package ReplittWorks;

import java.util.Scanner;

public class HasaJava {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        boolean r = (word.indexOf("java") == 0 || word.indexOf("java") ==1);
        System.out.println(r);


        scan.close();
    }
}
