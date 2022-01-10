package ReplittWorks;

import java.util.Scanner;

public class AlejandoII {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String a = s.nextLine();
        String name = "alejandro";
        String pr = "project";
        if (a.contains(name) && a.contains(pr)){
            System.out.println("read");

        }else {
            System.out.println("don't read");
        }

s.close();
    }
}
