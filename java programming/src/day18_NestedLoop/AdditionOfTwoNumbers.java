package day18_NestedLoop;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      while (true) {
          System.out.println("Enter firs number:");


          int num1 = scan.nextInt();
          System.out.println("Enter second number");
          int num2 = scan.nextInt();
          System.out.println("Addition: " + (num1 + num2));
          System.out.println("Would like to continue: ");
          String a = scan.next().toLowerCase();
          while (!(a.equals("no")|| a.equals("yes"))){
              System.out.println("invalid entry, please reenter");
              a=scan.next().toLowerCase();

          }
          if (a.equals("no")) {
              break;
          }
      }

        scan.close();
    }
}
