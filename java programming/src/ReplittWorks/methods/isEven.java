package ReplittWorks.methods;

import java.util.Scanner;

public class isEven {
    public static boolean isEven(int n) {
        boolean isEven = true;
        if (n % 2 == 0) {
            isEven = true;
        }else {isEven=false;}

        return isEven;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isEven(in.nextInt()));
        in.close();
    }


}


