package ReplittWorks;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if (num >0 ){
            System.out.println("num = " + num + "\npositive");
        }else if (num < 0){
            System.out.println("num = " + num + "\nnegative");
        }else if (num == 0){
            System.out.println("num = " + num + "\nzero");
        }





s.close();
    }
}
