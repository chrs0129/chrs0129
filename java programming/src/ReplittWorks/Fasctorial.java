package ReplittWorks;

import java.util.Scanner;

public class Fasctorial {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
      long f = 1l;
        for (int i = 1 ; i <=n ; i++) {

            f=f*i;
        }
        System.out.println(f);
scan.close();

    }
}
