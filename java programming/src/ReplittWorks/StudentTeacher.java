package ReplittWorks;

import java.util.Scanner;

public class StudentTeacher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                String name = input.next();
                if (name.equals("Chen")){
                    System.out.println("teacher");
                }else {
                    System.out.println("student");
                }








                input.close();
    }
}
