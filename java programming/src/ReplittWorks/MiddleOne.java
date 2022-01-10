package ReplittWorks;

import java.util.Scanner;

public class MiddleOne {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
String word = scan.next();
if(word.length()%2 != 0 && word.length() >= 3){
    System.out.println(word.charAt(word.length()/2 ));
}else if (word.length() == 1){
    System.out.println(word.repeat(3));
}else if (word.length()%2 == 0 && word.length() >= 4) {
   String n = "" + word.charAt(word.length() / 2 -1) + word.charAt(word.length() / 2);
    System.out.println(n);
    }else if (word.length() == 2){
    System.out.println(word.repeat(2));

    }



        scan.close();
    }
}
