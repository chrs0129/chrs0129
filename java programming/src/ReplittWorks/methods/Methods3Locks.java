package ReplittWorks.methods;

import java.util.Scanner;

public class Methods3Locks {
    public static boolean threeLocks(boolean a, boolean b, boolean c) {

        return a == b || c;

    }//end threeLocks

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(threeLocks(input.nextBoolean(), input.nextBoolean(), input.nextBoolean()));

        input.close();
    }


}


