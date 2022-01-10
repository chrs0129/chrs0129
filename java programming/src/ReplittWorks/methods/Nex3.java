package ReplittWorks.methods;

import java.util.Scanner;

public class Nex3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number" + "\n");

        int num = inp.nextInt();


        next3(num);
    inp.close();
    }

    // Do not touch above
public static void next3(int num){
    System.out.println("next 3 are:");
    for (int i = num+1; i <=num+3 ; i++) {
        System.out.print(i + " ");
    }
}




}
