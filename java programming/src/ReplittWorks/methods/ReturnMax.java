package ReplittWorks.methods;

import java.util.Scanner;

public class ReturnMax {
    public static int max(int x, int max){
        // Code here
int var=0;
if (x>max){
    var=x;
}else {
    var = max;
}
return var;



    }

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.println(max(in.nextInt(), in.nextInt()));
in.close();
    }


}
