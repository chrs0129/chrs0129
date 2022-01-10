package day17_While_DoWhile;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        // username : Cydeo
        //  password Cydeo123

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:");
        String u = scan.next();
        System.out.println("Enter your password:");
        String p = scan.next();
if ((u.equals("Cydeo") && p.equals("Cydeo123") )){
    System.out.println("logged in");
}else {
    int attempt = 3;
    while (!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempt > 0 ) {
        System.out.println("Incorrect user name or password, plese reenter:");
        System.out.println("Enter your user name:");
        u = scan.next();
        System.out.println();
        System.out.println("enter your password:");
        p = scan.next();
        attempt--;

    }


}
if (u.equals("Cydeo") && p.equals("Cydeo123")){
    System.out.println("logged in");
}else {
    System.out.println("Your account is locked");
}

scan.close();
    }
}
/*
  username: Cydeo
                    password: Cydeo123

        Ask the user to enter their credentials.
                If credentials are matched, your program should print "Logged in."
                If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is lucked."
 */
