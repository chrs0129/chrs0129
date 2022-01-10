package ReplittWorks.methods;

import java.util.Scanner;

public class ExtractNums {
    public static String extractNum(String s) {
String nums="";
        for (int i = 0; i <s.length() ; i++) {
            char n=s.charAt(i);
            if(n>='0' &&n<='9'){
                nums+=n;
            }
        }
return nums;
    }

    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        System.out.println(extractNum(in.next()));
    in.close();
    }
}
