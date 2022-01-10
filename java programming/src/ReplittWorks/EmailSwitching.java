package ReplittWorks;

import java.util.Scanner;

public class EmailSwitching {


        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String email = scan.next();

            // WRITE YOUR CODES HERE:


            if(email.contains("_")){
                String name = email.substring(0,email.indexOf("_"));
                String lastName = email.substring(email.indexOf("_")+1,email.indexOf("@"));
                String domain = email.substring(email.indexOf("@"));
                System.out.println(lastName+"_" +name + domain);
            }else {
                System.out.println(email);
            }

            scan.close();

        }

}
