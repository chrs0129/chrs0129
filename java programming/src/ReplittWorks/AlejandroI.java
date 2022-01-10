package ReplittWorks;

import java.util.Scanner;

public class AlejandroI {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);

        String a = s.nextLine();
        String name = "alejandro";
       if (a.contains(name)){
           System.out.println("read");

       }else {
           System.out.println("don't read");
       }



        s.close();
    }
}
