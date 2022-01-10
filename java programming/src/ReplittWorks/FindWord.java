package ReplittWorks;

import java.util.Scanner;

public class FindWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sentence:");
        String wrd = scan.nextLine();
        System.out.println(wrd.contains("word"));

        scan.close();
    }
}
