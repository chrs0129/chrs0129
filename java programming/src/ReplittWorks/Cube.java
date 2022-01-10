package ReplittWorks;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        cube();

    }

    public static void cube() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = n * n * n;
        System.out.println(result);
        input.close();
    }
}
