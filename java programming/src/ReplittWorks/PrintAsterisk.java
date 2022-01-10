package ReplittWorks;

import java.util.Scanner;

public class PrintAsterisk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char ch = '*';
        String result = "" + ch;

        System.out.print(result.repeat(n));
        scan.close();

    }
}
