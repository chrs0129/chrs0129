package ReplittWorks.methods;

import java.util.Scanner;

public class ProfitLoss {
    public static String profits(int buyPrice, int sellPrice) {
        //your code here
       String profits="";
        if (sellPrice > buyPrice) {
            profits="profit";
        } else if (sellPrice < buyPrice) {
          profits ="loss";
        } else {
            profits="no loss";
        }
return profits;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(profits(in.nextInt(), in.nextInt()));
        in.close();
    }

}


