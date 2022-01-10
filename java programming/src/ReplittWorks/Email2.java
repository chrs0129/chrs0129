package ReplittWorks;

import java.util.Locale;
import java.util.Scanner;

public class Email2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        String fname = email.substring(0, email.indexOf('_'));
        String lname = email.substring(email.indexOf('_') + 1, email.indexOf('@'));
        String domain = email.substring(email.indexOf('@') + 1, email.indexOf('.'));

        String fname_capital = fname.substring(0, 1).toUpperCase() + fname.substring(1, fname.length());
        String lname_capital = lname.substring(0, 1).toUpperCase() + lname.substring(1, lname.length());
        System.out.println("First name: " + fname_capital +
                "\nLast name: " + lname_capital + "\nDomain: " + domain);


        scan.close();
    }
}
