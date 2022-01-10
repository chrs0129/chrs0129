package ReplittWorks;

import java.util.Scanner;

public class Party {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter guest name:");
        String name1 = input.next();

        while (true) {
            System.out.println("Do you want to enter new guest name:");
            String answer = input.next().toLowerCase();

            if (answer.equals("yes")) {
                System.out.println("Please enter guest name:");
                name1 +=", " + input.next();

            } else if (answer.equals("no")) {

                break;
            }

        }
        System.out.println("Guest's list: " + name1);

        input.close();
    }
}













